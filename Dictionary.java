public class Dictionary{
    protected String [] words1= new String[200];
    protected String [] words2= new String[200];
    protected int i =0;

    void add(String word1,String word2){
        words1[i]=word1;
        words2[i]=word2;
        i++;
    }

    boolean contains(String word){
        for(int x =0; x<i; x++){

            if(words1[x].equals(word)){
                if(words2[x]!=null){
                    return true;              
                }
            }

        }
        return false;

    }

    String equiv(String word) throws NotFoundException{
        int x=0;
        boolean condition=true;
        for(; x<i ; x++){

            if(words1[x].equals(word)){
                if(words2[x]==null){
                    condition=false;                  
                }
                break;
            }
        }

        if(!condition){
            throw new NotFoundException(word);
        }
        return words2[x];

    }

    void remove(String word) throws NotFoundException{
        boolean condition=true;
        for(int x =0; x<i; x++){

            if(words1[x].equals(word)){
                condition=false;
                words2[x]=null;
                i--;
                break;

            }
        }    
        if(condition)
            throw new NotFoundException(word);

    }

    boolean same(String word1,String word2) throws NotFoundException{
        boolean condition=true;
        int x =0;
        for(; x<words1.length; x++){
            if(words1[x].equals(word1)){   
                condition=false;
                break;
            }
        } 
        if(condition)
            throw new NotFoundException(word1);
        if(words2[x].equals(word2))
            return true;
        else
            return false;

    }

    void getString(int z){
        System.out.println(words1[z] + " " + words2[z]);

    }

    int size(){
        return i;
    } 

}
