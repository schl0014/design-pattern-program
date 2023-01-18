public class MouseFacade {
    private ConsoleWriter writer;
    private MouseBuilder builder;
    private MouseDirector director;

    public MouseFacade() {
        this.writer = new ConsoleWriter();
        this.builder = new WireLessMouse();
        this.director = new MouseDirector(builder);
    }

    public void createMouseInstruction() {
        director.ChangeBuilder(this.builder);
        String mouse = director.makeMouseInstruction();
        writer.writeLine(mouse);
    }
}