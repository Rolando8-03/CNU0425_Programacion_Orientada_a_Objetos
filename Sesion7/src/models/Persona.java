package models;

import java.time.LocalDate;

/**
 * Clase Persona
 */

public class Persona {
    /**
     * Atributos: nombres, apellidos, fecha de nacimiento y sexo
     */
    private String nombres;
    private String apellidos;
    private LocalDate fechaNacimiento;
    private boolean sexo;

    /**
     * Constructores
     */
    public Persona() {}

    public Persona(String nombres, String apellidos, LocalDate fechaNacimiento, boolean sexo) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.fechaNacimiento = fechaNacimiento;
        this.sexo = sexo;
    }

    /**
     * Getters & Setters
     */
    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public boolean isSexo() {
        return sexo;
    }

    public void setSexo(boolean sexo) {
        this.sexo = sexo;
    }
    /**
     * toString
     */
    @Override
    public String toString() {
        return "Persona{" +
                "nombres='" + nombres + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                ", sexo=" + sexo +
                '}';
    }
}
