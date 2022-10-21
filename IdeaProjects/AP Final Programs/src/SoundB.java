// Shreyas Potnuru
// Program Practice 1: Arrays AP Question pt 2
// 4/19/20

import java.util.Arrays;
public class SoundB{
    // array of values
    private int[] samples = {0, 0, 0, 0, -14, 0, -35, -39, 0, -7, 16, 32, 37, 29, 0, 0};

    /**Part (b)
     *  Removes all silence from the beginning of this sound.
     *  Silence is represented by a value of 0.
     *  Precondition: samples contains at least one nonzero value
     *  Postcondition: the length of samples reflects the removal of starting silence
     */
    public void trimSilenceFromBeginning() {
        int beginning = 0;
        for (int sample : samples) { // counts silence at beginning of samples array
            if (sample == 0)
                beginning += 1;
            else
                break;
        }

        int[] new_arr = new int[samples.length - beginning]; // new array for samples
        int pos = 0;

        for(int i = beginning; i < samples.length; i++){ // copying over everything except the beginning silence to new array
            new_arr[pos] = samples[i];
            pos += 1;
        }
        samples = new_arr;
    }

    public static void main(String[] args){ // main

        SoundB s = new SoundB();

        System.out.println("The original array of samples is " + Arrays.toString(s.samples));
        s.trimSilenceFromBeginning();
        System.out.println("The new array of samples is " + Arrays.toString(s.samples));
        System.out.println("The length of the new array should be 12 and is " + s.samples.length);
    }
}

/* Output:
The original array of samples is [0, 0, 0, 0, -14, 0, -35, -39, 0, -7, 16, 32, 37, 29, 0, 0]
The new array of samples is [-14, 0, -35, -39, 0, -7, 16, 32, 37, 29, 0, 0]
The length of the new array should be 12 and is 12
 */

