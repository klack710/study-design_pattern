public class Main {
    public static void main(String args[])
    {
        ConcreteFactoryClient cc = new ConcreteFactoryClient();
        ConcreteFactoryUser cu = new ConcreteFactoryUser();
        cc.printOwnProduct();
        cu.printOwnProduct();
    }
}