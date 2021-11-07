public class MicrosoftWord implements NewFileReader {
    @Override

    public void readDocx(String nameFile){
        System.out.println("File "+nameFile+" anda akan dibuka di Microsoft Word");
    }

    public void readPdf(String nameFile){}
    public void readPptx(String nameFile){}
}