import java.util.*;
import java.io.*;

class ex10 {
    public static void main(String[] args) {
        ArrayList<ArrayList<String>> lines = convert("twinkle.txt");

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

}

