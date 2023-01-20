public class WiredMouse implements MouseBuilder {

    private String _mouse = "";


    public void ClickRate() {
        _mouse += "Ga naar de settings van de muis en daar kan je de clickrate aanpassen. ";
        this.BreakLineForTitleLine();
    }

    public void ConnectToPC() {
        _mouse += "Pak de usb kabel en plug het in de computer";
        this.BreakLineForTitleLine();
        this.addNewLine();
    }

    public void Troubleshooting() {
        _mouse += "Je kan de USB kabel eruit halen en kijken of hij schoon is.";
        this.BreakLineForTitleLine();
        this.addNewLine();
        _mouse += "Je kan kan ook kijken of the USB port schoon is.";
        this.BreakLineForTitleLine();
        this.addNewLine();
    }

    public void RgbLight() {
        _mouse += "Ga naar de settings van de muis";
        this.BreakLineForTitleLine();
        this.addNewLine();
    }

    public void HowToStore() {
        _mouse += "Rol het draad goed zodat het niet beschadigd op en berg het op in een veilige plek";
        this.BreakLineForTitleLine();
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

    private void BreakLineForTitleLine() {
        _mouse += "\n\n\r";
    }
}
