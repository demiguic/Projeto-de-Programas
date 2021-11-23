package abstractfactory.factories;

import abstractfactory.keyboard.Keyboard;
import abstractfactory.keyboard.RGBKeyboard;
import abstractfactory.mouse.Mouse;
import abstractfactory.mouse.RGBMouse;


//Cada fábrica concreta implementa a fábrica abstrata e é responsável pela criação de produtos de um mesmo tipo.
public class RGBFactory implements  ComputerPeripherals{
    @Override
    public Keyboard createKeyboard() {
        return new RGBKeyboard();
    }

    @Override
    public Mouse createMouse() {
        return new RGBMouse();
    }
}
