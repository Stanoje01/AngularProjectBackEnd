package com.example.AngularProjekatBackend.Entity;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "rezervacija", schema = "project", catalog = "")
public class RezervacijaEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "idrezervacija")
    private int idrezervacija;
    @Basic
    @Column(name = "naziv")
    private String naziv;
    @Basic
    @Column(name = "cena")
    private Integer cena;
    @Basic
    @Column(name = "ime")
    private String ime;
    @Basic
    @Column(name = "prezime")
    private String prezime;
    @Basic
    @Column(name = "adresa")
    private String adresa;

    public int getIdrezervacija() {
        return idrezervacija;
    }

    public void setIdrezervacija(int idrezervacija) {
        this.idrezervacija = idrezervacija;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public Integer getCena() {
        return cena;
    }

    public void setCena(Integer cena) {
        this.cena = cena;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RezervacijaEntity that = (RezervacijaEntity) o;
        return idrezervacija == that.idrezervacija && Objects.equals(naziv, that.naziv) && Objects.equals(cena, that.cena) && Objects.equals(ime, that.ime) && Objects.equals(prezime, that.prezime) && Objects.equals(adresa, that.adresa);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idrezervacija, naziv, cena, ime, prezime, adresa);
    }
}
