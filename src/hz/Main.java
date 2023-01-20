
public class Main {
    public static void main(String[] args) {
        MouseFacade facade = new MouseFacade();
        facade.createMouseInstruction();

        Mouse mouse = new Mouse(100);
        mouse.BatteryUsages();
        mouse.BatteryUsages();
        mouse.BatteryUsages();
        mouse.BatteryUsages();
        mouse.BatteryFull();
        mouse.RemoveBattery();
        mouse.InsertBattery();
//        mouse.BatteryFull();

//        mouse.BatteryEmpty();






    }
}