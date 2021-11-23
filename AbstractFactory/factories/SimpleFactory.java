package abstractfactory.factories;

import abstractfactory.keyboard.Keyboard;
import abstractfactory.keyboard.SimpleKeyboard;
import abstractfactory.mouse.Mouse;
import abstractfactory.mouse.SimpleMouse;

//Cada fábrica concreta implementa a fábrica abstrata e é responsável pela criação de produtos de um mesmo tipo.
public class SimpleFactory implements ComputerPeripherals{
    @Override
    public Keyboard createKeyboard() {
        return new SimpleKeyboard();
    }

    @Override
    public Mouse createMouse() {
        return new SimpleMouse();
    }
}
