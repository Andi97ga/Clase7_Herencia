/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clase7_pricinpalherencia;
import java.time.LocalDate;
/**
 *
 * @author User
 */
public class Animal {
    private String nombre;
    private int yearNacimiento;
    private String color;
    private String raza;
    
    public int calcularEdad(){
        return LocalDate.now().getYear()- this.yearNacimiento;
    }
    
    //getter y setters
    public int getYearNacimiento(){
        return this.yearNacimiento;
    }
    
    public void setYearNacimiento(int y){
        this.yearNacimiento=y;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
    
}
