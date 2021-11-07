public class MicrosoftPowerPoint implements NewFileReader{
    @Override
    
    public void readDocx(String nameFile){}
    public void readPdf(String nameFile){}

    public void readPptx(String nameFile){
          System.out.println("File "+nameFile+" anda akan dibuka di Microsoft Power Point");
    }
}