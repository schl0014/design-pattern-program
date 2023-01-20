public class Mouse {

    MouseState HasBattery;
    MouseState HasNoBattery;

    MouseState state;

    int BatteryPercentage = 100;

    public Mouse(int MouseBatteryNumber) {
        HasBattery = new HasBattery(this);
        HasNoBattery = new HasNoBattery(this);
        this.BatteryPercentage = MouseBatteryNumber;


        if (MouseBatteryNumber > 25) {
            state = HasBattery;
        } else {
            state = HasNoBattery;
        }

    }

    public void decreaseBattery() {
        BatteryPercentage = getBatteryPercentage() - 25;
    }

    public void increaseBattery() {
        this.BatteryPercentage = 100;
    }

    public int getBatteryPercentage() {
        return BatteryPercentage;
    }

    public MouseState getState() {
        return state;
    }

    public void setState(MouseState state) {
        this.state = state;
    }

    public void RemoveBattery() {
        state.RemoveBattery();
    }

    public void InsertBattery() {
        state.InsertBattery();
    }

    public void BatteryFull() {
        state.BatteryFull();
    }

    public void BatteryEmpty() {
        state.BatteryEmpty();
    }

    public void BatteryUsages() {
        state.BatteryUsages();
    }

    public MouseState getHasBattery() {
        return HasBattery;
    }

    public MouseState getHasNoBattery() {
        return HasNoBattery;
    }


}




