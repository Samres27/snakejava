/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject3;

/**
 *
 * @author yosoy
 */
public class NodoDoble {
	private char a;
        private int x;
        private int y;
	private NodoDoble siguiente;
	private NodoDoble anterior;

	public NodoDoble ( int a, int b,char t) {
		this.a=t;
                this.x=a;
                this.y=b;
                
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
	public void setSiguiente ( NodoDoble next ) {
		this.siguiente = next;
	}
	public void setAnterior (NodoDoble prev) {
		this.anterior = prev;
	}
	public NodoDoble getSiguiente () {
		return this.siguiente;
	}
	public NodoDoble getAnterior () {
		return this.anterior;
	}

}

