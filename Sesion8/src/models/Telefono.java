package models;

public class Telefono {
    private String modelo;
    private String marca;
    private String procesador;
    private int memoria;

    public Telefono() {}

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public int getMemoria() {
        return memoria;
    }

    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }

    @Override
    public String toString() {
        return "Telefono{" +
                "modelo='" + modelo + '\'' +
                ", marca='" + marca + '\'' +
                ", procesador='" + procesador + '\'' +
                ", memoria=" + memoria +
                '}';
    }
}
