class Tutorial extends ScC {

    Tutorial (String modCode, int classId, String venueId, Instructor instructor, int startTime){
    super(modCode, classId, venueId, instructor, startTime, 1);
    
    }

    @Override
    public String toString() {
        return this.getModCode() + " T" + this.getClassID() + " @ " + this.getVenueId() + " [" + this.getInstructor() + "] " + this.getStartTime() +"--"+ (this.getStartTime() + this.getDuration());
    }
}
