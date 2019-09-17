package com.utn.rjmg.pedrest.controller.comida;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.utn.rjmg.pedrest.controller.base.AbstractBaseRestController;
import com.utn.rjmg.pedrest.model.comida.Guarnicion;
import com.utn.rjmg.pedrest.service.comida.GuarnicionService;
import com.utn.rjmg.pedrest.specification.comida.GuarnicionSpecification;

@RestController
@RequestMapping("/guarniciones")
public class GuarnicionController extends AbstractBaseRestController<Guarnicion, GuarnicionService, GuarnicionSpecification> {
	
}
