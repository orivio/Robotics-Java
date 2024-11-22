public class PracticeProblems {

    //practice 1
    static int countOccurrences(int[] arr, int n) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++)
            if (arr[i] == n) {
                sum++;
            }
            return sum;
            // worked successfully
    }
    //practice 2
    static int[] reverseArray(int[] arr) {
        int[] reverseArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            reverseArr[i] = arr[arr.length - 1 - i];
    
        }
        return reverseArr;
        // worked successfully
    }
    //practice 3
    static double sumGrid(double[][] grid) {
        double sum = 0;
        for(double[] row : grid) {
            for(double value : row){
                sum += value;

            }
        }
        return sum;
        //worked successfully
    }
    //practice 4 FINALLY
    static int fib(int n){
        if (n <= 0) {
            return 0;
        } else if (n ==1) {
            return 1;
        } else{
            return fib(n - 1) + fib(n - 2);
        }
    }
    //WORKED SUCCESSFULLY!!!!!!!!!!
}
