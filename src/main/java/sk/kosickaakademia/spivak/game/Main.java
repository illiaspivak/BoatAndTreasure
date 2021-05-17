package sk.kosickaakademia.spivak.game;


public class Main
{
    public static void main( String[] args )
    {
        Map map = new Map();
        int[] parameters = new int[]{2,34,165,23,45,100,45,5,64,21,9,76};

        map.printMap(map.createMap(parameters));
    }
}
