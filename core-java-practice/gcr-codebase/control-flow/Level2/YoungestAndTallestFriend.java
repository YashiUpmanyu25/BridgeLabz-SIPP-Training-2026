import java.util.Scanner;

public class YoungestAndTallestFriend {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int amarAge = input.nextInt();
        int akbarAge = input.nextInt();
        int anthonyAge = input.nextInt();

        double amarHeight = input.nextDouble();
        double akbarHeight = input.nextDouble();
        double anthonyHeight = input.nextDouble();

        String youngestFriend;
        String tallestFriend;

        if (amarAge <= akbarAge && amarAge <= anthonyAge) {
            youngestFriend = "Amar";
        } else if (akbarAge <= amarAge && akbarAge <= anthonyAge) {
            youngestFriend = "Akbar";
        } else {
            youngestFriend = "Anthony";
        }

        if (amarHeight >= akbarHeight && amarHeight >= anthonyHeight) {
            tallestFriend = "Amar";
        } else if (akbarHeight >= amarHeight && akbarHeight >= anthonyHeight) {
            tallestFriend = "Akbar";
        } else {
            tallestFriend = "Anthony";
        }

        System.out.println("Youngest Friend = " + youngestFriend);
        System.out.println("Tallest Friend = " + tallestFriend);

        input.close();
    }
}