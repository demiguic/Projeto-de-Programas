package abstractfactory.mouse;

//Uma variável do objeto existente
public class SimpleMouse implements Mouse{
    @Override
    public void click() {
        System.out.println("Você usou um mouse simples.");
    }
}
