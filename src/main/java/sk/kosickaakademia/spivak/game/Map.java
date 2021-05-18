package sk.kosickaakademia.spivak.game;

import java.util.Scanner;

public class Map {
    /**
     * Create a map 0 - water; 1 - island
     * @param parameters
     * @return String[][]
     */
    public String[][] createMap(int[] parameters){
        String[][] pole = new String[12][12];
        for(int i = 0; i < 12; i++){
            String island = decToBinary(parameters[i]);
            for(int j = 0; j < 12; j++){
                pole[i][j] = String.valueOf(island.charAt(j));

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
        if(oct.length()<13){
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
    public void printMap (String matrix[][]){
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }

    /**
     * The position of the boat on the map (symbol L)
     * @param map
     */
    public void boat (String[][] map){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the position of the boat (row and column):");
        int row = scanner.nextInt();
        int column = scanner.nextInt();
        while(row > 12 || row < 0 || column > 12 || column < 0){
            System.out.println("Incorrect input data");
            row = scanner.nextInt();
            column = scanner.nextInt();
        }
        System.out.println(row);
        System.out.println(column);
        while(map[row-1][column-1].equals("1")) {
            System.out.println("The island is located at this position, enter other data");
            row = scanner.nextInt();
            column = scanner.nextInt();
            while(row > 12 || row < 0 || column > 12 || column < 0){
                System.out.println("The value must be between 1 and 12. Try again:");
                row = scanner.nextInt();
                column = scanner.nextInt();
            }
        }
        map[row - 1][column - 1] = "L";
    }

    /**
     * The position of the treasure on the map (symbol P)
     * @param map
     */
    public void treasure (String[][] map){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the position of the treasure (row and column):");
        int row = scanner.nextInt();
        int column = scanner.nextInt();
        while(row > 12 || row < 0 || column > 12 || column < 0){
            System.out.println("The value must be between 1 and 12. Try again:");
            row = scanner.nextInt();
            column = scanner.nextInt();
        }
        System.out.println(row);
        System.out.println(column);
        while(map[row-1][column-1].equals("1")) {
            System.out.println("The island is located at this position, enter other data");
            row = scanner.nextInt();
            column = scanner.nextInt();
            while(row > 12 || row < 0 || column > 12 || column < 0){
                System.out.println("Incorrect input data");
                row = scanner.nextInt();
                column = scanner.nextInt();
            }
        }
        map[row - 1][column - 1] = "P";
    }




}
