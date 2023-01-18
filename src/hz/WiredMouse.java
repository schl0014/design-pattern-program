public class WiredMouse implements MouseBuilder {

    private String _mouse = "";

    @Override
    public void ConnectToPC() {
        _mouse += "pak de usb kabel en plug het in de computer";
        this.addNewLine();
    }

    public void ClickRate() {
        _mouse += "ga naar settings en klik ";
        this.addNewLine();
    }

    public void Troubleshooting() {

        _mouse += "ga naar settings en ";
        this.addNewLine();
    }

    public void RgbLight() {
        _mouse += "GA naar de settings";
        this.addNewLine();
    }

    public void HowToStore() {
        _mouse += "Rol het goede op man en ruim het op";
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
