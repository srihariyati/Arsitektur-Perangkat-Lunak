public class FileAdapter implements FileReader {
    NewFileReader newFileReader;

    public FileAdapter(String docType){
        if (docType.equalsIgnoreCase(".docx")){
            newFileReader = new MicrosoftWord();
        }
        else if(docType.equalsIgnoreCase(".pptx")){
            newFileReader = new MicrosoftPowerPoint();
        }
        else if(docType.equalsIgnoreCase(".pdf")){
            newFileReader = new NitroPro();
        }
    }

    @Override
    public void read(String docType, String nameFile){
         if (docType.equalsIgnoreCase(".docx")){
            newFileReader.readDocx(nameFile);
        }
        else if(docType.equalsIgnoreCase(".pptx")){
            newFileReader.readPptx(nameFile);
        }
        else if(docType.equalsIgnoreCase(".pdf")){
              newFileReader.readPdf(nameFile);
        }
    }
}