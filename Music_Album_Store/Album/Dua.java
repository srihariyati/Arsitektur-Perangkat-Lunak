package Album;
/**
 * Class Dua yang menginplements HargaAlbum akan mengoverride
 * method album dan akan menampilkan harga 290000
 * 
 * @author Sri Hariyati
 * @version 1.0
 */

public class Dua implements HargaAlbum{
    /**
     * Mengoverride method albbum pada interface HargaAlbum
     * untuk menampilkan harga album yang berharga 290.000
     */
    @Override
    public void album(){
       System.out.print("Harga album ini adalah Rp.290.000 \n");
    }
    
}
