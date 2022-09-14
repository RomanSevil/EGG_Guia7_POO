/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_intro;

//import java.util.Scanner;


//public class Vectores_Matrices {

    //eje16
    /*public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector: ");
        int n= leer.nextInt();
        int[] vector= new int[n]; 
       
        
        llenarArreglo(vector);
        System.out.println("Ingrese un numero a buscar: ");
        int num=leer.nextInt();
        System.out.println("El numero se encuentra en la posicion " + buscarNumero(vector,num) + " y se encuentra repetido " + repeticiones(vector,num) + " veces");
        
    }
    
    public static void llenarArreglo(int[] vector){
        for(int i=0;i<vector.length;i++){
            vector[i]=(int)(Math.random()*10);
        }
        for(int i=0;i<vector.length;i++){
            System.out.print(vector[i] + " ");
        }
    }
    public static int buscarNumero(int[] vector,int num) {
        
        int j;
        
        for(int i=0;i<vector.length;i++){
            if(vector[i]==num){
                j=i;
                return j;        
            }
        }
       return -1;
    }
    
    public static int repeticiones(int [] vector,int num){
        int cont=0;
        for(int i=0;i<vector.length;i++){
            if(vector[i]==num){
                cont++;
            }
        }
        return cont;
    }*/
    
    
    //eje17
    /*
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int n=leer.nextInt();
        int[] vector=new int[n];
        llenarArray(vector);
        contarDigitos(vector);
    }
    
    public static void llenarArray(int [] vector){
        for(int i=0;i<vector.length;i++){
            vector[i]=(int) (Math.random()*15000);
        }
        
        for(int i=0;i<vector.length;i++){
            System.out.print(vector[i] + " ");
        }
    }
    
    public static void contarDigitos(int [] array){
        int nDigits;
        int unDigito=0;
        int dosDigitos=0;
        int tresDigits=0;
        int cuatroDigits=0;
        int cincoDigits=0;
        
        for(int i=0;i<array.length;i++){
            nDigits=String.valueOf(array[i]).length();
            //System.out.println(nDigits);
            switch (nDigits) {
                case 1:
                    unDigito++;
                    break;
                case 2:
                    dosDigitos++;
                    break;
                case 3:
                    tresDigits++;
                    break;
                case 4:
                    cuatroDigits++;
                    break;
                case 5:
                    cincoDigits++;
                    break;
                default:
                    break;
            }
        }
        System.out.println(" ");
        System.out.println("Numeros de un digito: " + unDigito);
        System.out.println("Numeros de dos digitos: " + dosDigitos);
        System.out.println("Numeros de tres digitos: " + tresDigits);
        System.out.println("Numeros de cuatro digitos: " + cuatroDigits);
        System.out.println("Numeros de cinco digitos: " + cincoDigits);
    } 
    */
    
    //eje18
    /*public static void main(String[] args) {
        int[][] matriz= new int[4][4];
        llenarMatriz(matriz);
        matrizTranspuesta(matriz);
    }
    
    public static void llenarMatriz( int[][]matriz){
        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz.length;j++){
                matriz[i][j]=(int)(Math.random()*99);
            }
        }
        
        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz.length;j++){
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println(" ");
        }
    }
    
    public static void matrizTranspuesta(int [][]matriz){
        int aux;
        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz.length;j++){
                //cuando i es mayor a j, se invierten los indices por ejemplo en la posicion 1,0 esta el 26, y luego invierte sus indices y queda en la posicion [0][1]. En la posicion [0][1] estaba el 81 y luego paso a la posicion[1][0]   
                if(i>j){//26 1,0
            aux=matriz[i][j]; //aux=26 
            matriz[i][j]=matriz[j][i]; //26[1][0]=81[0][1]
            matriz[j][i]=aux; //  [0][1]=26
                }
                    
            }
        }
        
        System.out.println(" ");
        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz.length;j++){
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println(" ");
        }
        
    }*/
    
    //eje19
    /*public static void main(String[] args) {
        //int[][] matriz=new int[3][3];
       int matriz[][]={{0,-2,4},{2,0,2},{-4,-2,0}};
       int [][]mn=new int[3][3];
       int [][] transpuesta=new int[3][3];
       int antiSimetrica;
       antiSimetrica=0;
      imprimirMatriz(matriz);
      
       
       matrizNegativa(matriz,mn);
       
       System.out.println("Matriz negativa: ");
       imprimirMatriz(mn);
       
       transponerMatriz(matriz,transpuesta);
       System.out.println("Matriz transpuesta:");
        imprimirMatriz(transpuesta);
        
       for(int i=0;i<matriz.length;i++){
           for(int j=0;j<matriz.length;j++){
               if(transpuesta[i][j]==mn[i][j]){
                   antiSimetrica++;
               }
           }
       }
       
       if(antiSimetrica==9){
           System.out.println("La matriz es antisimetrica");
       }else{
           System.out.println("La matriz no es antisimetrica ");
       }
    }
    
    
    public static void imprimirMatriz(int [][] matriz){
        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz.length;j++){
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println(" ");
        }
    }
    public static void transponerMatriz(int [][] matriz,int [][]transpuesta){
         for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz.length;j++){
                transpuesta[i][j]=matriz[j][i];
            }
        
    }
    }
    
    public static void matrizNegativa(int [][]matriz,int[][]mn){
        
        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz.length;j++){
               mn[i][j]=-matriz[i][j];
            }       
    } 
    }*/
    
    //eje20
   /* public static void main(String[] args) {
        //int[][] matriz=new int[3][3];
        Scanner leer=new Scanner(System.in);
        int matriz[][]={{2,7,6},{9,5,1},{4,3,8}};
        //llenarMatriz(matriz,leer);
        imprimirMatriz(matriz);
        
        int sumaBase= 0;
        for(int i=0;i<matriz.length;i++){
            
            sumaBase+=matriz[0][i];
        }
        System.out.println(" ");
        //System.out.println(sumaBase);
       
        
       
        if(sumaHorizontal(matriz, sumaBase) && sumaColumnas(matriz) && sumaDiagonal(matriz)){
            System.out.println("La suma es " + sumaBase);
            System.out.println("La matriz es mágica");
        }else{
            System.out.println("La matriz no es magica");
        }
        
    }
    /*public static void llenarMatriz(int [][]matriz,Scanner leer){
        int num;
        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz.length;j++){
                System.out.println("Ingrese un numero entre 1 y 9");
                num=leer.nextInt();
                while(num>9 && num>1){
                    System.out.println("Numero fuera de rango");
                    num=leer.nextInt();
                }
                if(num<=9&&num>=1){
                    matriz[i][j]=num;
                }
            }  
        }
    }*/
    
    /*public static boolean sumaDiagonal(int[][] matriz){
        boolean magica=false;
        int diag1=0;
        int diag2=0;
        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz.length;j++){
                if(i==j){
                    diag1+=matriz[i][j]; 
                }
                if(i+j==matriz.length-1){
                    diag2 += matriz[i][j];
                    
                }
            }
        }
        //System.out.println(diag1);
        //System.out.println(diag2);
        if(diag1==diag2){
            magica=true;
        }
        return magica;
    }
    
    public static boolean sumaColumnas(int [][]matriz){
        boolean magica;
        int primeraSuma=0;
        int sumaVer;
        int k=0;
        for(int i=0;i<matriz.length;i++){
            primeraSuma+=matriz[i][0];
        }
        
        for(int i=0;i<matriz.length;i++){
            sumaVer=0;
            for(int j=0;j<matriz.length;j++){
                sumaVer += matriz[j][i];
            }
            
            if(sumaVer==primeraSuma){
            k++;
        }
        }
        
        if(k==matriz.length){
            magica=true;
        }else{
            magica=false;
        }
        return magica;
        
    }
    
    public static boolean sumaHorizontal(int [][] matriz, int sumaBase){
        boolean magica;
        int suma;
        int k=0;
        for(int i=0;i<matriz.length;i++){
            suma=0;
            for(int j=0;j<matriz.length;j++){
                suma += matriz[i][j];
            }
            
            if(suma==sumaBase){
                k++;
            }
        }
        if(k==matriz.length){
            magica=true;
        }else{
            magica=false;
        }
       
        return magica;

    }
    
    
    public static void imprimirMatriz(int [][]matriz){
        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz.length;j++){
                System.out.print( matriz[i][j] + " ");
            }
            System.out.println(" ");
        }
    }*/
    
    //eje21
    
    /*public static void main(String[] args) {
        //int [][] M=new int[10][10];
        int M[][]={{1,26,36,47,5,6,72,81,95,10},{11,26,36,77,5,66,72,88,95,10},{1,26,36,47,5,28,72,81,97,10},{1,26,63,47,4,6,72,81,9,10},{32,76,79,1,36,5,67,96,12,11},{99,13,54,88,89,90,75,12,41,76},{67,78,87,45,14,22,26,42,66,78},{98,46,34,47,5,6,72,81,95,10},{24,67,96,47,85,16,62,36,93,24},{21,68,78,98,95,67,12,41,36,12}};
        int P [][] ={{36,5,67},{89,90,75},{14,22,26}};
       
        
        
        boolean log=false;
        
       
         filas:
                    for (int i = 0; i < M.length - P.length + 1; i++) {
                        columnas:
                        for (int j = 0; j < M.length - P[0].length + 1; j++) {
                            for (int k = 0; k < P.length; k++) {
                                for (int l = 0; l < P[0].length; l++) {
                                    if (M[i + k][j + l] != P[k][l]) {
                                        System.out.println("i "+i);
                                        System.out.println("j "+j);
                                        System.out.println("k "+k);
                                        System.out.println("l "+l);
                                        continue columnas;
                                    }
                                }
                            }
                            
                            
                        System.out.println("submatriz encontrada en fila " +i+ " columna " + j );
                        log=true;
                        break filas;
                        
                        
                        }
                        
                    }
                    if(log==false){
                            System.out.println("Matriz no encontrada");
                        } 
        
    }
}*/
   //System.out.println(M.length-P.length+1);
        
                       
        
        
   /* for(int i=0;i<M.length;i++){
            for(int j=0;j<M.length;j++){
                System.out.print(M[i][j] + " ");
            }
            System.out.println(" ");
        }
               
            
                    for(int i=0;i<M.length-P.length+1;i++){
                        for(int j=0;j<M.length-P.length+1;j++){
                            int contador=0;
                            for(int k=0;k<P.length;k++){
                                for(int l=0;l<P.length;l++){
                                    if(M[i+k][j+l]==P[k][l]){
                                        contador++;
                                    }
                                    if(contador==9){
                                        log=true;
                                        System.out.println("Matriz encontrada en fila " + i + " columna "+j);
                                    }
                                }
                            }
                        }
                    }
                    if(log==false){
                        System.out.println("Matriz no encontrada");
                    }*/

    


    
