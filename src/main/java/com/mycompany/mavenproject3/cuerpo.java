/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject3;

/**
 *
 * @author yosoy
 */

public class cuerpo {
    char a;
    int x;
    int y;
     int posm;
    private cuerpo siguiente;
    private cuerpo anterior;
    public cuerpo ( int a, int b,char t, int pos) {
		this.a=t;
                this.x=a;
                this.y=b;
                posm=pos;
                
	} 
     
     public boolean soycola(){
      return getValora()=='s';
     }
     public boolean soycabeza(){
         return getValora()=='c';
     }
     public boolean soycuerpo(){
         return getValora()=='o';
     }
     public int getPosm(){
         return posm;
     }
     public void setposm(int t){
         posm=t;
     }
     

	
	public int getValorx() {
		return this.x;
	}
        public char getValora () {
		return this.a;
	}
        public int getValory () {
		return this.y;
	}
        public void setValorx(int a) {
		x=a;
	}
        public void setValora (char b) {
		a=b;
	}
        public void setValory (int a) {
		y=a;
	}
	public void setSiguiente ( cuerpo next ) {
		this.siguiente = next;
	}
	public void setAnterior (cuerpo prev) {
		this.anterior = prev;
	}
	public cuerpo getSiguiente () {
		return this.siguiente;
	}
	public cuerpo getAnterior () {
		return this.anterior;
	}
}
