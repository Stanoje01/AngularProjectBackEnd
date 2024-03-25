package com.example.AngularProjekatBackend.Service;

import com.example.AngularProjekatBackend.Dao.KorisnikDao;
import com.example.AngularProjekatBackend.Entity.KorisnikEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class KorisnikService {

    @Autowired
    private KorisnikDao korisnikDao;

    public void registrujKorisnika(KorisnikEntity korisnik) {
        if (korisnikDao.findByUsername(korisnik.getUsername()) != null ||
                korisnikDao.findByEmail(korisnik.getEmail()) != null) {
            throw new RuntimeException("Korisnik vec postoji u bazi podataka!");
        } else {

            korisnikDao.save(korisnik);
        }
    }
    public String login (String username, String password){
        KorisnikEntity korisnik = korisnikDao.findByUsername(username);


        if(korisnik == null || !korisnik.getPassword().equals(password)){
            throw new RuntimeException("Neipravno korisnicko ime ili lozinka!");
        }
        if("admin".equals(korisnik.getRola())){
            return "Admin se uspesno ulogovao";
        }
        else{
            return "Uspesno ste se loginovali!";
        }
    }
}
