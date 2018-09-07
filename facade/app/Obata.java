public class Obata {
    private String intellijLicense = "";

    public String getIntellij()
    {
        String responce = "";
        String license = "";
        Sakuraisan sakuraisan = new Sakuraisan();

        license = sakuraisan.getLicense("IntelliJ", 49900, "siteUrl");

        if (license == "") {
            responce = "ライセンスもらえなかった(´・ω・｀)";
        } else {
            this.intellijLicense = license;
            responce = "やったーライセンスID[" + license + "]を手に入れたよ！";
        }
        return responce;
    }
}