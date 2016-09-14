/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author jaime
 */
public class Mixto {

    private int entero;
    private int numerador;
    private int denominador;

    public Mixto(int entero, int numerador, int denominador) throws DenominadorCeroExeption {
        this.entero = entero;
        this.numerador = numerador;
        this.denominador = denominador;
        if(denominador == 0){
            throw new DenominadorCeroExeption();
        }
    }

    public int getEntero() {
        return entero;
    }

    public void setEntero(int entero) {
        this.entero = entero;
    }

    public int getNumerador() {
        return numerador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }

    public Mixto Sumar(Mixto m2) throws DenominadorCeroExeption {
        int entero = this.getEntero() + m2.getEntero();
        int numerador = this.numerador * m2.denominador + this.denominador * m2.numerador;
        int denominador = this.denominador * m2.denominador;
        Mixto m = new Mixto(entero, numerador, denominador);
        return m;
    }
    
    public Mixto Restar(Mixto m2) throws DenominadorCeroExeption{
        int entero = this.getEntero() - m2.getEntero();
        int numerador =this.getNumerador() * m2.getDenominador() - this.getDenominador() * m2.getNumerador();
        int denominador = this.getDenominador() * m2.getDenominador();
        Mixto m = new Mixto(entero, numerador, denominador);
        return m;
    }

    public Mixto Multiplicacion(Mixto m2) throws DenominadorCeroExeption{
        int entero = this.entero * m2.getEntero();
        int numerador = this.getNumerador() * m2.getNumerador();
        int denominador = this.getDenominador() * m2.getDenominador();
        Mixto m = new Mixto(entero, numerador, denominador);
        return m;
    }
    
    public Mixto Dividir(Mixto m2) throws DenominadorCeroExeption{
        int entero = this.getEntero() / m2.getEntero();
        int numerador = this.getNumerador() * m2.getDenominador();
        int den = this.denominador * m2.getDenominador();
        Mixto m = new Mixto(entero,numerador,denominador);
        return m;
    }
}
