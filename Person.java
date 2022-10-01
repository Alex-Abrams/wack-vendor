public class Person {
  private int money;
  private String name;


  public Person(int money, String name) {
    this.money = money;
    this.name = name;
  }

  // setting money can change it
  public void setMoney(int moneySpent) {
    this.money = moneySpent;
  }

  //getter for checking mamount of money
  public int getMoney() {
    return money;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

}
