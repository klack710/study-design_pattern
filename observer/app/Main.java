public class Main {
    public static void main(String args[])
    {
        Subject prn = new PrintRandomNumber();
        Observer ussu = new Ussu();
        Observer ieee = new Ieee();
        prn.addObserver(ussu);
        prn.addObserver(ieee);

        for (int i = 0; i < 100; i++){
            prn.run();
        }
        System.out.println("End");
    }
}