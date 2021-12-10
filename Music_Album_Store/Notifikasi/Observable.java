package Notifikasi;

/**
 * interface face subject ini akan berisi method terkait hal hal yang
 * dapat dilakukan oleh obserable
 * 
 * @author Sri Hariyati
 * @version 1.0
 */

public interface Observable {
    
    /**
     * Method untuk menambah pembeli
     * @param pembeli
     */
    public void tambahPembeli(Pembeli pembeli);

    /**
     * Method untuk memberikan notifikasi
     * @param notif
     */
    public void beriNotifikasi(String notif);
}
