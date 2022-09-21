/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia_poo.Servicios;

import guia_poo.Entidades.Ahorcado;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class ahorcadoServicios {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Ahorcado crearJuego() {
        System.out.println("Ingrese una palabra");
        String palabra = leer.next();
        System.out.println("Ingrese el numero maximo de jugadas");
        int jugadas = leer.nextInt();

        String[] vector = new String[palabra.length()];

        int k = 0;

        for (int i = 0; i < vector.length; i++) {
            vector[i] = palabra.substring(k++, k);
        }
        /*for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i] + "");
        }*/
        Ahorcado a1 = new Ahorcado();
        a1.setPalabra(vector);
        a1.setIntentos(jugadas);
        return a1;
    }

    public int longitud(Ahorcado a1) {
        int longitud = a1.getPalabra().length;
        return longitud;
    }

    public boolean buscar(String letra, Ahorcado a1) {
        boolean esta = false;
        for (int i = 0; i < a1.getPalabra().length; i++) {
            if (letra.equalsIgnoreCase(a1.getPalabra()[i])) {
                esta = true;
                break;
            }
        }
        return esta;
    }

    public boolean encontradas(String letra, Ahorcado a1) {
        int encontradas = a1.getLetrasEncontradas();
        //int intentos = a1.getIntentos();
        String vector[] = a1.getPalabra();
        int faltantes = vector.length - encontradas;
        boolean esta = false;

        //intentos--;
        //a1.setIntentos(intentos);
        for (int i = 0; i < vector.length; i++) {

            if (letra.equalsIgnoreCase(vector[i])) {
                encontradas++;
                esta = true;

                faltantes--;
            }

        }
        a1.setLetrasEncontradas(encontradas);
        System.out.println("Numero de letras (encontradas,faltantes): " + "(" + a1.getLetrasEncontradas() + "," + faltantes + ")");

        return esta;
    }

    public void juego(Ahorcado a1) {

        int intentos = a1.getIntentos();
        do {

            System.out.println("Ingrese una letra:");
            String letra = leer.next();

            System.out.println("Longitud de la palabra: " + longitud(a1));
            if (buscar(letra, a1)) {
                System.out.println("Mensaje: La letra pertenece a la palabra");
            } else {
                System.out.println("Mensaje: La letra no pertenece  a la palabra");
            }

            if (!encontradas(letra, a1)) {
                intentos--;
                a1.setIntentos(intentos);
            }
            if (a1.getIntentos() > 0) {
                System.out.println("Numero de oportunidades restantes " + a1.getIntentos());
            } else {
                System.out.println("Mensaje: Lo sentimos, no hay más oportunidades");
            }
        } while (a1.getIntentos() > 0 && a1.getLetrasEncontradas() != a1.getPalabra().length);
        if (a1.getLetrasEncontradas() == a1.getPalabra().length) {
            System.out.println("Felicitaciones! Has ganado");
        }

    }
}
