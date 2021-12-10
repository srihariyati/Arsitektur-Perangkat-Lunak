package Album;
/**
 * Class Abum ini akan mengatur daftar harga album yang akan ditampilkan
 * 
 * @author Sri Hariyati
 * @version 1.0
 */

 public class Album{
     private HargaAlbum hargaType;

    public void setHargaType(HargaAlbum hargaType)
    {
        this.hargaType = hargaType;
    }

    public void showHarga()
    {
        this.hargaType.album();
    }
 }