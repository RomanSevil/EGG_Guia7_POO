/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_intro;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Java_Intro {

    /**
     * @param args the command line arguments
     */
   /* public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        int num1= leer.nextInt();
        int num2= leer.nextInt();
        int suma= num1+num2;
        System.out.println(suma);
        
                
    }*/
    
    //eje2
    /*public static void main(String[] args) {
        Scanner Leer= new Scanner(System.in);
        String nombre=Leer.next();
        System.out.println("Mi nombre es " + nombre);
        
    }*/
    
    //eje3
    /*public static void main(String[] args) {
        Scanner Leer=new Scanner(System.in) ;
        Leer.useDelimiter("\n");
        
        String frase= Leer.next();
        System.out.println(frase.toLowerCase());
    }*/
    
    //eje4
    /*public static void main(String[] args) {
        int grados=20;
        float equivalente=32+(9*grados/5);
        System.out.println(equivalente);
    }*/
    
    //eje5
    /*public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        double num=leer.nextDouble();
        System.out.println("El doble de " + num+ " es " + num*2);
        System.out.println("El triple de " + num+ " es " + num*3);
        System.out.println("La raiz cuadrada de " + num+ " es " + Math.sqrt(num));
    }*/
    
    
   /* public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int[][] matrizGrande = new int[10][10];
        int[][] matrizChica = new int[3][3];
        int cont;

        llenarMatriz(matrizGrande);

        muestraMatriz(matrizGrande);

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                matrizChica[i][j] = leer.nextInt();
            }
        }

        verificarMatriz(matrizGrande, matrizChica);
    }

    public static void llenarMatriz(int[][] matrizGrande) {

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {

                matrizGrande[i][j] = (int) (Math.random() * ((100 - 10) + 1) + 10);
            }

        }
    }

    public static void muestraMatriz(int[][] matrizGrande) {

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {

                System.out.print(matrizGrande[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public static void verificarMatriz(int[][] matrizGrande, int[][] matrizChica) {

        for (int i = 0; i < 8; i++) { 
            for (int j = 0; j < 8; j++) { 

                int cont = 0;

                for (int k = 0; k < 3; k++) { 
                    for (int l = 0; l < 3; l++) { 

                        if (matrizGrande[i + k][j + l] == matrizChica[k][l]) {
                            cont++;
                            System.out.println("i "+i);
                            System.out.println("j "+j);
                            System.out.println("k " +k);
                            System.out.println("l " +l);
                        }

                        if (cont == 9) {

                            System.out.println("Matriz encontrada en [" + i + "][" + j + "]");
                            
                        }

                    }

                }

            }
            

        }
    }*/
    
}
