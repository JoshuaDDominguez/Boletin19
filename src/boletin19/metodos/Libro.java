/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin19.metodos;

/**
 *
 * @author jdominguezdominguez
 */
public class Libro {

    String titulo, autor, isbn;
    float precio;
    int numUnidades;

    public Libro() {
    }

    public Libro(String titulo, String autor, String isbn, float precio, int numUnidades) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.precio = precio;
        this.numUnidades = numUnidades;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public float getPrecio() {
        return precio;
    }

    public int getNumUnidades() {
        return numUnidades;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public void setNumUnidades(int numUnidades) {
        this.numUnidades = numUnidades;
    }

}
