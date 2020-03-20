package sample;

import java.util.Random;

public class Field {
    private final int size = 4;
    private int[][] tiles;

    /**
     * Initializes board with random (but solvable) set of tiles.
     */
    public Field(){
        initRandomTiles();
    }

    public void initRandomTiles(){
        tiles = new int[size][size];

        for (int i = 1; i < size * size; i++){
            int curIndex = (int) (Math.random() * (size * size - 1));
            while (tiles[curIndex / size][curIndex % size] != 0){
                curIndex = (int) (Math.random() * (size * size - 1));
            }
            tiles[curIndex / size][curIndex % size] = i;
        }
        if (!isSolvable())
            makeSolvable();
    }

    boolean isSolvable(){
        int chaos = 0;
        int curTileValue;
        for(int i = 0; i < size * size - 2; i++){
            curTileValue = tiles[i / size][i % size];
            for(int j = i + 1; j < size * size - 1; j++){
                if(curTileValue > tiles[j / size][j % size])
                    chaos++;
            }
        }
        return chaos % 2 != 1;
    }

    private void makeSolvable(){
        int tempTile = tiles[size - 1][size -2];
        tiles[size - 1][size - 2] = tiles[size - 1][size - 3];
        tiles[size - 1][size - 3] = tempTile;
    }
    public boolean isSolved(){
        for (int i = 1; i < size * size; i++){
            if (tiles[i / size][i % size] != i)
                return false;
        }
        return true;
    }

    public int[][] getTiles(){
        return tiles;
    }

    void setTiles(int[][] tiles){
        this.tiles = tiles;
    }

}
