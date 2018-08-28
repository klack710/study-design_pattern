public class Ieee extends Observer{
    public void update(Subject subject) {
        if(subject.getNumber() % 3 == 0) {
            System.out.println("イエー！");
        }
    }
}