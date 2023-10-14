package com.utn.APIRest.Servicies;

import com.utn.APIRest.Entities.Domicilio;
import com.utn.APIRest.Entities.Libro;
import com.utn.APIRest.Repositories.BaseRepository;
import com.utn.APIRest.Repositories.LibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class LibroServiceImpl extends BaseServiceImpl<Libro,Long> implements LibroService{
    @Autowired
    private LibroRepository libroRepository;
    public LibroServiceImpl(BaseRepository<Libro, Long> baseRepository, LibroRepository libroRepository) {
        super(baseRepository);
        this.libroRepository = libroRepository;
    }

}
