package com.tdd.listas;

public class ListaEnlazada {
	Nodo primero, ultimo;

	/**
	 * Método constructor de ListaEnlzada donde crea una lista vacia.
	 */
	public ListaEnlazada(){
		primero=ultimo= null;

	}
	/**
	 * Método que retorna el nodo primero  de la lista
	 * @return primero
	 */
	public Nodo primero(){
		return(primero);
	}
	/**
	 * Método que retorna el ultimo nodo de la lista
	 * @return ultimo
	 */
	public Nodo ultimo(){
		return(ultimo);
	}
	/**
	 * Método que analiza si la lista esta vacia o no
	 * @return true si está vacia
	 * 		   false si tiene un elemento o más.
	 */
	public boolean esVacia( ){
		if(primero() ==null) return(true);
		else return(false);

	}	         
	/**
	 * Método que inserta un nodo al final de la lista.
	 * @param dato
	 */
	public void insertarFin(Double dato){
		Nodo nuevoNodo = new Nodo(dato);
		if(esVacia()){
			primero = nuevoNodo;
			ultimo =  nuevoNodo;
		}
		else{
			ultimo.asignaSig(nuevoNodo);
			ultimo = nuevoNodo;    
		}       
	}    

}
