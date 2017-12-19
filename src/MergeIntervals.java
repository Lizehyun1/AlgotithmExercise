import java.util.*;
class Interval{
    public int start;
    public int end;
    Interval(){};
    Interval(int start, int end){
        this.start = start;
        this.end = end;
    }
}
public class MergeIntervals {
    public static List<Interval> merge(List<Interval> intervals) {
        if (intervals.size() <= 1)
            return intervals;
        intervals.sort((i1, i2) -> Integer.compare(i1.start, i2.start));
        List<Interval> resutl = new LinkedList<Interval>();
        int start = intervals.get(0).start;
        int end = intervals.get(0).end;
        for (Interval interval:
             intervals) {
            if (interval.start <= end){
                end = Math.max(end, interval.end);
            }
            else{
                resutl.add(new Interval(start, end));
                start = interval.start;
                end = interval.end;
            }
        }
        resutl.add(new Interval(start, end));
        return resutl;
    }

    public static void main(String[] args) {
    }
}
