package com.example.AngularProjekatBackend.Service;

import com.example.AngularProjekatBackend.Dao.KorisnikDao;
import com.example.AngularProjekatBackend.Entity.KorisnikEntity;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class KorisnikService {

    @Autowired
    private KorisnikDao korisnikDao;

    @Autowired
   // private PasswordEncoder passwordEncoder;

    public void registrujKorisnika(KorisnikEntity korisnik){
        if(korisnikDao.findByUsername(korisnik.getUsername())!=null ||
        korisnikDao.findByEmail(korisnik.getEmail())!=null){
            throw new RuntimeException("Korisnik vec postoji u bazi podataka!");
        }

       // String enkriptovanaLozinka = passwordEncoder.encode(korisnik.getPassword());

        korisnikDao.save(korisnik);
    }

    public boolean proveriPostojanjeKorisnika(String korisnickoIme, String email) {
        return korisnikDao.findByUsername(korisnickoIme) != null ||
                korisnikDao.findByEmail(email) != null;
    }


}
