// import java.util.ArrayList;
//
// class Person {
//   private double money;
//   private String name;
//   // private ArrayList<String> items;
//
//   public Person(double money, String name) {
//     this.money = money;
//     this.name = name;
//   }
//
//   // setting money can change it
//   public void setMoney(double money, double moneySpent) {
//     this.money = money - moneySpent;
//   }
//
//   //getter for checking mamount of money
//   public double getMoney() {
//     return money;
//   }
//
//   // public void setItems(ArrayList<String> items, String newItem) {
//   //   this.items = items;
//   //
//   // }
//
// }


public class Main {
  public static void main(String[] args) {
    Person randy = new Person(8.3, "randy");

    System.out.println(randy.getName());
  }
}
