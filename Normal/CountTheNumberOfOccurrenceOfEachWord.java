package Normal;
import java.util.Set;

public class CountTheNumberOfOccurrenceOfEachWord {
    public static void main(String[] args) {
        String st = "The rain fell down, down, down. It fell on the roof, on the trees, and on the ground. It fell so hard that it made a loud noise. The people inside their houses could hear the rain falling, and they were glad to be inside where it was dry. The rain fell for a long time, and then it stopped. The sun came out, and the people went outside to enjoy the fresh air";
        String[] splitedArray = st.split(" ");
        
        for (int i = 0; i < splitedArray.length; i++) {
            int count = 0;
            for (int j = i+1; j < splitedArray.length; j++) {
                if (splitedArray[i].equals(splitedArray[j])) {
                    count += 1;
                }
            }
            System.out.println(splitedArray[i] + " " + count);
        }
    }
}
