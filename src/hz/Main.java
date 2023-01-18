
public class Main {
    public static void main(String[] args) {
        MouseFacade facade = new MouseFacade();
        facade.createMouseInstruction();

        Mouse mouse = new Mouse();

        mouse.BatteryFull();
        mouse.InsertBattery();
        mouse.BatteryEmpty();
        mouse.RemoveBattery();



    }
}