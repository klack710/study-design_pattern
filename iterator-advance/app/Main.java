public class Main {
    public static void main(String args[])
    {
        ItemBox box = new ItemBox();
        BaseIterator ite_box = box.getIterator();

        while (ite_box.hasNext())
        {
            System.out.println(ite_box.next().getValue());
        }
    }
}