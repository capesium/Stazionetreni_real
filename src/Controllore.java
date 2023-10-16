public class Controllore extends Biglietteria{
    
    private String nome;
    private String cognome;
    private int età;
    private String secondo_guadagno;
    
     public Controllore(String nome,String cognome, int età, String secondo_guadagno){
        this.nome=nome;
        this.cognome=cognome;
        this.età=età;
        this.secondo_guadagno=secondo_guadagno;
    }
    
    public Controllore(){
        this.nome="nicolo";
        this.cognome="fagioli";
        this.età=22;
        this.secondo_guadagno=" e come secondo guadagno nicolò usa il metodo del calcio scommesse tramite una ludopatia aggressiva";
    }
    
    public Controllore(Controllore t){
        this.nome=t.nome;
        this.cognome=t.cognome;
        this.età=t.età;
        this.secondo_guadagno=t.secondo_guadagno;
    }
    
      public String getNome(){
        return this.nome;
    }
    
    public String getCognome(){
        return this.nome;
    }

    public int getEtà(){
        return this.età;
    }
    public String getSecondo_guadagno(){
        return this.secondo_guadagno;
    }
    
     public void setNome(String nome){
        this.nome=nome;
    }
    
    public void setCognome(String cognome){
        this.cognome=cognome;
    }

    public void setEtà(int età){
        this.età=età;
    }
    public void setSecondo_guadagno(String secondo_guadagno){
        this.secondo_guadagno=secondo_guadagno;
    }
    @Override
    public String toString(){
        return "Il controllore è "+this.nome+""+this.cognome+" di età "+this.età+" anni"+this.secondo_guadagno;
    }

}