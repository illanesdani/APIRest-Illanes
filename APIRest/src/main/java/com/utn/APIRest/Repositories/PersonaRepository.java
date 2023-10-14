package com.utn.APIRest.Repositories;

import com.utn.APIRest.Entities.Persona;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepository extends BaseRepository<Persona,Long> {
}
