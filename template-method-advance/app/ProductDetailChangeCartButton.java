public class ProductDetailChangeCartButton extends TemplateChangeCartButton {

    protected void changeClickedCartButton(String button_position, int product_id) {
        System.out.println(button_position + "のカートに追加ボタンを変えるよ");
        System.out.println("製品" + product_id + "のカートに追加ボタンを変えるよ");
        System.out.println("カートに追加ボタンのデザインは、中くらいだよ。");
    }

    protected void changeSameProductCartButton(int product_id) {
        // どの操作を行うかは、使用する画面に依存しているので、引数で渡すことが出来ない。
        // View側で行う動作を指定しても良いが、そこまで来るとロジックをViewに持たせてしまう
        // よって、テンプレートパターンで、オブジェクトを作り分ける
        System.out.println("製品ID:" + product_id + "のカートに追加ボタンを探して変えるよ");
        System.out.println("今回は製品詳細なので、該当するボタンを消すよ");
    }
}