package petshop;

public class Petshop {

    public Petshop() {
    }

    public void banho(Gato gato, String servico) {
        int basico = 10;
        int medio = 20;
        int luxo = 50;

        switch (servico) {
            case "basico":
                gato.getDono().setValorCobrado(gato.getDono().getValorCobrado() + basico);
            case "medio":
                gato.getDono().setValorCobrado(gato.getDono().getValorCobrado() + medio);
            case "luxo":
                gato.getDono().setValorCobrado(gato.getDono().getValorCobrado() + luxo);
        }
    }

    public void tosa(Gato gato, String servico) {
        int basico = 20;
        int medio = 30;
        int luxo = 40;

        switch (servico) {
            case "basico":
                gato.getDono().setValorCobrado(gato.getDono().getValorCobrado() + basico);
            case "medio":
                gato.getDono().setValorCobrado(gato.getDono().getValorCobrado() + medio);
            case "luxo":
                gato.getDono().setValorCobrado(gato.getDono().getValorCobrado() + luxo);
        }
    }

    public void consulta(Gato gato, String servico) {
        int basico = 100;
        int medio = 200;
        int luxo = 230;

        switch (servico) {
            case "basico":
                gato.getDono().setValorCobrado(gato.getDono().getValorCobrado() + basico);
            case "medio":
                gato.getDono().setValorCobrado(gato.getDono().getValorCobrado() + medio);
            case "luxo":
                gato.getDono().setValorCobrado(gato.getDono().getValorCobrado() + luxo);
        }
    }

    public void hotel(Gato gato, String servico) {
        int basico = 50;
        int medio = 70;
        int luxo = 100;

        switch (servico) {
            case "basico":
                gato.getDono().setValorCobrado(gato.getDono().getValorCobrado() + basico);
            case "medio":
                gato.getDono().setValorCobrado(gato.getDono().getValorCobrado() + medio);
            case "luxo":
                gato.getDono().setValorCobrado(gato.getDono().getValorCobrado() + luxo);
        }
    }

    public void cobrar(Dono dono){
        System.out.println("Valor do serviço para " + dono.getName() + ": R$" + dono.getValorCobrado());
    }
}