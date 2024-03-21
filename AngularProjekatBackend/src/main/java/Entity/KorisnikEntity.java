package Entity;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "korisnik", schema = "project", catalog = "")
public class KorisnikEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "idkorisnik")
    private int idkorisnik;
    @Basic
    @Column(name = "rola")
    private String rola;
    @Basic
    @Column(name = "username")
    private String username;
    @Basic
    @Column(name = "password")
    private String password;
    @Basic
    @Column(name = "email")
    private String email;

    public int getIdkorisnik() {
        return idkorisnik;
    }

    public void setIdkorisnik(int idkorisnik) {
        this.idkorisnik = idkorisnik;
    }

    public String getRola() {
        return rola;
    }

    public void setRola(String rola) {
        this.rola = rola;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        KorisnikEntity that = (KorisnikEntity) o;
        return idkorisnik == that.idkorisnik && Objects.equals(rola, that.rola) && Objects.equals(username, that.username) && Objects.equals(password, that.password) && Objects.equals(email, that.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idkorisnik, rola, username, password, email);
    }
}
