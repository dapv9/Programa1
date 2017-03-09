package com.tdd.estadisticatest;

import static org.junit.Assert.assertEquals;

import java.io.IOException;

import javax.swing.JOptionPane;

import org.junit.Test;

import com.tdd.archivosplanos.LeerArchivoTxt;
import com.tdd.estadisticadev.Media;
import com.tdd.listas.ListaEnlazada;

public class MediaTest {

		
	@Test
	public void testMediaListaVacia(){
		Media media = new Media();
		ListaEnlazada l1 = new ListaEnlazada();
		double mediaValor  = media.calcularMedianaLista(l1);
		assertEquals(0, mediaValor, 0);
	}
	
	@Test
	public void testMediaLista(){
		Media media = new Media();
		ListaEnlazada l1 = new ListaEnlazada();
		
		for (int i = 0; i < 10; i++) {
			l1.insertarFin(2.0);	
		}
		double mediaValor  = media.calcularMedianaLista(l1);
		assertEquals(2, mediaValor, 0);
	}
	
	@Test
	public void testMediaColumna1() {
		Media media = new Media();
		ListaEnlazada l1 = new ListaEnlazada();
		LeerArchivoTxt lectorArchivo = new LeerArchivoTxt();
		try {
			l1 = lectorArchivo.leerArchivoDouble("..\Programa1\columna1.txt");
		} catch (IOException e) {
			   JOptionPane.showMessageDialog(null,"Error: No se encontró el archivo",
			      "Advertencia",JOptionPane.WARNING_MESSAGE);
		}
		double resultadoMedia = media.calcularMedianaLista(l1);
		assertEquals(550.6, resultadoMedia, 0.005);
	}
		@Test
		public void testMediaColumna2() {
			Media media = new Media();
			ListaEnlazada l1 = new ListaEnlazada();
			LeerArchivoTxt lectorArchivo = new LeerArchivoTxt();
			try {
				l1 = lectorArchivo.leerArchivoDouble("..\Programa1\columna2.txt");
			} catch (IOException e) {
				   JOptionPane.showMessageDialog(null,"Error: No se encontró el archivo",
				      "Advertencia",JOptionPane.WARNING_MESSAGE);
			}
			double resultadoMedia = media.calcularMedianaLista(l1);
			assertEquals(60.32, resultadoMedia, 0.005);

	}

}
