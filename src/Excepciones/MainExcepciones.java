package Excepciones;

import org.iesch.MiExcepcion.MiExcepcion;

import java.util.LinkedList;
import java.util.List;


public class MainExcepciones {
    public static void main(String[] args) {
        //exampleArithmeticException();

        //checkedException();

//        try {
//            checkedException2();
//            System.out.println("¿Este mensaje se verá?"); //No se mostrará
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//            System.out.println();
//            throw new RuntimeException(e);
//        } finally {
//            System.out.println("Siempre se ejecuta, haya error o no");
//        }

//        try {
//            checkedTwoExceptions(false);
//        } catch (RuntimeException e) {
//            System.out.println(e.getMessage());
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }

//        try {
//            uncheckedTwoExceptions(false);
//        } catch (ArithmeticException e) {
//            System.out.println(e.getMessage());
//        } catch (RuntimeException e) {
//            System.out.println(e.getMessage());
//        }

//        try {
//            uncheckedTwoExceptions2(true);
//        } catch (ArithmeticException | NullPointerException e) {
//            System.out.println(e.getMessage());
//        }

//        try {
//            throw new MiExcepcion("Error random");
//        } catch (MiExcepcion e) {
//            System.out.println(e.getMessage());
//            //throw new RuntimeException(e);
//        }

//        stackOverflow(0);

        ourOfMemory();
    }

    // Unchecked Exceptions
    static private void uncheckedTwoExceptions(boolean flag) throws RuntimeException, ArithmeticException {
        if (flag) {
            throw new ArithmeticException("Arithmetic Exception");
        } else throw new RuntimeException("Runtime");
    }

    // Unchecked Exceptions
    static private void uncheckedTwoExceptions2(boolean flag) throws ArithmeticException, NullPointerException {
        if (flag) {
            throw new ArithmeticException("Arithmetic Exception");
        } else throw new NullPointerException("NullPointer");
    }

    // Checked Exceptions
    private static void checkedTwoExceptions(boolean flag) throws Exception {
        if (flag) {
            throw new Exception("Excepción común");
        } else throw new RuntimeException("Runtime");
    }

    //Checked Exceptions
    private static void checkedException() {
        try {
            throw new Exception("Mensaje de error");
        } catch (Exception e) {
            System.out.println(e.getMessage()); // Lógica de negocio
        }
    }

    // Checked Exceptions
    private static void checkedException2() throws Exception {
        throw new Exception("Excepción lanzada");
    }

    // Unchecked Exceptions
    public static void exampleArithmeticException() {
        double numero = 10 / 0;
        System.out.println(numero);
    }

    // Stack Overflow
    public static void stackOverflow(int num) {
        num++;
        stackOverflow(num);
    }

    // Out off memory
    public static void ourOfMemory() {
        List<byte[]> list = new LinkedList<>();
        int index = 1;

        while (true) {
            byte[] b = new byte[10 * 1024 * 1024]; // 10MB byte object
            list.add(b);
            Runtime rt = Runtime.getRuntime();
            System.out.printf("[%3s] Memoria restante en la pila: %s%n", index++, rt.freeMemory());
        }
    }
}
