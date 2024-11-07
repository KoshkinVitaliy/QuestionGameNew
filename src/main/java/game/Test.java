package game;

public class Test {
    public static void delete(int index, String[] arr) {
        var previousArr = arr;
        arr = new String[arr.length - 1];

        System.out.println();
        var flag = false;

        for (int k = 0; k < arr.length; k++) {
            if (k == index && k <= arr.length - 1) {
                arr[k] = previousArr[k+1];
                flag = true;
            }
            else {
                if (flag) {
                    arr[k] = previousArr[k+1];
                }
                else arr[k] = previousArr[k];
            }
        }
        for (var number: arr) {
            System.out.print(number + " ");
        }
    }

    public static void main(String[] args) {
        String[] arr = {"1", "2", "3", "4", "5"};
        delete(3, arr);
        delete(1, arr);
        delete(2, arr);
        delete(3, arr);
    }
}
