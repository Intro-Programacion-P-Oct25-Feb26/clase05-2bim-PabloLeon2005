/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete01;

import paquete02.DatoPersonal;
import paquete03.DatosUbicacion;
import paquete04.DatoAcademico;
import paquete05.DatoFinal;
import paquete06.Informe;
import paquete02.DatoTrabajo;
/**
 *
 * @author reroes
 */
public class Principal {

    public static void main(String[] args) {
        String nombre;
        String ciudad;
        String apellidoRetornado;
        String empresa;
        String direccion;
        double[] misNotas;
        double promedio;
        
        nombre = DatoPersonal.obtenerNombre();
        apellidoRetornado = DatoPersonal.obtenerApellido();
        ciudad = DatosUbicacion.obtenerCiudad();
        misNotas = DatoAcademico.obtenerNotas(4);
        promedio = DatoFinal.obtenerPromedio(misNotas);
        empresa = DatoTrabajo.obtenerNombreEmpresa();
        direccion = DatoTrabajo.obtenerDireccionEmpresa();
        Informe.Imprimir(nombre, apellidoRetornado, ciudad, empresa, direccion, misNotas, promedio);

    }
    
}
/*

Generar una solución que le permita al usuario ingresar por teclado sus 
identificativos, como serían su nombre, apellido y ciudad importando estos datos 
desde otro paquete y otra clase hacia el main; Además con ayuda de un ciclo 
repetitivo se le debe solicitar que ingrese cuatro notas obtenidas, de igual 
manera estas deberán ser importadas desde otro paquete y otra clase hacia 
el main y se las deberá guardar dentro de un arrelo unidimensional, este 
arreglo debe ser enviado a una función que con ayuda de un ciclo repetitivo
lea los datos de cada espacio del arreglo, los sume dentro de una variable
y divida la variable para la longitud de las notas ingresadas (que en este caso
sería cuatro)importando estos datos desde otro paquete y otra clase hacia el 
main finalmente desde el main se debe recopilar la información e
imprimir todo con un mensaje que debería quedar de la siguiente manera: 

Los datos ingresados son:
Nombre: Pablo
Apellido: Leon
Ciudad: Loja
Promedio: 10,00

*/
