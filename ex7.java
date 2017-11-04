import java.util.*;

class ex7 {

    public static void main(String[] args) {
        DrinksMachine machine1 = new DrinksMachine(50,0,1);     //first machine
        DrinksMachine machine2 = new DrinksMachine(30,0,1);     //second machine
        DrinksMachine machine3 = new DrinksMachine(60,0,1);     //third machine
        DrinksMachine machine4 = new DrinksMachine(20,0,1);     //third machine
        ArrayList<DrinksMachine> a = new  ArrayList<DrinksMachine>();   //array of machines
        a.add(machine1);
        a.add(machine2);
        a.add(machine3);
        a.add(machine4);
        System.out.println("You get " + buying(a));

    }

    public static Can buying(ArrayList<DrinksMachine> a) {
        int index=0;
        int empty=0;
        try{        
            for(int i=0; i < a.size() -1; i ++) {

                for(int x=a.size()-1; x >=0 ; x --) {
                    if((a.get(x).cokesEmpty())){                   
                        //a.remove(x);
                        empty++;                   

                    }

                }

                if(empty==a.size())
                    throw new EmptyMachineException();

                else{

                    if( a.get(index).getPrice() > a.get(i+1).getPrice()){
                        index= i+1;
                    }
                }
            }
            a.get(index).insert(a.get(index).getPrice());
            System.out.println("The price of the cheapest one is " +a.get(index).getBalance());
            
        }
        catch( EmptyMachineException e ){       // exception handling

            System.out.println("Empty machines");

        }
         return a.get(index).pressCoke();
    }
}
