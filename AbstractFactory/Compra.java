package abstractfactory;

import abstractfactory.factories.ComputerPeripherals;
import abstractfactory.keyboard.Keyboard;
import abstractfactory.mouse.Mouse;

public class Compra {
    private final Keyboard keyboard;
    private final Mouse mouse;

    public Compra(ComputerPeripherals peripherals){
        keyboard = peripherals.createKeyboard();
        mouse = peripherals.createMouse();
    }

    public void test(){
        mouse.click();
        keyboard.write();
    }
}
