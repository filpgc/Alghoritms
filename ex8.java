import java.util.*;

class ex8 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> a = new ArrayList<ArrayList<Integer>>();
        int x=0;
        for(int i=0; i<4; i++){
            ArrayList<Integer> inner = new ArrayList<Integer>();
            a.add(inner);
            System.out.println("Enter some numbers (all on one line, separated by spaces):");
            try{
                String line = input.nextLine();
                String[] numbers = line.split(" ");
                for(x=0; x<numbers.length; x++)
                    a.get(i).add(new Integer(numbers[x]));
            }
            catch(NumberFormatException e ) {

                System.out.println("Only numbers please");
                continue;
            }
        }
        System.out.println("The numbers are stored in the ArrayList of the ArrayList");
        System.out.println("The ArrayList is "+a);
        System.out.print("Enter one number: ");
        int p = input.nextInt();
        //replaceDestr(a,p,q);
        notContain(a,p);
        System.out.println("The ArrayList is now "+a);
    }
    
    //destructive version
    public static void notContain(ArrayList<ArrayList<Integer>> a, int number){

        for(int i = a.size()-1; i >=0 ; i --) {
            //System.out.println(a.get(i));
            for(int x = a.get(i).size()-1; x >=0 ; x --){
                if(a.get(i).get(x)==number){
                    a.remove(a.get(i));
                    break;
                }

            }

        }
        

    }

}