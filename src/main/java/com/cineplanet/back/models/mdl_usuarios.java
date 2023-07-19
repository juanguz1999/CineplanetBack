package com.cineplanet.back.models;

public class mdl_usuarios {
    private String correo;
    private String nombre;
    private String urlPicture;

    // Constructor
    public mdl_usuarios(String correo, String nombre, String urlPicture) {
        this.correo = correo;
        this.nombre = nombre;
        this.urlPicture = urlPicture;
    }

    // Getters y setters
    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUrlPicture() {
        return urlPicture;
    }

    public void setUrlPicture(String urlPicture) {
        this.urlPicture = urlPicture;
    }
}
