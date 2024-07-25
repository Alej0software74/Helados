package org.example;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner leerTeclado = new Scanner(System.in);
        String nombreVendedor;
        int heladoSimple;
        int heladoDoble;
        int heladoEspecial;
        LocalDate fechaIngreso;

        int valorSimple;
        int valorDoble;
        int  valorEspecial;

        valorEspecial=12000;
        valorDoble=6000;
        valorSimple=3000;



        System.out.print("Nombre Vendedor: ");
        nombreVendedor=leerTeclado.nextLine();

        System.out.print("Cantidad de Helados Simple Vendidos: ");
        heladoSimple=leerTeclado.nextInt();

        System.out.print("Cantidad de Helados Doble vendidos: ");
        heladoDoble=leerTeclado.nextInt();

        System.out.print("Cantidad de Helados Especial vendidos: ");
        heladoEspecial=leerTeclado.nextInt();

        int totalVentasSimple = heladoSimple*valorSimple;
        int totalVentasDoble = heladoDoble*valorDoble;
        int totalVentasEspecial = heladoEspecial*valorEspecial;
        int totalVentasDiarias = totalVentasDoble + totalVentasEspecial + totalVentasSimple;
        int totalValorDia= heladoSimple+heladoDoble+heladoEspecial;

        System.out.println("Cantidad helados simple vendidos por dia: " +heladoSimple+ " Valor total: " +totalVentasSimple);
        System.out.println("Cantidad helados doble vendidos por dia: " +heladoDoble+ " Valor  total: " +totalVentasDoble);
        System.out.println("Cantidad helados especial vendidos por dia: " +heladoEspecial+ " Valor total: " +totalVentasEspecial);
        System.out.println("Valor total ventas: " +totalValorDia+ " Valor total helados: " +totalVentasDiarias);











    }
}