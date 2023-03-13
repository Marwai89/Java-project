<?xml version="1.0" encoding="UTF-8"?>

<?import javafx.scene.control.Button?>
<?import javafx.scene.control.Label?>
<?import javafx.scene.control.TextArea?>
<?import javafx.scene.control.TextField?>
<?import javafx.scene.layout.AnchorPane?>


<AnchorPane maxHeight="-Infinity" maxWidth="-Infinity" minHeight="-Infinity" minWidth="-Infinity" prefHeight="400.0" prefWidth="600.0" xmlns="http://javafx.com/javafx/8.0.111" xmlns:fx="http://javafx.com/fxml/1" fx:controller="myrestaurantfx.FXMLDocumentController">
<children>
<Label layoutX="218.0" layoutY="36.0" prefHeight="17.0" prefWidth="109.0" style="-fx-background-color: #9ef59d;" text="MY RESTAURANT" textAlignment="RIGHT" />
<Label layoutX="115.0" layoutY="86.0" style="-fx-background-color: #f5bc42;" text="FOOD" />
<Label layoutX="355.0" layoutY="86.0" style="-fx-background-color: #f5bc42;" text="DRINKS" />
<TextField fx:id="foodTF" layoutX="74.0" layoutY="121.0" />
<TextField fx:id="drinksTF" layoutX="316.0" layoutY="121.0" />
<Button fx:id="orderFoodBtn" layoutX="98.0" layoutY="167.0" mnemonicParsing="false" onAction="#orderFood" prefHeight="25.0" prefWidth="102.0" style="-fx-background-color: #9dd4f5;" text="ORDER FOOD" />
<Button fx:id="orderDrinksBtn" layoutX="346.0" layoutY="167.0" mnemonicParsing="false" onAction="#orderDrinks" prefHeight="25.0" prefWidth="109.0" style="-fx-background-color: #9dd4f5;" text="ORDER DRINKS" />
<TextArea fx:id="orderTextArea" layoutX="88.0" layoutY="251.0" prefHeight="102.0" prefWidth="368.0" />
<Label layoutX="206.0" layoutY="219.0" prefHeight="17.0" prefWidth="109.0" style="-fx-background-color: #d89df5;" text="YOUR ORDERS" />
<Label layoutX="75.0" layoutY="103.0" prefHeight="17.0" prefWidth="135.0" style="-fx-background-color: #42f5ce;" text="Bread | Omlette | Chicken" />
<Label layoutX="323.0" layoutY="103.0" prefHeight="17.0" prefWidth="135.0" style="-fx-background-color: #42f5ce;" text="Coke| Whiskey| Wine" />
</children>
</AnchorPane>

BreakfastrestaurantFX .java


package Breakfastrestaurantfx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class BreakfastrestaurantFX extends Application {

@Override
public void start(Stage stage) throws Exception {
Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));

Scene scene = new Scene(root);
stage.setTitle("Breakfastrestaurant JavaFx Project");
stage.setScene(scene);
stage.show();
}

/**
* @param args the command line arguments
*/
public static void main(String[] args) {
launch(args);
}

}