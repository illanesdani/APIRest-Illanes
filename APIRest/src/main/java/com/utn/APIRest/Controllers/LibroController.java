package com.utn.APIRest.Controllers;

import com.utn.APIRest.Entities.Libro;
import com.utn.APIRest.Servicies.LibroServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/BD1/libros")
public class LibroController extends BaseControllerImpl<Libro, LibroServiceImpl>{
}
