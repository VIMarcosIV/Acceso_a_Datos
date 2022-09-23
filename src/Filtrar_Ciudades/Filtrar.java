package Filtrar_Ciudades;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Filtrar {
    public static void main(String[] args) {
        File file = new File("MOCK_DATA_city.txt");
        FileReader fr = null;
        ArrayList<String> lst = new ArrayList<>();
        ArrayList<String> lstFinal = new ArrayList<>();
        try {
            fr = new FileReader(file);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        BufferedReader br = new BufferedReader(fr);

        try {
            String line = br.readLine();
            while (line != null) {
                lst.add(line);
                line = br.readLine();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                fr.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        // Lo mismo pero con funciones lambda que en teoría son mas legibles
        // lst.stream().forEach(city -> System.out.println(city));

        // lst.stream().forEach(System.out::println);

//        for (int i = 0; i < lst.size(); i++) {
//            if (lst.get(i).startsWith("B")) {
//                lstFinal.add(lst.get(i));
//            }
//        }
//
//        for (int j = 0; j < lstFinal.size(); j++) {
//            System.out.println(lstFinal.get(j));
//        }

        List<String> filtrado = new ArrayList<>();
        filtrado = lst.stream().filter(city -> city.startsWith("B")).filter(city -> city.contains("n")).collect(Collectors.toList());
        filtrado.forEach(System.out::println);


        // .parallel() lo que hace es repartir la tarea a realizar entre los núcleos de la cpu, lo cual agiliza el proceso
        //  filtrado = filtrado.stream().parallel().filter(city -> city.startsWith("B")).filter(city -> city.contains("n")).collect(Collectors.toList());
        //  filtrado.forEach(System.out::println);
    }
}
