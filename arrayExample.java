package basics;


import java.util.Scanner;

public class arrayExample {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        int[] myArray = {1,2,3,5,7,9};
        int[] anotherArray = new int[10];
        String[] gender = {"female", "male"};

        myArray[1] = 13;
        myArray[3] = 13;
        anotherArray[5] = 17;




        for (int i = 0; i <  anotherArray.length; i++) {
            //System.out.println("item at: "+ i+ "is" + anotherArray[i]);
            System.out.println("item at: " +i);
            anotherArray[i] = input.nextInt();




        }
    }
}
