public class PracticeProblems {

    //practice 1
    static int countOccurrences(int[] arr, int n) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++)
            if (arr[i] == n) {
                sum++;
            }
            return sum;
    }


}
