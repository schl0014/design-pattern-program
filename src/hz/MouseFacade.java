public class MouseFacade {
    private ConsoleWriter writer;
    private MouseBuilder builder;
    private MouseDirector director;

    public MouseFacade(MouseBuilder answer) {
        this.writer = new ConsoleWriter();
        this.builder = answer;
        this.director = new MouseDirector(builder);
    }

    public void createMouseInstruction() {
        director.ChangeBuilder(this.builder);
        String mouse = director.makeMouseInstruction();
        writer.writeLine(mouse);
    }


}