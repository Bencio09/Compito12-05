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
public class Cuoco extends Thread{
    static int contaPiatti = 0;
    int nPiatto = 0;
    Bancone b;
    int nDipendenti;

    public Cuoco(Bancone b, int nDipendenti) {
        this.b = b;
        contaPiatti++;
        nPiatto = contaPiatti;
        this.nDipendenti = nDipendenti;
    }

    @Override
    public void run(){
        while (nDipendenti < 10) {            
            try {
                b.deposita(nPiatto);
                sleep((int) (Math.random() * 2000));
                
            } catch (Exception e) {
            }
        }
    }
    
    
    
    
    
        
}
