public class Drink extends Refreshment {
  public Drink(String brand, int price, int quantity, String position) {
    super(brand, price, quantity, position);
  }

  @Override
  public void stuck() {
    System.out.println(brand + " got stuck!!");
  }

  @Override
  public void receiveRefreshment() {
    System.out.println("Plunk! " + brand + " is ready!");
  }
}
