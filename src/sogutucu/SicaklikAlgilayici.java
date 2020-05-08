/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sogutucu;

import java.util.Random;

/**
 *
 * @author kbryi
 */
public class SicaklikAlgilayici implements ISicaklikAlgilayici {
    
    private int sicaklik;
    
        public SicaklikAlgilayici()
        {
            Random rastgele=new Random(); 
            sicaklik=rastgele.nextInt(51);
        }
        
        public int SicaklikGonder()
        {
            return sicaklik;
        }
}
