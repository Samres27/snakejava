/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject3;

import java.util.Arrays;

/**
 *
 * @author yosoy
 */
public class moviminetos {
    // movimientos para le personaje este modificara la matriz conforme los moviemientos que se tenga
    //1 ariba 2 abajo  3izquierda 4 derecha
    par [][] respuesta;
    /*
    public par[][] mover(par[][] ms,int vla,int puntaje){
        respuesta=new par[ms.length][ms.length];
        for(int i=0;i<respuesta.length;i++){Arrays.fill(respuesta[i],new par(0, ' '));}
        int vl=0;
        for(int i=0;i<ms.length;i++){
            for(int j=0;j<ms.length;j++){
                vl=vla;
                par v=ms[i][j];
                par rs=new par(0,' ');
                if(v.e == 'C'){
                    rs.e='C';
                    rs.m=vl;
                   
                }else{
                    rs.e=v.e;
                    vl=v.m;
                }
                if(v.vacio()&&vl==1&&i>0&&puntaje>0){//izquierda
                    if(v.e!='C'){rs.m=ms[i-1][j].m;}
                    rs.us=false;
                    respuesta[i-1][j]=rs;
                    puntaje--;
                    // continue;
                }
                if(v.vacio()&&vl==2&&i<ms.length-1&&puntaje>0){//derecha
                   if(v.e!='C'){rs.m=ms[i+1][j].m;}
                   rs.us=false; 
                   respuesta[i+1][j]=rs;
                     //continue;
                     puntaje--;
                }
                if(v.vacio()&&vl==3&&j<ms.length-1&&puntaje>0){//abajo
                    if(v.e!='C'){rs.m=ms[i][j+1].m;}
                    rs.us=false;
                    respuesta[i][j+1]=rs;
                     //continue;
                     puntaje--;
                }
                if(v.vacio()&&vl==4&&j>0&&puntaje>0){//ariba
                    if(v.e!='C'){rs.m=ms[i][j-1].m;}
                    rs.us=false;
                    respuesta[i][j-1]=rs;
                    puntaje--;
                    // continue;
                }
                
                  
                
                
                    
                
            }
        }
        return respuesta;
    }
*/
    public void esperar1_5(){
        try {
       //Ponemos a "Dormir" el programa durante los ms que queremos
            Thread.sleep(1000);
        }
            catch (Exception e) {
            System.out.println(e);
        }
    }
    public void esperar5_10(){
        try {
       //Ponemos a "Dormir" el programa durante los ms que queremos
            Thread.sleep(800);
        }
            catch (Exception e) {
            System.out.println(e);
        }
    }
    public void esperar10_15(){
        try {
       //Ponemos a "Dormir" el programa durante los ms que queremos
            Thread.sleep(600);
        }
            catch (Exception e) {
            System.out.println(e);
        }
    }
    public void esperar15_20(){
        try {
       //Ponemos a "Dormir" el programa durante los ms que queremos
            Thread.sleep(400);
        }
            catch (Exception e) {
            System.out.println(e);
        }
    }
    public void esperar20_25(){
        try {
       //Ponemos a "Dormir" el programa durante los ms que queremos
            Thread.sleep(200);
        }
            catch (Exception e) {
            System.out.println(e);
        }
    }
    public void esperar25_30(){
        try {
       //Ponemos a "Dormir" el programa durante los ms que queremos
            Thread.sleep(100);
        }
            catch (Exception e) {
            System.out.println(e);
        }
    }
    public void esperar30_35(){
        try {
       //Ponemos a "Dormir" el programa durante los ms que queremos
            Thread.sleep(90);
        }
            catch (Exception e) {
            System.out.println(e);
        }
    }
    public void esperar35_40(){
        try {
       //Ponemos a "Dormir" el programa durante los ms que queremos
            Thread.sleep(80);
        }
            catch (Exception e) {
            System.out.println(e);
        }
    }
    public void esperar40__(){
        try {
       //Ponemos a "Dormir" el programa durante los ms que queremos
            Thread.sleep(60);
        }
            catch (Exception e) {
            System.out.println(e);
        }
    }
    public par[][] mover(snake s, int tam,int nuevom, par[][] cont){
            respuesta=new par[tam][tam];
        for(int i=0;i<respuesta.length;i++){Arrays.fill(respuesta[i],new par(0, ' '));}
        int vl=0;
        int taas=s.getTamanio();
        s.moverTodo(nuevom, tam);
        s.crearTabla(respuesta,cont);
        return respuesta;
    }

    public void esperar45__() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
