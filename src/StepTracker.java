public class StepTracker {



    private int totalDays = 0;
    private int activeDays = 0;
    private int totalStep = 0;
    private int minActive;

    public StepTracker(int numSteps){
        this.minActive = numSteps;
    }

    public void dailySteps(int steps){
        totalStep += steps;
        if(steps >= minActive){
            activeDays++;
        }
        totalDays++;
    }

    public int activeDays(){
        return activeDays;
    }

    public double averageSteps(){
        return (0.0+totalStep)/totalDays;
    }
}
