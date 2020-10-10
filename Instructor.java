class Instructor {
    private final String name;

    Instructor(String name) {
        this.name = name;
    }

    public boolean equals(Object ins){
        try{
            return this.name == ((Instructor)ins).name;
        }
        catch (Exception e) {
            return false;
        }
    }
    public boolean equals(Instructor ins){
        try {
            return this.name == ins.name;
        }
        catch (Exception e){
            return false;
        }
    }
    public String toString(){
        return this.name;
    }
}
