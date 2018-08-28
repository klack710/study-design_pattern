import java.util.Random;

public class PrintRandomNumber extends Subject {
    private String subjectName = "PrintRandomNumber";
    private int number = -1;
    private Random rnd = new Random();

    public int getNumber() {
        return this.number;
    }
    public String getName() {
        return this.subjectName;
    }
    public void run() {
        this.number = this.rnd.nextInt(100) + 1;
        System.out.println(this.number);
        notifyObservers();
    }
}