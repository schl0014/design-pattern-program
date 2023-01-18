public class WireLessMouse implements MouseBuilder {

    private String _mouse;

    @Override
    public void ConnectToPC() {
        _mouse += " zoek naar het bluetooth symbooltje zet dit aan. Zoek op je computer naar de bluetotoh functie en connect met je muis" ;
        this.addNewLine();
    }

    public void ClickRate() {
        _mouse += "clikc een keer op de knop bij de scrollwiel.Dit verhoogt de clickrate met 1 " ;
        this.addNewLine();
    }

    public void Troubleshooting() {

        _mouse += "schakel je muis uit." ;
        this.addNewLine();
        _mouse +="Verwijder de bleutooth verbinding met de muis.";
        this.addNewLine();
        _mouse +="probeer dan te muis weer te connecten als dit niet werkt update de bluetooth drivers ";
        this.addNewLine();
    }

    public void RgbLight() {
        _mouse += "draai je muis om en zoek naat het licht symbooltje . Druk deze aan";
        this.addNewLine();
    }

    public void HowToStore() {
        _mouse += "het beste is om de muis in een apart vakje in je tas te stop zodat het niet beschadigd raakt in je tas";
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
