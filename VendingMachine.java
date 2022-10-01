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
      System.out.println(el.getPosition() + ": " + el.getBrand() + "  --> $" + el.getPrice());
    }

    for(Drink el : drinks) {
      // total += el.getPrice();
      System.out.println(el.getPosition() + ": " + el.getBrand() + "  --> $" + el.getPrice());
    }
    return "";
  }
  // this method is for subtracting money spent on food
  public void subtractMoney(Person person, int index) {
    Random r = new Random();
    int randNum = r.nextInt(100);

    if (person.getMoney() < food.get(index).getPrice()) {
      System.out.println("insufficent funds!");
    } else {
      int remainingMoney = person.getMoney() - food.get(index).getPrice();
      person.setMoney(remainingMoney);

      if (randNum > 64) {
        food.get(index).stuck();
      } else {
        food.get(index).receiveRefreshment();
      }
    }
    System.out.println("You have $" + person.getMoney() + " remaining." );
  }

  //overloading, basically the same as money but it needs to use dsrinks
  public void subtractMoney(Person person, int index, int random) {

    if (person.getMoney() < drinks.get(index).getPrice()) {
      System.out.println("insufficent funds!");
    } else {
      int remainingMoney = person.getMoney() - drinks.get(index).getPrice();
      person.setMoney(remainingMoney);
      if (random > 64) {
        drinks.get(index).stuck();
      } else {
        drinks.get(index).receiveRefreshment();
      }
    }


    System.out.println("You have $" + person.getMoney() + " remaining." );
  }

  // its sentient
  public void vendingMachineScanner(ArrayList<Person> peopleLine) {
    Scanner scan = new Scanner(System.in); // need to get people's names
    System.out.println("Welcome to sentient wonkey vending machine!!");
    System.out.println("Type info to see available items and prices");
    System.out.println("Type letter and number code with 0 spaces get item");
    System.out.println("Type E to exit and step out of line"); // exits the whole program when line is done

    for (Person person: peopleLine) {
      System.out.println("Hello " + person.getName() + "! You have $" + person.getMoney() + " left.");
      String input = scan.next();

      do {
      switch(input.toUpperCase()) {
        case "INFO":
          System.out.println(checkItems());
          input = scan.next().toUpperCase();
          System.out.println("Enter your chice of beverage: example B3");
        break;

        case "E":
          input = "E";
          break;

        case "A1":
          subtractMoney(person, 0);
          input = scan.next().toUpperCase();
        break;

        case "A2":
          subtractMoney(person, 1);
          input = scan.next().toUpperCase();
        break;

        case "A3":
          subtractMoney(person, 2);
          input = scan.next().toUpperCase();
        break;

        case "B1":
          subtractMoney(person, 3);
          input = scan.next().toUpperCase();
        break;

        case "B2":
          subtractMoney(person, 4);
          input = scan.next().toUpperCase();
        break;

        case "B3":
          subtractMoney(person, 5);
          input = scan.next().toUpperCase();
        break;

        case "C1":
          Random rand2 = new Random();
          int rand_int2 = rand2.nextInt(60);
          subtractMoney(person, 0, rand_int2);
        break;

        case "C2":
          Random rand3 = new Random();
          int rand_int3 = rand3.nextInt(70);
          subtractMoney(person, 1, rand_int3);
        break;

        case "C3":
          Random rand4 = new Random();
          int rand_int4 = rand4.nextInt(80);
          subtractMoney(person, 2, rand_int4);
        break;

        default:
          System.out.println("Invalid entry!");
          input = scan.next().toUpperCase();
          break;
        }
      } while (!input.equals("E"));

      System.out.println("Thank you for shopping! Next!");
    }
  }


}
