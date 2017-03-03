package com.tdd.archivosplanos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import com.tdd.listas.ListaEnlazada;

public class LeerArchivoTxt {

	public ListaEnlazada leerArchivoDouble(String direccion) throws IOException {
		String temp;
		Double dato = 0.0;
		ListaEnlazada listaDatos = new ListaEnlazada();
		FileReader archivo = new FileReader(direccion);
		BufferedReader bufferDatos = new BufferedReader(archivo);
		while ((temp = bufferDatos.readLine()) != null) {
			dato = Double.parseDouble(temp);
			listaDatos.insertarFin(dato);
		}
		bufferDatos.close();
		return listaDatos;
	}

}
