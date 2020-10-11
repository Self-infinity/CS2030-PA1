class Lecture extends ScC {

    Lecture (String modCode, int classId, String venueId, Instructor instructor, int startTime){
        super(modCode, classId, venueId, instructor, startTime, 2);
        
    }
    
    @Override
    public String toString() {
        return this.getModCode() + " L" + this.getClassID() + " @ " + this.getVenueId() + " [" + this.getInstructor() + "] " + this.getStartTime() +"--"+ (this.getStartTime() + this.getDuration());
    }
}
