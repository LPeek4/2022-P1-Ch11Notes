import java.util.Random;
import java.util.Scanner;

public class LinearSearching {

    static int numList[] = new int[1000];

    public static void main(String args[]){

        Random rand = new Random(1234);
        for(int k = 0; k < numList.length; k++){
            numList[k] = rand.nextInt(1000);
        }

        for(int k = 0; k < numList.length; k++){
            System.out.print(numList[k] + " ");
        }

        Scanner scan = new Scanner(System.in);
        int look = scan.nextInt();

        System.out.print(linearSearch(look) + " ");

    }

    public static int linearSearch(int lookup) {


        for (int k = 0; k < numList.length; k++) {

            if (numList[k] == lookup)
                return k;

        }
    }
}
