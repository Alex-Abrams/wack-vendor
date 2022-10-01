public abstract class Refreshment {

    String brand;
    int price;
    int quantity;
    String position;

  public Refreshment(String brand, int price, int quantity, String position) {
    this.brand = brand;
    this.price = price;
    this.quantity = quantity;
    this.position = position;
  }

  // refreshment names and price will be read only
  public int getPrice() {
    return price;
  }

  public String getBrand() {
    return brand;
  }

  public void setQuantity(int q) {
    this.quantity = q;
  }

  public int getQuantity() {
    return quantity;
  }

  public String getPosition() {
    return position;
  }

  public abstract void stuck();

  public abstract void receiveRefreshment();

}
