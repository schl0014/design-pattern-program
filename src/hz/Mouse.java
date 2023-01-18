public class Mouse {

    MouseState HasBattery;
    MouseState HasNoBattery;

    MouseState state;

    public Mouse(){
        HasBattery = new HasBattery();
        HasNoBattery = new HasNoBattery();
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
}
