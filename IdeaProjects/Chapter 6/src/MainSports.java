/*
* Shreyas Potnuru
* Chapter 06
* Program 37
*/

public class MainSports {
    public static void main(String[] args){
        SportsTeam greenBay = new Football("Packers", 10, 6, 0, 16, 51, 8);

        SportsTeam minnesota = new Baseball("Twins", 59, 103, 0, 162, 200, 690, 126);

        System.out.println(greenBay);
        System.out.println();
        System.out.println(minnesota);
    }

}
/* Output:
Team Name: Packers,Games Played: 16,Wins: 10,Losses: 6,Ties: 0, 51 Touchdowns, and 8 Interceptions

Team Name: Twins,Games Played: 162,Wins: 59,Losses: 103,Ties: 0, 200 Home Runs, 690 RBI's and 126 Errors
*/
