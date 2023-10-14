package com.utn.APIRest.Servicies;

import com.utn.APIRest.Entities.Localidad;
import com.utn.APIRest.Repositories.BaseRepository;
import com.utn.APIRest.Repositories.LocalidadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class LocalidadServiceImpl extends BaseServiceImpl<Localidad, Long> implements LocalidadService {

    @Autowired
    private LocalidadRepository localidadRepository;
    public LocalidadServiceImpl(BaseRepository<Localidad, Long> baseRepository, LocalidadRepository libroRepository) {
        super(baseRepository);
        this.localidadRepository = libroRepository;
    }
}
