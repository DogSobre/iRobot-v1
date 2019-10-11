package DogSobre_Industries;

public class Command {

    private String name;
    private int duration;
    private long startTime;



    public Command (String n, int d){
        this.name = n;
        this.duration = d;
        this.startTime = 0;
    }

    public Command (String n, int d, long st){
        this.name = n;
        this.duration = d;
        this.startTime = st;
    }


    public String getName(){
        return this.name;
    }

    public int getMaxDuration(){
        return this.duration;
    }

    public long getElapsedDuration(){
        return System.currentTimeMillis() - this.startTime;
    }

    public boolean isFinished()
    {
        return this.getElapsedDuration() >= this.getMaxDuration();
    }

}
