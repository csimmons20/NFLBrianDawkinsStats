package sample;

public interface Model {

    String descriptionTeam();
    int descriptionCOMB();
    int descriptionFF();
    int descriptionINT();
    int descriptionSack();
    void next();
    void previous();
    int CBchoice = 0;

    default int getCBchoice() {return CBchoice};
}
