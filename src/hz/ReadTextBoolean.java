public class ReadTextBoolean {
    public String[] _BooleanAdapter = {"wired,wireless"};
    public String[] _LIstWithActions = {"instructions"};
    String bad = "Bad answer fill in a valid answer";
    ConsoleWriter writer = new ConsoleWriter();
    private MouseFacade facade;

    public MouseFacade ConvertTextToFacade(String answer) {
        for (String s : _BooleanAdapter) {
            if (answer.equals("wired")) {
                MouseFacade facade = new MouseFacade(new WiredMouse());
                break;
            } else if (answer.equals("wireless")) {
                MouseFacade facade = new MouseFacade(new WireLessMouse());
                break;
            } else {
                writer.writeLine(bad);
                break;
            }
        }
        return facade;
    }

}