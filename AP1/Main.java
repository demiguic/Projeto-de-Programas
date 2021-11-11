package petshop;

public class Main {
    public static void main(String[] args) {

        Petshop GatoPet = new Petshop();

        //Criando os Donos
        Dono Ademir = new Dono("Ademir", "034.703.372-50", "R. Pimenta Bueno, 180",
                "92994433634");
        Dono Pedro = new Dono("Pedro", "034.342.424-50", "Manaus, AM",
                "9939439129");

        //Criando os gatos
        Gato Drogo = new Gato("Drogo", 3, "Branco", "Whiskas", Ademir);
        Gato Garfield = new Gato("Garfield", 13, "Laranja", "Lasanha", Pedro);
        Gato Miau = new Gato("Miau", 5, "Cinza", "Whiskas", Ademir);
        Gato Tom = new Gato("Thomas", 10, "Cinza", "Rato", Pedro);
        Gato Happy = new Gato("Happy", 25, "Azul", "Pedra", Ademir);


        //Atribuindo gato aos donos
        Ademir.addGato(Drogo);
        Ademir.addGato(Miau);
        Ademir.addGato(Happy);
        Pedro.addGato(Garfield);
        Pedro.addGato(Tom);

        //Definindo o gato favorito de um dono
        Pedro.setGatofavorito(Tom);

        //Exibindo o gato favorito
        Pedro.mostrarGatoFavorito();

        //Mostrar o dono de um gato
        Drogo.mostrarDono();

        //Criando cupom
        Cupom vinte = new Cupom("Vintaum", 20, true);
        Cupom quinze = new Cupom("Quinze15", 15, true);

        //Adicionado cupom aos donos
        Pedro.addCupom(vinte);
        Pedro.addCupom(quinze);

        //Mostrando os cupons de um dono
        Pedro.mostrarCupom();

        //Serviço no gato
        GatoPet.banho(Tom, "luxo");
        GatoPet.banho(Tom, "luxo");

        //Cobrança e pagamento dos serviços
        GatoPet.cobrar(Pedro);
        Pedro.pagarServicosCupom();
    }
}
