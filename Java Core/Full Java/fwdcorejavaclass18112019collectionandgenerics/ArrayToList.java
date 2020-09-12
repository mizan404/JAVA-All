package collectionexample;

import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ArrayToList {

    public static void main(String[] argv) {

        String sArray[] = createArray();

        // convert array to list
        List<String> lList = Arrays.asList(sArray);

        System.out.println("\n--------- Iterator Loop -------\n");
        long lIteratorStartTime = new Date().getTime();
        System.out.println("Start: " + lIteratorStartTime);

        // iterator loop
        Iterator<String> iterator = lList.iterator();
        while (iterator.hasNext()) {
            String stemp = iterator.next();
        }
        long lIteratorEndTime = new Date().getTime();
        System.out.println("End: " + lIteratorEndTime);

        long lIteratorDifference = lIteratorEndTime - lIteratorStartTime;
        System.out.println("Iterator - Elapsed time in milliseconds: "
                + lIteratorDifference);

        System.out.println("\n-------END-------");

        System.out.println("\n--------- For Loop --------\n");
        long lForStartTime = new Date().getTime();
        System.out.println("Start: " + lForStartTime);

        // for loop
        for (int i = 0; i < lList.size(); i++) {
            String stemp = (String) lList.get(i);
        }

        long lForEndTime = new Date().getTime();
        System.out.println("End: " + lForEndTime);

        long lForDifference = lForEndTime - lForStartTime;
        System.out.println("For - Elapsed time in milliseconds: "
                + lForDifference);

        System.out.println("\n-------END-------");

        System.out.println("\n--------- While Loop -------\n");
        long lWhileStartTime = new Date().getTime();
        System.out.println("Start: " + lWhileStartTime);

        // while loop
        int j = 0;
        while (j < lList.size()) {
            String stemp = (String) lList.get(j);
            j++;
        }
        long lWhileEndTime = new Date().getTime();
        System.out.println("End: " + lWhileEndTime);

        long lWhileDifference = lWhileEndTime - lWhileStartTime;
        System.out.println("While - Elapsed time in milliseconds: "
                + lWhileDifference);

        System.out.println("\n-------END-------");
        
        
        System.out.println("\n--------- Enhanced for Loop -------\n");
        long eWhileStartTime = new Date().getTime();
        System.out.println("Start: " + eWhileStartTime);

        // Advanced loop
        for(String s: lList){
        
        }
        long eWhileEndTime = new Date().getTime();
        System.out.println("End: " + eWhileEndTime);

        long eWhileDifference = eWhileEndTime - eWhileStartTime;
        System.out.println("Enhanced for - Elapsed time in milliseconds: "
                + eWhileDifference);

        System.out.println("\n-------END-------");

    }

    static String[] createArray() {

        String sArray[] = new String[550000];

        for (int i = 0; i < 550000; i++) {
            sArray[i] = "Array " + i;
        }

        return sArray;
    }
}
