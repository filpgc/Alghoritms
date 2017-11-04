import java.util.Scanner;

class Ex4 {

    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        DrinksMachine m1 = new DrinksMachine(50, 5, 5);
        System.out.println("Put some money ");
        int sum = input.nextInt();
        String answer;
        m1.insert(sum);
        Scanner input2 = new Scanner(System.in);
        if(m1.getBalance() >= m1.getPrice()){

            Can myCan = m1.pressCoke();
            int change = m1.pressChange();
            System.out.println(myCan.toString() + " for you, take your rest of " + change + "p");
            System.out.println("Drink?");
            answer=input2.nextLine();
            if(answer.equalsIgnoreCase("yes")){
                myCan.drink();
                if(!myCan.isFull()){

                    System.out.println("You finished the coke, now it is empty");
                }
            }
            else{
                System.out.println("Ok you will drink it later");

            }
        }

        else {
            System.out.println("Not enough money");
        }
    }

}

