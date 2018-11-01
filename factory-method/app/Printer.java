public abstract class Printer {
    // ここで各クラス毎にインスタンス化するものが
    // 異なるのがミソ？
    protected abstract Product createProduct();

    protected void print(Product product) {
        System.out.println("***");
        System.out.println(product.getOwnName());
        System.out.println("***");
    }

    public void printOwnProduct(){
        Product product = createProduct();
        print(product);
    }
}