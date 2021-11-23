package abstractfactory.keyboard;

//Uma variável do objeto existente
public class RGBKeyboard implements Keyboard{
    @Override
    public void write() {
        System.out.println("Digitando no teclado RGB...");
    }
}
