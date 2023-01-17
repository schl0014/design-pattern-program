public class WireLessMouse implements EmailBuilder {

    private String _email = "";

    public void ClickRate(String name) {
        _email += "Beste meneer " + name + ",";
        this.addNewLine();
    }

    public void Troubleshooting(String name) {

        _email += "Beste mevrouw " + name + ",";
        this.addNewLine();
    }

    public void RgbLight(String name) {

        _email += "Voor wie het aangaat,";
        this.addNewLine();
    }

    public void HowToStore(String name, String university) {
        _email += "Ik ben " + name + " en studeer aan de "+ university + ".";
        this.addNewLine();
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
