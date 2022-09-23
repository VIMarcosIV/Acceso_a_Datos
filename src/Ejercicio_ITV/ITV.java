package Ejercicio_ITV;

import java.time.LocalDate;
import java.util.HashMap;

public class ITV {
    public static void main(String[] args) {

        HashMap<String, coche> ITVList = new HashMap<>(); // Diccionario

        coche c1 = new coche("1238917893asd", "seat", "leon", 1000.0, "13123", LocalDate.of(2022, 05, 25), "Ninguno");
        coche c2 = new coche("1238917", "seat", "leon", 1000.0, "13123", LocalDate.of(2022, 05, 25), "Ninguno");
        coche c3 = new coche("1238917asd", "seat", "leon", 1000.0, "13123", LocalDate.of(2022, 05, 25), "Ninguno");
        coche c4 = new coche("1238893asd", "seat", "leon", 1000.0, "13123", LocalDate.of(2022, 05, 25), "Ninguno");
        coche c5 = new coche("1238sd", "seat", "leon", 1000.0, "13123", LocalDate.of(2022, 05, 25), "Ninguno");
        coche c6 = new coche("12sd", "seat", "leon", 1000.0, "13123", LocalDate.of(2022, 05, 25), "Ninguno");
        coche c7 = new coche("1238913asd", "seat", "leon", 1000.0, "13123", LocalDate.of(2022, 05, 25), "Ninguno");
        coche c8 = new coche("1217893asd", "seat", "leon", 1000.0, "13123", LocalDate.of(2022, 05, 25), "Ninguno");
        coche c9 = new coche("123893asd", "seat", "leon", 1000.0, "13123", LocalDate.of(2022, 05, 25), "Ninguno");
        coche c10 = new coche("1233asd", "seat", "leon", 1000.0, "13123", LocalDate.of(2022, 05, 25), "Ninguno");

        ITVList.put(c1.getMatricula(), c1);
        ITVList.put(c2.getMatricula(), c2);
        ITVList.put(c3.getMatricula(), c3);
        ITVList.put(c4.getMatricula(), c4);
        ITVList.put(c5.getMatricula(), c5);
        ITVList.put(c6.getMatricula(), c6);
        ITVList.put(c7.getMatricula(), c7);
        ITVList.put(c8.getMatricula(), c8);
        ITVList.put(c9.getMatricula(), c9);
        ITVList.put(c10.getMatricula(), c10);

        System.out.println(ITVList.get("1233asd").toString());
    }
}
