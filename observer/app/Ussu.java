public class Ussu extends Observer{
    public void update(Subject subject) {
        if(subject.getNumber() % 5 == 0) {
            System.out.println("ウッス！");
        }
    }
}