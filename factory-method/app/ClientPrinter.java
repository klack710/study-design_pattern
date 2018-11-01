public class ClientPrinter extends Printer {
    // ここで各クラス毎にインスタンス化するものが
    // 異なるのがミソ？
    protected Product createProduct() {
        return new ConcreteProductClient();
    }
}