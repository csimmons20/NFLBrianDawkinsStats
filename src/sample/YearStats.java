package sample;

public class YearStats {

    private String COMB;
    private String FF;
    private String INT;
    private String Sack;
    private String Team;
    private String Year;

    //Constructor
    YearStats(String BrianDawkinsAllData) {
        System.out.println("YearStats() " + BrianDawkinsAllData);
        String[] parts = BrianDawkinsAllData.split("\\t+", 11);
        COMB = parts[3];
        FF = parts[7];
        INT = parts[10];
        Sack = parts[6];
        Team = parts[1];
        Year = parts[0];
    }
//
    //Methods
    String COMBDescription() {
        return COMB;
    }

    String FFDescription() {
        return FF;
    }

    String INTDescription() {
        return INT;
    }

    String SackDescription() {
        return Sack;
    }

    String TeamDescription() {
        return Team;
    }

    String YearDescription() {
        return Year;
    }
}
