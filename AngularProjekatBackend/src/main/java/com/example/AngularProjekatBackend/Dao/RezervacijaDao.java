package com.example.AngularProjekatBackend.Dao;

import com.example.AngularProjekatBackend.Entity.RezervacijaEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RezervacijaDao extends CrudRepository<RezervacijaEntity, String> {
}
