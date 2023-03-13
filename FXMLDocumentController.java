package Breakfastrestaurantfx;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;


public class FXMLDocumentController implements Initializable {


// Linking textfields, buttons and textarea with frontend

@FXML
private Label label;

@FXML
TextField foodTF,drinksTF;

@FXML
Button orderFoodBtn,orderDrinksBtn;

@FXML
TextArea orderTextArea;



@Override
public void initialize(URL url, ResourceBundle rb) {

}


@FXML
public void orderFood(ActionEvent ev)
{
Food food=new Food();
String foodName=foodTF.getText();
food.setFoodName(foodName);
ordersPlaced(food);
System.out.print("orderDrink");

}

@FXML
public void orderDrinks(ActionEvent ev)
{
Drinks drinks=new Drinks();
String drinksName=drinksTF.getText();
drinks.setDrinksName(drinksName);
ordersPlaced(drinks);
System.out.print("orderDrink");
}


public void ordersPlaced(Object item)
{
String items="";

if(item instanceof Food)
{
items=((Food) item).getFoodName();
}
else if(item instanceof Drinks)
{
items=((Drinks) item).getDrinksName();

}

orderTextArea.setText(orderTextArea.getText()+"\n"+"Your order of "+ items +" is placed"+ "\n");


}


}