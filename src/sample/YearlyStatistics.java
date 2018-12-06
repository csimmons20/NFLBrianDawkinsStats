package sample;

import javax.naming.Context;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

class YearlyStatistics implements Model {

    //Fields
    private ArrayList<YearStats> football;
    private int current;

    //Constructor
    YearlyStatistics(Context context) {
        current = 0;
        football = new ArrayList();

        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("BrianDawkinsAllData"));
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
    public void next() {
        if (current < football.size() - 1) {
            current = current + 1;
        } else {
            current = 0;
        }
    }

    public void previous() {
        if (current > 0) {
            current = current - 1;
        } else {
            current = football.size() - 1;
        }
    }

    public String descriptionTeam() {
        return football.get(1).description();
    }

    public String description {
        return football.get(3).description();
    }

    public String
}
