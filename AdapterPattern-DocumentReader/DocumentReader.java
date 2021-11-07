public class DocumentReader implements FileReader{
    FileReader fileReader;

    @Override
    public void read(String docType, String nameFile){
        FileAdapter fa = new FileAdapter(docType);
        if (docType.equalsIgnoreCase(".docx")){
            fa.read(docType, nameFile);
        }
        else if (docType.equalsIgnoreCase(".pptx")){
            fa.read(docType, nameFile);
        }
        else if (docType.equalsIgnoreCase(".pdf")){
            fa.read(docType, nameFile);
        }
        else {
            System.out.println("Invalid Type");
        }
    }
}