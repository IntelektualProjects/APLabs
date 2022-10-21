/*
 * Shreyas Potnuru
 * Chapter 06
 * Program 37
 */

public class Baseball extends SportsTeam{
    private int hruns, rbis, errors;
    public Baseball(String n){
        super(n);
        hruns = 0;
        rbis = 0;
        errors = 0;
    }
    public Baseball(String n, int w, int l, int t, int p, int h, int r, int e){
        super(n, w, l, t, p);
        hruns = h;
        rbis = r;
        errors = e;
    }

    public double homeRunsPerGame(){
        return (double)hruns / super.getPlayed();
    }

    public double rbisPerGame(){
        return (double)rbis / super.getPlayed();
    }

    public double errorsPerGame(){
        return (double)errors / super.getPlayed();
    }

    public String toString(){
        return super.toString() + ", " + hruns + " Home Runs, " + rbis + " RBI's and " + errors + " Errors";
    }
}
