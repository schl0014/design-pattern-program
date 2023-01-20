public class Main {
    public static void main(String[] args) {

        ConsoleReader reader = new ConsoleReader();
        ConsoleWriter writer = new ConsoleWriter();



        ReadTextBoolean booleanAdapter = new ReadTextBoolean();



        // ask questions
        String q1 = "What mouse do you have";

        String q2 = "What functions do you want use:" +
                "Get instructions";
        String good = "You healthy person!";
        String bad = "Bad answer fill in a valid answer";

        // ask question to user
        writer.writeLine(q1);


//        writer.write();

        // read response
        String ans1 = booleanAdapter.ConvertTextToBoolean(reader.readLine());
        String ans2 = booleanAdapter.ConvertTextToBoolean(reader.readLine());
//        booleanAdapter.ConvertTextToBoolean(reader.readLine());

        //TODO
        // the reader should accept the following values as true:
        // "true", "yes", "oh yeah", "great", "sure", "love to", "of course", "always", "never done otherwise"

        if (ans1.equals("wired")) {
            MouseFacade facade = new MouseFacade(new WiredMouse());
        } else if (ans1.equals("wireless")) {
            MouseFacade facade = new MouseFacade(new WireLessMouse());
        } else {
            writer.writeLine(bad);
        }

        writer.writeLine(q2);



        // allow user to read our response
        reader.readLine();

//        facade.createMouseInstruction();
//
//        Mouse mouse = new Mouse(100);
//        mouse.BatteryUsages();
//        mouse.BatteryUsages();
//        mouse.BatteryUsages();
//        mouse.BatteryUsages();
//        mouse.BatteryFull();
//        mouse.RemoveBattery();
//        mouse.InsertBattery();


    }
}