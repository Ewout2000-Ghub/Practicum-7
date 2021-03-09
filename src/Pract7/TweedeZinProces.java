package Pract7;

public class TweedeZinProces implements OpmaakProces{

    private String enter;
    private String zinTwee;

    public TweedeZinProces(String zinTwee) {
        this.zinTwee = zinTwee;
    }

    public String maakOp(String input) {
        enter = input + "\n";
        String s = enter + "%";
        input = s.replace("%", zinTwee);

        return input;
    }
}
