/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete1;

/**
 *
 * @author Edgar Espinoza
 */
public class DocenteFactura extends Docente {
    private double valor_Factura;
    private double valor_ivaD;
    private double valor_Cancelar;
    
    public void establecerValorFactura(double v){
        
        valor_Factura = v;
        
    }
    public void establecerValorIvaD(double i){
        
        valor_ivaD = i;
        
    }
    public void calcularValorCancelar(){
        
        valor_Cancelar = valor_Factura - ((valor_Factura * valor_ivaD)/100);
        
    }
    public double obtenerValorFactura(){
        
        return valor_Factura;
        
    }
    public double obtenerValorIvaD(){
        
        return valor_ivaD;
        
    }
    public double obtenerValorCancelar(){
        
        return valor_Cancelar;
        
    }
    @Override
    public String toString(){
        
        String reporte = String.format("Nombres: %s\nCédula: %s\n"
                + "Valor Factura: %.1f\nValor iva descuento: %.1f\nValor total "
                + "a cancelar: %.1f\n", nombres, cedula, valor_Factura, valor_ivaD,
                valor_Cancelar);
        
        return reporte;
    }
}
