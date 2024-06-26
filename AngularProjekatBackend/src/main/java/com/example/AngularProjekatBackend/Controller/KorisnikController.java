package com.example.AngularProjekatBackend.Controller;

import com.example.AngularProjekatBackend.Entity.KorisnikEntity;
import com.example.AngularProjekatBackend.Service.KorisnikService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/korisnici")
public class KorisnikController {

    @Autowired
    private KorisnikService korisnikService;

    @PostMapping("/registracija")
    public ResponseEntity<?> registrujKorisnika(@RequestBody KorisnikEntity korisnik) {
        try {
            korisnikService.registrujKorisnika(korisnik);
            return ResponseEntity.ok().build();
        } catch (RuntimeException ex) {
            return ResponseEntity.badRequest().body(ex.getMessage());
        }
    }

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody KorisnikEntity korisnik){
        try {
            String poruka = korisnikService.login(korisnik.getUsername(), korisnik.getPassword());
            return ResponseEntity.ok(poruka);
        } catch (RuntimeException ex){
            return ResponseEntity.badRequest().body(ex.getMessage());
        }
    }
}
