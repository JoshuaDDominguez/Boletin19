/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin19.metodos;

import javax.swing.*;
import java.util.*;

/**
 *
 * @author jdominguezdominguez
 */
public class Metodos {

    static String tituloM, autorM, isbnM;
    static float precioM;
    static int numUnidadesM, c = 0;

    static Libro[] listaLibro;
    static ArrayList<String> titulos = new ArrayList<String>();
    static ArrayList<String> autores = new ArrayList<String>();
    static ArrayList<String> isbn = new ArrayList<String>();
    static ArrayList<Float> precios = new ArrayList<Float>();
    static ArrayList<Integer> numUnidades = new ArrayList<Integer>();

    static Scanner sc = new Scanner(System.in);

    static public void engadir() {
        titulos.add(JOptionPane.showInputDialog("Titulo del libro"));
        //
        autores.add(JOptionPane.showInputDialog("Autor del libro"));
        //
        isbn.add(JOptionPane.showInputDialog("ISBN del libro"));
        //
        precios.add(Float.parseFloat(JOptionPane.showInputDialog("Precio del libro")));
        //
        numUnidades.add(Integer.parseInt(JOptionPane.showInputDialog("Unidades disponibles del libro")));
        //
        c++;
    }

    static public void amosarEspecifico(String titulo) {
        for (int i = 0; i < titulos.size(); i++) {

            if (titulos.get(i).equalsIgnoreCase(titulo)) {
                System.out.println(titulos.get(i));
                System.out.println(autores.get(i));
                System.out.println(isbn.get(i));
                System.out.println(precios.get(i));
                System.out.println(numUnidades.get(i));
            } else {
                System.out.println("Titulo no encontrado");
            }
        }

    }

    static public void amosarTodo() {
        for (int i = 0; i < titulos.size(); i++) {
            System.out.println(titulos.get(i));
            System.out.println(autores.get(i));
            System.out.println(isbn.get(i));
            System.out.println(precios.get(i));
            System.out.println(numUnidades.get(i));
        }
    }

    //falta excepcion de venta en negativo
    static public void vender(String titulo) {
        int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Cantidad que se vendio?"));
        for (int i = 0; i < titulos.size(); i++) {

            if (titulos.get(i).equalsIgnoreCase(titulo)) {
                numUnidades.set(i, numUnidades.get(i) - cantidad);
            } else {
                System.out.println("Titulo no encontrado");
            }
        }
    }

    static public void darDeBaixa() {
        for (int i = 0; i < titulos.size(); i++) {
            if (numUnidades.get(i).equals(0)) {
                titulos.remove(i);
                autores.remove(i);
                isbn.remove(i);
                precios.remove(i);
                numUnidades.remove(i);
            }
        }
    }

}
