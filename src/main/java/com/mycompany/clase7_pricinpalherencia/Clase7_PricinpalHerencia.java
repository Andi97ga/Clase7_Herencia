/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.clase7_pricinpalherencia;

/**
 *
 * @author Andres
 */
public class Clase7_PricinpalHerencia {

    public static void main(String[] args) {
//        var perro = new Animal();
//        perro.setYearNacimiento(2018);
//        System.out.println("El animal nacio en el año: "+ perro.getYearNacimiento()+
//                            " y tiene "+perro.calcularEdad()+" años");
        var gatoMama = new Gato();
        gatoMama.setColor("plomo");
        gatoMama.setNombre("Mishi");
        gatoMama.setRaza("Mestizo");
        gatoMama.setYearNacimiento(2017);
        gatoMama.setNumeroAccidentesFatales(3);
        gatoMama.setNumeroVidas(9);
        
        System.out.println("El nombre del gato es: "+gatoMama.getNombre());
        System.out.println("La raza del gato es: "+gatoMama.getRaza());
        System.out.println("El gato nacio en el año: "+gatoMama.getYearNacimiento()+
                            " y tiene "+gatoMama.calcularEdad()+" años");
        System.out.println("Un gato tiene: "+gatoMama.getNumeroVidas()+" vidas");
        System.out.println(gatoMama.getNombre()+ " a tenido "+
                           gatoMama.getNumeroAccidentesFatales()+" accidentes "+" por lo tanto le queda "
                           + gatoMama.calcularVidasRestantes()+" vidas");
    }
}
