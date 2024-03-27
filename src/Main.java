import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Car[] cars = new Car[3];

        cars[0] = new Car("3er", 306);

        cars[1] = new Car("Golf 8", 160);

        cars[2] = new Car("Astra", 90);

        Scanner userInput = new Scanner(System.in);
        System.out.println("Bitte gib eine Anweisung ein (Autoname, Aktion))");
        String input = userInput.nextLine();

        //auswerten welches Auto genutzt werden soll und
        // welche Aktion durchgeführt werden soll
        //mögliche Aktionen: "fahren" und "anhalten"
        //Beispiel: "Golf 8, fahren"

        System.out.println("Eingabe war: " + input);

        String[] command = input.split(",");

        System.out.println("Command Car: " + command[0]);
        System.out.println("Command Action: " + command[1]);

        //1.Aufgabe: Auto finden
        Car currentCar = null;

        for( Car car : cars){
            if(car.getName() == command[0]){
                  currentCar = car;
            }
        }





    }
}