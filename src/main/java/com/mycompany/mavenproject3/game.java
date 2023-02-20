/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject3;

import interfaz.*;
import java.awt.*;

/**
 *
 * @author yosoy
 */
public class game{

    public static void main(String[] args) {
        interfazxx ls=new interfazxx();
        par[][] nm=ls.extraerMatriz();
        //nm[8][3]=new par(1,'C');
        //nm[7][3]=new par(2,'O');
       // ls.modificarMatriz(nm);
        ls.addKeyListener(ls);  //y ahora que ?
        cuerpo l=new cuerpo(7, 8, 'c', 1);
       
        snake sd=new snake(l);
       
        ls.insertarserpiente(sd);
        
        ls.setFocusable(true);
        ls.iniciar();
        
    }
}
