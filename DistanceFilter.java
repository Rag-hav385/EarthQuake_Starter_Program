
/**
 * Write a description of DistanceFilter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DistanceFilter implements Filter {
    private int maxDist;
    private Location loc;
    
    public DistanceFilter(int dist, Location loc2){
        this.maxDist = dist;
        this.loc = loc2;
    }
    
    public boolean satisfies(QuakeEntry qe){
        Location loc1 = qe.getLocation();
        return loc1.distanceTo(loc) < maxDist;
    }
    
    public String getName(){
        return "DistanceFilter";
    }
}
