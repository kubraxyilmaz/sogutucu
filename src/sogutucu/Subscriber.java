/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sogutucu;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kbryi
 */
public class Subscriber implements IObserver{
   

    @Override

    public void update(String mesaj) {
       List kullanicilar=new ArrayList();
        for(int i=0;i<VeritabaniIslemleri.getInstance().KisiIdGonder().size();i++)
        {
            kullanicilar=VeritabaniIslemleri.getInstance().KisiIdGonder();
        }
        for(int i=0;i<VeritabaniIslemleri.getInstance().KisiIdGonder().size();i++)
        {System.out.println( kullanicilar.get(i)+" id'li kullaniciya gelen mesaj -> " + mesaj);}

    }}

