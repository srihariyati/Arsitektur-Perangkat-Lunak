public class Demo{
    public static void main(String[] args){
        
        Cat puss = new CatSound();
        Duck sibek = new DuckSound();
        
        Duck donald = new DuckSound();
        Cat ubahSuara = new SoundAdapter(donald);
        
        System.out.println("-----------------------------------------");
        System.out.println("Ajang Talkshow di hutan kancil");
        System.out.println("-----------------------------------------");

        System.out.println("Seekor kucing oren yang bijaksana berkata");
        puss.miaw();
        System.out.println();

        System.out.println("Seekor bebek ijo yang tekun menuntut ilmu berkata");
        sibek.kweek();
        System.out.println();

        System.out.println("Seekor Kucing jadi-jadian tiba-tiba melintas dan berkata ");
        ubahSuara.miaw();
        System.out.println();
    }
}