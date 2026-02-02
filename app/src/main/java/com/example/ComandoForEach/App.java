
package com.example.ComandoForEach;

public class App {
    

    public static void main(String[] args) {
        
        int [] vetorNumeros = new int [] {1,2,3,4,5,6,7,8,9,10};
        
        //varrendo o vetor sem o uso do For Each
        
        System.out.println("Varrendo o vetor sem For Each");
        for (int i = 0; i < vetorNumeros.length; i++) {
            System.out.println("Nr: " + vetorNumeros[i]);
            
        }
        
        //varrenedo o vetor com o uso do For Each
        System.out.println("Varrendo o vetor com For Each");
        for(int listaNumeros: vetorNumeros){
            System.out.println("Nr: " + listaNumeros);
        }
        
        
        
        
    }
}
