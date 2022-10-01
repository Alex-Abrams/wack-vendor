import java.util.*;

public class Main {

  public static void main(String[] args) {

    Person david = new Person(4, "david");
    Person maine = new Person(7, "maine");
    Person lucy = new Person(6, "lucy");
    Person rebecca = new Person(5, "rebecca");
    ArrayList<Person> peopleLine = new ArrayList<>();
    peopleLine.add(lucy);
    peopleLine.add(david);
    peopleLine.add(rebecca);
    peopleLine.add(maine);

    ArrayList<Drink> arrayDrink = new ArrayList<>();
    Drink soup = new Drink("soup", 2, 5, "C1");
    Drink beer = new Drink("beer", 2, 5, "C2");
    Drink sprite = new Drink("sprite", 1, 5, "C3");

    arrayDrink.add(soup);
    arrayDrink.add(beer);
    arrayDrink.add(sprite);

    Food skittles = new Food("skittles", 3, 6, "A1");
    Food donuts = new Food("donuts", 4, 2, "A2");
    Food cake = new Food("cake", 6, 4, "A3");
    Food hotdog = new Food("hotdog", 2, 5, "B1");
    Food worms = new Food("worms", 1, 2, "B2");
    Food sardines = new Food("sardines", 4, 6, "B3");
    ArrayList<Food> arrayFood = new ArrayList<>();
    arrayFood.add(skittles);
    arrayFood.add(donuts);
    arrayFood.add(cake);
    arrayFood.add(hotdog);
    arrayFood.add(worms);
    arrayFood.add(sardines);

    VendingMachine vendor = new VendingMachine(arrayFood, arrayDrink);
    try {
      vendor.vendingMachineScanner(peopleLine);
    }catch(IllegalArgumentException e) {
      System.out.println("The program failed to load");
    } catch(Exception e) {
      System.out.println(e.getMessage());
    };


  }
}
