package Notifikasi;
import java.util.ArrayList;
/**
 * Class Toko merupakan class yang mengimplementasi interface Observable
 * dimana Toko dapat menambahkan pembeli dan menegirimkan notifikasi 
 * kepada pembeli tersebut
 * 
 * @author Sri Hariyati
 * @version 1.0
 */

public class Toko implements Observable {
    
    //Atribut pesanan album
    private String album;

    //menyimpan pembeli(observer) kedalam sebuah Arraylist
    ArrayList <Pembeli> costumer = new ArrayList<> ();

    /**
     * Method Constructor
     * @param album
     */
    public Toko(String album)
    {
        this.album = album;
    }

    @Override
    public void tambahPembeli(Pembeli pembeli)
    {
        costumer.add(pembeli);
    }

    @Override
    public void beriNotifikasi(String notif)
    {
        String iniNotif = String.format(album + " " +notif);

        for(Pembeli pembeli:costumer)
        {
            pembeli.dapatNotifikasi(iniNotif);
        }
    }



}
