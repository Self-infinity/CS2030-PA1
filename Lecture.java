class Lecture extends ScC {

    Lecture (String modCode, int classId, String venueId, Instructor instructor, int startTime){
        super(modCode, classId, venueId, instructor, startTime, 2);
        
    }
    
    public boolean clashWith(Lecture lec){
        if (this.getStartTime() <= lec.getStartTime()){
            if (this.getStartTime() + 2 <= lec.getStartTime()){
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
        if (this.getModCode().equals(tut.getModCode()) && (!this.getInstructor().equals(tut.getInstructor())) && (!this.getVenueId().equals(tut.getVenueId()))){
            return false;
        }
        if (this.getStartTime() <= tut.getStartTime()){
            if (this.getStartTime() + 2 <= tut.getStartTime()){
                return false;
            }
            else{
                return true;
            }
        }
        else{
            if (this.getStartTime() >= tut.getStartTime() + 1){
                return false;
            }
            else {
                return true;
            }
        }
    }

    @Override
    public String toString() {
        return this.getModCode() + " L" + this.getClassID() + " @ " + this.getVenueId() + " [" + this.getInstructor() + "] " + this.getStartTime() +"--"+ (this.getStartTime() + 1);
    }
}
