/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.unidad_01_04;

/**
 *
 * @author usuario
 */
public class Seleccion {
    String codigoFIFA;
    String nombre;
    int participacionesMundial;
    Tecnico director;
        
    public String obtienePais(){
        var retorno="Desconocido";
                
        switch (codigoFIFA) {
            case "ECU":
                retorno="ECUADOR";
                break;
            case "ARG":
                retorno="ARGENTINA";
                break;
            case "BRA":
                retorno="BRASIL";
                break;
            case "CHI":
                retorno="CHILE";
                break;
            
            default:
                throw new AssertionError();
        }
        
        return retorno;
    }
    
}
