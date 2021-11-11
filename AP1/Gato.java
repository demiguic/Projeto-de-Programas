package petshop;

public class Gato {
    private String nomeGato;
    private int idadeGato;
    private String corGato;
    private String racao;
    private Dono dono;

    public Gato(String nomeGato, int idadeGato, String corGato, String racao, Dono dono){
        this.nomeGato = nomeGato;
        this.idadeGato = idadeGato;
        this.corGato = corGato;
        this.racao = racao;
        this.dono = dono;
    }

    public String getNomeGato(){
        return nomeGato;
    }

    public void setNomeGato(String nomeGato){
        this.nomeGato = nomeGato;
    }

    public int getIdadeGato(){
        return idadeGato;
    }

    public void setIdadeGato(int idadeGato){
        this.idadeGato = idadeGato;
    }

    public String getCorGato(){
        return corGato;
    }

    public void setCorGato(String corGato){
        this.corGato = corGato;
    }

    public String getRacao(){
        return racao;
    }

    public void setRacao(String racao){
        this.racao = racao;
    }

    public Dono getDono(){
        return dono;
    }

    public void mostrarDono(){
        System.out.println("O dono de " + getNomeGato() + " eh: " + this.dono.getName());
    }
}
