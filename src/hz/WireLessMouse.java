public class WireLessMouse implements MouseBuilder {

    private String _mouse = "";

    public void ClickRate() {
        _mouse += "ga naar settings en verhoog " ;
        this.addNewLine();
    }

    public void Troubleshooting() {

        _mouse += "ga naar settings en klik op troubleshoot " ;
        this.addNewLine();
    }

    public void RgbLight() {
        _mouse += "GA naar de settings ga naar lights";
        this.addNewLine();
    }

    public void HowToStore() {
        _mouse += "Rol het goed opj";
        this.addNewLine();
    }



    public void reset() {
        _mouse = "";
    }



    public String getMouse() {
        return _mouse;
    }

    private void addNewLine() {
        _mouse += "\n\r";
    }
}
