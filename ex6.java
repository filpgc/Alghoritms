import java.util.*;

class ex6 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter some numbers (all on one line, separated by spaces):");
        String line = input.nextLine();
        String[] numbers = line.split(" ");
        ArrayList<Integer> a = new ArrayList<Integer>();
        for(int i=0; i<numbers.length; i++)
            a.add(new Integer(numbers[i]));
        System.out.println("The numbers are stored in an ArrayList");
        System.out.println("The ArrayList is "+a);
        System.out.print("Enter two numbers: ");
        int p = input.nextInt(), q=input.nextInt();
        replaceDestr(a,p,q);
       // a= replaceConstr(a,p,q);
        System.out.println("The ArrayList is now "+a);
    }

    public static <T> void replaceDestr(ArrayList<T> a,T b,T c){
        for(int i=0; i<a.size(); i++){
            if(a.get(i).equals(b)){
                a.set(i,c);
            }

        }     

    }

    public static <T> ArrayList<T> replaceConstr(ArrayList<T> a,T b,T c){
        ArrayList <T> second = new ArrayList <T> ();
        for(int i=0; i<a.size(); i++){
            if(a.get(i).equals(b)){
                second.add(c);
            }
            else
                second.add(a.get(i));

        }      
        return second;
    }

}