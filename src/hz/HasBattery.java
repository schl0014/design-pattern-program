public class HasBattery implements  MouseState{
    @Override
    public void RemoveBattery() {
        System.out.println("You have removed the battery");
    }

    @Override
    public void InsertBattery() {
        System.out.println("You have inserted the battery");
    }

    @Override
    public void BatteryFull() {
        System.out.println("battery is full");
    }

    @Override
    public void BatteryEmpty() {
        System.out.println("battery is empty change the battery");
    }
        }
