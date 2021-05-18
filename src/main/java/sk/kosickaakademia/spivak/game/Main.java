package sk.kosickaakademia.spivak.game;


public class Main
{
    public static void main( String[] args )
    {
        Map map = new Map();
        int[] parameters = new int[]{4095,212,84,1172,619,1252,780,3833,4010,707,516,888};

        String[][] pole = map.createMap(parameters);
        map.printMap(pole);
        map.boat(pole);
        map.treasure(pole);
        map.printMap(pole);




    }
}
