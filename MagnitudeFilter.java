
/**
 * Write a description of MagnitudeFilter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MagnitudeFilter implements Filter 
{
    private double minMag;
    private double maxMig;
    
    public MagnitudeFilter(double min , double  max){
        this.minMag = min;
        this.maxMig = max;
    }
    
    public boolean satisfies(QuakeEntry qe){
        return qe.getMagnitude() > minMag && qe.getMagnitude() < maxMig 
                || qe.getMagnitude() == minMag || qe.getMagnitude() == maxMig;
        
    }
    
    public String getName(){
        return "MagnitudeFilter";
    }
    

}
