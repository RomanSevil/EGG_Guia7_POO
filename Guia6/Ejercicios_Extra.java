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
public class Ejercicios_Extra {

    //eje1
    /*public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        
        System.out.println("Ingrese la cantidad de minutos");
        int minutos=leer.nextInt();
        int dias=0;
        int horas=0;
        int x;
        if(minutos<1440){
        
        horas=minutos/60;
        }else if(minutos>1440){
        
        dias=minutos/1440;
        x=minutos-(dias*1440);
        horas=x/60;
    }
        System.out.println("La cantidad de dias es " + dias + " , horas " + horas);
    
}*/
    //eje2
    /*public static void main(String[] args) {
        int A,B,C,D,aux;
        A=25;
        B=30;
        C=40;
        D=50;
       
        System.out.println("Valores: A " + A + " B " + B + " C " + C + " D " + D);
        aux=B;
        B=C;
        C=A;
        A=D;
        D=aux;
        System.out.println("Valores intercambiados: A " + A + " B " + B + " C " + C +" D " + D);
        
        
    }*/
    //eje3
    /*public static void main(String[] args) {
        String letra;
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese un letra");
        letra=leer.next();
        if(letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("e") || letra.equalsIgnoreCase("i") || letra.equalsIgnoreCase("o") || letra.equalsIgnoreCase("u")){
            System.out.println(letra + " es una vocal");
    }else{
            System.out.println(letra + " no es una vocal");
}
    
}*/
    //eje4
    /*public static void main(String[] args) {
        int num;
        String romano="";
        Scanner leer=new Scanner(System.in);
        
        System.out.println("Ingrese un numero entre 1 y 10");
        num=leer.nextInt();
        while(num<1 || num>10){
         System.out.println("Numero fuera de rango");
         num=leer.nextInt();
        }
       if(num>=1&&num<=9){
            switch(num){
            case 1:
            romano="I";
            break;
            case 2:
            romano="II";
            break;
            case 3:
            romano="II";
            break;
            case 4:
            romano="IV";
            break;
            case 5:
            romano="V";
            break;
            case 6:
            romano="VI";
            break;
            case 7:
            romano="VII";
            break;
            case 8:
            romano="VIII";
            break;
            case 9:
            romano="IX";
            break;
            case 10:
            romano="X";
            break;
            
        }
        System.out.println("El equivalente en romano del numero " + num+ " es " + romano);
        }
        
    }*/
    //eje5
    /*public static void main(String[] args) {
        String clase;
        double tratamiento,descuento;
        Scanner leer =new Scanner(System.in);
        System.out.println("Ingrese la clase de socio A/B/C");
        clase=leer.next();
        System.out.println("Ingrese el costo del tratamiento");
        tratamiento=leer.nextDouble();
        switch(clase.toUpperCase()){
            case "A" :
                descuento=tratamiento-tratamiento*50/100;
                System.out.println("El costo del tratamiento es " + descuento);
                break;
            case "B":
                descuento=tratamiento-tratamiento*35/100;
                System.out.println("El costo del tratamiento es " + descuento);
                break;
            case "C":
                System.out.println("El costo del tratamiento es " + tratamiento);
        }
    }*/
    //eje8
    /*public static void main(String[] args) {
        Scanner leer =new Scanner(System.in);
        int num;
        int leidos=0;
        int impar=0;
        int par=0;
        do{
            num=leer.nextInt();
            if(num>0){
            leidos++;
            //resto=num%2;
            switch(num%2){
                case 0:
                    par++;
                    break;
                case 1:
                    impar++;
                    break;
            }
        }else{
                System.out.println("El numero ingresado no es valido");
            }
        
        }while(!(num%5==0));
         System.out.println("Se leyeron " + leidos + " numeros. " + " Hay " +par+ " numeros pares. " + " Hay " +impar+ " numeros impares");
    }*/
    //eje9
    /*public static void main(String[] args) {
        Scanner leer =new Scanner(System.in);
        int num1,num2,resultado,resto;
        resultado=0;
        System.out.println("Ingrese un numero a dividir");
        num1=leer.nextInt();
        System.out.println("Ingrese el divisor");
        num2=leer.nextInt();
        resto=num1;
        do{
        resto=resto-num2;
        resultado++;
        }while(resto>=num2) ;
        System.out.println("El resultado es " + resultado + " y el residuo es " + resto);
    }*/
    //eje10
    /*public static void main(String[] args) {
        Scanner leer =new Scanner(System.in);
        int num1,num2,resultado,intento;
        boolean respuesta=false;
        num1=(int) (Math.random()*10);
        num2=(int) (Math.random()*10);
        resultado=num1*num2;
        while(!respuesta){
            System.out.println("Adivine el resultado de la multiplicacion");
            intento=leer.nextInt();
            if(intento==resultado){
                System.out.println("Adivino el resultado");
                respuesta=true;
            }else{
                System.out.println("Respuesta incorrecta");
            }
        }
    }*/
    //eje11
    /*public static void main(String[] args) {
        Scanner leer =new Scanner(System.in);
        int num,digitos,n;
        digitos=0;
        num=leer.nextInt();
        n=num;
        while(num!=0){
            digitos++;
            num=num/10;
        }
        System.out.println("El numero " + n+ " tiene "+ digitos+ " digitos ");
    }*/
    //eje16
    /*public static void main(String[] args) {
        Scanner leer =new Scanner(System.in);
        String nombre,respuesta;
        int edad,N;
        int k=0;
        boolean salir=false;
        
        System.out.println("Ingrese un numero de personas");
        N=leer.nextInt();
        do{
            for(int i=0;i<N;i++){
            System.out.println("Ingrese el nombre de la persona: ");
            nombre=leer.next();
            System.out.println("Ingrese la edad de la persona: ");
            edad=leer.nextInt();
                
            
            System.out.println("Informacion de " + nombre  );
                infoPersona(nombre,edad);
            
            System.out.println("Desea ver la informacion de la siguiente  persona");
            respuesta=leer.next();
            
            if(respuesta.equals("No")){
                salir=true;
            }else{
                k++;
            }
            if(k==N){
                salir=true;
            }  
        }
        }while(salir==false);
    }
    public static void infoPersona(String nombre,int edad){
        System.out.println("Nombre: " + nombre + " edad: " + edad);
        if(edad>=18){
            System.out.println("Es mayor de edad");
        }else{
            System.out.println("Es menor de edad");
        }
        System.out.println("");
        
    }*/
    //eje17
    /*public static void main(String[] args) {
        Scanner leer =new Scanner(System.in);
        int num;
        boolean primo;
        System.out.println("Ingrese un numero para saber si es primo");
        num=leer.nextInt();
        primo=esPrimo(num);
        if(primo){
            System.out.println("El numero "+ num + " es primo ");
        }else{
                System.out.println("El numero " + num+ " no es primo");
                }
    }
    
     public static boolean esPrimo(int num){
         boolean retorno=true;
         if(num==0 ||num==1||num==4){
             retorno=false;
             return retorno;
         }
             for(int i=2;i<num/2;i++){
                 if(num%i==0){
                     retorno=false;
                     return retorno;
                 }
             }
             return retorno;
         
     }*/
 /*public static boolean esPrimo(int num){
        boolean retorno;
        if(num%2!=0 && num%3!=0 && num%5!=0 &&num%7!=0){
            retorno=true;
        }else{
            retorno=false;
        }
        return retorno;
    }*/
    //eje23
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String[][] sopaLetras = new String[20][20];
        ingresarPalabras(sopaLetras, leer);

