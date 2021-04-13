/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package garadicorsa;

/**
 *
 * @author Utente
 */
public class Corridore implements Runnable{
    
    private Thread thr;

    public Corridore(String nome) {
        
        this.thr = new Thread(this, nome);
        thr.start();
        
    }

    @Override
    public void run() {
        
        for(int i = 0; i < 100; i++){
        
            System.out.println(thr.getName() + " ha percorso " + i + " metri");
            
            try {
                Thread.sleep((long)(Math.random() * 1000));
            } catch (Exception e) {
            }
        }
        System.out.println(thr.getName() + " HA CONCLUSO");
    }
    
    
}
