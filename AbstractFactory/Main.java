package abstractfactory;

import abstractfactory.factories.ComputerPeripherals;
import abstractfactory.factories.RGBFactory;
import abstractfactory.factories.SimpleFactory;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    private static Compra realizandoCompra(){
        Compra compra;
        ComputerPeripherals factory;
        Scanner s = new Scanner(System.in);
        String model = s.next().toLowerCase(Locale.ROOT);

        if (model.equals("rgb")){
            factory = new RGBFactory();
        }else {
            factory = new SimpleFactory();
        }
        compra = new Compra(factory);
        return compra;
    }

    public static void main(String[] args) {
        System.out.println("Escolha o tipo. Digite 'simples' ou 'rgb':");
        Compra compra = realizandoCompra();
        compra.test();
    }
}
