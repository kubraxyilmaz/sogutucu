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
public class Agarayuzu {
    
    public Agarayuzu() throws InterruptedException
    {
        MerkeziIslemBirimi merkezi = new MerkeziIslemBirimi();
        Scanner girdi = new Scanner(System.in);
        int secim;
      
        do{
            
            System.out.println("1.Sogutucuyu ac");
            System.out.println("2.Sıcaklıgı goster");
            System.out.println("3.Sogutucuyu kapat");
            System.out.println("4.Cıkıs");
            
            
            secim=girdi.nextInt();
            while(secim<1||secim>4)
            {
                 System.out.println("Lutfen menudeki secenekleri secin");
            secim=girdi.nextInt();
            }
            
            switch(secim)
            { //Menüden seçilen işleme göre gerekli işlemlerin gerçekleştirilmesi
            case 1:
                 
                merkezi.AcmaIstegiGonder();
            break;
            case 2:
                SicaklikAlgilayici derece =new SicaklikAlgilayici();
                System.out.println("Sicaklik olculuyor, lutfen bekleyin");
                try {
                            Thread.sleep(3000);
                    } catch (InterruptedException e) {
                            e.printStackTrace();
                    }
                System.out.println(derece.SicaklikGonder()+"°C");
                

            break;
            case 3:
                
                merkezi.KapamaIstegiGonder();
                break;
        }
            
        }while(secim!=4);
        {
            System.out.println("Uygulamadan cıkılmıstır.");
        }
            
    }
}