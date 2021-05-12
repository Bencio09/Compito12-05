/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.compito1205;

/**
 *
 * @author informatica
 */
public class Main {
    public static void main(String[] args) throws InterruptedException{
        Bancone b = new Bancone();
        int nDipendenti = 10;
        Dipendente d;
        Cuoco c;
        
        c = new Cuoco(b,nDipendenti);
        c.start();
        
        for(int i = 0; i < 10; i++){
            d = new Dipendente(b);
            d.start();
        }
        
        
        for(int i = 0; i < 10; i++){
            d = new  Dipendente(b);
            d.join();
        }
        
        System.out.println("");
    }
}
