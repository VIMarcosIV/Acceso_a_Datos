package Comparadores;

import java.util.*;
import java.util.stream.Collectors;

public class MainComparadores {
    public static void main(String[] args) {

        Persona p1 = new Persona(20, "Pepe");
        Persona p2 = new Persona(18, "Ana");
        Persona p3 = new Persona(25, "Luis");
        Persona p4 = new Persona(30, "Vivas");

        System.out.println("Comparable");
        List<Persona> lista = new ArrayList<>();
        lista.add(p1);
        lista.add(p2);
        lista.add(p3);
        lista.add(p4);

        System.out.println("Sin ordenar");
        for (Persona p : lista) System.out.println(p);

        System.out.println();

        System.out.println("Ordenado");
        Collections.sort(lista);
        for (Persona p : lista) System.out.println(p);

        System.out.println();

        System.out.println("Usando interfaz Comparator");
        PersonaNombreComparator pComparator = new PersonaNombreComparator();
        Collections.sort(lista, pComparator);
        for (Persona p : lista) System.out.println(p);

        System.out.println();

        System.out.println("Con programacion funcional, Lambda");
        Comparator<Persona> viejuno = (v1, v2) -> Integer.compare(v1.getEdad(), v2.getEdad());
        Persona p5 = new Persona(85, "Antonio Jose Perez Navarro");
        lista.add(p5);
        Collections.sort(lista, viejuno);
//        for (Persona p : lista) System.out.println(p);
        lista.stream().forEach(System.out::println);

        System.out.println();

        System.out.println("Lista");
        Instrumento i1 = new Instrumento("Cuerda", "Guitarra", 45);
        Instrumento i2 = new Instrumento("Percusión", "Batería", 96);
        Instrumento i3 = new Instrumento("Cuerda", "Guitarra", 45);

        List<Instrumento> array = new ArrayList<>();
        array.add(i1);
        array.add(i2);
        array.add(i3);

        array.forEach(System.out::println);

        System.out.println();

        // Con el TreeSet quitamos los repetidos
        System.out.println("TreeSet");
        TreeSet<Instrumento> treeSet = new TreeSet<>();
        treeSet.add(i1);
        treeSet.add(i2);
        treeSet.add(i3);
        treeSet.forEach(System.out::println);

        System.out.println();

        System.out.println("TreeMap");
        TreeMap<Integer, Instrumento> map = new TreeMap<>();
        map.put(1, i1);
        map.put(2, i2);
        map.put(3, i3);

        System.out.println(map.get(1));
        System.out.println(map.get(2));
        System.out.println(map.get(3));

        System.out.println();

        System.out.println("");


    }
}
