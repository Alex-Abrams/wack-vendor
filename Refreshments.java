public abstract class Refreshments {
  // needs to be a list of available Refreshments
  // or should the vending machine have the avaialb ones
  // make a drinks class and a food class, each has its own price, each overirdes a getStuck method
  String itemName;
  double price;
  public Refreshments(String itemName, double price) {
    this.price = price;
    this.itemName = itemName;
  }

  public abstract void getStuck();


}
