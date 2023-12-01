import java.util.ArrayList;

public class Day1 {
    public static void main(String[] args) {
        ReadFile file = new ReadFile("data/Day1.txt");
        ArrayList<String> fileContent = file.readFile();
        int totalSum = 0;
        for(String value: fileContent) {
            ArrayList<String> numsAsString = new ArrayList<>();
            String[] splitContent = value.split("");
            for(String character: splitContent) {
                char stringToChar = character.charAt(0);
                if(Character.isDigit(stringToChar)) {
                    numsAsString.add(character);
                }
            }
            String combinedNums = numsAsString.getFirst()+ numsAsString.getLast();
            totalSum += Integer.parseInt(combinedNums);
        }
      System.out.println("Total Sum: " + totalSum);
    }
}
