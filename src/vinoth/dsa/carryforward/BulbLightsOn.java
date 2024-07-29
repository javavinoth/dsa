package vinoth.dsa.carryforward;

public class BulbLightsOn {

    public static int switches(int[] A) {

        int switch_click = 0;
        for (int j : A) {
            if ((j == 0 && switch_click % 2 == 0) || (j == 1 && switch_click % 2 == 1)) {
                switch_click++;
            }
        }

        return switch_click;
    }

    public static void main(String[] args) {
        int[] bulbs = {0, 1, 1, 0, 1, 0};
        System.out.println(switches(bulbs));
    }
}