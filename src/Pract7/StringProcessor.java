package Pract7;

import java.util.ArrayList;

public class StringProcessor {

    private ArrayList<OpmaakProces> processen;

    public StringProcessor() {
        processen = new ArrayList<>();
    }

    public String verwerk(String input) {
        for (OpmaakProces p : processen) {
            input = p.maakOp(input);
        }
        return input;
    }

    public void voegProcesToe(OpmaakProces proces) {
        if (proces == null)
            throw new IllegalArgumentException("proces mag niet null zijn!");

        if (!processen.contains(proces)) {
            processen.add(proces);
        }
    }
}
