package AopPassArgs;

import java.util.HashMap;
import java.util.Map;

public class TrackCounter {
    private Map<Integer,Integer>trackCounts=new HashMap<>();
    public void countTrack(int trackNumber){
        int currentCount=getPlayCount(trackNumber);
        trackCounts.put(trackNumber,currentCount+1);
        System.out.println(trackCounts);
    }
    public int getPlayCount(int trackNumber){
        return trackCounts.containsKey(trackNumber)?trackCounts.get(trackNumber):
                0;
    }
}
