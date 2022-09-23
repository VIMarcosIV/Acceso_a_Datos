package Ejercicio_ITV;

import java.time.LocalDate;

public class coche {

    // Atributos
    String Matricula;
    String Marca;
    String Modelo;
    Double Combustible;
    String DNI_Titular;
    LocalDate Fecha_Caducidad_ITV;
    String Problemas_Encontrados;

    // Constructor


    public coche(String matricula, String marca, String modelo, Double combustible, String DNI_Titular, LocalDate fecha_Caducidad_ITV, String problemas_Encontrados) {
        Matricula = matricula;
        Marca = marca;
        Modelo = modelo;
        Combustible = combustible;
        this.DNI_Titular = DNI_Titular;
        Fecha_Caducidad_ITV = fecha_Caducidad_ITV;
        Problemas_Encontrados = problemas_Encontrados;
    }

    // Métodos


    @Override
    public String toString() {
        return "coche{" +
                "Matricula='" + Matricula + '\'' +
                ", Marca='" + Marca + '\'' +
                ", Modelo='" + Modelo + '\'' +
                ", Combustible=" + Combustible +
                ", DNI_Titular='" + DNI_Titular + '\'' +
                ", Fecha_Caducidad_ITV=" + Fecha_Caducidad_ITV +
                ", Problemas_Encontrados='" + Problemas_Encontrados + '\'' +
                '}';
    }

    public String getMatricula() {
        return Matricula;
    }

    public void setMatricula(String matricula) {
        Matricula = matricula;
    }

    public String getProblemas_Encontrados() {
        return Problemas_Encontrados;
    }

    public void setProblemas_Encontrados(String problemas_Encontrados) {
        Problemas_Encontrados = problemas_Encontrados;
    }

    public LocalDate getFecha_Caducidad_ITV() {
        return Fecha_Caducidad_ITV;
    }

    public void setFecha_Caducidad_ITV(LocalDate fecha_Caducidad_ITV) {
        Fecha_Caducidad_ITV = fecha_Caducidad_ITV;
    }

    public String getDNI_Titular() {
        return DNI_Titular;
    }

    public void setDNI_Titular(String DNI_Titular) {
        this.DNI_Titular = DNI_Titular;
    }

    public Double getCombustible() {
        return Combustible;
    }

    public void setCombustible(Double combustible) {
        Combustible = combustible;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String modelo) {
        Modelo = modelo;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }
}
