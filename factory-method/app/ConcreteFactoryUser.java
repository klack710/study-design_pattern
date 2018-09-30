public class ConcreteFactoryUser extends Factory{
    protected void print(Product product) {
        System.out.println("---");
        System.out.println(product.getOwnName());
        System.out.println("---");
    }
    // ここで各クラス毎にインスタンス化するものが
    // 異なるのがミソ？
    protected Product createProduct() {
        return new ConcreteProductUser();
    }
}