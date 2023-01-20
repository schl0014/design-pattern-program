


public class ReadTextBoolean {
    private String _answers;
    public String[] _BooleanAdapter = {"wired,wireless"};



    public String ConvertTextToBoolean(String answer){
        for (String s : _BooleanAdapter) {
            if (answer.equals("wired")) {
                _answers = "wired";
                break;
            } else if (answer.equals("wireless")) {
                _answers = "wireless";
                break;
            } else {
                _answers = s;
            }

        }


        return _answers;
    }
}
