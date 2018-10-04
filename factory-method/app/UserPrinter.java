public class UserPrinter extends Printer{
    // ここで各クラス毎にインスタンス化するものが
    // 異なるのがミソ？
    protected Product createProduct() {
        return new ConcreteProductUser();
    }
}