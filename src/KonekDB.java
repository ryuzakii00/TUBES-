import koneksi.SettingUI;
public class KonekDB {
    ///kgjh
    public SettingUI koneks = new SettingUI(null,true);
    public void koneksidatabase(){
        koneks.setServer("localhost");
        koneks.setUser("root");
        koneks.setPassword("");
        koneks.setDatabase("tubesmks");
        koneks.makeConnect();
    }
}
