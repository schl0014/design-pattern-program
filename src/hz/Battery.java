public class Battery implements MouseState {


    @Override
    public void Removebattery() {
        System.out.println("You have removed the battery");
    }

    @Override
    public void InsertBattery() {
        System.out.println("You have inserted the battery");
    }

    @Override
    public void BatteryFull() {
        System.out.println("");
    }

    @Override
    public void BatteryEmpty() {
        System.out.println("");
    }


}

