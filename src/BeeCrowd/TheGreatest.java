package BeeCrowd;

public class TheGreatest {
    static int great(int x, int y, int z){
        int max = (x+y+Math.abs(x-y))/2;
        int mainMax = (max+z+Math.abs(max-z))/2;
        return mainMax;
    }
}
