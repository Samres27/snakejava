/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject3;

/**
 *
 * @author yosoy
 */
public class ListaEnlazadaDoble {

	private NodoDoble ini;
	private NodoDoble fin;

	/*public ListaEnlazadaDoble (int[] lista) {
		System.out.println("Lista doblemente enlazada");
		System.out.println("=========================");

		this.ini = null;
		this.fin = null;

		for (int n : lista ) {
			NodoDoble nuevoNodo = new NodoDoble( 0,n,'0' );

			if (this.ini == null ) {
				this.ini = nuevoNodo;
				this.fin = nuevoNodo;
			} else {
				nuevoNodo.setAnterior(this.fin);
				this.fin.setSiguiente( nuevoNodo );
				this.fin = nuevoNodo;
			}
		}
	}*/
        public ListaEnlazadaDoble(NodoDoble l){
            l.setAnterior(l);
            l.setSiguiente(l);
            ini=l;
            fin=l;
        }
	public void retornaLista () {
		System.out.println("Recorre lista adelante");
		NodoDoble stepNodo = this.ini;
		while ( stepNodo != null ) {
			System.out.println(stepNodo.getValora()+'3' );
			stepNodo = stepNodo.getSiguiente();
		} 
	}

	public void retornaListaReversa () {
		System.out.println("Recorre lista reversa");
		NodoDoble stepNodo = this.fin;
		while ( stepNodo != null ) {
			System.out.println(stepNodo.getValora() );
			stepNodo = stepNodo.getAnterior();
		} 
	}
        public void anoiadir (NodoDoble t){
            t.setAnterior(fin);
            fin.setSiguiente(t);
            
        }


}

