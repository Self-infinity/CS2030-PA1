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

    public String getModCode() {
        return this.modCode;
    }

    public Instructor getInstructor() {
        return this.instructor;
    }

    public int getDuration() {
        return this.duration;
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
        if (this.getModCode().equals(clas.getModCode())){
            if (this instanceof Tutorial) {
                if (clas instanceof Tutorial) {
                    if (!(this.getInstructor().equals(clas.getInstructor())) && !(this.getVenueId().equals(clas.getVenueId()))){
                        return false;
                    }
                    else {
                        return true;
                    }
                }
                else {
                    return true;
                }
            }
            else { 
                return true;
            }
        }
        else {
            if (this instanceof Tutorial) {
                if (clas instanceof Tutorial) {
                    return true;
                }
                else {
                    if (!(this.getInstructor().equals(clas.getInstructor())) && !(this.getVenueId().equals(clas.getVenueId()))){
                        return false;
                    }
                    else {
                        return true;
                    }
                }
            }
            else {
                if (clas instanceof Tutorial) {
                    if (!(this.getInstructor().equals(clas.getInstructor())) && !(this.getVenueId().equals(clas.getVenueId()))){
                        return false;
                    }
                    else {
                        return true;
                    }
                }
                else {
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

