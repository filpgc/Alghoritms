
class Ex5 {
    public static void main(String[] args) {
        DrinksMachine m1 = new DrinksMachine(50);
        Can myCan1 = new Can("Coke");
        Can myCan2 = new Can("Coke");
        m1.loadCoke(myCan1);
        m1.loadCoke(myCan2);
        myCan1.drink(); // this makes the user drink the can 2, because can 1 gets empty
        drinkOneCan(myCan1, myCan2);

    }
    public static void drinkOneCan(Can c1, Can c2) {
        if(c1.isFull()){

            c1.drink();
            System.out.println("You drunk can 1");

        }
        else if(!c1.isFull() && c2.isFull()){
            c2.drink();
            System.out.println("You drunk can 2");

        }
        else {
            System.out.println("The cans are both empty");
        }

    }
}