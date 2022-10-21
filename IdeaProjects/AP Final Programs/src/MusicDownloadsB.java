// Shreyas Potnuru
// AP Program Practice 2
// MusicDownloads

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class MusicDownloadsB {
    /** The list of downloaded information.
     *  Guaranteed not to be null and not to contain duplicate titles.
     */
    private List<DownloadInfo> downloadList;

    /** Creates the list of downloaded information. */
    public MusicDownloadsB()
    { downloadList = new ArrayList<DownloadInfo>(); }

    public DownloadInfo getDownloadInfo(String title){ // Searches DownloadInfo object by name
        for(DownloadInfo d : downloadList){
            if(d.getTitle().equals(title))
                return d;
        }
        return null; // returns null if object not present in List
    }

    // Part (b)

    /** Updates downloadList with information from titles.
     * @param titles a list of song titles
     * Postcondition:
     *  - there are no duplicate titles in downloadList.
     *  - no entries were removed from downloadList.
     *  - all songs in titles are represented in downloadList.
     *  - for each existing entry in downloadList, the download count is increased by
     *       the number of times its title appeared in titles.
     *  - the order of the existing entries in downloadList is not changed.
     *  - the first time an object with a title from titles is added to downloadList, it
     *       is added to the end of the list.
     *  - new entries in downloadList appear in the same order
     *       in which they first appear in titles.
     *  - for each new entry in downloadList, the download count is equal to
     *       the number of times its title appeared in titles.
     */
    public void updateDownloads(List<String> titles) {
        for(String s : titles){
            if(getDownloadInfo(s) != null)
                getDownloadInfo(s).incrementTimesDownloaded(); // increment count if object already in downloadList
            else{
                downloadList.add(new DownloadInfo(s)); // else create new object and add to List
            }
        }
    }


    public static void main(String[] args) { // main
        DownloadInfo di;
        MusicDownloadsB test = new MusicDownloadsB();
        test.downloadList.add(new DownloadInfo("Hey Jude"));
        di = test.getDownloadInfo("Hey Jude");
        di.incrementTimesDownloaded();
        di.incrementTimesDownloaded();
        di.incrementTimesDownloaded();
        di.incrementTimesDownloaded();
        test.downloadList.add(new DownloadInfo("Soul Sister"));
        di = test.getDownloadInfo("Soul Sister");
        di.incrementTimesDownloaded();
        di.incrementTimesDownloaded();
        test.downloadList.add(new DownloadInfo("Aqualung"));
        di = test.getDownloadInfo("Aqualung");
        di.incrementTimesDownloaded();
        di.incrementTimesDownloaded();
        di.incrementTimesDownloaded();
        di.incrementTimesDownloaded();
        di.incrementTimesDownloaded();
        di.incrementTimesDownloaded();
        di.incrementTimesDownloaded();
        di.incrementTimesDownloaded();
        di.incrementTimesDownloaded();


        String[] t = {"Lights", "Aqualung", "Soul Sister", "Go Now", "Lights", "Soul Sister"};
        List<String> titles = Arrays.asList(t);
        test.updateDownloads(titles);
        System.out.println("Your part b should output the following: ");
        System.out.println("[Hey Jude 5, Soul Sister 5, Aqualung 11, Lights 2, Go Now 1]");
        System.out.println("Here is your run of part b \n" + test.downloadList);
    }
}
/* Output:
Your part b should output the following:
[Hey Jude 5, Soul Sister 5, Aqualung 11, Lights 2, Go Now 1]
Here is your run of part b
[Hey Jude 5, Soul Sister 5, Aqualung 11, Lights 2, Go Now 1]
 */
