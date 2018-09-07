public class SalesForce {
    public Boolean requisition(String item_name, int price, String url)
    {
        // TODO:購買申請の具体的な実装
        if (item_name != "" && price > 0 && url != "") {
            return true;
        }
        return false;
    }
}