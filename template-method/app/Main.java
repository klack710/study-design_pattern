public class Main {
    public static void main(String args[])
    {
        ConcreteDotPrint cdp = new ConcreteDotPrint();
        ConcreteLinePrint clp = new ConcreteLinePrint();
        cdp.templatePrint("dot");
        clp.templatePrint("line");
    }
}