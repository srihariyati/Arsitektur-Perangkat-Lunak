
import java.util.Scanner;

public class StrategyPattern
{
    private static Scanner scanner;
   public static void main(String[] args)
   {
    Blue blue = new Blue();
    Pink pink = new Pink();
    Green green = new Green();
    
    System.out.println("~ Blue");
    System.out.println("~ Pink");
    System.out.println("~ Green");
    System.out.print("Pilih Tiket yang anda inginkan : ");
    scanner = new Scanner(System.in);
    String pilihan = scanner.next();
    //System.out.print("Tiket yang kamu pilih adalah : " + pilihan);

    if("Blue".equalsIgnoreCase(pilihan)) 
    {
        blue.lihatHarga();
        blue.lihatPosisi();
    }

    if("Pink".equalsIgnoreCase(pilihan)) 
    {
        pink.lihatHarga();
        pink.lihatPosisi();
    }

    if("Green".equalsIgnoreCase(pilihan)) 
    {
        green.lihatHarga();
        green.lihatPosisi();
    }

   }
}
