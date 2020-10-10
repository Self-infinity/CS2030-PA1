//import Lecture;
class Tutorial extends ScC {
    //protected final int duration;

    Tutorial (String modCode, int classId, String venueId, Instructor instructor, int startTime){
    super(modCode, classId, venueId, instructor, startTime, 1);
    
    }

    public boolean clashWith(Lecture lec){
        if (this.getStartTime() <= lec.getStartTime()){
            if (this.getStartTime() + 1 <= lec.getStartTime()){
                return false;
            }
            else{
                return true;
            }
        }
        else{
            if (this.getStartTime() >= lec.getStartTime() + 2){
                return false;
            }
            else {
                return true;
            }
        }
    }

    public boolean clashWith(Tutorial tut){
        if (this.getStartTime() <= tut.getStartTime()){
            if (this.getStartTime() + 1 <= tut.getStartTime()){
                return false;
            }
            else{
                return true;
            }
        }
        else{
            if (this.getStartTime() >= tut.getStartTime() + 2){
                return false;
            }
            else {
                return true;
            }
        }
    }

    @Override
    public String toString() {
        return this.getModCode() + " T" + this.getClassID() + " @ " + this.getVenueId() + " [" + this.getInstructor() + "] " + this.getStartTime() +"--"+ (this.getStartTime() + 2);
    }
}
