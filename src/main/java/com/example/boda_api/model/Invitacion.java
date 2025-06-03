package com.example.boda_api.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "invitados")
public class Invitacion {
    @Id
    private String id;

    private String nombreCompleto;
    private String telefono;
    private String confirmacion;
    private String restriccionesAlimenticias;
    private String acompañante;
    private String alergiasAcompañante;
    private String necesitaAutobus;
    private String cancionFavorita;

    // Getters y Setters

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getConfirmacion() {
        return confirmacion;
    }

    public void setConfirmacion(String confirmacion) {
        this.confirmacion = confirmacion;
    }

    public String getRestriccionesAlimenticias() {
        return restriccionesAlimenticias;
    }

    public void setRestriccionesAlimenticias(String restriccionesAlimenticias) {
        this.restriccionesAlimenticias = restriccionesAlimenticias;
    }

    public String getAcompañante() {
        return acompañante;
    }

    public void setAcompañante(String acompañante) {
        this.acompañante = acompañante;
    }

    public String getAlergiasAcompañante() {
        return alergiasAcompañante;
    }

    public void setAlergiasAcompañante(String alergiasAcompañante) {
        this.alergiasAcompañante = alergiasAcompañante;
    }

    public String getNecesitaAutobus() {
        return necesitaAutobus;
    }

    public void setNecesitaAutobus(String necesitaAutobus) {
        this.necesitaAutobus = necesitaAutobus;
    }

    public String getCancionFavorita() {
        return cancionFavorita;
    }

    public void setCancionFavorita(String cancionFavorita) {
        this.cancionFavorita = cancionFavorita;
    }
}
