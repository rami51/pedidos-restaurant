package com.utn.rjmg.pedrest.service.comida.impl;

import org.springframework.stereotype.Service;

import com.utn.rjmg.pedrest.model.comida.Guarnicion;
import com.utn.rjmg.pedrest.repository.comida.GuarnicionRepository;
import com.utn.rjmg.pedrest.service.base.AbstractBaseCrudService;
import com.utn.rjmg.pedrest.service.comida.GuarnicionService;

@Service
public class GuarnicionServiceImpl 
	extends AbstractBaseCrudService<Guarnicion, GuarnicionRepository> 
	implements GuarnicionService {
	
}


