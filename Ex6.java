class Ex6 {

    //test program
    public static void main(String [] args) {                   
        DrinksMachine m1 = new DrinksMachine(50,10,10);
        DrinksMachine m2 = new DrinksMachine(50,10,10);
        m1.insert(50);
        m2.insert(20);
        String mostCash = storeCash(m1,m2);
        System.out.println( mostCash + " has most cash");
        

    }

    public static String storeCash(DrinksMachine m1, DrinksMachine m2) {
        int cash1 = m1.collectCash();
        int cash2 = m2.collectCash();

        if(cash1<cash2)
            return "Machine 1 ";

        else 
            return "Machine 2";

    }
    
    public static void raisePrice(DrinksMachine m1, DrinksMachine m2, int p){
        
        if(m1.getPrice()< m2.getPrice() ) {
            if(m1.getPrice() + p > m2.getPrice()){
                m1.setPrice(m2.getPrice());
                
            }
            else {
                m1.setPrice(m1.getPrice() + p);
                m2.setPrice(m1.getPrice() + p);
                
            }
        }
            else {
                if(m2.getPrice() + p > m1.getPrice()){
                m2.setPrice(m1.getPrice());
                
            }
            else {
                m2.setPrice(m2.getPrice() + p);
                m2.setPrice(m2.getPrice() + p);
                
            }
                
                
        }
            
            
        }
        
        
        
    }



