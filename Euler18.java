public class Euler18 {
    public static void main(String[] args) {
        String triangleInput =
                "3\n" +
                "7 4\n" +
                "2 4 6\n" +
                "8 5 9 3";
        String [] line = triangleInput.split("\n");
        int numberLines = line.length;
        int [][] actualValues = new int[numberLines][numberLines];

        for (int i = 0; i<numberLines; i++){
            String [] column = line[i].split(" ");
            for (int j = 0; j<numberLines; j++) {
                int columnInt = Integer.parseInt(column[j]);
                actualValues[i][j] = columnInt;
            }
        }

    }
}
