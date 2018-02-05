/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin19;

import boletin19.metodos.*;
import javax.swing.JOptionPane;

/**
 *
 * @author jdominguezdominguez
 */
public class Boletin19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //int menu = 0;
        int menu = Integer.parseInt(JOptionPane.showInputDialog("MENU\n"
                + "1 --> Añadir libro\n"
                + "2 --> Vender libro\n"
                + "3 --> Enseñar por titulo\n"
                + "4 --> Enseñar todos\n"
                + "5 --> Eliminar sin stock"));
        switch (menu) {
            case 1:
                Metodos.engadir();
                break;
            case 2:
                Metodos.vender(null);
                break;
            case 3:
                Metodos.amosarEspecifico(null);
                break;
            case 4:
                Metodos.amosarTodo();
                break;
            case 5:
                Metodos.darDeBaixa();
                break;
            default:
                    System.out.println("Numero invalido");
        }
    }

}
