package Pengemasan;
/**
 * Class TubeParalon merupakan salah satu jenis decorator yang akan 
 * digunakan untuk prose pengiriman pesanan jika pembeli akan 
 * membeli fold poster
 *
 * @author Sri Hariyati
 * @version 1.0
 * 
 */
public class TubeParalon extends PackingDecorator{
    
    /**
     * Method Constructor untuk membuat objek
     * @param decorator
     */
    public TubeParalon(Decorator decorator)
    {
        super(decorator);
    }

    /**
     * Method untuk melakukan packaging
     */
    public String packing()
    {
        return super.packing() + this.packingWithTubeParalon();
    }

    /**
     * Method ini difunakan untuk menampilkan jenis decorator
     * yang akan digunakan
     * @return decorator
     */
    public String packingWithTubeParalon()
    {
        return " dengan tambahan Tube Paralon";
    }
}
