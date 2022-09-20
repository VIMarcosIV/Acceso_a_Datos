package Clase_Optional;

import java.sql.SQLOutput;

public class MainArgs {

    public static void main(String[] args) {

        String[] lista = new String[]{"coche", "moto","avión"};
        doSomething(lista);
        System.out.println();
        doSomething2("camello","cerdo","caballo","perro");

    }

    private static void doSomething(String[] args) // Primer ejemplo
    {
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
    }

    private static void doSomething2(String ...args) // Segundo ejemplo
    {
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
    }

}
