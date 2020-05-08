/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sogutucu;
import java.sql.*;
import java.io.FileWriter;

import java.io.IOException;

import java.io.PrintWriter;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author kbryi
 */
public class VeritabaniIslemleri {
    
     private static VeritabaniIslemleri instance;
     private PrintWriter out;
     private String kullaniciAdi= null;
     private String kullaniciId=null;
     private String sifre=null;
     private static List kisiler = new ArrayList(); 
     private static List sifreler = new ArrayList(); 
     private static List idler = new ArrayList(); 
     
   private VeritabaniIslemleri()
   {
       try
        {  
            Class.forName("org.postgresql.Driver");
            
            /***** Bağlantı kurulumu *****/
            Connection conn = (Connection) DriverManager.getConnection("jdbc:postgresql://localhost:5432/sogutucu",
                    "postgres", "admin");
            

            String sql= "SELECT \"KullaniciAdi\", \"KullaniciId\", \"sifre\"  FROM \"Internet_Kullanicisi\"";

            /***** Sorgu çalıştırma *****/
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            
            /***** Bağlantı sonlandırma *****/
            conn.close();

            

            while(rs.next())
            {
                /***** Kayda ait alan değerlerini değişkene ata *****/
                kullaniciAdi  = rs.getString("KullaniciAdi");
                kullaniciId= rs.getString("KullaniciId");
                sifre = rs.getString("sifre");
                
                kisiler.add(kullaniciAdi); 
                sifreler.add(sifre); 
                idler.add(kullaniciId);
            }
            
            /***** Kaynakları serbest bırak *****/
            rs.close();
            stmt.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
   
    public static synchronized VeritabaniIslemleri getInstance(){

            if(instance==null)

                instance = new VeritabaniIslemleri();

        return instance;
    
}
    
public List KisiIdGonder()
{
  return idler;
}


    public static boolean kullaniciDogrula(String kullaniciadi, String sifre) {
        
      VeritabaniIslemleri vtys= new VeritabaniIslemleri();
        System.out.println("Veritabani dogrulama sistemi kullanıcıyı doğruluyor...");
         try {
                            Thread.sleep(1000);
                    } catch (InterruptedException e) {
                            e.printStackTrace();
                    }

        
        
                 for(int i=0;i<kisiler.size();i++)
                    
         { 
             if(kullaniciadi.compareTo((String)(kisiler.get(i)))==0&&sifre.compareTo((String)(sifreler.get(i)))==0)
             {
                 System.out.println(kullaniciadi+ " "+ sifre+"   Kullanici dogrulandi");
                  try {
                            Thread.sleep(1000);
                    } catch (InterruptedException e) {
                            e.printStackTrace();
                    }
                  return true;
             }
            
         }

      return false;

    }

  
}