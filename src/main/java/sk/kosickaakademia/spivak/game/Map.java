package sk.kosickaakademia.spivak.game;

public class Map {
    /**
     * Create a map 0 - water; 1 - island
     * @param parameters
     * @return String[][]
     */
    public int[][] createMap(int[] parameters){
        int[][] pole = new int[12][12];
        for(int i = 0; i < 12; i++){
            String island = decToBinary(parameters[i]);
            for(int j = 0; j < 12; j++){
                pole[i][j] = Integer.parseInt(String.valueOf(island.charAt(j)));

            }
        }
        return pole;
    }

    /**
     * Converting from decimal to binary
     * @param dec
     * @return String
     */
    public String decToBinary(int dec){
        char[] hexDigits = {'0', '1'};
        String oct = "";
        while (dec != 0) {
            int rem = dec % 2;
            oct = hexDigits[rem] + oct;
            dec = dec / 2;
        }
        if(oct.length()<9){
            for(int i = oct.length(); i < 12; i++) {
                oct = "0" + oct;
            }
        }
        return oct;
    }

    /**
     * Print a map
     * @param matrix
     */
    public void printMap (int matrix[][]){
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }


}
