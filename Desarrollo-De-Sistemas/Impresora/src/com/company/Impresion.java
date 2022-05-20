package com.company;

public class Impresion {

    private int id;
    private String extensionArchivo;
    private String directorioArchivo;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getExtensionArchivo() {
        return extensionArchivo;
    }

    public void setExtensionArchivo(String extensionArchivo) {
        this.extensionArchivo = extensionArchivo;
    }

    public String getDirectorioArchivo() {
        return directorioArchivo;
    }

    public void setDirectorioArchivo(String directorioArchivo) {
        this.directorioArchivo = directorioArchivo;
    }

    public Impresion(int id, String extensionArchivo, String directorioArchivo) {
        this.id = id;
        this.extensionArchivo = extensionArchivo;
        this.directorioArchivo = directorioArchivo;
    }
}
