package petshop;

import java.util.ArrayList;

public class Dono {
    private String name;
    private String cpf;
    private String address;
    private String telefone;
    private ArrayList<Gato> gatos = new ArrayList<>();
    private ArrayList<Cupom> cupons = new ArrayList<>();
    private Gato gatoFavorito;
    private double valorCobrado;


    public Dono (String nome, String cpf, String address, String telefone){
        this.name = nome;
        this.cpf = cpf;
        this.address = address;
        this.telefone = telefone;
    }

    public String getName(){
        return name;
    }

    public void setName(String nome){
        this.name = nome;
    }

    public String getCpf(){
        return cpf;
    }

    public void setCpf(String cpf){
        this.cpf = cpf;
    }

    public String getAddress(){
        return address;
    }

    public void setAddress(String address){
        this.address = address;
    }

    public String getTelefone(){
        return telefone;
    }

    public void setTelefone(String telefone){
        this.telefone = telefone;
    }

    public void addGato(Gato gato){
        this.gatos.add(gato);
    }

    public void setGatofavorito(Gato gato){
        this.gatoFavorito = gato;
    }

    public Gato getGatofavorito(){
        return gatoFavorito;
    }

    public void setValorCobrado(double valorCobrado){
        this.valorCobrado = valorCobrado;
    }

    public double getValorCobrado(){
        return this.valorCobrado;
    }

    public void mostrarGatoFavorito(){
        System.out.println("O gato favorito de " + this.getName() + " eh: " +
                this.getGatofavorito().getNomeGato());
    }

    public void addCupom (Cupom cupom){
        this.cupons.add(cupom);
    }

    public void popCupom(Cupom cupom){
        this.cupons.remove(cupom);
    }

    public Cupom getMaiorCupom(){
        int maior = 0;
        int indice = 0;

        for (int i = 0; i < this.cupons.size(); i++){
            if (this.cupons.get(i).getPorcentagem() > maior){
                indice = i;
                maior = cupons.get(i).getPorcentagem();
            }
        }
        return cupons.get(indice);
    }

    public void mostrarCupom(){
        System.out.println("-----------------");
        System.out.println("Cupons de " + this.getName() + ": \n");
        for (Cupom cupon : this.cupons) {
            System.out.println("Cupom: " + cupon.getCodigo());
        }
        System.out.println("-----------------");
    }

    public void pagarServicos(){
        System.out.println(this.getName() + " deve pagar R$:" + this.valorCobrado);
        this.valorCobrado = 0;
        System.out.println("Serviços de " + this.getName() + " pagos!");
        System.out.println("\n");
    }

    public void pagarServicosCupom(){
        if (this.cupons.size() > 0) {
            this.valorCobrado = valorCobrado - (valorCobrado * (getMaiorCupom().getPorcentagem() / 100.0));
            System.out.println(this.getName() + " deve pagar com CUPOM R$:" + this.valorCobrado);
            this.valorCobrado = 0;
            System.out.println("Serviços de " + this.getName() + " pagos!");
            this.getMaiorCupom().setAtivo(false);
            popCupom(getMaiorCupom());
            System.out.println("\n");
        }else {
            System.out.println(this.getName() + " não tem cupons.");
            System.out.println(this.getName() + " deve pagar R$:" + this.valorCobrado);
            this.valorCobrado = 0;
            System.out.println("Serviços de " + this.getName() + " pagos!");

        }
    }
}
