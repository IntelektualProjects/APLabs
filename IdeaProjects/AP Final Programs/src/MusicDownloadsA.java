// Shreyas Potnuru
// AP Program Practice 2
// MusicDownloads

import java.util.ArrayList;
import java.util.List;

public class MusicDownloadsA {
    /** The list of downloaded information.
     *  Guaranteed not to be null and not to contain duplicate titles.
     */
    private List<DownloadInfo> downloadList; // List of DownloadInfo Objects

    /** Creates the list of downloaded information. */
    public MusicDownloadsA()
    { downloadList = new ArrayList<DownloadInfo>(); }

    // Part (a)

    /** Returns a reference to the DownloadInfo object with the requested title if it exists.
     *  @param title the requested title
     *  @return a reference to the DownloadInfo object with the
     *          title that matches the parameter title if it exists in the list;
     *          null otherwise.
     *  Postcondition:
     *   - no changes were made to downloadList.
     */
    public DownloadInfo getDownloadInfo(String title){ // Searches DownloadInfo object by name
        for(DownloadInfo d : downloadList){
            if(d.getTitle().equals(title))
                return d;
        }
        return null; // returns null if object not present in List
    }

    public static void main(String[] args) { // main
        DownloadInfo di;
        MusicDownloadsA test = new MusicDownloadsA();
        test.downloadList.add(new DownloadInfo("Hey Jude"));
        di = test.getDownloadInfo("Hey Jude");
        for(int i = 0; i < 4; i++)
            di.incrementTimesDownloaded();
        test.downloadList.add(new DownloadInfo("Soul Sister"));
        di = test.getDownloadInfo("Soul Sister");
        di.incrementTimesDownloaded();
        di.incrementTimesDownloaded();
        test.downloadList.add(new DownloadInfo("Aqualung"));
        di = test.getDownloadInfo("Aqualung");
        for(int i = 0; i < 9; i++)
            di.incrementTimesDownloaded();
        di = test.getDownloadInfo("Happy Birthday");
        System.out.print("Part a should output ");
        System.out.println("[Hey Jude 5, Soul Sister 3, Aqualung 10] " + null);
        System.out.println("Here is your output: " + test.downloadList + " " + di);

    }

}
/* Output:
Part a should output [Hey Jude 5, Soul Sister 3, Aqualung 10] null
Here is your output: [Hey Jude 5, Soul Sister 3, Aqualung 10] null
 */

