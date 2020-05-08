/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sogutucu;

/**
 *
 * @author kbryi
 */
public class MerkeziIslemBirimi {
    Eyleyici eyleyici = new Eyleyici();
   
   
    private int acikmi=0;
    
    
    public void AcmaIstegiGonder()
    {
        eyleyici.SogutucuyuAc(acikmi);
        acikmi++;
    }
    
      
    public void KapamaIstegiGonder()
    {
        eyleyici.SogutucuyuKapat(acikmi);
        acikmi=0;
    }
}
