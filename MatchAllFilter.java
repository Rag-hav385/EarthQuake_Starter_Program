import java.util.*;

/**
 * Write a description of MatchAllFilter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MatchAllFilter implements Filter {
    private ArrayList<Filter> filters;
    
    public MatchAllFilter(){
        filters = new ArrayList<Filter>();
    }
    
    public void addFilter(Filter F){
        filters.add(F);
    }
    
    public boolean satisfies(QuakeEntry qe){
        for(Filter f : filters){
            if(!f.satisfies(qe)){
                return false;
            }
        }
        return true; 
    }
    
    public String getName(){
        String filtername = "";
        for(Filter f : filters){
            filtername += f.getName();
        }
        return filtername;
        
    }
}
 