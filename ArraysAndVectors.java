public class ArraysAndVectors {
    public static void main(String[] args) {
        System.out.println("Welcome to my Array Program");

        int[] myNumbers = new int[8];

        //Fill
        myNumbers[0] = 1;
        myNumbers[1] = 3;
        myNumbers[2] = 5;
        myNumbers[3] = 7;
        myNumbers[4] = 9;
        myNumbers[5] = 11;
        myNumbers[6] = 13;
        myNumbers[7] = 15;


        //Output
        System.out.println("myNumbers[3] = " + myNumbers[3]);
        System.out.println("\n\n");


        //For loop incramented(+1)
        for (int i = 0; i < 8; i++) {
            //System.out.println("\nSomething\n");
            System.out.println("myNumbers[" + i + "] is: " + myNumbers[i]);
        }
        //fill the array with 5,10,15....
        int myFiveContainer = 0;
        for (int i = 0; i < 8; i++) {
            myNumbers[i] = myFiveContainer += 5;
        }
        System.out.println("\nThis array should be the 5...\n");
        for (int i = 0; i < 8; i++) {
            //System.out.println("\nSomething\n");
            System.out.println("myNumbers[" + i + "] is: " + myNumbers[i]);
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.println("i = " + i + " || " + "int j = " + j);
            }
        }
        //2D Array: Create a java program to create a 2-Dimensional Array
        int[][][] myNumberGrid = new int[3][4][3];


        //fill the array with a for() loop
        myFiveContainer = 0;

        for (int h = 0; h < 3; h++) {
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    myNumberGrid[h][i][j] = myFiveContainer += 5;
                }
            }
        }
        for (int h = 0; h < 3; h++) {
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print(myNumberGrid[h][i][j] + " ");
                }
                System.out.println("");
            }
        }
    }
}

/*

*/