/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete;

/**
 *
 * @author Issei
 */
public class Algoritmo {
    
    int i,j,temporal;
    
    public Algoritmo(){
        this.i=0;
        this.j=0;
        this.temporal=0;
    }
    
    //Metodo ordenamiento Shell
    public void shell(int[] arreglo){
        int salto,i,j,k,auxiliar;
        salto=arreglo.length/2;//conforme el tamanio del arreglo sera la division y los saltos que se haran
        while(salto>0){//se termina el algoritmo cuando el minimo de slto es de 1
            for(i=salto;i<arreglo.length;i++){
                j=i-salto;
                while(j>=0){//mientras j>=0
                    k=j+salto;
                    if(arreglo[j]<=arreglo[k]){
                        break;//termina el ciclo
                    }else{
                        auxiliar=arreglo[j];
                        arreglo[j]=arreglo[k];
                        arreglo[k]=auxiliar;
                        j-=salto;//j=j-salto
                    }
                }
            }
            salto=salto/2;
        }
        System.out.println("Arreglo ordenado con shell");
        mostrarArreglo(arreglo);
    }
    
    //Muestra los datos del vector
    public void mostrarArreglo(int [] arreglo){
        int k;//creamos variable local
        for(k=0;k<arreglo.length;k++){
            System.out.print("["+arreglo[k]+"]");
        }
        System.out.println();
    }
}
