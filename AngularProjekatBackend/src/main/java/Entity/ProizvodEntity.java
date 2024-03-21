package Entity;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "proizvod", schema = "project", catalog = "")
public class ProizvodEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "idProizvod")
    private int idProizvod;
    @Basic
    @Column(name = "naziv")
    private String naziv;
    @Basic
    @Column(name = "cena")
    private Integer cena;
    @Basic
    @Column(name = "procesor")
    private String procesor;
    @Basic
    @Column(name = "graficka")
    private String graficka;
    @Basic
    @Column(name = "ram")
    private String ram;
    @Basic
    @Column(name = "ssd")
    private String ssd;
    @Basic
    @Column(name = "slika")
    private String slika;
    @Basic
    @Column(name = "tip")
    private String tip;

    public int getIdProizvod() {
        return idProizvod;
    }

    public void setIdProizvod(int idProizvod) {
        this.idProizvod = idProizvod;
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

    public String getProcesor() {
        return procesor;
    }

    public void setProcesor(String procesor) {
        this.procesor = procesor;
    }

    public String getGraficka() {
        return graficka;
    }

    public void setGraficka(String graficka) {
        this.graficka = graficka;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getSsd() {
        return ssd;
    }

    public void setSsd(String ssd) {
        this.ssd = ssd;
    }

    public String getSlika() {
        return slika;
    }

    public void setSlika(String slika) {
        this.slika = slika;
    }

    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProizvodEntity that = (ProizvodEntity) o;
        return idProizvod == that.idProizvod && Objects.equals(naziv, that.naziv) && Objects.equals(cena, that.cena) && Objects.equals(procesor, that.procesor) && Objects.equals(graficka, that.graficka) && Objects.equals(ram, that.ram) && Objects.equals(ssd, that.ssd) && Objects.equals(slika, that.slika) && Objects.equals(tip, that.tip);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idProizvod, naziv, cena, procesor, graficka, ram, ssd, slika, tip);
    }
}
