class ScC {
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

    public int getDuration() {
        return this.duration;
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

    public boolean clashWith(ScC clas){
        if (this.getStartTime() <= clas.getStartTime()){
            if (this.getStartTime() + this.getDuration() <= clas.getStartTime()){
                return false;
            }
            else{
                return this.timeOverlap(clas);
            }
        }
        else{
            if (this.getStartTime() >= clas.getStartTime() + clas.getDuration()){
                return false;
            }
            else {
                return this.timeOverlap(clas);
            }
        }
    }

    public boolean timeOverlap(ScC clas) {
        if (this.getModCode().equals(clas.getModCode())){//modCode is same
            if (this.getDuration() == 1) { //this is a tut
                if (clas.getDuration() == 1) { //clas is a tut
                    if (!(this.getInstructor().equals(clas.getInstructor())) && !(this.getVenueId().equals(clas.getVenueId()))){
                        return false;
                    }
                    else {
                        return true;
                    }
                }
                else { //clas is a lec
                    return true;
                }
            }
            else { 
                return true;
            }
        }
        else {//modCode is different
            if (this.getDuration() == 1) { //this is a tut
                if (clas.getDuration() == 1) { //clas is a tut
                    return true;
                }
                else { //clas is a lec
                    if (!(this.getInstructor().equals(clas.getInstructor())) && !(this.getVenueId().equals(clas.getVenueId()))){
                        return false;
                    }
                    else {
                        return true;
                    }
                }
            }
            else { //this is a lec
                if (clas.getDuration() == 1) { //clas is a tut
                    if (!(this.getInstructor().equals(clas.getInstructor())) && !(this.getVenueId().equals(clas.getVenueId()))){
                        return false;
                    }
                    else {
                        return true;
                    }
                }
                else { //clas is a lec
                    if (!(this.getInstructor().equals(clas.getInstructor())) && !(this.getVenueId().equals(clas.getVenueId()))){
                        return false;
                    }
                    else {
                        return true;
                    }
                }    
            }
        }
    }
}

