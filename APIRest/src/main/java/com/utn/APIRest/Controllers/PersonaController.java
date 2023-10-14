package com.utn.APIRest.Controllers;

import com.utn.APIRest.Entities.Persona;
import com.utn.APIRest.Servicies.PersonaServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/BD1/personas")
public class PersonaController extends BaseControllerImpl<Persona, PersonaServiceImpl>{
}
