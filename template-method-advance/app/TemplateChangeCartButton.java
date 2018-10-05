public abstract class TemplateChangeCartButton {
    protected abstract void changeClickedCartButton(String button_position, int product_id);
    protected abstract void changeSameProductCartButton(int product_id);
    private void attachGaEvent() {
        System.out.println("変更に使ったボタンに対してGAイベントを付与するよ");
    }

    // 基本の動作をここで記述
    public void changeCartButton(String button_position, int product_id) {
        // クリックされたボタンを、クリック済みに変える
        this.changeClickedCartButton(button_position ,product_id);

        // 同じ製品IDのボタンを探して、クリック済みに変える
        this.changeSameProductCartButton(product_id);

        // GAイベントをつけ直す
        this.attachGaEvent();
    }
}