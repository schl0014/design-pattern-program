public class WireLessMouse implements MouseBuilder {

    private String _mouse;

    @Override
    public void ConnectToPC() {
        _mouse += "Connect to pc";
        this.BreakLineForTitleLine();
        _mouse += "Zoek naar het bluetooth symbooltje zet dit aan. Zoek op je computer naar de bluetotoh functie en connect met je muis";
        this.BreakLineForTitleLine();
    }

    public void ClickRate() {
        _mouse += "CLick rate";
        this.BreakLineForTitleLine();
        _mouse += "click een keer op de knop bij de scrollwiel. Dit verhoogt de clickrate met 1 ";
        this.BreakLineForTitleLine();
    }

    public void Troubleshooting() {
        _mouse += "troubleshooting";
        this.BreakLineForTitleLine();
        _mouse += "schakel je muis uit.";
        this.addNewLine();
        _mouse += "Verwijder de bleutooth verbinding met de muis.";
        this.addNewLine();
        _mouse += "probeer dan te muis weer te connecten als dit niet werkt update de bluetooth drivers ";
        this.BreakLineForTitleLine();
    }

    public void RgbLight() {
        _mouse += "how to turn on RGB";
        this.BreakLineForTitleLine();
        _mouse += "draai je muis om en zoek naat het licht symbooltje . Druk deze aan";
        this.BreakLineForTitleLine();
    }

    public void HowToStore() {
        _mouse += "How to shore your mouse";
        this.BreakLineForTitleLine();
        _mouse += "het beste is om de muis in een apart vakje in je tas te stop zodat het niet beschadigd raakt in je tas";
        this.BreakLineForTitleLine();
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
