package leetcode;

/**
 * Created on 2017-11-23
 *
 * @author Jerry Shen
 */
public class P657 {

    public boolean judgeCircle(String moves) {
        int x = 0;
        int y = 0;
        for (int i=0;i<moves.length();++i) {
            switch (moves.charAt(i)) {
                case 'U':
                    ++y;
                    break;
                case 'D':
                    --y;
                    break;
                case 'L':
                    --x;
                    break;
                case 'R':
                    ++x;
                    break;
            }
        }
        return x == 0 && y == 0;
    }
}
