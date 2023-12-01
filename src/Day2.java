import java.util.ArrayList;
import java.util.HashMap;

public class Day2 {
    public static void main(String[] args) {
        String[] letterNums = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        HashMap<String, String> numsHash = new HashMap<>();

        for(int i = 0; i < letterNums.length ; i++) {
            numsHash.put(letterNums[i], Integer.toString(i + 1));
        }

        ReadFile file = new ReadFile("data/Day2_test.txt");
        ArrayList<String> fileContent = file.readFile();
    }
}
