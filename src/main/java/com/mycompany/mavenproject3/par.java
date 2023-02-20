/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject3;

/**
 *
 * @author yosoy
 */
public class par {
    //movimiento elemento
    public int m=0;
    public int e=0;
    public boolean us=true;
    public par(int m, char el){
        this.m=m;
        e=el;
    }
    public boolean vacio(){
        return m!=0;
    }
}
