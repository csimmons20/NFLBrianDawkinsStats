package sample;

import javafx.scene.control.ChoiceBox;

import javax.naming.Context;
import java.io.BufferedReader;
import java.io.File;
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
        football = new ArrayList();

        try {
            File savedText = new File(getClass().getResource("BrianDawkinsAllData").toURI());

            BufferedReader bufferedReader = new BufferedReader(new FileReader(savedText));
            String nextLine;
            while ((nextLine = bufferedReader.readLine()) != null) {
                football.add(new YearStats(nextLine));
            }
            bufferedReader.close();
        } catch (Exception e) {
            System.out.println("YearStats() reading data threw exception:");
            e.printStackTrace();
        }
    }

    //Methods
    public void setYear(int year) {
        current = year - 1996;
    }

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
