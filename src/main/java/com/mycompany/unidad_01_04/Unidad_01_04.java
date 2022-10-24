/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.unidad_01_04;

/**
 *
 * @author usuario
 */
public class Unidad_01_04 {

    public static void main(String[] args) {
        var ecuador = new Seleccion();
        ecuador.codigoFIFA="ECU";
        ecuador.nombre="Federación Ecuatoriana de Fútbol (FEF)";
        ecuador.participacionesMundial=4;
        
        System.out.println(ecuador.obtienePais());
        
        var chile = new Seleccion();
        chile.codigoFIFA="CHI";
        chile.nombre="Federación Chilena de Fútbol (FCF)";
        chile.participacionesMundial=9;
        
        System.out.println(ecuador.obtienePais());
        
        var guardiola=new Tecnico();
        guardiola.fechaNacimiento=1971;
        guardiola.lugarNacimiento="España";
        guardiola.nombre="Josep Guardiola";
        guardiola.yearExperiencia=15;
        
        System.out.println(guardiola.mostarInfo());
        
        var mou= new Tecnico();
        mou.fechaNacimiento=1963;
        mou.lugarNacimiento="Portugal";
        mou.nombre="Jose Mourinho";
        mou.yearExperiencia=22;
        
        System.out.println(mou.mostarInfo());
        
        var enner = new Jugador();
        enner.nombre="Enner Valencia";
        enner.posicion="Goleador";
        enner.fechaNacimiento=1989;
        enner.equipo=ecuador;
        
        var byron = new Jugador();
        byron.nombre="Byron Castillo";
        byron.posicion="Defensa";
        byron.fechaNacimiento=1998;
        byron.equipo=ecuador;
        
        var reyArturo = new Jugador();
        reyArturo.nombre="Arturo Vidal";
        reyArturo.posicion="Mediocampo";
        reyArturo.fechaNacimiento=1987;
        reyArturo.equipo=chile;
        
        
        System.out.println(enner.mostrarInfo());
        System.out.println(byron.mostrarInfo());
        System.out.println(reyArturo.mostrarInfo());
        
        
        
        
        
    }
    
}
