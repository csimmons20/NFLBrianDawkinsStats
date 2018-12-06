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

        String[] parts = BrianDawkinsAllData.split("\\t+", 10);
        COMB = parts[3];
        FF = parts[7];
        INT = parts[10];
        Sack = parts[6];
        Team = parts[1];
        Year = parts[0];
    }

    //Methods
    String description() {
        return "Year: " + Year + ", Team: " + Team + ", COMB: " + COMB + ", Sack: " + Sack + ", FF: " + FF + ", INT: " + INT;
    }
}
