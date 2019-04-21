import java.awt.*;
import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;
import java.lang.reflect.Array;


public class Main {

    public static void main (String[] args) {

//        Car myCar = new Car(25.5,
//                "1BC32E",
//                Color.BLUE, true);
//
//        Car sallyCar = new Car(13.9,
//                "3D2OBN",
//                Color.BLACK,
//                false);
//
//        System.out.println("My Car's License Plate: " + myCar.licensePlate);
//        System.out.println("Sally's License Plate: " + sallyCar.licensePlate);
//
//        System.out.println(myCar.paintColor.toString());
//        myCar.changePaintColor(Color.RED);
//        System.out.println(myCar.paintColor.toString());

//        System.out.println("Enter a word: ");
//
//        Scanner sc = new Scanner(System.in);
//        int userNum = sc.nextInt();
//        System.out.println(userNum);
//        double userNumber2 = sc.nextDouble();
//        System.out.println(userNumber2);


//        String userInput = sc.next();
//
//        String uppercased = userInput.toUpperCase();
//        System.out.println(uppercased);
//
//        char firstCharacter = userInput.charAt(0);
//        System.out.println(firstCharacter);
//
//        System.out.println("Contains: " +
//                userInput.contains("Enter".toLowerCase()));

//        int[] numbers = new int[5];
//
//        numbers[0] = 31;
//        numbers[1] = 45;
//        numbers[2] = 22;
//        numbers[3] = 98;
//        numbers[4] = 10;
//
//        // This does the same thing with numbers arr
//        int[] numbers2 = {31, 43, 22, 98, 10};
//        Arrays.sort(numbers);
//        System.out.println(Arrays.toString(numbers));
//
//        String[] myFavoriteCandyBars = {"Twix", "Hershey's", "Chrunch"};
//        myFavoriteCandyBars[1] = "HoneyBunny";
//        System.out.println("Index 2: " + myFavoriteCandyBars[1]);
//        System.out.println("Length: " + myFavoriteCandyBars.length);
//
//        System.out.println("Index 2: " + Array.get(myFavoriteCandyBars, 2));


//        Dog valery = new Dog(
//                10,
//                "Lab",
//                "Female",
//                false
//        );
//
//        System.out.println("Age: " + valery.age);
//        valery.yearPass(100);
//        System.out.println("Age: " + valery.age);
//        valery.bark();

//        System.out.println("Enter your age: ");
//        Scanner in = new Scanner(System.in);
//        int age = in.nextInt();
//
//        if (age >= 0 && age <= 5) {
//            System.out.println("Baby");
//        } else if (age >= 6 && age <= 11) {
//            System.out.println("Kid");
//        } else if (age >= 12 && age <= 17) {
//            System.out.println("Teen");
//        } else if (age >= 18) {
//            System.out.println("Adult");
//        } else {
//            System.out.println("Invalid");
//        }
//
//        System.out.println("Thanks for using this program!");

//        double power = Math.pow(5, 3);
//        double squareRoot = Math.sqrt(65);
//
//        Random rand = new Random();
//        int randomNumber = rand.nextInt();
//        int randomNumberWithBound = rand.nextInt(10);
//
//
//        System.out.println(randomNumber);
//        System.out.println(randomNumberWithBound);

//        Coin c = new Coin();
//        System.out.println("Initial: " + c.getFaceUp());
//
//        for(int i = 0; i < 10; i++) {
//            c.flip();
//            System.out.println("After: " + c.getFaceUp());
//        }

        Dice d = new Dice();
        d.init();
    }
}
