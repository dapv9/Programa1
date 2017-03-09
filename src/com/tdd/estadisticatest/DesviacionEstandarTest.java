package com.tdd.estadisticatest;

import static org.junit.Assert.assertEquals;

import java.io.IOException;

import javax.swing.JOptionPane;

import org.junit.Test;

import com.tdd.archivosplanos.LeerArchivoTxt;
import com.tdd.estadisticadev.DesviacionEstandar;
import com.tdd.estadisticadev.Media;
import com.tdd.listas.ListaEnlazada;

public class DesviacionEstandarTest {

	@Test
	public void desviacionEstandarColumna1() {
		DesviacionEstandar desviacion = new DesviacionEstandar();
		ListaEnlazada l1 = new ListaEnlazada();
		Media m1 = new Media();
		LeerArchivoTxt lectorArchivo = new LeerArchivoTxt();
		try {
			l1 = lectorArchivo.leerArchivoDouble("..\Programa1\columna1.txt");
		} catch (IOException e) {
			   JOptionPane.showMessageDialog(null,"Error: No se encontró el archivo",
			      "Advertencia",JOptionPane.WARNING_MESSAGE);
		}
		double resultadoMedia = m1.calcularMedianaLista(l1);
		double resultadoDesviacionEstandar = desviacion.calcularDesviacionEstandar(l1, resultadoMedia);
		assertEquals(572.03, resultadoDesviacionEstandar, 0.004);

	}
	@Test
	public void desviacionEstandarColumna2() {
		DesviacionEstandar desviacion = new DesviacionEstandar();
		ListaEnlazada l1 = new ListaEnlazada();
		Media m1 = new Media();
		LeerArchivoTxt lectorArchivo = new LeerArchivoTxt();
		try {
			l1 = lectorArchivo.leerArchivoDouble("..\Programa1\columna2.txt");
		} catch (IOException e) {
			   JOptionPane.showMessageDialog(null,"Error: No se encontró el archivo",
			      "Advertencia",JOptionPane.WARNING_MESSAGE);
		}
		double resultadoMedia = m1.calcularMedianaLista(l1);
		double resultadoDesviacionEstandar = desviacion.calcularDesviacionEstandar(l1, resultadoMedia);
		assertEquals(62.26, resultadoDesviacionEstandar, 0.005);

	}

}
