import java.awt.*;
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


        Dog valery = new Dog(
                10,
                "Lab",
                "Female",
                false
        );

        System.out.println("Age: " + valery.age);
        valery.yearPass(100);
        System.out.println("Age: " + valery.age);
        valery.bark();
    }
}
