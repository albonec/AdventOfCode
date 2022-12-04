import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Elves {

    public static void main(String[] args) throws IOException {
        File elves = new File("res/elves.txt");
        Scanner scan = new Scanner(elves);
        ArrayList<Integer> totals = new ArrayList<>();
        ArrayList<String> lines = new ArrayList<>();
        int tempTotal = 0;
        int maxTotal = 0;
        int secondMaxTotal = 0;
        int thirdMaxTotal = 0;
        for (int i = 0; i < 2255; i++) {
            if(scan.hasNextLine()) {
                lines.add(scan.nextLine());
            }
        }
        for (int i = 0; i < lines.size(); i++) {
            if(!lines.get(i).equals("")) {
                tempTotal += Integer.parseInt(lines.get(i));
            } else {
                totals.add(tempTotal);
                tempTotal = 0;
            }
        }
        for (int i = 0; i < totals.size(); i++) {
            if(totals.get(i) > maxTotal) {
                maxTotal = totals.get(i);
            }
        }
        totals.remove(totals.indexOf(maxTotal));
        for (int i = 0; i < totals.size(); i++) {
            if(totals.get(i) > secondMaxTotal) {
                secondMaxTotal = totals.get(i);
            }
        }
        totals.remove(totals.indexOf(secondMaxTotal));
        for (int i = 0; i < totals.size(); i++) {
            if(totals.get(i) > thirdMaxTotal) {
                thirdMaxTotal = totals.get(i);
            }
        }

        System.out.println("Greatest: " + maxTotal);
        System.out.println("Second: " + secondMaxTotal);
        System.out.println("Third: " +thirdMaxTotal);
        System.out.println("Sum: " + (maxTotal+secondMaxTotal+thirdMaxTotal));
    }
}