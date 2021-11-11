package petshop;

public class Cupom {
    private String codigo;
    private int porcentagem;
    private boolean ativo;

    public Cupom (String codigo, int porcentagem, boolean ativo){
        this.codigo = codigo;
        this.porcentagem = porcentagem;
        this.ativo = ativo;
    }

    public void setCodigo(String codigo){
        this.codigo = codigo;
    }

    public String getCodigo(){
        return codigo;
    }

    public void setPorcentagem(int porcentagem){
        this.porcentagem = porcentagem;
    }

    public int getPorcentagem(){
        return porcentagem;
    }

    public void setAtivo(boolean ativo){
        this.ativo = ativo;
    }

    public boolean isAtivo(){
        return ativo;
    }
}
