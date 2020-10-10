abstract class ScC {
    private final String modCode;
    private final int classId;
    private final String venueId;
    private final int startTime;
    private final Instructor instructor;
    private final int duration;
    ScC(String modCode, int classId, String venueId, Instructor instructor, int startTime, int duration){
    this.modCode = modCode;
    this.classId = classId;
    this.venueId = venueId;
    this.instructor = instructor;
    this.startTime = startTime;
    this.duration = duration;}

    public boolean hasSameModule(ScC clas){
        return this.modCode == clas.modCode;
    }

    public boolean hasSameInstructor(ScC clas){
        return this.instructor.equals(clas.instructor);
    }

    public boolean hasSameVenue(ScC clas){
        return this.venueId == clas.venueId;
    }

    public String getModCode() {
        return this.modCode;
    }

    public Instructor getInstructor() {
        return this.instructor;
    }

    public int getStartTime() {
        return startTime;
    }

    public int getClassID() {
        return this.classId;
    }

    public String getVenueId() {
        return this.venueId;
    }

    abstract public boolean clashWith(ScC clas);
}

