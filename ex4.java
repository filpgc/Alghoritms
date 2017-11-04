import java.util.*;

class ex4 {
    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList(Arrays.asList("tomato", "cheese","chips","fruit","pie","butter","tea","buns"));
        removeDestr(a,4);
        for(int i =0; i <a.size(); i ++) {
                System.out.print(a.get(i) + " ");
        }
    
    }

    public static void removeDestr(ArrayList <String> a, int b){
        for(int i=a.size() -1; i >=0; i --) {
            //System.out.println(a.get(i).length());
            if(a.get(i).length() < b)
                a.remove(i);

        }

    }

}
