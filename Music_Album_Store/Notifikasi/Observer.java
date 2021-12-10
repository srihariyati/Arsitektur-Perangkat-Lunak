package Notifikasi;
/**
 * Interface Observer berisi method method terkait hal hal yang
 * dapat dilakukan oleh sebuah observer
 * 
 * @author Sri Hariyati
 * @version 1.0
 */

 public interface Observer{
     /**
      * method untuk dapat menerima notifikasi
      * @param notif
      */

      public void dapatNotifikasi(String notif);
 }