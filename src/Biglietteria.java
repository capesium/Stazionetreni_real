public class Biglietteria extends App{

    private int costo;
    private String data;
    private String tratta;

    public Biglietteria(String data, int costo, String tratta){
        this.costo=costo;
        this.tratta=tratta;   
        this.data=data;
    }
    public Biglietteria(){
        this.costo=2;
        this.data="16-10-2023";
        this.tratta="toline-darfo";
    }
    public int getCosto(){
        return this.costo;
 }
     public String getData(){
        return this.data;
 }
    public String getTratta(){
        return this.tratta;
}
 
     public void setCosto(int costo){
         this.costo=costo;
     }
     
      public void setTratta(String tratta){
         this.tratta=tratta;
     }
     public void setData(String data){
        this.data=data;
     }
     @Override
    public String toString(){
        return "Le informazioni sul biglietto sono: il costo "+this.costo+" euro, in data "+this.data+", per la tratta "+this.tratta;
    }
}