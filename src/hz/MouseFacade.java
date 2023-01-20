public class MouseFacade {
    private final ConsoleWriter writer;
    private final MouseBuilder builder;
    private final MouseDirector director;
    private final ClickRateMouse clickRateMouse;
    private final Computer computer;
    private final HeadPhones headPhones;
    private final KeyBoard keyBoard;
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
        this.clickRateMouse.down(4);
        this.mouse.InsertBattery();
        this.mouse.BatteryEmpty();
    }

    public void Gaming() {
        this.computer.on();
        this.mouse.BatteryUsages();
        this.monitor.on();
        this.clickRateMouse.up(10);
        this.headPhones.on();
        this.headPhones.connection();
        this.keyBoard.colorKeys();
        this.monitor.BrightnessUp(4);
        this.keyBoard.hotkeys();
        this.computer.gaming();
        this.mouse.BatteryUsages();
        this.mouse.BatteryUsages();
        this.mouse.BatteryUsages();
        this.mouse.RemoveBattery();
        this.mouse.InsertBattery();
        this.mouse.RemoveBattery();
    }

    public void ListeningToMusicAndRadio(){
        this.headPhones.on();
        this.headPhones.connection();
        this.headPhones.VolumeUp(85);
        this.radio.on();
        this.radio.setFm();
        this.radio.VolumeDown(51);
    }

    public void Streaming(){
        this.computer.on();
        this.monitor.on();
        this.webCam.on();
        this.keyBoard.typing();
        this.microphone.on();
        this.headPhones.on();
        this.webCam.recording();
        this.monitor.BrightnessDown(4);
        this.monitor.Colorpallet();
        this.headPhones.VolumeUp(4);
        this.microphone.sensitvity(10);
        this.computer.gaming();
        this.radio.setAm();
    }

    public void TurnOff(){
        this.radio.off();
        this.microphone.off();
        this.headPhones.VolumeDown(10);
        this.webCam.off();
        this.headPhones.off();
        this.computer.off();
        this.monitor.off();
    }


}