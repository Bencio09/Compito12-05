/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.compito1205;

import java.util.concurrent.Semaphore;

/**
 *
 * @author informatica
 */
public class Bancone {
    Semaphore vuoto = new Semaphore(0);
    Semaphore pieno = new Semaphore(1);
    int nPiatto = 0;
    static int contaPiatti = 0;
    
    public void deposita(int nPiatto){
        try {
            vuoto.acquire();
            System.out.println("Il piatto n° " + nPiatto + ", è pronto");
        } catch (InterruptedException e) {
        }
        
        pieno.release();
    }
    
    public int preleva(){
        try {
            pieno.acquire();
            System.out.println("Consuma " + nPiatto);
            contaPiatti++;
            nPiatto = contaPiatti;
        } catch (InterruptedException e) {
        }
        
        vuoto.release();
        
        return nPiatto;
    }
            
}
