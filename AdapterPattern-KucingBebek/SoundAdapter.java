public class SoundAdapter implements Cat{
    
    Duck duck;
    public SoundAdapter(Duck duck){
        this.duck = duck;
    }

    @Override
    public void miaw(){
        duck.kweek();  
    }  
}