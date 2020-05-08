/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sogutucu;

import java.util.Scanner;

/**
 *
 * @author kbryi
 */
public class User {
    

    public void Basla() throws InterruptedException
    {
        
         Scanner girdi = new Scanner(System.in);
          String kullaniciAdi="";
         String sifre="";
        System.out.println("Sogutucu'ya hosgeldiniz.");
        System.out.print("Kullanici adinizi giriniz:");
          kullaniciAdi=girdi.nextLine();
        System.out.print("Sifrenizi giriniz:");
        sifre=girdi.nextLine();
        
       
        boolean dogrulama=VeritabaniIslemleri.kullaniciDogrula(kullaniciAdi,sifre);
        if (dogrulama)
        {
             Agarayuzu arayuz=new Agarayuzu();
        }
        else
        {
            System.out.println("Kullanici dogrulanamadi.");
      
        }
    
        
}
    }
