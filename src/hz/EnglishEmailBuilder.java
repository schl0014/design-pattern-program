public class EnglishEmailBuilder implements EmailBuilder {

    private String _email = "";

    public void addressASir(String name) {
        _email += "Dear Mr." + name + ",";
        this.addNewLine();
    }

    public void addressAMadam(String name) {

        _email += "Dear Ms." + name + ",";
        this.addNewLine();
    }

    public void toUnknown(String name) {

        _email += "To who it may concern,";
        this.addNewLine();
    }

    public void talkAboutMe(String name, String university) {
        _email += "My name is " + name + " and I'm a recent graduate of "+ university + ".";
        this.addNewLine();
    }

    public void showInterest(String company) {
        _email += "I'm emailing you to ask about a potential interning opportunity at " + company;
        _email += " I’d love to learn more about. Please let me know if you have any internships available.";
        this.addNewLine();
    }

    public void tellHowToContactMe() {
        _email += "You can reach me via email or on my cell phone.";
        this.addNewLine();
    }

    public void sayThanks() {
        this.addNewLine();
        this.addNewLine();
        _email += "Thank you so much for your time. I really look forward to hearing from you.";
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
