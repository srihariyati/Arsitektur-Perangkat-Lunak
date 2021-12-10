package Album;
/**
 * Class Tiga yang mengimplements HargaAlbum akan mengoverride
 * method album dan dan menampilkan harga 310000
 */
public class Tiga implements HargaAlbum {
    /**
     * Mengoverride method album pada interface HargaAlbum
     * untuk menampilkan harga album yang berharga 310.000
     */
    @Override
    public void album()
    {
        System.out.print("Harga album ini adalah Rp.310.000 \n");
    }
    
}
