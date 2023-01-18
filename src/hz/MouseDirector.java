public class MouseDirector {

    private MouseBuilder _builder;

    public MouseDirector(MouseBuilder builder) {
        _builder = builder;
    }

    public void ChangeBuilder(MouseBuilder builder) {
        _builder = builder;
    }

    public String makeMouseInstruction() {
        _builder.reset();
        _builder.ConnectToPC();
        _builder.ClickRate();
        _builder.Troubleshooting();
        _builder.HowToStore();
        _builder.RgbLight();


        return _builder.getMouse();
    }
}
