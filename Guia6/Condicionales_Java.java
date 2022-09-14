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
public class Condicionales_Java {

    //eje6
    /*public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int num=leer.nextInt();
        if(num==0){
            System.out.println ("El numero " + num + " no es par ni impar");
        }else if(num%2==0){
            System.out.println("El numero " + num + " es par ");
        }
        else{
            System.out.println("El numero " + num + " es impar");
        }
    }*/
    
    //eje7
    /*public static void main(String[] args) {
        String clave="eureka";
        Scanner leer=new Scanner(System.in);
        String frase=leer.next();
        if(frase.toLowerCase().equals(clave)){
            System.out.println("CORRECTO");
        }else{
            System.out.println("INCORRECTO");
        }
        
    }*/
    
    //eje8
    /*public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        //leer.useDelimiter("\n");
        String frase=leer.nextLine();
        System.out.println(frase.length());
        if(frase.length()==8){
            System.out.println("CORRECTO");
        }else{
            System.out.println("INCORRECTO");
        }
        
    }*/
    
    //eje9
    /*public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        leer.useDelimiter("\n");
        String frase=leer.next();
        String letra=frase.substring(0,1);
        if(letra.toUpperCase().equals("A")){
            System.out.println("Correcto");
        }else{
            System.out.println("Incorrecto");
        }
    }*/
    
    //eje10
    
    /*public static void main(String[] args) {
        
        int suma=0;
        int num;
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese el limite a sumar:");
        int limite=leer.nextInt();
               
        while (suma<limite) {            
            num=leer.nextInt();
            suma += num;
            System.out.println("La suma es "+suma);
        }
    }*/
    
    //eje11
   /* public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int op;
        int num1,num2;
        String res;
        boolean salir=false;
        while(!salir){
        System.out.println("Ingrese dos numeros: " );
         num1=leer.nextInt();
         num2=leer.nextInt();
        double resultado;
        System.out.println("MENU");
        System.out.println("1.Sumar");
        System.out.println("2.Restar");
        System.out.println("3.Multiplicar");
        System.out.println("4.Dividir");
        System.out.println("5.Salir");
        System.out.println("Seleccione una opcion");
        op=leer.nextInt();
        switch(op){
            case 1:
                resultado=num1+num2;
                System.out.println("La suma es " + resultado);
                break;
            case 2:
                resultado=num1-num2;
                System.out.println("La resta es " + resultado);
                break;
            case 3:
                resultado=num1*num2;
                System.out.println("La multiplicaciom es " + resultado);
                break;
            case 4:
                if(num2==0){
                    System.out.println("Error! La division por cero no existe");
                }else{
                resultado=num1/num2;
                System.out.println("La division es " + resultado);
                } 
                break;
            case 5:
                System.out.println("¿Está seguro que desea salir del programa (S/N)?");
                res=leer.next();
                if(res.toUpperCase().equals("S")){
                salir=true;
                break; 
                }
            default:
                System.out.println("Opcion Invalida");     
        }
    }
    }*/
    
    //eje12
    /*public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        String cadena;
       
        int correcta=0;
        int incorrecta=0;
        cadena="";
        while(!cadena.equals("&&&&&")){
            cadena=leer.next();
            
            if(cadena.length()<=5 && cadena.substring(0,1).equals("X")&&cadena.substring(cadena.length()-1).equals("O")){
                correcta++;
            }else{
                incorrecta++;
            }
        }
        System.out.println( " La cantidad de lecturas correctas es " + correcta + " La cantidad de lecturas incorrectas es "  + incorrecta);
    }*/
    
    //eje13
   /* public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        
        System.out.println("Ingrese la cantidad de elementos ");
        int n=leer.nextInt();
        
        
         //fila superior
        for(int i=0;i<n;i++){
            System.out.print("*"); //print escribe en linea los asteriscos
        }
        System.out.println(" ");
        
        //columnas
        for(int i=0;i<n-2;i++){
            System.out.print("*"); // con cada nueva vuelta del bucle escribe la columna izquierda
            for(int j=0;j<n-2;j++){
            System.out.print(" "); //escribe una linea de espacios de acuerdo a n-2(2)
        }
            System.out.println("*");//al final del bucle escribe la columna derecha con salto de linea
        }
        
        //fila inferior
        for(int i=0;i<n;i++){
            System.out.print("*");
        }
        
    }*/
    
    //eje14
    /*public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        String moneda;
        System.out.println("Ingrese la cantidad de euros a convertir");
        double euro=leer.nextDouble();
        
       System.out.println("Selecciona a que moneda se convertira");
        System.out.println("dolar/yen/libra");
       moneda=leer.next();
        while(!moneda.equals("dolar") && !moneda.equals("yen") && !moneda.equals("libra")){
            System.out.println("Moneda no disponible, seleccione otra moneda");
            moneda=leer.nextLine();
    }
        convertirEuro(euro, moneda);
    }
    
    public static void convertirEuro(double euro,String moneda){
        double conversion;
        
        switch(moneda){
            case "dolar":
                conversion= euro * 1.28611 ;
                System.out.println(euro + " € " + " son " + conversion + " dolares ");
                
            break;
            case "yen":
                conversion= euro * 129.852;
                System.out.println(euro + " € " + " son " + conversion + " yenes");
            break;
            case "libra":
                conversion=euro * 0.86;
                System.out.println(euro + " € " + " son " + conversion + " libras");
            break;
            default:
                System.out.println("Moneda no disponible");
                break;
                
        }
        
    }*/
    
    //eje15
    /*public static void main(String[] args) {
        int[] array=new int[100];
        mostrarArreglo(array);
    }
    
    public static void mostrarArreglo(int[] array){
        
        for(int i=0;i<100;i++){
            
                array[i]=i+1;
    }
        for(int i=array.length-1;i>=0;i--){
            System.out.print("[" + array[i] + "]");
    }
        System.out.println(" ");
    }*/
    
    
   
}
    
