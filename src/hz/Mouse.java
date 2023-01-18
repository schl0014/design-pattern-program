public class Mouse {

    MouseState HasBattery;
    MouseState HasNoBattery;

    MouseState state;

    public Mouse(){
        HasBattery = new HasBattery(this);
        HasNoBattery = new HasNoBattery(this);
    }
    public void setState(){
        this.state = state;
    }
    public MouseState getState(){
        return state;
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

    public MouseState getHasBattery() {
        return HasBattery;
    }

    public MouseState getHasNoBattery() {
        return HasBattery;
    }
}
