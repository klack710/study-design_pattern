public abstract class Factory {
    protected abstract void print(Product product);
    // ここで各クラス毎にインスタンス化するものが
    // 異なるのがミソ？
    protected abstract Product createProduct();

    // ここで実行したいものを記述している
    // ただ、ここに書かずに、ConcreteFactoryに書いても良い？
    public void printOwnProduct(){
        Product product = createProduct();
        print(product);
    }
}