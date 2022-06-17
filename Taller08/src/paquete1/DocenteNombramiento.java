/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete1;

/**
 *
 * @author Edgar Espinoza
 */
public class DocenteNombramiento extends Docente {

    private double valor_Sueldo;
    private double valor_HoraE;
    private int num_HorasE;
    private double sueldo;

    public void establecerValor_Sueldo(double valor) {
        valor_Sueldo = valor;
    }

    public void establecerValor_HoraE(double vH) {
        valor_HoraE = vH;
    }

    public void establecerNum_HorasE(int nH) {
        num_HorasE = nH;
    }

    public void calcularSueldo() {
        sueldo = valor_Sueldo + (num_HorasE * valor_HoraE);
    }

    public double obtenerValor_Sueldo() {
        return valor_Sueldo;
    }

    public double obtenerValor_HoraE() {
        return valor_HoraE;
    }

    public int obtenerNum_HorasE() {
        return num_HorasE;
    }

    public double obtenerSueldo() {
        return sueldo;
    }
    @Override
    public String toString(){
        
        String reporte = String.format("Nombres: %s\nCédula: %s\n"
                + "Valor Sueldo: %s\nValor Horas Estra: %.1f\nNúmero de horas extra: %d\n"
                + "Sueldo Total: %.1f", nombres, cedula, valor_Sueldo, valor_HoraE,
                num_HorasE, sueldo);
        
        return reporte;
    }
}
