/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp.jdelgadog.a05;
import java.util.Scanner;
/**
 *
 * @author GILDARDO
 */
public class SPPJDelgadoGA05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        solicitaPalabra("cual es nu nombre");
        solicitaNumero("cuanto vale pi");
        solicitaNumeroLong("cuanto es 100 elevado al cuadrado");
        solicitaCaracter("cual es la primer letra de tu apellido");
    }
    //Método para strings
        static String solicitaPalabra(String palabra){
        Scanner kb=new Scanner(System.in);
    String  a="";
    boolean flag;
    do{
        System.out.println("Introduce "+palabra);//podemos solicitar cualquier numero entero con indicacion de itroduce tal o cual cosa las veces que quieras
        try{
            a=kb.nextLine();
            flag=true;
        }catch(Exception ex){
            flag=false;
            System.out.println("El dígito tecleado no es una cadena de caracteres"+ex);
            kb.nextLine();//Resetea la memoria y borra el enter inicial y permite meter otro numero
        }
    }while(flag==false);
    return a;
    }
         //Método para double
        static double solicitaNumero(String palabra){
        Scanner kb=new Scanner(System.in);
    double i=0;
    boolean flag;
    do{
        System.out.println("Introduce " +palabra);//podemos solicitar cualquier numero entero con indicacion de itroduce tal o cual cosa las veces que quieras
        try{
            i=kb.nextDouble();
            flag=true;
        }catch(Exception ex){
            flag=false;
            System.out.println("El número insertado no es de tipo double"+ex);
            kb.nextLine();//Resetea la memoria y borra el enter inicial y permite meter otro numero
        }
    }while(flag==false);
    return i;
    }
         //Método para long
        static long solicitaNumeroLong(String palabra){
        Scanner kb=new Scanner(System.in);
    long i=0;
    boolean flag;
    do{
        System.out.println("Introduce " +palabra);//podemos solicitar cualquier numero entero con indicacion de itroduce tal o cual cosa las veces que quieras
        try{
            i=kb.nextLong();
            flag=true;
        }catch(Exception ex){
            flag=false;
            System.out.println("El número insertado no es de tipo double"+ex);
            kb.nextLine();//Resetea la memoria y borra el enter inicial y permite meter otro numero
        }
    }while(flag==false);
    return i;
    }
         //Método para double
        static char solicitaCaracter(String palabra){
        Scanner kb=new Scanner(System.in);
    char i =0;
    boolean flag;
    do{
        System.out.println("Introduce "+palabra);//podemos solicitar cualquier numero entero con indicacion de itroduce tal o cual cosa las veces que quieras
        try{
            i=kb.next().charAt(0);
            flag=true;
        }catch(Exception ex){
            flag=false;
            System.out.println("El digito insertado no es de tipo char"+ex);
            kb.nextLine();//Resetea la memoria y borra el enter inicial y permite meter otro numero
        }
    }while(flag==false);
    return i;
    }
    }
   

