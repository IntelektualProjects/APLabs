/* Shreyas Potnuru
* Chapter 01
* Program 4
*/

public class LongJump {
    public static void main(String[] args) {


        double jump_one = 3.3; // jump length first trial
        double jump_two = 3.5; // jump length second trial
        double jump_three = 4.0; // jump length third trial
        double jump_four = 3.0; // jump length fourth trial

        System.out.println("The lengths of the jumps:\t'3.3 meters'\t'3.5 meters'\t'" + jump_three + " meters'\t'" + jump_four + " meters'");

        double average_jump = (jump_one + jump_two + jump_three + jump_four) / 4; // calculates average jump length

        System.out.println("\nThe average jump is " + average_jump + " meters"); // outputs average jump length
    }
}
/* Output:
* The lengths of the jumps:	'3.3 meters'	'3.5 meters'	'4.0 meters'	'3.0 meters'

  The average jump is 3.45 meters */