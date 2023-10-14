package com.utn.APIRest.Repositories;

import com.utn.APIRest.Entities.Libro;
import org.springframework.stereotype.Repository;

@Repository
public interface LibroRepository extends BaseRepository<Libro,Long> {
}
