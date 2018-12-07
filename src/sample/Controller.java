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
public ChoiceBox UserSelects;
public Label ffEdit;
public Label combEdit;
public Label intEdit;
public Label sackEdit;

 Model ourModel;

   public void initialize() {
        System.out.println("Controller initialize");



        UserSelects.setValue(ourModel.getCBchoice());
        UserSelects.getItems().addAll("1996", "1997", "It's 1998", "1999", "2000", "2001", "2002", "2003",
                "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011");
       UserSelects.setOnAction(e-> {
                   System.out.println("choice box action happened");

                   if (UserSelects.valueProperty().get().equals("1996")) {
                       System.out.println("1996 action happened");
                   }
           if (UserSelects.valueProperty().get().equals("1997")) {
               System.out.println("1997 action happened");

           }
           if (UserSelects.valueProperty().get().equals("1998")) {
               System.out.println("1998 action happened");

           }
           if (UserSelects.valueProperty().get().equals("1999")) {
               System.out.println("1999 action happened");

           }
           if (UserSelects.valueProperty().get().equals("2000")) {
               System.out.println("2000 action happened");

           }
           if (UserSelects.valueProperty().get().equals("2001")) {
               System.out.println("2001 action happened");

           }
           if (UserSelects.valueProperty().get().equals("2002")) {
               System.out.println("2002 action happened");

           }
           if (UserSelects.valueProperty().get().equals("2003")) {
               System.out.println("2003 action happened");

           }
           if (UserSelects.valueProperty().get().equals("2004")) {
               System.out.println("2004 action happened");

           }
           if (UserSelects.valueProperty().get().equals("2005")) {
               System.out.println("1996 action happened");

           }if (UserSelects.valueProperty().get().equals("2006")) {
               System.out.println("1996 action happened");

           }if (UserSelects.valueProperty().get().equals("2007")) {
               System.out.println("1996 action happened");

           }if (UserSelects.valueProperty().get().equals("2008")) {
               System.out.println("1996 action happened");

           }if (UserSelects.valueProperty().get().equals("2009")) {
               System.out.println("1996 action happened");

           }if (UserSelects.valueProperty().get().equals("2010")) {
               System.out.println("1996 action happened");

           }if (UserSelects.valueProperty().get().equals("2011")) {
               System.out.println("1996 action happened");

           }
               }

       );



    }



}
