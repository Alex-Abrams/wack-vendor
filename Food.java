public class Food extends Refreshment {

  public Food(String brand, int price, int quantity, String position) {
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
