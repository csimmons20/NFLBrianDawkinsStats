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
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Controller {


public ImageView Player;
public ImageView TeamLogo;
public ChoiceBox UserSelects;
public ChoiceBox playerChoices;
public Label ffEdit;
public Label combEdit;
public Label intEdit;
public Label sackEdit;

 Model ourModel;

   public void initialize() throws Exception {

       ourModel = new YearlyStatistics();

        System.out.println("Controller initialize");

       //create Philadelphia's logos
       FileInputStream input = new FileInputStream("src/sample/PhillyEagles.png");
       Image philly = new Image(input);

       //create Denver's logo
       FileInputStream inny = new FileInputStream("src/sample/DenverBroncos.png");
       Image denver = new Image(inny);

//Create Choicebox for user to select players
       playerChoices.getItems().addAll("Brian Dawkins", "Kam Chancellor");
       playerChoices.setOnAction(e-> {

           if (playerChoices.valueProperty().get().equals("Brian Dawkins")) {

               UserSelects.setValue(ourModel.getCBchoice());
               UserSelects.getItems().addAll("1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003",
                       "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011");
               UserSelects.setOnAction(event-> {
                           System.out.println("choice box action happened");

                           if (UserSelects.valueProperty().get().equals("1996")) {

                               System.out.println("1996 action happened");
                               TeamLogo.setImage(philly);
                               ourModel.setYear(1996);
                               combEdit.setText(ourModel.descriptionCOMB());
                               ffEdit.setText(ourModel.descriptionFF());
                               sackEdit.setText(ourModel.descriptionSack());
                               intEdit.setText(ourModel.descriptionINT());

                           }
                           if (UserSelects.valueProperty().get().equals("1997")) {

                               System.out.println("1997 action happened");
                               TeamLogo.setImage(philly);
                               ourModel.setYear(1997);
                               combEdit.setText(ourModel.descriptionCOMB());
                               ffEdit.setText(ourModel.descriptionFF());
                               sackEdit.setText(ourModel.descriptionSack());
                               intEdit.setText(ourModel.descriptionINT());

                           }
                           if (UserSelects.valueProperty().get().equals("1998")) {

                               System.out.println("1998 action happened");
                               TeamLogo.setImage(philly);
                               ourModel.setYear(1998);
                               combEdit.setText(ourModel.descriptionCOMB());
                               ffEdit.setText(ourModel.descriptionFF());
                               sackEdit.setText(ourModel.descriptionSack());
                               intEdit.setText(ourModel.descriptionINT());

                           }
                           if (UserSelects.valueProperty().get().equals("1999")) {

                               System.out.println("1999 action happened");
                               TeamLogo.setImage(philly);
                               ourModel.setYear(1999);
                               combEdit.setText(ourModel.descriptionCOMB());
                               ffEdit.setText(ourModel.descriptionFF());
                               sackEdit.setText(ourModel.descriptionSack());
                               intEdit.setText(ourModel.descriptionINT());

                           }
                           if (UserSelects.valueProperty().get().equals("2000")) {

                               System.out.println("2000 action happened");
                               TeamLogo.setImage(philly);
                               ourModel.setYear(2000);
                               combEdit.setText(ourModel.descriptionCOMB());
                               ffEdit.setText(ourModel.descriptionFF());
                               sackEdit.setText(ourModel.descriptionSack());
                               intEdit.setText(ourModel.descriptionINT());

                           }
                           if (UserSelects.valueProperty().get().equals("2001")) {

                               System.out.println("2001 action happened");
                               TeamLogo.setImage(philly);
                               ourModel.setYear(2001);
                               combEdit.setText(ourModel.descriptionCOMB());
                               ffEdit.setText(ourModel.descriptionFF());
                               sackEdit.setText(ourModel.descriptionSack());
                               intEdit.setText(ourModel.descriptionINT());

                           }
                           if (UserSelects.valueProperty().get().equals("2002")) {

                               System.out.println("2002 action happened");
                               TeamLogo.setImage(philly);
                               ourModel.setYear(2002);
                               combEdit.setText(ourModel.descriptionCOMB());
                               ffEdit.setText(ourModel.descriptionFF());
                               sackEdit.setText(ourModel.descriptionSack());
                               intEdit.setText(ourModel.descriptionINT());

                           }
                           if (UserSelects.valueProperty().get().equals("2003")) {

                               System.out.println("2003 action happened");
                               TeamLogo.setImage(philly);
                               ourModel.setYear(2003);
                               combEdit.setText(ourModel.descriptionCOMB());
                               ffEdit.setText(ourModel.descriptionFF());
                               sackEdit.setText(ourModel.descriptionSack());
                               intEdit.setText(ourModel.descriptionINT());

                           }
                           if (UserSelects.valueProperty().get().equals("2004")) {

                               System.out.println("2004 action happened");
                               TeamLogo.setImage(philly);
                               ourModel.setYear(2004);
                               combEdit.setText(ourModel.descriptionCOMB());
                               ffEdit.setText(ourModel.descriptionFF());
                               sackEdit.setText(ourModel.descriptionSack());
                               intEdit.setText(ourModel.descriptionINT());

                           }
                           if (UserSelects.valueProperty().get().equals("2005")) {

                               System.out.println("2005 action happened");
                               TeamLogo.setImage(philly);
                               ourModel.setYear(2005);
                               combEdit.setText(ourModel.descriptionCOMB());
                               ffEdit.setText(ourModel.descriptionFF());
                               sackEdit.setText(ourModel.descriptionSack());
                               intEdit.setText(ourModel.descriptionINT());

                           }
                           if (UserSelects.valueProperty().get().equals("2006")) {

                               System.out.println("2006 action happened");
                               TeamLogo.setImage(philly);
                               ourModel.setYear(2006);
                               combEdit.setText(ourModel.descriptionCOMB());
                               ffEdit.setText(ourModel.descriptionFF());
                               sackEdit.setText(ourModel.descriptionSack());
                               intEdit.setText(ourModel.descriptionINT());

                           }
                           if (UserSelects.valueProperty().get().equals("2007")) {

                               System.out.println("2007 action happened");
                               TeamLogo.setImage(philly);
                               ourModel.setYear(2007);
                               combEdit.setText(ourModel.descriptionCOMB());
                               ffEdit.setText(ourModel.descriptionFF());
                               sackEdit.setText(ourModel.descriptionSack());
                               intEdit.setText(ourModel.descriptionINT());

                           }
                           if (UserSelects.valueProperty().get().equals("2008")) {

                               System.out.println("2008 action happened");
                               TeamLogo.setImage(philly);
                               ourModel.setYear(2008);
                               combEdit.setText(ourModel.descriptionCOMB());
                               ffEdit.setText(ourModel.descriptionFF());
                               sackEdit.setText(ourModel.descriptionSack());
                               intEdit.setText(ourModel.descriptionINT());

                           }
                           if (UserSelects.valueProperty().get().equals("2009")) {

                               System.out.println("2009 action happened");
                               TeamLogo.setImage(denver);
                               ourModel.setYear(2009);
                               combEdit.setText(ourModel.descriptionCOMB());
                               ffEdit.setText(ourModel.descriptionFF());
                               sackEdit.setText(ourModel.descriptionSack());
                               intEdit.setText(ourModel.descriptionINT());

                           }
                           if (UserSelects.valueProperty().get().equals("2010")) {

                               System.out.println("2010 action happened");
                               TeamLogo.setImage(denver);
                               ourModel.setYear(2010);
                               combEdit.setText(ourModel.descriptionCOMB());
                               ffEdit.setText(ourModel.descriptionFF());
                               sackEdit.setText(ourModel.descriptionSack());
                               intEdit.setText(ourModel.descriptionINT());

                           }
                           if (UserSelects.valueProperty().get().equals("2011")) {

                               System.out.println("2011 action happened");
                               TeamLogo.setImage(denver);
                               ourModel.setYear(2011);
                               combEdit.setText(ourModel.descriptionCOMB());
                               ffEdit.setText(ourModel.descriptionFF());
                               sackEdit.setText(ourModel.descriptionSack());
                               intEdit.setText(ourModel.descriptionINT());

                           }
                       }

               );
           }
           if (playerChoices.valueProperty().get().equals("Kam Chancellor")) {

               UserSelects.getItems().addAll("2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017");
               UserSelects.setOnAction(event-> {
                   if (UserSelects.valueProperty().get().equals("2010")) {

                       System.out.println("2010 action happened");
                       //TeamLogo.setImage(denver);
                       ourModel.setYear(2010);
                       combEdit.setText(ourModel.descriptionCOMB());
                       ffEdit.setText(ourModel.descriptionFF());
                       sackEdit.setText(ourModel.descriptionSack());
                       intEdit.setText(ourModel.descriptionINT());

                   }
                           if (UserSelects.valueProperty().get().equals("2011")) {

                               System.out.println("2011 action happened");
                               //TeamLogo.setImage(denver);
                               ourModel.setYear(2011);
                               combEdit.setText(ourModel.descriptionCOMB());
                               ffEdit.setText(ourModel.descriptionFF());
                               sackEdit.setText(ourModel.descriptionSack());
                               intEdit.setText(ourModel.descriptionINT());

                           }
                           if (UserSelects.valueProperty().get().equals("2012")) {

                               System.out.println("2010 action happened");
                               //TeamLogo.setImage(denver);
                               ourModel.setYear(2012);
                               combEdit.setText(ourModel.descriptionCOMB());
                               ffEdit.setText(ourModel.descriptionFF());
                               sackEdit.setText(ourModel.descriptionSack());
                               intEdit.setText(ourModel.descriptionINT());

                           }
                           if (UserSelects.valueProperty().get().equals("2013")) {

                               System.out.println("2013 action happened");
                               //TeamLogo.setImage(denver);
                               ourModel.setYear(2013);
                               combEdit.setText(ourModel.descriptionCOMB());
                               ffEdit.setText(ourModel.descriptionFF());
                               sackEdit.setText(ourModel.descriptionSack());
                               intEdit.setText(ourModel.descriptionINT());

                           }
                           if (UserSelects.valueProperty().get().equals("2014")) {

                               System.out.println("2014 action happened");
                               //TeamLogo.setImage(denver);
                               ourModel.setYear(2014);
                               combEdit.setText(ourModel.descriptionCOMB());
                               ffEdit.setText(ourModel.descriptionFF());
                               sackEdit.setText(ourModel.descriptionSack());
                               intEdit.setText(ourModel.descriptionINT());

                           }
                           if (UserSelects.valueProperty().get().equals("2015")) {

                               System.out.println("2015 action happened");
                               //TeamLogo.setImage(denver);
                               ourModel.setYear(2015);
                               combEdit.setText(ourModel.descriptionCOMB());
                               ffEdit.setText(ourModel.descriptionFF());
                               sackEdit.setText(ourModel.descriptionSack());
                               intEdit.setText(ourModel.descriptionINT());

                           }
                           if (UserSelects.valueProperty().get().equals("2016")) {

                               System.out.println("2016 action happened");
                               //TeamLogo.setImage(denver);
                               ourModel.setYear(2016);
                               combEdit.setText(ourModel.descriptionCOMB());
                               ffEdit.setText(ourModel.descriptionFF());
                               sackEdit.setText(ourModel.descriptionSack());
                               intEdit.setText(ourModel.descriptionINT());

                           }
                           if (UserSelects.valueProperty().get().equals("2017")) {

                               System.out.println("2017 action happened");
                               //TeamLogo.setImage(denver);
                               ourModel.setYear(2017);
                               combEdit.setText(ourModel.descriptionCOMB());
                               ffEdit.setText(ourModel.descriptionFF());
                               sackEdit.setText(ourModel.descriptionSack());
                               intEdit.setText(ourModel.descriptionINT());

                           }
               }
               );
           }
       } );



        /*UserSelects.setValue(ourModel.getCBchoice());
        UserSelects.getItems().addAll("1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003",
                "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011");
       UserSelects.setOnAction(e-> {
                   System.out.println("choice box action happened");

                   if (UserSelects.valueProperty().get().equals("1996")) {

                       System.out.println("1996 action happened");
                       TeamLogo.setImage(philly);
                       ourModel.setYear(1996);
                       combEdit.setText(ourModel.descriptionCOMB());
                       ffEdit.setText(ourModel.descriptionFF());
                       sackEdit.setText(ourModel.descriptionSack());
                       intEdit.setText(ourModel.descriptionINT());

                   }
           if (UserSelects.valueProperty().get().equals("1997")) {

               System.out.println("1997 action happened");
               TeamLogo.setImage(philly);
               ourModel.setYear(1997);
               combEdit.setText(ourModel.descriptionCOMB());
               ffEdit.setText(ourModel.descriptionFF());
               sackEdit.setText(ourModel.descriptionSack());
               intEdit.setText(ourModel.descriptionINT());

           }
           if (UserSelects.valueProperty().get().equals("1998")) {

               System.out.println("1998 action happened");
               TeamLogo.setImage(philly);
               ourModel.setYear(1998);
               combEdit.setText(ourModel.descriptionCOMB());
               ffEdit.setText(ourModel.descriptionFF());
               sackEdit.setText(ourModel.descriptionSack());
               intEdit.setText(ourModel.descriptionINT());

           }
           if (UserSelects.valueProperty().get().equals("1999")) {

               System.out.println("1999 action happened");
               TeamLogo.setImage(philly);
               ourModel.setYear(1999);
               combEdit.setText(ourModel.descriptionCOMB());
               ffEdit.setText(ourModel.descriptionFF());
               sackEdit.setText(ourModel.descriptionSack());
               intEdit.setText(ourModel.descriptionINT());

           }
           if (UserSelects.valueProperty().get().equals("2000")) {

               System.out.println("2000 action happened");
               TeamLogo.setImage(philly);
               ourModel.setYear(2000);
               combEdit.setText(ourModel.descriptionCOMB());
               ffEdit.setText(ourModel.descriptionFF());
               sackEdit.setText(ourModel.descriptionSack());
               intEdit.setText(ourModel.descriptionINT());

           }
           if (UserSelects.valueProperty().get().equals("2001")) {

               System.out.println("2001 action happened");
               TeamLogo.setImage(philly);
               ourModel.setYear(2001);
               combEdit.setText(ourModel.descriptionCOMB());
               ffEdit.setText(ourModel.descriptionFF());
               sackEdit.setText(ourModel.descriptionSack());
               intEdit.setText(ourModel.descriptionINT());

           }
           if (UserSelects.valueProperty().get().equals("2002")) {

               System.out.println("2002 action happened");
               TeamLogo.setImage(philly);
               ourModel.setYear(2002);
               combEdit.setText(ourModel.descriptionCOMB());
               ffEdit.setText(ourModel.descriptionFF());
               sackEdit.setText(ourModel.descriptionSack());
               intEdit.setText(ourModel.descriptionINT());

           }
           if (UserSelects.valueProperty().get().equals("2003")) {

               System.out.println("2003 action happened");
               TeamLogo.setImage(philly);
               ourModel.setYear(2003);
               combEdit.setText(ourModel.descriptionCOMB());
               ffEdit.setText(ourModel.descriptionFF());
               sackEdit.setText(ourModel.descriptionSack());
               intEdit.setText(ourModel.descriptionINT());

           }
           if (UserSelects.valueProperty().get().equals("2004")) {

               System.out.println("2004 action happened");
               TeamLogo.setImage(philly);
               ourModel.setYear(2004);
               combEdit.setText(ourModel.descriptionCOMB());
               ffEdit.setText(ourModel.descriptionFF());
               sackEdit.setText(ourModel.descriptionSack());
               intEdit.setText(ourModel.descriptionINT());

           }
           if (UserSelects.valueProperty().get().equals("2005")) {

               System.out.println("2005 action happened");
               TeamLogo.setImage(philly);
               ourModel.setYear(2005);
               combEdit.setText(ourModel.descriptionCOMB());
               ffEdit.setText(ourModel.descriptionFF());
               sackEdit.setText(ourModel.descriptionSack());
               intEdit.setText(ourModel.descriptionINT());

           }
           if (UserSelects.valueProperty().get().equals("2006")) {

               System.out.println("2006 action happened");
               TeamLogo.setImage(philly);
               ourModel.setYear(2006);
               combEdit.setText(ourModel.descriptionCOMB());
               ffEdit.setText(ourModel.descriptionFF());
               sackEdit.setText(ourModel.descriptionSack());
               intEdit.setText(ourModel.descriptionINT());

           }
           if (UserSelects.valueProperty().get().equals("2007")) {

               System.out.println("2007 action happened");
               TeamLogo.setImage(philly);
               ourModel.setYear(2007);
               combEdit.setText(ourModel.descriptionCOMB());
               ffEdit.setText(ourModel.descriptionFF());
               sackEdit.setText(ourModel.descriptionSack());
               intEdit.setText(ourModel.descriptionINT());

           }
           if (UserSelects.valueProperty().get().equals("2008")) {

               System.out.println("2008 action happened");
               TeamLogo.setImage(philly);
               ourModel.setYear(2008);
               combEdit.setText(ourModel.descriptionCOMB());
               ffEdit.setText(ourModel.descriptionFF());
               sackEdit.setText(ourModel.descriptionSack());
               intEdit.setText(ourModel.descriptionINT());

           }
           if (UserSelects.valueProperty().get().equals("2009")) {

               System.out.println("2009 action happened");
               TeamLogo.setImage(denver);
               ourModel.setYear(2009);
               combEdit.setText(ourModel.descriptionCOMB());
               ffEdit.setText(ourModel.descriptionFF());
               sackEdit.setText(ourModel.descriptionSack());
               intEdit.setText(ourModel.descriptionINT());

           }
           if (UserSelects.valueProperty().get().equals("2010")) {

               System.out.println("2010 action happened");
               TeamLogo.setImage(denver);
               ourModel.setYear(2010);
               combEdit.setText(ourModel.descriptionCOMB());
               ffEdit.setText(ourModel.descriptionFF());
               sackEdit.setText(ourModel.descriptionSack());
               intEdit.setText(ourModel.descriptionINT());

           }
           if (UserSelects.valueProperty().get().equals("2011")) {

               System.out.println("2011 action happened");
               TeamLogo.setImage(denver);
               ourModel.setYear(2011);
               combEdit.setText(ourModel.descriptionCOMB());
               ffEdit.setText(ourModel.descriptionFF());
               sackEdit.setText(ourModel.descriptionSack());
               intEdit.setText(ourModel.descriptionINT());

           }
               }

       );*/



    }



}
