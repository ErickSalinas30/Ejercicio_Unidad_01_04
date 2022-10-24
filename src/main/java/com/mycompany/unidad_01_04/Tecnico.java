/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.unidad_01_04;

/**
 *
 * @author usuario
 */
public class Tecnico {
    String nombre;
    int fechaNacimiento;
    int yearExperiencia;
    String lugarNacimiento;
    
    public String mostarInfo(){
        return "El tecnico "+this.nombre+" nacido en "+this.lugarNacimiento+" el año de "
                +this.fechaNacimiento+" con una preparacion de: "+this.yearExperiencia+" años";
    }
}
