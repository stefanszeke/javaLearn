import java.util.Arrays;

public class TwoDimensionalArrays {
    public static void main(String[] args) {
        int[][] table = new int[4][4];

        for( int i = 0; i < 4; i++ ) {
            for( int j = 0; j < 4; j++ ) {
                table[i][j] = (4*i) + j + 1;
            }
        }

        print2DTable(table, "Table");

        int[][] rotated_table = new int[4][4];

        for( int i = 0; i < 4; i++ ) {
            for( int j = 0; j < 4; j++ ) {
                rotated_table[j][3-i] = table[i][j];
           }
        }

        print2DTable(rotated_table,"Rotated Table");

        // deep copy of rotated_table 1:
        int[][] rotated_copy1 = new int[rotated_table.length][];
        for(int i = 0; i < rotated_table.length; i++) {
            rotated_copy1[i] = rotated_table[i].clone();
        }
        rotated_copy1[0][0] = 99;
        print2DTable(rotated_copy1, "Rotated Table Copy 1");

        // deep copy of rotated_table 2:
        int[][] rotated_copy2 = new int[rotated_table.length][];
        for(int i = 0; i < rotated_table.length; i++) {
            int[] row = new int[rotated_table[i].length];
            System.arraycopy(rotated_table[i], 0, row, 0, rotated_table[i].length);
            rotated_copy2[i] = row;
        }
        rotated_copy2[0][0] = 99;
        print2DTable(rotated_copy2, "Rotated Table Copy 2");

        // deep copy of rotated_table 1:
        int[][] rotated_copy3 = new int[rotated_table.length][];
        for(int i = 0; i < rotated_table.length; i++) {
            rotated_copy3[i] = Arrays.copyOf(rotated_table[i], rotated_table[i].length);
        }
        rotated_copy3[0][0] = 99;
        print2DTable(rotated_copy3, "Rotated Table Copy 3");
    }

    static void print2DTable(int[][] table, String table_name) {
        System.out.println(table_name + ":");
        for(int[] row: table) {
            for(int n: row) {
                System.out.print(n + ", ");
            }
            System.out.println();
        }
        System.out.println();
    }


}


// 0 0 // 1 // (4*0) + 0 + 1
// 0 1 // 2 // (4*0) + 1 + 1
// 0 2 // 3
// 0 3 // 4 // (4*0) + 3 + 1

// 1 0 // 5 // (4*1) + 0 + 1
// 1 1 // 6
// 1 2 // 7
// 1 3 // 8 // (4*1) + 3 + 1



// 0 0 // 0 // (4*0) + 0
// 0 1 // 1
// 0 2 // 2
// 0 3 // 3

// 1 0 // 4
// 1 1 // 5
// 1 2 // 6
// 1 3 // 7 // (4*1) + 3