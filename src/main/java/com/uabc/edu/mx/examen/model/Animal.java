package com.uabc.edu.mx.examen.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Arrays;
import java.util.Date;

@Entity
@Table(name="ANIMALES")
public class Animal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idAnimal;

    @Column(name = "tipo_animal")
    private String tipoAnimal;

    @Column(name = "raza_animal")
    private String razaAnimal;

    @Column(name = "color_animal")
    private String colorAnimal;

    @Column(name = "pelaje_animal")
    private String pelajeAnimal;

    @Column(name = "fecha_nacimiento")
    private String fechaNacimientoAnimal;

    @Column(name = "vacuna_animal")
    private boolean vacunaAnimal;

    @Column(name = "adoptado")
    private boolean estadoAnimal;

    @Column(name = "adoptante")
    private String nombreAdoptante;

    @Column(name = "img")
    private  byte[] img;

    @Column(name = "str")
    private String str;

    public Long getIdAnimal() {
        return idAnimal;
    }

    public void setIdAnimal(Long idAnimal) {
        this.idAnimal = idAnimal;
    }

    public String getTipoAnimal() {
        return tipoAnimal;
    }

    public void setTipoAnimal(String tipoAnimal) {
        this.tipoAnimal = tipoAnimal;
    }

    public String getRazaAnimal() {
        return razaAnimal;
    }

    public void setRazaAnimal(String razaAnimal) {
        this.razaAnimal = razaAnimal;
    }

    public String getColorAnimal() {
        return colorAnimal;
    }

    public void setColorAnimal(String colorAnimal) {
        this.colorAnimal = colorAnimal;
    }

    public String getPelajeAnimal() {
        return pelajeAnimal;
    }

    public void setPelajeAnimal(String pelajeAnimal) {
        this.pelajeAnimal = pelajeAnimal;
    }

    public String getFechaNacimientoAnimal() {
        return fechaNacimientoAnimal;
    }

    public void setFechaNacimientoAnimal(String fechaNacimientoAnimal) {
        this.fechaNacimientoAnimal = fechaNacimientoAnimal;
    }

    public boolean isVacunaAnimal() {
        return vacunaAnimal;
    }

    public void setVacunaAnimal(boolean vacunaAnimal) {
        this.vacunaAnimal = vacunaAnimal;
    }

    public boolean isEstadoAnimal() {
        return estadoAnimal;
    }

    public void setEstadoAnimal(boolean estadoAnimal) {
        this.estadoAnimal = estadoAnimal;
    }

    public String getNombreAdoptante() {
        return nombreAdoptante;
    }

    public void setNombreAdoptante(String nombreAdoptante) {
        this.nombreAdoptante = nombreAdoptante;
    }

    public byte[] getImg() {
        return img;
    }

    public void setImg(byte[] img) {
        this.img = img;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "idAnimal=" + idAnimal +
                ", tipoAnimal='" + tipoAnimal + '\'' +
                ", razaAnimal='" + razaAnimal + '\'' +
                ", colorAnimal='" + colorAnimal + '\'' +
                ", pelajeAnimal='" + pelajeAnimal + '\'' +
                ", fechaNacimientoAnimal='" + fechaNacimientoAnimal + '\'' +
                ", vacunaAnimal=" + vacunaAnimal +
                ", estadoAnimal=" + estadoAnimal +
                ", nombreAdoptante='" + nombreAdoptante + '\'' +
                ", img=" + Arrays.toString(img) +
                ", str='" + str + '\'' +
                '}';
    }
}
