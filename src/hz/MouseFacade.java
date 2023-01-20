public class MouseFacade {
    private final ConsoleWriter writer;
    private final MouseBuilder builder;
    private final MouseDirector director;
    private final ClickRateMouse clickRateMouse;
    private final Computer computer;
    private final HeadPhones headPhones;
    private final KeyBoard keyBoard;
    private final LightsMouse lightsMouse;
    private final Microphone microphone;
    private final Monitor monitor;
    private final Radio radio;
    private final WebCam webCam;

    private final Mouse mouse;

    public MouseFacade(MouseBuilder answer) {
        this.clickRateMouse = new ClickRateMouse();
        this.computer = new Computer();
        this.headPhones = new HeadPhones();
        this.keyBoard = new KeyBoard();
        this.lightsMouse = new LightsMouse();
        this.microphone = new Microphone();
        this.monitor = new Monitor();
        this.radio = new Radio();
        this.webCam = new WebCam();
        this.writer = new ConsoleWriter();
        this.builder = answer;
        this.director = new MouseDirector(builder);
        this.mouse = new Mouse(100);
    }

    public void UseMouseTheFirstTime() {
        director.ChangeBuilder(this.builder);
        String mouse = director.makeMouseInstruction();
        writer.writeLine(mouse);
    }

    public void Gaming() {
        this.computer.on();
        this.mouse.BatteryUsages();
        this.monitor.on();
        this.clickRateMouse.up(10);
        this.headPhones.on();
        this.headPhones.connection();
        this.computer.gaming();
        this.mouse.BatteryUsages();
        this.mouse.BatteryUsages();
        this.mouse.BatteryUsages();
        this.mouse.RemoveBattery();
        this.mouse.InsertBattery();
        this.mouse.RemoveBattery();

    }


}