        imprimirSopa(sopaLetras);
    }

    public static void ingresarPalabras(String[][] sopaLetras, Scanner leer) {
        String palabra, letra;
        int num = (int) (Math.random() * 10);
        String espacio = Integer.toString(num);
        int k = 0;
        int fila = 0;

        for (int h = 0; h < 5; h++) {
            fila = (int) (Math.random() * 20);
            System.out.println("Ingrese una palabra de 3 a 5 caracteres");
            palabra = leer.next();
            while (palabra.length() > 5 || palabra.length() < 3) {
                System.out.println("La pababra no debe tener mas de 5 caracteres ni menos de 3 caracteres");
                palabra = leer.next();
            }
            if (palabra.length() >= 3 && palabra.length() <= 5) {

                k = 0;
                for (int l = 0; l < palabra.length(); l++) {

                    //letra = palabra.substring(k++, k);
                    //System.out.println(letra);
                    llenarFilas(sopaLetras, fila, palabra);

                    /*for (int j = 0; j < palabra.length(); j++) {
                            
                            sopaLetras[fila][j] = letra;
                    
                }*/
                }
            }
        }
        llenarEspacios(sopaLetras, espacio);
    }

    public static void llenarEspacios(String[][] sopaLetras, String espacio) {
        for (int i = 0; i < sopaLetras.length; i++) {
            for (int j = 0; j < sopaLetras.length; j++) {
                if (sopaLetras[i][j] == null) {
                    sopaLetras[i][j] = espacio;
                }
            }
        }
    }

    public static void llenarFilas(String[][] sopaLetras, int fila, String palabra) {

        int k = 0;
        for (int j = 0; j < palabra.length(); j++) {
            sopaLetras[fila][j] = palabra.substring(k++, k);
        }
    }

    public static void imprimirSopa(String[][] sopaLetras) {
        for (int i = 0; i < sopaLetras.length; i++) {
            for (int j = 0; j < sopaLetras.length; j++) {
                System.out.print(sopaLetras[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
}
