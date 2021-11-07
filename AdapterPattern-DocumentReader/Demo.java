import java.util.Scanner;

public class Demo {
    public static void main(String[] args){
        DocumentReader dr = new DocumentReader();
        Scanner scan = new Scanner(System.in);

        System.out.println("Masukkan nama dokumen dan format file :");
        String dokumen_data = scan.nextLine();
        
       if (dokumen_data.contains(".pdf")){
            dr.read(".pdf",dokumen_data);
       }
       else if(dokumen_data.contains(".docx")){
            dr.read(".docx",dokumen_data);
       }
       else if(dokumen_data.contains(".pptx")){
            dr.read(".pptx",dokumen_data);
       }
       else{
           System.out.println("Invalid Document");
       }
    }
}