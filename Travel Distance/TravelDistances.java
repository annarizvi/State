package Project5;

public class TravelDistances {

    public static String[] getCity(String cityString) {
        return cityString.split(",");
    }

    public static int[][] getDistance(String inputDistanceString) {
        String[] row = inputDistanceString.split("<>");
        String[][] echEl = new String[row.length][row[0].split(",").length];

        for (int i = 0; i < row.length; i++) {
            echEl[i] = row[i].split(",");
        }
        int[][] Num = new int[0][];
        for (int i = 0; i < echEl.length; i++) {
            for (int j = 0; j < echEl[i].length; j++) {
                Num[i][j] = Integer.parseInt(echEl[i][j]);
            }
        }
        return Num;
    }

    public static void main(String[] args) {

        String[] cities = getCity(args[0]);
        System.out.println("List of cities:");
        for (int i = 0; i < cities.length; i++) {
            System.out.println((i + 1) + ":" + cities[i]);
        }

        System.out.println("Distances:");
        int[][][] getDistances = new int[0][][];
        int[][] distances = getDistances[1];
        for (int[] distance : distances) {
            for (int i : distance) {
                System.out.println(i);
            }
            System.out.println();

        }


    }

    private static int[][] getDistances(String arg) {
        return new int[0][];
    }
}



