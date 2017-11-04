import java.util.Scanner;
import java.util.*;

class Ex9

{

    //test program
    public static void main(String [] args) {                   
        DrinksMachine m1 = new DrinksMachine(100,2,2);
        DrinksMachine m2 = new DrinksMachine(50,2,2);
        while(!(m1.fantasEmpty() && m1.cokesEmpty() && m2.fantasEmpty() && m2.cokesEmpty())){
            DrinksMachine m3 = chooseMachine(m1,m2);
            chooseCan(m3);

        }

        takeMoney(m1, m2);
    }

    public static void takeMoney(DrinksMachine m1, DrinksMachine m2){
        int moneyfirst = m1.collectCash();
        int moneysecond = m2.collectCash();
        System.out.println("\nMoney first machine: " + moneyfirst +"\nMoney second machine: " + moneysecond);
        System.out.println("Total cash of the day: " + (moneyfirst + moneysecond));
    }

    public static DrinksMachine chooseMachine(DrinksMachine m1, DrinksMachine m2){
        System.out.println("\nA: Machine 1\nB: Machine 2");
        Scanner input = new Scanner(System.in);
        String answer = input.nextLine();
        if(answer.equalsIgnoreCase("A") || answer.equalsIgnoreCase("B")){
            if(answer.equalsIgnoreCase("A")){
                if(m1.cokesEmpty() && m1.fantasEmpty()){
                    System.out.println("The first machine is empty");
                    return chooseMachine(m1,m2);
                }
                return m1;

            }
            else {
                if(m2.cokesEmpty() && m2.fantasEmpty()){
                    System.out.println("The second machine is empty");
                    return chooseMachine(m1,m2);
                }
                return m2;

            }
        }
        else {
            System.out.println("You have to choose between A and B");
                return chooseMachine(m1,m2);
        }
    }

    public static void chooseCan(DrinksMachine m3){
        System.out.println("A: Buy Coke\nB: Buy Fanta");
        Scanner input = new Scanner(System.in);
        String answer = input.nextLine();
        if(answer.equalsIgnoreCase("A")){

            if(!m3.cokesEmpty()){
                buyCan(m3, answer);
            }
            else{
                System.out.println("Cokes finished");
                chooseCan(m3);
            }
        }   
        else{
            if(!m3.fantasEmpty()) {
                buyCan(m3, answer);
            }
            else {
                System.out.println("Fantas finished");
                chooseCan(m3);
            }
        }
    }

    public static void buyCan(DrinksMachine m3, String answer){
        boolean condition = true;
        int amount=0;
        int money=0;
        while (condition){
            System.out.print("Insert Money ");
            Scanner input = new Scanner(System.in);
            try {
                amount = input.nextInt();
                money = money + amount;
            }
            catch(InputMismatchException E) {
                System.out.println("You have to insert money not letters!!");
            }

            if(money >= m3.getPrice()){
                m3.insert(money);
                if(answer.equalsIgnoreCase("A")){

                    m3.pressCoke();

                }
                else{

                    m3.pressFanta();

                }
                condition = false;
                int change = m3.pressChange();
                System.out.println("Thanks, take your drink");
                if(change!=0)
                    System.out.println("This is your change: " + change + "p");

            }
            else{
                System.out.println("You need other " + (m3.getPrice()-money) + "p");

            }

        }

    }
}

