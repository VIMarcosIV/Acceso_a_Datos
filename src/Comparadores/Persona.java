package Comparadores;

public class Persona implements Comparable<Persona> {

    int edad;
    String nombre;

    // Getters y setters
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Constructor
    public Persona(int edad, String nombre) {
        this.edad = edad;
        this.nombre = nombre;
    }

    // toString()
    @Override
    public String toString() {
        return "Persona{" +
                "edad=" + edad +
                ", nombre='" + nombre + '\'' +
                '}';
    }


    // Devolver un 0 si son iguales
    // Devolver un 1 si this (este objeto en el que estamos) es > (mayor) que el argumento
    // Devolver un -1 si el argumento es mayor que el objeto this
    @Override
    public int compareTo(Persona o) {
//        if (this.edad == o.edad) return 0;
//        else if (this.edad > o.edad) return 1;
//        else return -1;
        return Integer.compare(this.edad, o.edad);
    }
}
