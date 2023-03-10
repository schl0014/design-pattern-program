public class HasNoBattery implements MouseState {
    Mouse mouse;

    public HasNoBattery(Mouse mouse) {
        this.mouse = mouse;
    }

    @Override
    public void RemoveBattery() {
        System.out.println("There is no battery");
    }

    @Override
    public void InsertBattery() {
        System.out.println("You have inserted the battery");
        mouse.setState(mouse.getHasBattery());
    }

    @Override
    public void BatteryFull() {
        System.out.println("You have no battery");
    }

    @Override
    public void BatteryEmpty() {
        System.out.println("Your have no battery");
    }

    @Override
    public void BatteryUsages() {
        System.out.println("Your have no battery");
    }

}

