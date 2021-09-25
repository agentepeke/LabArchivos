/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.trabajo_con_archivos;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Peke
 */
public class Main {
       
      private void escribirArchivo(String nombre, String edad, String telefono){
        try{
            FileWriter escritorArchivo = new FileWriter("agendaA.txt");
            
            escritorArchivo.write(nombre + "-");
            escritorArchivo.write(edad + "-");
            escritorArchivo.write(telefono + "-");
            
            escritorArchivo.close();
            
        }catch(IOException ex){
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
private void escribirArchivoPorTamaño(String nombre, String edad, String telefono){
        try{
            FileWriter escritorArchivo = new FileWriter("agendaA.txt");

            int nom = nombre.length();
            int ed = edad.length();
            int tel = telefono.length();
            //llenaremos el espacio del Nombre
            if(nom==30){
                escritorArchivo.write(nombre);
            }
            else if(nom<30){
                String aux="";
                for(int x = nom; x < 30; x++){
                    aux = aux + "-";
                }
                escritorArchivo.write(nombre+aux);
            }
            else{
                System.out.println("El nombre no puede ser mayor a 30 caracteres");
            }
              //llenaremos el espacio de la edad
             if(ed==2){
                escritorArchivo.write(edad);
            }
            else if(ed<2){
                String aux1="";
                for(int x = ed; x < 2; x++){
                    aux1 = aux1 + "-";
                }
                escritorArchivo.write(edad+aux1);
            }
            else{
                System.out.println("La edad no puede ser mayor a 2 caracteres");
            }
            //llenaremos el espacion del telefono
            if(tel==10){
                escritorArchivo.write(telefono);
            }
            else if(tel<10){
                String aux2="";
                for(int x = tel; x < 10; x++){
                    aux2 = aux2 + "-";
                }
                escritorArchivo.write(telefono+aux2);
            }
            else{
                System.out.println("El telefono no puede ser mayor a 8 caracteres");
            }
          
 
            escritorArchivo.close();

        }catch(IOException ex){
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }


    }
 
 
  
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        Scanner x = new Scanner(System.in);
        Main agenda = new Main();
        String nombre, edad, telefono;

        System.out.println("Ingrese el nombre del nuevo contacto: ");
        nombre = x.nextLine();
        System.out.println("Ingrese la edad del nuevo contacto: ");
        edad = x.nextLine();
        System.out.println("Ingrese el número de teléfono del nuevo contacto: ");
        telefono = x.nextLine();
        
        agenda.escribirArchivo(nombre, edad, telefono);
        agenda.escribirArchivoPorTamaño(nombre, edad, telefono);
        
        
    }
    
}

