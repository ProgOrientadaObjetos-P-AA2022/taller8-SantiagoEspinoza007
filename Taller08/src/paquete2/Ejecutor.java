/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

import java.util.Locale;
import java.util.Scanner;
import paquete1.Docente;
import paquete1.DocenteFactura;
import paquete1.DocenteNombramiento;

/**
 *
 * @author reroes
 */
public class Ejecutor {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        leer.useLocale(Locale.US);

        String nombres = "";
        String dni = "";
        System.out.println("Ingrese un docente de tipo: \n"
                + "1. Nombramiento\n"
                + "2. Factura");
        int opc = leer.nextInt();

        switch (opc) {
            case 1:
                DocenteNombramiento docenteN = new DocenteNombramiento();
                DatosDocente(docenteN);
                System.out.println("Ingresar valor sueldo: ");
                double valor_S = leer.nextDouble();
                System.out.println("Ingresar valor hora extra: ");
                double valor_HE = leer.nextDouble();
                System.out.println("Ingresar número horas extra: ");
                int num_HE = leer.nextInt();
                docenteN.establecerValor_Sueldo(valor_S);
                docenteN.establecerValor_HoraE(valor_HE);
                docenteN.establecerNum_HorasE(num_HE);
                docenteN.calcularSueldo();
                System.out.println("-------DOCENTE NOMBRAMIENTO-------");
                System.out.printf("%s\n", docenteN);
                break;

            case 2:
                DocenteFactura docenteF = new DocenteFactura();
                DatosDocente(docenteF);
                System.out.println("Ingresar valor factura: ");
                double valor_F = leer.nextDouble();
                System.out.println("Ingresar valor iva descuento: ");
                double valor_ID = leer.nextDouble();
                docenteF.establecerValorFactura(valor_F);
                docenteF.establecerValorIvaD(valor_ID);
                docenteF.calcularValorCancelar();
                System.out.println("-------DOCENTE FACTURA-------");
                System.out.printf("%s\n", docenteF);
                break;

            default:
                System.out.println("Opcion ingresada incorrecta");
                break;
        }

    }

    public static void DatosDocente(Docente d) {
        Scanner leer = new Scanner(System.in);
        String nom;
        System.out.println("Ingrese los nombres: ");
        nom = leer.nextLine();
        String dni;
        System.out.println("Ingrese la cédula: ");
        dni = leer.nextLine();
        d.establecerNombres(nom);
        d.establecerCedula(dni);
    }
}
