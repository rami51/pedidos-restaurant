package com.utn.rjmg.pedrest.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.utn.rjmg.pedrest.configuration.security.UserDetailsServiceImpl;

@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class WebSecurityConfiguration extends WebSecurityConfigurerAdapter {
	
	@Bean
	public UserDetailsService userDetailsService() {
		return new UserDetailsServiceImpl();
	}
	
	@Bean
	public BCryptPasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
	
    @Bean
    public DaoAuthenticationProvider authenticationProvider() {
        DaoAuthenticationProvider authProvider = new DaoAuthenticationProvider();
        authProvider.setUserDetailsService(userDetailsService());
        authProvider.setPasswordEncoder(passwordEncoder());
        return authProvider;
    }
	
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
    	//PasswordEncoder encoder = PasswordEncoderFactories.createDelegatingPasswordEncoder();
        auth.inMemoryAuthentication()
          .withUser("admin")
          .password(passwordEncoder().encode("admin"))
          .roles("USER","ADMIN");
    	
    	auth.authenticationProvider(authenticationProvider());
    }
 
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
          .authorizeRequests()
          .anyRequest()
          .authenticated()
          .and()
          .httpBasic()
          .and()
          .csrf().disable();
        
//        http
//        .authorizeRequests().antMatchers("/wallPage").hasAnyRole("ADMIN", "USER")
//        .and()
//        .authorizeRequests().antMatchers("/login", "/resource/**").permitAll()
//        .and()
//        .formLogin().loginPage("/login").usernameParameter("username").passwordParameter("password").permitAll()
//        .loginProcessingUrl("/doLogin")
//        .successForwardUrl("/postLogin")
//        .failureUrl("/loginFailed")
//        .and()
//        .logout().logoutUrl("/doLogout").logoutSuccessUrl("/logout").permitAll()
//        .and()
//        .csrf().disable();
    }
}