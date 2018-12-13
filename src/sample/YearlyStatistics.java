package sample;

import javafx.scene.control.ChoiceBox;

import javax.naming.Context;
import java.io.BufferedReader;
import java.io.FileReader;
import java.time.Year;
import java.util.ArrayList;

class YearlyStatistics implements Model {


    //Fields
    private ArrayList<YearStats> football;
    //private int firstYear;
    private int current;
    public ChoiceBox UserSelects;

    //Constructor
    YearlyStatistics() {
        //firstYear = 1996;
        current = 0;
        football = new ArrayList();

        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("/Desktop/NFLBrianDawkinsStats/src/sample/BrianDawkinsAllData"));
            String nextLine;
            while ((nextLine = bufferedReader.readLine()) != null) {
                football.add(new YearStats(nextLine));
            }
            bufferedReader.close();
        } catch (Exception e) {
            System.out.println("YearStats() reading data threw exception:");
            e.printStackTrace();
        }
        System.out.println("current " + current);
    }

    //Methods
    public void next() {
        Object value = UserSelects.getValue();

        if (value.equals("1996")) {
            current = 0;
        }

        if (value.equals("1997")) {
            current = current + 1;
        }

        //System.out.println("current " + current);
    }

    /*public void previous() {
        Object value = UserSelects.getValue();

        if (value.equals("1996")) {
            current = 0;
        }

        if (!value.equals("1996")) {
            current = current - 1;
        }

        System.out.println("current " + current);
    }*/

    public String descriptionTeam() {
        return football.get(current).TeamDescription();
    }

    public String descriptionCOMB() {
        return football.get(current).COMBDescription();
    }

    public String descriptionFF() {
        return football.get(current).FFDescription();
    }

    public String descriptionINT() {
        return football.get(current).INTDescription();
    }

    public String descriptionSack() {
        return football.get(current).SackDescription();
    }

    public String descriptionYear() {
        return football.get(current).YearDescription();
    }
}
