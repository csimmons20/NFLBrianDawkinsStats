package sample;

public interface Model {

    String descriptionTeam();
    String descriptionCOMB();
    String descriptionFF();
    String descriptionINT();
    String descriptionSack();
    void next();
    void previous();
    int CBchoice = 0;

    default int getCBchoice() {return CBchoice};
}
