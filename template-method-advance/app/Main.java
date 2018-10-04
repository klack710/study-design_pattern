public class Main {
    public static void main(String args[])
    {
        CategoryTopChangeCartButton ctccb = new CategoryTopChangeCartButton();
        ProductDetailChangeCartButton pdccb = new ProductDetailChangeCartButton();

        ctccb.changeCartButton("サイドカラム", 12);

        System.out.println("------");

        ctccb.changeCartButton("製品詳細", 12);

        System.out.println("------");

        pdccb.changeCartButton("サイドカラム", 12);

        System.out.println("------");

        pdccb.changeCartButton("製品詳細", 12);
    }
}