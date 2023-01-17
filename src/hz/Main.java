
public class Main {

    public static void main(String[] args) {

        //
        ConsoleWriter writer = new ConsoleWriter();

        // Let's construct an email
        EnglishEmailBuilder builder = new EnglishEmailBuilder();

        EmailDirector director = new EmailDirector(builder);

        director.ChangeBuilder(new DutchEmailBuilder());

        String email = director.makeEmailApplyForInternship();

        writer.writeLine(email);
    }
}
