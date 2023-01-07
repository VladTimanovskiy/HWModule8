import java.util.Arrays;
import java.lang.Math.*;
public class TargetFinder {
    public int[] findTarget(int[] aiCoords, int[][] targets) {
int[] min = {(int) Math.sqrt(Integer.MAX_VALUE), (int) Math.sqrt(Integer.MAX_VALUE)};
        for (int i = 0; i < targets.length; i++) {
            int[] result = {(int) Math.sqrt(Math.pow(targets[i][i] - aiCoords[i], 2) + Math.pow(targets[i][i] - aiCoords[i], 2))};
            int[] result2 = {(int) Math.sqrt(Math.pow(min[i] - aiCoords[i], 2) + Math.pow(min[i] - aiCoords[i], 2))};
        if (result[i] < result2[i]) {
            min = result;
        }
        }
        return min;
    }
}
