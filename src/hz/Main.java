
public class Main {
    public static void main(String[] args) {
        //
        ConsoleWriter writer = new ConsoleWriter();
        // Let's construct an email
        WiredMouse builder = new WiredMouse();

        MouseDirector director = new MouseDirector(builder);

        director.ChangeBuilder(new WireLessMouse());

        String mouse = director.makeMouseInstruction();
        writer.writeLine(mouse);
    }
}