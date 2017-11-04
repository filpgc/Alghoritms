import java.util.Scanner;

class Ex3 {

    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        DrinksMachine m1 = new DrinksMachine(50, 10, 10);
        System.out.println("Put some money ");
        int sum = input.nextInt();
        int amount = buyCokes(m1, sum);
        System.out.println("I have " + m1.pressChange() + "p and " + amount + " cans of Coke " );
    }

    public static int buyCokes(DrinksMachine m1, int sum) {
        m1.insert(sum);
        int count = 0;
        while (! m1.cokesEmpty()&& m1.getBalance() >= m1.getPrice()) {

            m1.pressCoke();
            count ++;

        }
        return count;

    }
}