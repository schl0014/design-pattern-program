public class Mouse {

    MouseState HasBattery;
    MouseState HasNoBattery;

    MouseState state;

    int count = 100;

    public Mouse(int MouseBatteryNumber){
        HasBattery = new HasBattery(this);
        HasNoBattery = new HasNoBattery(this);
        this.count = MouseBatteryNumber;
        MouseBatteryNumber--;
        if (MouseBatteryNumber > 0) {
            state = HasBattery;
        } else {
            state = HasNoBattery;
        }

    }

//    public void decreaseCount() {
//        count--;
//        if (count == 0) {
//            setState(HasNoBattery);
//        }
//    }
    public int getCount() {
        return count;
    }


    public void setState(MouseState state){
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
        return HasNoBattery;
    }



}




