package sample;

public interface Model {

    String descriptionTeam();
    String descriptionCOMB();
    String descriptionFF();
    String descriptionINT();
    String descriptionSack();
    String descriptionYear();
    void setYear(int year);
    int CBchoice = 0;

    default int getCBchoice() {return CBchoice;}
}
