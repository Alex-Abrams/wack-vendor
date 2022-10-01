import java.util.*;

public class VendingMachine {
  // needs to hold an array of Refreshment objects

  private ArrayList<Food> food;

  private ArrayList<Drink> drinks;

  public VendingMachine(ArrayList<Food> f, ArrayList<Drink> d) {
    this.food = f;
    this.drinks = d;
  }


  public String checkItems() {
    int total = 0;
    int size = food.size();
    System.out.println(size);
    for(Food el : food) {
      // total += el.getPrice();
      System.out.println(el.getPosition() + ": " + el.getBrand() + "  -->" + el.getPrice());
    }

    for(Drink el : drinks) {
      // total += el.getPrice();
      System.out.println(el.getPosition() + ": " + el.getBrand() + "  -->" + el.getPrice());
    }
    return "";
  }

  // its sentient
  public void vendingMachineScanner(ArrayList<Person> peopleLine) {
    Scanner scan = new Scanner(System.in); // need to get people's names
    System.out.println("Welcome to sentient vending machine!!");
    System.out.println("Type info to see available items and prices");
    // System.out.println("Type $ to deposit money"); // get their total money
    System.out.println("Type letter and number code with 0 spaces get item");
    System.out.println("Type E to exit and step out of line"); // exits the whole program when line is done

    for (Person person: peopleLine) {
      System.out.println("You have $" + person.getMoney());
      String input = scan.next();
      switch(input.toUpperCase()) {
        case "INFO":
          System.out.println(checkItems());
        break;

        case "E":
          System.out.println("Thank you for shopping! Next!");
        break;

        case "A1":
          // System.out.println(food.get(0).getPrice());
          if (person.getMoney() < food.get(0).getPrice()) {
            System.out.println("insufficent funds!");
          } else {
            int remainingMoney = person.getMoney() - food.get(0).getPrice();
            // person.setMoney(remainingMoney);
            System.out.println(remainingMoney);
          }
          System.out.println("You have " + person.getMoney() + " remaining." );
        break;

        case "A2":
        break;

        case "A3":
        break;

        case "B1":
        break;

        case "B2":
        break;

        case "B3":
        break;

        case "C1":
        break;

        case "C2":
        break;

        case "C3":
        break;
    }

    }
  }


}
