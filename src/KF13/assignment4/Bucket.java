package KF13.assignment4;
/**
 *
 * @author Rafal
 */
public class Bucket {
    
    public HtmlList pointer = null;
    
    public Bucket(String firstWord, String url){
        
        HtmlList newWord = new HtmlList(firstWord, pointer , new PageList());
        newWord.url.addPage(url);
        pointer = newWord; 
    }
    
    public void addWordToBucket(String word, String url){
        HtmlList newWord = new HtmlList(word, pointer, new PageList());
        newWord.url.addPage(url);
        pointer = newWord;
    }
    
    public boolean checkIfWordInBucket(String word){
        HtmlList currentWord = pointer; 
        while(currentWord!= null){
            if((currentWord.str).equals(word)){
                return true;
            }else{
                currentWord = currentWord.next;
            }
        }
        return false;
    }
    
    public HtmlList getWord(String word){
        HtmlList currentWord = pointer;
        while(currentWord != null){
          if( (currentWord.str).equals(word) ){
               return currentWord; 
          }
          currentWord = currentWord.next;
        }
        return null;
    }
    
}
