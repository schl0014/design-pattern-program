public class WiredMouse implements MouseBuilder {

    private String _mouse = "";

    public void ClickRate() {
        _mouse += "ga naar settings en klik " ;
        this.addNewLine();
    }

    public void Troubleshooting() {

        _mouse += "ga naar settings en " ;
        this.addNewLine();
    }

    public void RgbLight() {
        _mouse += "GA naar de settings";
        this.addNewLine();
    }

    public void HowToStore() {
        _mouse += "Rol het goed op man";
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
