package abstractfactory.keyboard;

public class SimpleKeyboard implements Keyboard{

    @Override
    public void write() {
        System.out.println("Digitando em um teclado simples...");
    }
}
