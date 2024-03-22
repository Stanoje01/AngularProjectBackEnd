package com.example.AngularProjekatBackend.Dao;

import com.example.AngularProjekatBackend.Entity.ProizvodEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProizvodDao extends CrudRepository<ProizvodEntity, String> {
}
