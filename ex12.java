import java.util.*;

class ex12 {
    public static void main(String args[]) {
        Scanner input= new Scanner(System.in);
        ArrayList<String> a = new ArrayList<String>(); 
        System.out.println("Enter some stuff (all on one line, separated by spaces):");
        String line= input.nextLine();
        String[] words= line.split(" ");
        for(int i=0; i < words.length; i ++)
            a.add(words[i]);
        //System.out.println("The ArrayList is now "+a);
        System.out.print("First word: ");
        String p= input.nextLine();
        System.out.print("Second word: ");
        String q= input.nextLine();
        a=change(a,p,q);
        System.out.println("The ArrayList is now "+a);

    }
    
    // it does it constructively
    public static <T> ArrayList<T> change(ArrayList<T> a, T b, T c) {
        ArrayList<T> second = new ArrayList<T>();
        int i;
        for(i=a.size()-1; i>=0 ; i--){
            if(a.get(i).equals(c)){
                second.add(a.get(i));  
                i--;
                break;
            }

        }
        while(i>=0){
            second.add(a.get(i));
            if(a.get(i).equals(b))
                break;
            i--;
        }
        return second;
    }

}

