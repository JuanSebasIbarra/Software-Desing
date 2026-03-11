package org;
public class Main {

    public static void main(String[] args){

    cuentaBancaria miCuenta = new cuentaBancaria();
    System.out.println(miCuenta.getTitular());
    miCuenta.setSaldo(800.000);
    
    miCuenta.setTitular("Sebastian Ibarra");
    miCuenta.setSaldo(800.000);
    
    System.out.println(miCuenta.getTitular());
    miCuenta.setTitular("Sebastian");
    
    miCuenta.setSaldo(-800.000);
    System.out.println(miCuenta.getTitular());
    System.out.println(miCuenta.getSaldo());
    }
}






