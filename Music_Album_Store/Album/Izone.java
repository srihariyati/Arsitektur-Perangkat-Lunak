package Album;
/**
 * Class Izone merupakan salah satu jenis album 
 * dimana harga labum ini akan dideklarasikan di class Dua
 * dengan harga 290.000
 */

public class Izone extends Album{
    
    //method untuk mengatur harga album Izone
   public Izone(){
       setHargaType(new Dua());
   }
    
}
