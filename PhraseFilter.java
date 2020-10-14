
/**
 * Write a description of PhraseFilter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PhraseFilter implements Filter {
    private String where;
    private String phrase;
    
    public PhraseFilter(String position , String tittle){
        this.where = position;
        this.phrase = tittle;
    }
    
    public boolean satisfies(QuakeEntry qe){
        if(where == "start"){
         return qe.getInfo().startsWith(phrase);
        }
        if(where == "end"){
            return qe.getInfo().endsWith(phrase);
        }
        if(where == "any"){
            return qe.getInfo().contains(phrase);
        } 
        
        return false;
        
    }
    
    public String getName(){
        return "PhraseFilter";
    }

}
