package Piedra_Papel_o_Tijera;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class MainJuego {
    public static void main(String[] args) throws ExcepcionPiedraPapelTijera {
        int opcion = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("¡Bienvenido a Piedra, papel o tijera!");
        Random rnd = new Random();
        int opcionIA = rnd.nextInt(3) + 1;
        System.out.println(opcionIA);

            System.out.println("Selecciona una opción introduciendo su número correspondiente");
            System.out.println("1.- Piedra");
            System.out.println("2.- Papel");
            System.out.println("3.- Tijera");

            try {
                opcion = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Debes seleccionar una opción de la 1 a la 3");
            }

            if (opcion >= 1 && opcion <= 3) {
                System.out.println("Se están cumpliendo las reglas del juego");
                switch (opcion) {
                    case 1://Piedra
                        opcionIA = rnd.nextInt(3) + 1;
                        opcion = 1;
                        if (opcionIA == 1) {
                            System.out.println("Jugador: Piedra = IA: Piedra");
                            System.out.println("Empate");
                        } else if (opcionIA == 2) {
                            System.out.println("Jugador: Piedra = IA: Papel");
                            System.out.println("Has perdido");
                        } else if (opcion == 3) {
                            System.out.println("Jugador: Piedra = IA: Tijera");
                            System.out.println("Has ganado");
                        }
                        break;
                    case 2://Papel
                        opcionIA = rnd.nextInt(3) + 1;
                        opcion = 2;
                        if (opcionIA == 1) {
                            System.out.println("Jugador: Papel = IA: Piedra");
                            System.out.println("Has ganado");
                        } else if (opcionIA == 2) {
                            System.out.println("Jugador: Papel = IA: Papel");
                            System.out.println("Empate");
                        } else if (opcion == 3) {
                            System.out.println("Jugador: Papel = IA: Tijera");
                            System.out.println("Has perdido");
                        }
                        break;
                    case 3://Tijera
                        opcionIA = rnd.nextInt(3) + 1;
                        opcion = 3;
                        if (opcionIA == 1) {
                            System.out.println("Jugador: Tijera = IA: Piedra");
                            System.out.println("Has perdido");
                        } else if (opcionIA == 2) {
                            System.out.println("Jugador: Tijera = IA: Papel");
                            System.out.println("Has ganado");
                        } else if (opcion == 3) {
                            System.out.println("Jugador: Tijera = IA: Tijera");
                            System.out.println("Empate");
                        }
                        break;
                    default: opcionIA = rnd.nextInt(3) + 1;
                }
            } else {
                System.out.println("Esa opción no existe, debes seguir las reglas del juego");
            }
        }
    }

