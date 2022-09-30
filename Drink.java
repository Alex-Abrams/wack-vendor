public class Drink extends Refreshments {

  @Override
  void getStuck() {
    System.out.println("Your refreshing " + itemName + "got stuck!!");
  }
}
