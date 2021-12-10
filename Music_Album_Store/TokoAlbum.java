import Album.*;
import Notifikasi.*;
import Pengemasan.*;
import java.util.Scanner;

/**
 * Class TokoALbum digunakna untuk menjalankan program
 * 
 * @author Sri Hariyati
 * @version 1.0
 */
public class TokoAlbum {
    private static Scanner scanner;
    
    public static void main(String[] args)  throws InterruptedException {
        // membuat objek nama album
        Gfriend gf = new Gfriend();
        Itzy itzy = new Itzy();
        Izone izone = new Izone();

        //membuat objek pengemasan
        Decorator biasa = new Packing();
        Decorator bwarp = new ExtraBubbleWarp(new Packing());
        Decorator tube = new TubeParalon(new Packing());

        scanner = new Scanner(System.in);

        System.out.println("+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");
        System.out.println("SELAMAT DATA DI TOKO ALBUM FUTURE");
        System.out.println("+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");

        //input nama pembeli
        System.out.print("Masukkan Nama kamu : ");
        String namaString = scanner.nextLine();

        //input pilihan album
        System.out.println("Silahkan pilih album yang ingin dibeli!");
        System.out.println("1. GFRIEND 3RD ALBUM [Walpurgis Night]");
        System.out.println("2. Iz*One 4TH MINI ALBUM [One-Reeler Act IV]");
        System.out.println("3. ITZY 1ST ALBUM [Crazy in Love]");
        System.out.print("Pilihan : ");
        String albumString = scanner.nextLine();

        //kondisi jika memilih salah satu album
        if((albumString.equalsIgnoreCase("gfriend") || albumString.equalsIgnoreCase("gf") || albumString.equalsIgnoreCase("1") ) ){
            System.out.println(" ");
            System.out.println("Kamu memilih GFRIEND 3RD ALBUM [Walpurgis Night]");
            albumString =  "GFRIEND 3RD ALBUM [Walpurgis Night]";
            gf.showHarga();
        }else if((albumString.equalsIgnoreCase("izone") || albumString.equalsIgnoreCase("2") ) ){
            System.out.println(" ");
            System.out.println("Kamu memilih Iz*One 4TH MINI ALBUM [One-Reeler Act IV]");
            albumString = "Iz*One 4TH MINI ALBUM [One-Reeler Act IV]";
            izone.showHarga();
        }else if((albumString.equalsIgnoreCase("itzy") || albumString.equalsIgnoreCase("3"))){
            System.out.println(" ");
            System.out.println("Kamu memilih ITZY 1ST ALBUM [Crazy in Love]");
            albumString = "ITZY 1ST ALBUM [Crazy in Love]";
            itzy.showHarga();
        }
        else{
            //keaadan jika keyword yang dimasukkan tidak ada
            System.out.println("Ups! Album yang kamu pilih belum tersedia!\n");
            System.exit(0);
        }

        //input pilihan decorator tube paralon
        System.out.println("---------------------------------------------");
        System.out.print("Apakah kamu mau menambahkan Folded Poster? (y/n) : ");
        String fold = scanner.nextLine();

        //kondisi jika pembeli ingin menambahkan folded poster
        if( (fold.equalsIgnoreCase("ya")) || (fold.equalsIgnoreCase("y"))){
            //jika ya, konfimasi penambahan bubble warp
            System.out.print("Apakah kamu mau menambahkan Ekstra Bubble Warp? (y/n) : ");
            String bubble = scanner.nextLine();
            if( (bubble.equalsIgnoreCase("ya"))||(bubble.equalsIgnoreCase("y"))){
                //jika ya akan menampilkan decorator tube dan bubble warp
                System.out.println(tube.packing());
                System.out.println(bwarp.packing());
            }else if((bubble.equalsIgnoreCase("no"))||(bubble.equalsIgnoreCase("n"))||(bubble.equalsIgnoreCase("tidak"))){
                //jika tidak hanya menampilkan tube karena hanya membeli folded poster
                System.out.print(tube.packing());
            }
            //kondisi jika pembeli tidak membeli fold poster
        }else if((fold.equalsIgnoreCase("no"))||(fold.equalsIgnoreCase("n"))||(fold.equalsIgnoreCase("tidak"))){
            // menawarkan ekstra bubble warp
            System.out.print("Apakah kamu mau menambahkan Ekstra Bubble Warp? (y/n) : ");
            String bubble = scanner.nextLine();
            //jika ya hanya akan menambahkan bubble warp 
            if( (bubble.equalsIgnoreCase("ya"))||(bubble.equalsIgnoreCase("y"))){
                System.out.println(bwarp.packing());

                //jika tidak hanya akan packing biasa
            }else if((bubble.equalsIgnoreCase("no"))||(bubble.equalsIgnoreCase("n"))||(bubble.equalsIgnoreCase("tidak"))){
                System.out.print(biasa.packing());
            }
        }

        Toko pesanan = new Toko(albumString);
        Pembeli pembeli = new Pembeli(namaString);

        pesanan.tambahPembeli(pembeli);
        Thread.sleep(1000);
        pesanan.beriNotifikasi("pesanan kamu sedang diproses");

        Thread.sleep(1000);
        pesanan.beriNotifikasi("pesanan kamu sedang dikemas");

        Thread.sleep(1000);
        pesanan.beriNotifikasi("pesanan kamu sedang menuju ke alamat kamu");
        
        Thread.sleep(1000);
        pesanan.beriNotifikasi("pesanan kamu sudah tiba di kota kamu"); 
        
        Thread.sleep(1000);
        pesanan.beriNotifikasi("pesanan kamu sedang diantarkan ke rumah kamu"); 
        
        Thread.sleep(1000);
        pesanan.beriNotifikasi("pesanan kamu selesai"); 

    }
}
