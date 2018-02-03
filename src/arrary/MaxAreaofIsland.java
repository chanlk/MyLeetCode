package arrary;

/**
 * Given a non-empty 2D array grid of 0's and 1's, an island is a group of 1's (representing land) connected 4-directionally
 * (horizontal or vertical.) You may assume all four edges of the grid are surrounded by water.
 * Find the maximum area of an island in the given 2D array. (If there is no island, the maximum area is 0.)
 *
 * @author Chanlk
 * Create 1/15/18
 */
public class MaxAreaofIsland {



    public int maxAreaOfIsland(int[][] grid) {
        int maxLength = 0;
        int row = grid.length;
        int cloumn = grid[0].length;
        boolean[][] flags = new boolean[row][cloumn];
        for(int i = 0;i<row;i++){
            for (int j = 0; j < cloumn; j++){
                if(grid[i][j] == 1){
                    maxLength = Math.max(maxLength, findBrother(grid, flags, i, j));
                }
            }
        }
        return maxLength;
    }
    public int findBrother(int[][] graph,boolean[][] flags,int i,int j){
        if (i >= 0 && i < graph.length && j>=0 && j <graph[0].length && flags[i][j] == false && graph[i][j] == 1){
            flags[i][j] = true;
           return  1+findBrother(graph,flags,i-1,j)+findBrother(graph,flags,i+1,j)+
                   findBrother(graph,flags,i,j-1)+findBrother(graph,flags,i,j+1);
        }
        return 0;
    }
    public static void main(String[] argus){
        int[][] grid = {{0,0,1,0,0,0,0,1,0,0,0,0,0},
                        {0,0,1,0,0,1,1,1,1,1,0,0,0},
                        {0,1,1,1,1,1,0,0,0,0,0,0,0}};
        MaxAreaofIsland maxAreaofIsland = new MaxAreaofIsland();
        int island = maxAreaofIsland.maxAreaOfIsland(grid);
        System.out.println(island);
    }

}
