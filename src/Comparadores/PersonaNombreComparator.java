package Comparadores;

import java.util.Comparator;

public class PersonaNombreComparator implements Comparator<Persona> {

    @Override
    public int compare(Persona o1, Persona o2) {
        return o1.nombre.compareToIgnoreCase(o2.nombre);
    }
}
