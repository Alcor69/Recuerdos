/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.recuerdos;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author rb940
 */
public class Recuerdos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese su nombre: ");
        String nombre1 = scanner.nextLine();
        
        System.out.println("Ingrese el nombre de su señora: ");
        String nombre2 = scanner.nextLine();
        
        //persona 1
        System.out.println( nombre1+" Ingresa tu cantidad de tus recuerdos: ");
        int recuerdos1prs = scanner.nextInt();
        
        String[] recuerdos1 = new String[recuerdos1prs];
        System.out.println("Introduce los recuerdos de " + nombre1 + " :");
        for(int i = 0; i< recuerdos1prs; i++){
            recuerdos1[i] = scanner.nextLine();
            
        }
        
        //persona2
        System.out.println(nombre2 + " Ingresa tu cantidad de recuerdos: ");
        int recuerdos2prs = scanner.nextInt();
        
        String[] recuerdos2 = new String[recuerdos2prs];
        System.out.println("Introduce los recuerdos de " + nombre2 + " :");
        for(int i = 0; i< recuerdos2prs; i++){
            recuerdos2[i] = scanner.nextLine();
            
        }
        
        ArrayList<String> recuerdosComunes = new ArrayList<>();
        
        for(String recuerdo1 : recuerdos1){
            for(String recuerdo2 : recuerdos2){
                if(recuerdo1.equalsIgnoreCase(recuerdo2)&& !recuerdosComunes.contains(recuerdo1)){
                    recuerdosComunes.add(recuerdo1);
                
                }
            
            }
            
        }
        // Mostrar los recuerdos comunes
        if (recuerdosComunes.isEmpty()) {
            System.out.println("No hay recuerdos comunes entre " + nombre1 + " y " + nombre2 + ".");
        } else {
            System.out.println("Los recuerdos importantes de " + nombre1 + nombre2);
            for (String recuerdo : recuerdosComunes) {
                System.out.println("- " + recuerdo);
            }
        }
                
                 
        
    }
}
