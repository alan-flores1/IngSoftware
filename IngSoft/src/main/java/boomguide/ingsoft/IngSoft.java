/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package boomguide.ingsoft;
import Interfaz_Boomguide.*;
import java.util.Scanner;

/**
 *
 * @author maxwe
 */
public class IngSoft {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Selecciona la interfaz!\n1-Version a0.3  2-Version a0.3-b1\n");
        int seleccion = scanner.nextInt();
        if (seleccion == 1) {
            Interfaz vista1 = new Interfaz();
            vista1.setVisible(true);
        } else if (seleccion == 2) {
            Interfaz2 vista2 = new Interfaz2();
            vista2.setVisible(true);
        } else {
            System.out.println("Selección inválida.");
        }    }
}
