package Comparadores;

import java.util.Objects;

public class Instrumento implements Comparable<Instrumento> {

    String Tipo;
    String Nombre;
    int valor;

    // Constructor vacio
    public Instrumento() {
    }

    // Constructor
    public Instrumento(String tipo, String nombre, int valor) {
        Tipo = tipo;
        Nombre = nombre;
        this.valor = valor;
    }

    // Getters y setters
    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String tipo) {
        Tipo = tipo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    // toString()
    @Override
    public String toString() {
        return "Instrumento{" +
                "Tipo='" + Tipo + '\'' +
                ", Nombre='" + Nombre + '\'' +
                ", valor=" + valor +
                '}';
    }

    // equals y hashCode para comparar los objetos
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Instrumento that = (Instrumento) o;
        return valor == that.valor && Objects.equals(Tipo, that.Tipo) && Objects.equals(Nombre, that.Nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Tipo, Nombre, valor);
    }

    public int compareTo(Instrumento o) {
        return Integer.compare(this.valor, o.valor);
    }
}
