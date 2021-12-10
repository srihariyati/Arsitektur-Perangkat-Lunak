package Album;
/** CLass Gfriend merupakan salah satu jenis album 
 * dimana harga album ini akan dideklarasikan di class Tiga 
 * dengan harga 310.000
 * 
 * @author Sri Hariyati
 * @version 1.0
 */

public class Gfriend extends Album{

    //Method untuk mengatur harga untuk album Gfriend
    public Gfriend(){
        setHargaType(new Tiga());
    }
}
