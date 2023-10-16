public class Treno extends Controllore{
    private String alimentazione;
    private String regione;

    public Treno(String alimentazione,String regione){
        this.alimentazione=alimentazione;
        this.regione=regione;
    }
    
    public Treno(){
        this.alimentazione="diesel";
        this.regione="lombardia";
    }
    
    public Treno(Treno t){
        this.alimentazione=t.alimentazione;
        this.regione=t.regione;
    }
     
    public String getAlimentazione(){
        return this.alimentazione;
    }
    
    public String getRegione(){
        return this.regione;
    }
    
     public void setAlimentazione(String alimentazione){
        this.alimentazione=alimentazione;
    }
    
    public void setRegione(String regione){
        this.regione=regione;
    }
    @Override
    public String toString(){
        return "Il treno su cui viaggerai funziona tramite combustione a "+this.alimentazione+" nella regione "+this.regione;
    }
    
}