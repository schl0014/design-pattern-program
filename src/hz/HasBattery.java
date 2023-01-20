public class HasBattery implements MouseState {
    Mouse mouse;

    public HasBattery(Mouse mouse) {
        this.mouse = mouse;
    }

    @Override
    public void RemoveBattery() {
        System.out.println("You have removed the battery");
    }

    @Override
    public void InsertBattery() {
        System.out.println("don't do that battery is still good");
    }

    @Override
    public void BatteryFull() {
        System.out.println("battery is full");
    }

    @Override
    public void BatteryEmpty() {
        System.out.println("battery is empty change the battery");
        mouse.setState(mouse.getHasNoBattery());
    }
}
