package Pengemasan;
/**
 * Class packing untuk melakukan pengemasan 
 * 
 * @author Sri Hariyati
 * @version 1.0
 */

public class Packing implements Decorator
{
    /**Method packing pada Decorator akan di override 
     * untuk menampilkan informasi pengemasan
     */
    @Override
    public String packing(){
        return "Pengemasan : Album pesanan anda akan dikemas rapi ";
    }
}