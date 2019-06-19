/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmoburbuja;

/**
 *
 * @author Usuario
 */
public class AlgoritmoBurbuja {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] arreglo = {6,36,24,10,12};
        imprimir(arreglo);
        algoritmoSeleccion(arreglo);
        imprimir(arreglo);
    }
    public static void algoritmoSeleccion(int[] arreglo){
        for (int i = 1; i < arreglo.length-1; i++) {
            int minimo = i;
            for (int j = i+1; j < arreglo.length; j++) {
                if (arreglo[j]<arreglo[minimo]){
                    minimo = j;
                }
            }
            if(i!=minimo){
                int aux = arreglo[i];
                arreglo[i] = arreglo[minimo];
                arreglo[minimo] = aux;
            }
        }
    }
    public static void imprimir(int [] arreglo){
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i]+" ");
        }
        System.out.println();
    }
}
