package Pengemasan;
/**
 * Class ExtraBubbleWarp merupakan salah satu jenis decorator yang 
 * akan digunakan untuk proses pengiriman pesanan jika pembeli meminta
 * penambahan bubble warp selama pengiriman
 * 
 * @author Sri Hariyati
 * @version 1.0
 */
public class ExtraBubbleWarp extends PackingDecorator {

    /**
     * Method Constructor untuk membuat objek
     * @param decorator
     */
    public ExtraBubbleWarp(Decorator decorator)
    {
        super(decorator);
    }

    /**
     * Method ini akan digunakan untuk melakukan packing
     */
    public String packing()
    {
        return super.packing() + this.packingWithExtraBubbleWarp();
    }

    /**
     * Method ini akan digunakan untuk menmpilkan jenis decorator
     * yang akan digunakan
     * @return jenis decorator
     */
    public String packingWithExtraBubbleWarp()
    {
        return " dengan tambahan Extra Bubble Warp";
    }

    
}
