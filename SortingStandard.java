import java.util.Comparator;

class SortingStandard implements Comparator<ScC> { 
    //*Used for sorting Classes.*/ 
    public int compare(ScC a, ScC b) { 
        if (a.getStartTime() < b.getStartTime()) {
            return -1;
        } 
        else if (a.getStartTime() > b.getStartTime()) {
            return 1;
        }
        else {
            if (a.getModCode().equals(b.getModCode())) {
                if (a.getClassID() < b.getClassID()) {
                    return -1;
                }
                else {
                    return 1;
                }
            }
            else {
                return a.getModCode().compareTo(b.getModCode());
            }
        }
    } 
} 
