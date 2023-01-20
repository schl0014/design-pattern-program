public class Main {
    public static void main(String[] args) {
        ConsoleReader reader = new ConsoleReader();
        ConsoleWriter writer = new ConsoleWriter();
        ConvertTextToFacadeClass facadeAdapter = new ConvertTextToFacadeClass();
        // ask questions
        String q1 = "What mouse do you have";

        String q2 = "What functions do you want use:" + "Get instructions";
        String good = "You healthy person!";
        String bad = "Bad answer fill in a valid answer";
        MouseFacade facade;
        // ask question to user
        writer.writeLine(q1);

        // read response
        facade = facadeAdapter.ConvertTextToFacade(reader.readLine());
        writer.writeLine(q2);
        String ans2 = reader.readLine();

        if (ans2.equals("instructions")) {
            facade.createMouseInstruction();
        } else if (ans2.equals("wireless")) {

        } else {
            writer.writeLine(bad);
        }

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