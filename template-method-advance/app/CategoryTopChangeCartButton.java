public class CategoryTopChangeCartButton extends TemplateChangeCartButton {

    public void changeClickedCartButton(String button_position, int product_id) {
        System.out.println(button_position + "のカートに追加ボタンを変えるよ");
        System.out.println("製品ID:" + product_id + "のカートに追加ボタンを変えるよ");
        System.out.println("カートに追加ボタンのデザインは、大きめだよ。");
    }

    public void changeSameProductCartButton(int product_id) {
        // どのボタンのデザインを使うかは、使用する画面に依存しているので、引数で渡すことが出来ない。
        // View側で使うデザインを指定しても良いが、そこまで来るとロジックをViewに持たせてしまう
        // よって、テンプレートパターンで、オブジェクトを作り分ける
        System.out.println("製品ID:" + product_id + "のカートに追加ボタンを探して変えるよ");
        System.out.println("今回はカテTOPなので、ボタンの変更を行うよ");
    }
}