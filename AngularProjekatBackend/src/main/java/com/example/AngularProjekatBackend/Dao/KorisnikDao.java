package com.example.AngularProjekatBackend.Dao;

import com.example.AngularProjekatBackend.Entity.KorisnikEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KorisnikDao extends JpaRepository<KorisnikEntity, Integer> {
    KorisnikEntity findByUsername(String username);

    KorisnikEntity findByEmail(String email);
}
