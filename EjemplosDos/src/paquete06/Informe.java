/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete06;

/**
 *
 * @author PC
 */
public class Informe {

    public static void Imprimir(String a, String b, String c, String d, String e, double[] f, double g) {
        String cadena = "";
        for (int i = 0; i < f.length; i++) {
            cadena += f[i] + " / ";
        }
        System.out.printf("\n\nLos datos ingresados son:\n"
                + "Nombre: %s\n"
                + "Apellido: %s\n"
                + "Ciudad: %s\n"
                + "Nombre de la empresa: %s\n"
                + "Dirección de la empresa: %s\n"
                + "Notas: %s\n"
                + "Promedio: %s\n",
                a,
                b,
                c,
                d,
                e,
                cadena,
                g);

    }
}
