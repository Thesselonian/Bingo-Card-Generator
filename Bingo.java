import java.util.Random;
import java.util.ArrayList;
import java.util.Random;

public class Bingo {
    public static void main(String[] args) {
        // ArrayList<Integer> selectedNumbers = new ArrayList<Integer>();
        // while(selectedNumbers.size() < 25 ) {
        //     selectedNumbers.add(NumberSelection(selectedNumbers));
        // }
        // System.out.println(selectedNumbers);
        int[][] bingoCard = BingoCardGenerator();
        String rowOutput = "B  I  N  G  O";
        for(int r = 0; r < bingoCard.length; r++) {
            System.out.println(rowOutput);
            rowOutput = "";
            for(int c = 0; c < bingoCard[0].length; c++) {
                rowOutput += bingoCard[r][c];
                rowOutput += " ";
                if(bingoCard[r][c] < 10) {
                    rowOutput += " ";
                }
            }
        }
    }
    // Method for generating a bingo card with unique, random numbers between 1 and 75.
    public static int[][] BingoCardGenerator() {
        Random random = new Random();
        ArrayList<Integer> numberList = new ArrayList<Integer>();
        int[][]newBingoCard = new int[5][5];
        int randomNumber = 0;
        while(numberList.size() < (newBingoCard.length * newBingoCard.length)) {
            randomNumber = random.nextInt(74) +1;
            if(numberList.contains(randomNumber)) {
            }
            else {
                numberList.add(randomNumber);
            }
        }
        for(int r = 0; r < newBingoCard.length; r++) {
            for(int c = 0; c < newBingoCard[0].length; c++) {
                newBingoCard[r][c] = numberList.get(numberList.size()-1);
                numberList.remove(numberList.size()-1);
            }
        }
        return newBingoCard;
    } 

    // public static int NumberSelection(ArrayList<Integer> selectedNumbers) {
    //     Random random = new Random();
    //     int numberToBeSelected = 0;
    //     boolean previouslySelected = true;
    //     while(previouslySelected) {
    //         numberToBeSelected = random.nextInt(74) + 1;
    //         if(!selectedNumbers.contains(numberToBeSelected)) {
    //             break;
    //         }
    //     }
    //     return numberToBeSelected;
    // }
}