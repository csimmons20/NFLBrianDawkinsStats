package sample;

public class YearStats {

    private int COMB;
    private int FF;
    private int INT;
    private float Sack;
    private String Team;
    private int Year;

    //Constructor
    YearStats(String BrianDawkinsAllData) {

        String[] parts = BrianDawkinsAllData.split("\\t+", 10);
        COMB = Integer.parseInt(parts[3]);
        FF = Integer.parseInt(parts[7]);
        INT = Integer.parseInt(parts[10]);
        Sack = Float.parseFloat(parts[6]);
        Team = parts[1];
        Year = Integer.parseInt(parts[0]);
    }

    //Methods
    String description() {
        return "Year: " + Year + ", Team: " + Team + ", COMB: " + COMB + ", Sack: " + Sack + ", FF: " + FF + ", INT: " + INT;
    }
}
