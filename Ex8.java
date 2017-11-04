class Ex8

 {

    //test program
    public static void main(String [] args) {                   
        DrinksMachine m1 = new DrinksMachine(0,10,10);
        m1.insert(400);
        int count = numbOfCokes(m1);
        System.out.println(count);

    }

    public static int numbOfCokes(DrinksMachine m1){
        int count=0;
        while(!m1.cokesEmpty() && m1.getBalance()>=m1.getPrice())
        {
            m1.pressCoke();
            count++;
            
        }
        int x= count;
        while(x>0) {
            Can c1 = new Can ("Coke");
            m1.loadCoke(c1);
            x--;
            

        }
        
        return count;
    }
}


