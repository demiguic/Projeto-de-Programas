package abstractfactory.factories;

import abstractfactory.keyboard.Keyboard;
import abstractfactory.mouse.Mouse;

//Uma fábrica abstrata conhece todos os tipos abstratos de produto.

public interface ComputerPeripherals {
    Keyboard createKeyboard();
    Mouse createMouse();
}
