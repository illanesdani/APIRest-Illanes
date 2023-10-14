package com.utn.APIRest.Controllers;

import com.utn.APIRest.Entities.Autor;
import com.utn.APIRest.Servicies.AutorServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/BD1/autores")
public class AutorController extends BaseControllerImpl<Autor, AutorServiceImpl>{
}
