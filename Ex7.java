class Ex7 {

    //test program
    public static void main(String [] args) {                   
        DrinksMachine m1 = new DrinksMachine(40,10,10);
        DrinksMachine m2 = new DrinksMachine(90,10,10);
        m1.insert(50);
        m2.insert(20);
        raisePrice(m1,m2,80);
        System.out.println(m1.getPrice()+ " " + m2.getPrice());

    }

    public static void raisePrice(DrinksMachine m1, DrinksMachine m2, int p){

        if(m1.getPrice()< m2.getPrice() ) {
            if(m1.getPrice() + p > m2.getPrice()){
                m1.setPrice(m2.getPrice());

            }
            else {
                m1.setPrice(m1.getPrice() + p);

            }
        }
        else {
            if(m2.getPrice() + p > m1.getPrice()){
                m2.setPrice(m1.getPrice());

            }
            else {
                m2.setPrice(m2.getPrice() + p);

            }
        }
    }
        
}

