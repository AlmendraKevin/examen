package com.uabc.edu.mx.examen.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name="TABLA_ANIMALES")
public class Animal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idAnimal;

    @Column(name = "tipo")
    private String tipoAnimal;

    @Column(name = "raza")
    private String razaAnimal;

    @Column(name = "color")
    private String colorAnimal;

    @Column(name = "t_pelaje")
    private String pelajeAnimal;

    @Column(name = "fecha")
    private String fechaNacimientoAnimal;

    @Column(name = "vacunas")
    private String vacunasAnimal;

    @Column(name = "responsable")
    private String adoptanteAnimal;

    @Column(name = "estado_adopcion")
    private String estadoAnimal;

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

    public String getVacunasAnimal() {
        return vacunasAnimal;
    }

    public void setVacunasAnimal(String vacunasAnimal) {
        this.vacunasAnimal = vacunasAnimal;
    }

    public String getAdoptanteAnimal() {
        return adoptanteAnimal;
    }

    public void setAdoptanteAnimal(String adoptanteAnimal) {
        this.adoptanteAnimal = adoptanteAnimal;
    }

    public String getEstadoAnimal() {
        return estadoAnimal;
    }

    public void setEstadoAnimal(String estadoAnimal) {
        this.estadoAnimal = estadoAnimal;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "idAnimal=" + idAnimal +
                ", tipoAnimal='" + tipoAnimal + '\'' +
                ", razaAnimal='" + razaAnimal + '\'' +
                ", colorAnimal='" + colorAnimal + '\'' +
                ", pelajeAnimal='" + pelajeAnimal + '\'' +
                ", fechaNacimientoAnimal=" + fechaNacimientoAnimal +
                ", vacunasAnimal='" + vacunasAnimal + '\'' +
                ", adoptanteAnimal='" + adoptanteAnimal + '\'' +
                ", estadoAnimal='" + estadoAnimal + '\'' +
                '}';
    }
}
