
public class Main {
    public static void main(String[] args) {
        MouseFacade facade = new MouseFacade();
        facade.createMouseInstruction();

        Mouse mouse = new Mouse(100);

        mouse.BatteryFull();
        mouse.InsertBattery();
        mouse.BatteryEmpty();
        mouse.RemoveBattery();
//        while(mouse.getCount() > 0) {
//            mouse.decreaseCount();
//        }



    }
}