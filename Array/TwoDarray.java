import java.util.Scanner;

public class TwoDarray{

    public static void twoDarray(){
        Scanner sc = new Scanner(System.in);
    
        System.out.print("Enter rows: ");
        int row = sc.nextInt();
        System.out.print("Enter columns: ");
        int col = sc.nextInt();
    
        int[][] number = new int[row][col]; // create a 2D array
    
        System.out.println("Input: ");
        for(int i = 0; i < row; i++) { // use for rows
            for(int j = 0; j < col; j++) { // use for columns 
                number[i][j] = sc.nextInt();
            }
        }
    
        System.out.println("Output: ");
        for(int i = 0; i < row; i++) { // output rows 
            for(int j = 0; j < col; j++) { // output columns
                System.out.print("| " + number[i][j] + " | "); 
            }
            System.out.println();           
        }          
    }
    public static void main(String[] args) {
        twoDarray();
    }
}
