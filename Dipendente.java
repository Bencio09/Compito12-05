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
public class Dipendente extends Thread{
    int nPiatto;
    static int contaPiatti = 0;
    Bancone b;
    
    
    public Dipendente(Bancone b) {
        this.b = b;
        contaPiatti++;
        nPiatto = contaPiatti;
    }
    @Override
    public void run(){
        try {
            sleep((int)Math.random() * 3000);
        } catch (Exception e) {
        }
        nPiatto = b.preleva();
    }
}
