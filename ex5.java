import java.util.*;

class ex5 {
    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList(Arrays.asList("tomato", "cheese","chips","fruit","pie","butter","tea","buns"));
        a=removeConstru(a,4);
        for(int i =0; i <a.size(); i ++) {
                System.out.print(a.get(i) + " ");
        }
    
    }

    public static ArrayList<String> removeConstru(ArrayList <String> a, int b){
        ArrayList<String> c = new ArrayList();
        
        
        for(int i=0; i <a.size(); i ++) {
            //System.out.println(a.get(i).length());
            if(!(a.get(i).length() < b))
                c.add(a.get(i));

        }
        return c;
    }

}
