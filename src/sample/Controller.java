package sample;

//Chloe
//UpdateListview w/ Data of year
//Update Picture of Team
//Connect the code to Scene Builder

import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;



import java.awt.*;
import java.util.ArrayList;

public class Controller {


public ImageView Player;
public ImageView TeamLogo;
public ChoiceBox CBY;
public Label TextViewFF;
public Label TextViewCOMB;
public Label TextViewINT;
public Label TextViewSack;

 Model ourModel;

   public void initialize() {
        System.out.println("Controller initialize");

        //ourModel = new Model();



        CBY.setValue(ourModel.getCBchoice());
        CBY.getItems().addAll("1996", "1997", "It's 1998", "1999", "2000", "2001", "2002", "2003",
                "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011");

    }



}
