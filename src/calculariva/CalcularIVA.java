/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculariva;

/**
 *
 * @author Usuario
 */
import java.util.Scanner;

public class CalcularIVA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here     
        Scanner scanner=new Scanner(System.in);
        System.out.print("Introduce el precio del producto: ");
        double precioProducto=scanner.nextDouble();
        double iva = 0.21 * precioProducto;
        double precioConIVA = precioProducto + iva;
        System.out.println("Importe del IVA: " + iva);
        System.out.println("Precio con IVA: " + precioConIVA);
    }
    
}
