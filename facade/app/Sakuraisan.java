public class Sakuraisan {
    public String getLicense(String item_name, int price, String url)
    {
        LegalDepartment ld = new LegalDepartment();
        SalesForce sf = new SalesForce();

        // 法務チェック、購買申請
        if(ld.checkLegal(item_name) && sf.requisition(item_name, price, url)) {
            // 購入
            return this.getLicenseCode(item_name, price, url);
        }
        return "";
    }

    public String getLicenseCode(String item_name, int price, String url)
    {
        // TODO:ライセンス購入フロー
        return "di3d3ndai3ql2";
    }

}