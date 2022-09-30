import java.util.ArrayList;

public class Person {
  private double money;
  private String name;
  // private ArrayList<String> items;

  public Person(double money, String name) {
    this.money = money;
    this.name = name;
  }

  // setting money can change it
  public void setMoney(double money, double moneySpent) {
    this.money = money - moneySpent;
  }

  //getter for checking mamount of money
  public double getMoney() {
    return money;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  // public void setItems(ArrayList<String> items, String newItem) {
  //   this.items = items;
  //
  // }

}
