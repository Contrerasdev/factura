import javax.swing.*;
import java.util.Scanner;

public class Factura {
    public static void main(String[] args) {
        System.out.println("**************************");
        System.out.println("Bienvenido a nuestro local, favor, facturar");
        Scanner entradas = new Scanner(System.in);
        //Variables
        String factura;
        double articulo1, articulo2;
        double impuesto = 0.19;
        double totalImpuesto;
        double precioBruto;
        double precioTotal;
        double efectivo;
        double cambio;
        System.out.print("Ingrese el nombre de la factura: ");
        factura = entradas.nextLine();
        System.out.print("Ingrese el precio del primer articulo:");
        articulo1 = entradas.nextDouble();
        System.out.print("Ingrese el precio del segundo articulo:");
        articulo2 = entradas.nextDouble();
        precioBruto = (articulo1 + articulo2);
        totalImpuesto = (precioBruto * 0.19);
        precioTotal = (precioBruto + totalImpuesto);

        System.out.println("-----------------------------------------");
        System.out.println("Detalles");
        System.out.println("-----------------------------------------");
        System.out.println("Descripcion factura: " +factura);
        System.out.println("Costo del primer articulo: " +articulo1);
        System.out.println("Costo del Segundo articulo: " +articulo2);
        System.out.println("Precio Bruto: "+precioBruto);
        System.out.println("Impuesto: " + totalImpuesto);
        System.out.println("Precio Bruto + Impuesto: "+precioTotal);
        System.out.print("Ingrese el efectivo con el que se pago la factura:");
        efectivo = entradas.nextDouble();
        System.out.println("El cambio que dara al cliente es de: " +(efectivo - precioTotal));
        System.out.println("-----------------------------------------");
        System.out.println("El precio Bruto a pagar en ambos articulos, en la factura: " +factura+ ", es de: "   +precioBruto+ ", con un impuesto a pagar por esta compra de: " + totalImpuesto+ ", lo que se hace un pago total de:  " +precioTotal);
        System.out.println("Gracias por su compra, lo esperamos pronto...");
    }
}
