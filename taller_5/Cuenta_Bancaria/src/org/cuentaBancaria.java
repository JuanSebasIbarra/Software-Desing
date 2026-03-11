package org;

public class cuentaBancaria {

    private double Saldo;
    private String Titular;

    public cuentaBancaria() {
        this.Saldo = 0;
        this.Titular = "";
    }

    public cuentaBancaria(double saldo, String titular) {
        this.Saldo = saldo;
        this.Titular = titular;
    }

    public double getSaldo() {
        return this.Saldo;
    }



    public void setSaldo(double saldo) {
        if (Saldo >= 0) {
            this.Saldo = Saldo;
        } else {
            System.out.println("Saldo no puede ser negativo");
        }

        this.Saldo = Saldo;


    }

    public String getTitular() {
        String hideName="";
        for (int i = 0; i < this.Titular.length(); i++) {
            if (this.Titular.charAt(i) == ' ') {
                hideName += ' ';
            }
            else if (i == 0 || this.Titular.charAt(i -1)==' ' ) {
                hideName += this.Titular.charAt(i);
            }
            else {
                hideName += "*";
            }
        }
        return hideName;
    }

    public void setTitular(String titular) {
        Titular = titular;
    }
}



