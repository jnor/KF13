package KF13.assignment4;
/**
 *
 * @author Rafal
 */
public class HashMap {
    
    public Bucket [] hashMap;
    
    //Instanciate HashMap[] with a size of all elements in a list
    public HashMap(){
        hashMap = new Bucket[7990];
    }
    
    //Add word to hash map
    public void addWord(String word, String url){
        int hashCode = GenerateHashCode(word);
        if(checkIfBucketExists(hashCode) == false){
            System.out.println("Generating new bucket");
           hashMap[hashCode] = new Bucket(word, url);
        }else{
           if(hashMap[hashCode].checkIfWordInBucket(word) == true){
              System.out.println(word +" this word already exists in bucket");
              if(hashMap[hashCode].getWord(word).url.containsPage(url) == false){
                  System.out.println("");
                  hashMap[hashCode].getWord(word).url.addPage(url);
              }
              //hashMap[hashCode].addWordToBucket(word);
           }else{
              hashMap[hashCode].addWordToBucket(word, url);
           }
        }
     }
    
    //Returns modulo of hashCoded string.
    public int GenerateHashCode(String s){
        System.out.println("GenerteHashCode: word: " + s + " code: " + Math.abs(s.hashCode()%hashMap.length));
        return Math.abs(s.hashCode()%hashMap.length);
    }
    
    public boolean checkIfBucketExists(int hashCode){
         if(hashMap[hashCode] == null){
              return false;
         }else{return true;}
     }
    
    public Bucket searchForWord(String word){ 
        return hashMap[GenerateHashCode(word)];
    }
    
    
}
