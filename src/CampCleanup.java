import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class CampCleanup {

    public static boolean doRangesCover(int min1, int max1, int min2, int max2) {
        if(min1 <= min2 && max1 >= max2) {
            return true;
        } else {
            return min2 <= min1 && max2>= max1;
        }
    }

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scan = new Scanner(new FileReader("res/campcleanup.txt"));
        int count = 0;
        while(scan.hasNextLine()) {
            String line = scan.nextLine();
            String half1 = line.substring(0, line.indexOf(','));
            String half2 = line.substring(line.indexOf(',') + 1);
            int num1 = Integer.parseInt(half1.substring(0, half1.indexOf("-")));
            int num2 = Integer.parseInt(half1.substring(half1.indexOf("-") + 1));
            int num3 = Integer.parseInt(half2.substring(half2.indexOf(",") + 1, half2.indexOf("-")));
            int num4 = Integer.parseInt(half2.substring(half2.indexOf("-") + 1));
            System.out.println(line);
            if(doRangesCover(num1, num2 ,num3 ,num4)) {
                System.out.println(true);
                count++;
            } else {
                System.out.println(false);
            }
        }
        System.out.println(count + " intervals fully cover the other");
    }

}
