/*
 * Shreyas Potnuru
 * Chapter 06
 * Program 37
 */

public class SportsTeam {
    private String name;
    private int won, lost, tied, played;

    public SportsTeam(String n){
        name = n;
        won = 0;
        lost = 0;
        tied = 0;
        played = 0;
    }

    public SportsTeam(String n, int w, int l, int t, int p){
        name = n;
        won = w;
        lost = l;
        tied = t;
        played = p;
    }

    public String getName(){ return name;}
    public int getWon(){
        return won;
    }
    public int getLost(){
        return lost;
    }
    public int getTied(){
        return tied;
    }
    public int getPlayed(){
        return played;
    }

    public double getWinningPercentage(){
        return (double)won / (double)played;
    }
    public void playGame(String s){
        if(s.equals("W")){
            won += 1;
        }
        else{
            lost += 1;
        }
    }
    public String toString(){
        return "Team Name: " + getName() + ",Games Played: " + getPlayed() + ",Wins: " + getWon() + ",Losses: " + getLost() + ",Ties: " + getTied();
    }
}
