
public class TiketKonser
{
  private HargaBehavior hargaType;
  private PosisiBehavior posisiType;

  public void lihatHarga() {
      this.hargaType.harga();
  } 

 public void lihatPosisi(){
     this.posisiType.posisi();
 }
// set value 
  public void setHargaType(HargaBehavior hargaType){
      this.hargaType = hargaType;
  }

  public void setPosisiType(PosisiBehavior posisiType){
      this.posisiType = posisiType;
  }

}
