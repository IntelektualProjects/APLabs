// Shreyas Potnuru
// Program Practice 1: Arrays AP Question pt 1
// 4/19/20

import java.util.Arrays;
public class SoundA{
    // Array of sample amplitudes
    private int[] samples = { 40, 2532, 17, -2300, -17, -4000, 2000, 1048, -420, 33, 15, -32, 2030, 3223};

    /**Part (a)
     * Changes those values in this sound that have an amplitude greater than limit
     *  Values greater than limit are changed to limit.
     *  @param limit the amplitude limit
     *         Precondition: limit >= 0
     *  @return the number of values in this sound that this method changed
     */
    public int limitAmplitude(int limit){ // counts values greater than and less than the magnitude of limit
        int value = limit;
        int count = 0;
        for(int i = 0; i < samples.length; i++){
            if(samples[i] > limit || samples[i] < (limit * -1)){
                if(samples[i] < 0) // if value in sample is negative
                    limit = limit * -1;
                count += 1;
                samples[i] = limit;
                limit = value; // resets limit value to original
            }
        }
        return count;
    }

    public static void main(String[] args){ // main
        SoundA s = new SoundA();
        System.out.println("The original array is: " + Arrays.toString(s.samples));
        System.out.println("limitAmplitude(2000) should return 5 " +
                "and returned " + s.limitAmplitude(2000));
        System.out.println("The changed array is: " + Arrays.toString(s.samples));

    }
}

/* Output:
The original array is: [40, 2532, 17, -2300, -17, -4000, 2000, 1048, -420, 33, 15, -32, 2030, 3223]
limitAmplitude(2000) should return 5 and returned 5
The changed array is: [40, 2000, 17, -2000, -17, -2000, 2000, 1048, -420, 33, 15, -32, 2000, 2000]
 */

