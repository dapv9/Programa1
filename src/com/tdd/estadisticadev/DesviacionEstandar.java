package com.tdd.estadisticadev;

import com.tdd.listas.ListaEnlazada;
import com.tdd.listas.Nodo;

public class DesviacionEstandar {

	public double calcularDesviacionEstandar(ListaEnlazada l1, double resultadoMedia) {
		
		if(l1.esVacia()){
			return 0;
		}
		double sumaValores = 0;
		double numeroValores = 0;
		Nodo dato = l1.primero();
		do {
			sumaValores += Math.pow((dato.retorneDato()-resultadoMedia), 2);
			dato = dato.retorneSig();
			numeroValores += 1;
		} while (dato != l1.ultimo().retorneSig());
		return Math.sqrt(sumaValores/(numeroValores-1));
	}

}
