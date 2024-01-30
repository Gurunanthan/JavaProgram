package leetcode;
public class BookDistribution {
    public static void main(String args[]) {
        int totalNumberOfStudents = 2;
        int[] studentPage = { 64, 51, 120, 50 };
        int totalBooks = 0;
        for (int i = 0; i < studentPage.length; i++) {
            totalBooks += studentPage[i];
        }
        int diff = totalBooks;
        for (int i = 0; i < studentPage.length; i++) {
            System.out.println(totalBooks-studentPage[i]);
            if(diff>totalBooks-studentPage[i])
            {
                diff=totalBooks-studentPage[i];
            }
        }
        System.out.println(diff);
    }
}
