import java.util.*;
import java.io.*;

class ex11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<ArrayList<String>> lines = convert("twinkle.txt");
        System.out.print("Enter one word: ");
        String p = input.nextLine();
        lines=  notContainConstru(lines,p);
        //notContainDestru(lines,p);
        System.out.println("The ArrayList is "+lines);
    }

    public static  ArrayList<ArrayList<String>> convert(String file){
        ArrayList<ArrayList<String>> lines = new ArrayList<ArrayList<String>>();

        try{
            BufferedReader in = new BufferedReader(new FileReader(file));
            String s;

            while((s = in.readLine()) != null){
                ArrayList<String> a = new ArrayList<String>();
                String[] sentence= s.split(" ");
                for(int i =0; i <sentence.length; i ++){

                    a.add(sentence[i]);

                }

                lines.add(a);
            }

        }catch(Exception e){
            e.printStackTrace();
        }

        return lines;
    }

    public static <T> ArrayList<ArrayList<T>> notContainConstru(ArrayList<ArrayList<T>> a, T thing){
        ArrayList<ArrayList<T>> b = new ArrayList<ArrayList<T>>();
        boolean condition;

        for(int i = 0; i <a.size() ; i ++) {
            condition=true;
            //System.out.println(a.get(i));
            for(int x = 0; x <a.get(i).size() ; x ++){
                if(a.get(i).get(x).equals(thing)){
                    condition=false;
                    break;
                }

            }

            if(condition)
                b.add(a.get(i));

        }
        return b;

    }
    
    public static <T> void notContainDestru(ArrayList<ArrayList<T>> a, T thing){

        for(int i = a.size()-1; i >=0 ; i --) {
            //System.out.println(a.get(i));
            for(int x = a.get(i).size()-1; x >=0 ; x --){
                if(a.get(i).get(x).equals(thing)){
                    a.remove(a.get(i));
                    break;
                }

            }

        }
        

    }


}

