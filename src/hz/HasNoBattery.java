public class HasNoBattery implements MouseState {


    @Override
    public void RemoveBattery() {
        System.out.println("There is no battery");
    }

    @Override
    public void InsertBattery() {
        System.out.println("You have inserted the battery");
    }

    @Override
    public void BatteryFull() {
        System.out.println("You have no battery");
    }

    @Override
    public void BatteryEmpty() {
        System.out.println("Your have no battery");
    }
    
}

