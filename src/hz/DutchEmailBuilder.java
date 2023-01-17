public class DutchEmailBuilder implements EmailBuilder {

    private String _email = "";

    public void addressASir(String name) {
        _email += "Beste meneer " + name + ",";
        this.addNewLine();
    }

    public void addressAMadam(String name) {

        _email += "Beste mevrouw " + name + ",";
        this.addNewLine();
    }

    public void toUnknown(String name) {

        _email += "Voor wie het aangaat,";
        this.addNewLine();
    }

    public void talkAboutMe(String name, String university) {
        _email += "Ik ben " + name + " en studeer aan de "+ university + ".";
        this.addNewLine();
    }

    public void showInterest(String company) {
        _email += "Ik stuur deze email met betrekking tot de mogelijkheid voor een stage bij " + company;
        _email += " Ik zou hier graag meer informatie willen. Kunt u mij aangeven of er stageplekken beschikbaar zijn?";
        this.addNewLine();
    }

    public void tellHowToContactMe() {
        _email += "U kunt mij bereiken via email of telefoon.";
        this.addNewLine();
    }

    public void sayThanks() {
        this.addNewLine();
        this.addNewLine();
        _email += "Bij voorbaat dank. Ik zie uit naar uw reactie.";
    }

    public void reset() {
        _email = "";
    }

    public String getEmail() {
        return _email;
    }

    private void addNewLine() {
        _email += "\n\r";
    }
}
