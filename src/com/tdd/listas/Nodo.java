package com.tdd.listas;

public class Nodo {
	Double dato;
	Nodo sig;

	/**
	 * Método constructor nodo dado un dato.
	 * @param dato2
	 */
	public Nodo(Double dato){     
		this.dato = dato;
		sig = null;
	}
	/**
	 * Método constructor nodo sin parametros.                  
	 */
	public Nodo(){        
		dato =0.0; 
		sig = null;               
	}
	/**
	 * Método para asignar un dato al nodo.
	 * @param dato
	 */
	public void asignaDato(Double dato){
		this.dato = dato;
	}
	/**
	 * Método que asigna cual es el nodo que le sigue.
	 * @param x
	 */
	public void asignaSig(Nodo x){
		sig = x;
	}	
	/**
	 * Método que retorna el dato de un nodo.
	 * @return
	 */
	public Double retorneDato(){
		return(dato);
	}
	/**
	 * Método que retorna el nodo siguiente al nodo actual.
	 * @return
	 */
	public Nodo retorneSig(){
		return(sig);
	}

}
