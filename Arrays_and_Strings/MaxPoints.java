/**
 * Definition for a point.
 * class Point {
 *     int x;
 *     int y;
 *     Point() { x = 0; y = 0; }
 *     Point(int a, int b) { x = a; y = b; }
 * }
 */
public class MaxPoints {
    public int maxPoints(Point[] points) {
        int len = points.length;
        if(len == 0)
            return 0;
        if(len == 1)
            return 1;
        HashMap<ArrayList<Double, Double>, Integer> map = new HashMap<>();
        int maxCount = 0;
        for(int i = 0; i < len; ++i) {
            for(int j = i + 1; j < len; ++j) {
                if(Point[i].x != Point[j].x) {
                    ArrayList<Double, Double> key = getKey(Point[i], Point[j]);
                    if(map.contains(key)) {
                        int count = map.get(key) + 1;
                        map.put(key, count);
                        if(count > maxCount)
                            maxCount = count;
                    }
                    else {
                        map.put(key, 0);
                    }
                }
            }
        }
        return maxCount;
    }
    
    public ArrayList<Double, Double> getKey(Point a, Point b) {
        double m = (b.y - a.y) / (b.x - a.x);
        if(a.x != 0) {
            double b = a.y / (m * a.x);
        }
        else
            double b = b.y / (m * b.x);
        ArrayList<Double, Double> pair = new ArrayList<>();
        pair.add(m);
        pair.add(b);
        return pair;
    }
}