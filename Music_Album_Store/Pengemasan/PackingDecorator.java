package Pengemasan;
/**
 * Abstrack class PackingDecorator digunakan untuk 
 * menginisiasi cara packing terhadap pesanan
 * 
 * @author Sri Hariyati
 * @version 1.0
 */
public abstract class PackingDecorator implements Decorator{
    //Objek packing 
    private Decorator decorator;

    public PackingDecorator(Decorator decorator)
    {
        this.decorator = decorator;
    }

    @Override
    public String packing()
    {
        return decorator.packing();
    }
}
