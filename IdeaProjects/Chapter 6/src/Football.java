/*
 * Shreyas Potnuru
 * Chapter 06
 * Program 37
 */

public class Football extends SportsTeam{
    private int touchdowns;
    private int intercepts;

    public Football(String name){
        super(name);
        touchdowns = 0;
        intercepts = 0;
    }

    public Football(String n, int w, int l, int t, int p, int tw, int i){
        super(n, w, l, t, p);
        touchdowns = tw;
        intercepts = i;
    }

    public double touchDownsPerGame(){
        return (double)touchdowns / super.getPlayed();
    }

    public double interceptionsPerGame(){
        return (double)intercepts / super.getPlayed();
    }

    public String toString(){
        return super.toString() + ", " + touchdowns + " Touchdowns, and " + intercepts + " Interceptions";
    }
}
