public class ConcreteDotPrint extends AbstractPrint {
    public void firstLine() {
        System.out.println("...");
    }

    public void print(String str) {
        System.out.println(str);
    }

    public void lastLine() {
        System.out.println("...");
    }
}