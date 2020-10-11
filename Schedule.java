import java.util.ArrayList;
import java.util.List;

class Schedule {
    private final List<ScC> Schedule;

    public Schedule(){
        this.Schedule  = new ArrayList<>();
    }

    public Schedule(List<ScC> Schedule){
        this.Schedule  = Schedule;
    }

    public Schedule add(ScC clas){
        for (ScC c : this.Schedule) {
            if (clas.clashWith(c)) {
                return new Schedule(new ArrayList<>(this.getSchedule()));
            }
        }
        List<ScC> newSchedule = new ArrayList<>(this.getSchedule());
        newSchedule.add(clas);
        return new Schedule(newSchedule);
    }

    public List<ScC> getSchedule(){
        return this.Schedule;
    }

    @Override
    public String toString() {
        String classLst = "";
        Schedule.sort();
        for (ScC c : this.Schedule) {
            classLst = classLst + "\n" + c.toString();
        }
        return classLst;
    }
}
