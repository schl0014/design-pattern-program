public class ConvertTextToFacadeClass {
    public String[] _ListWithSortOfComputerMouses = {"wired,wireless"};

    String _answerBad = "Bad answer fill in a valid answer";
    ConsoleWriter writer = new ConsoleWriter();
    private MouseFacade facade;

    public MouseFacade ConvertTextToFacade(String answer) {
        for (String s : _ListWithSortOfComputerMouses) {
            if (answer.equals("wired")) {
                facade = new MouseFacade(new WiredMouse());
                break;
            } else if (answer.equals("wireless")) {
                facade = new MouseFacade(new WireLessMouse());
                break;
            } else {
                writer.writeLine(_answerBad);
                break;
            }
        }
        return facade;
    }

}