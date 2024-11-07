package game;

public class GeneratorOfNumbers {

    public static String[] generator = new String[5];

    private static int generateNumber(int min, int max) {
        return (int) ((Math.random() * max)) + min;
    }

    private static void pullGenerator() {
        String[] registy = {"1", "2", "3", "4", "5"};
        for(var i=0; i < generator.length; i++) {
            generator[i] = "";
            for (var counter = 0; counter < 5; counter++) {
                var index = generateNumber(0, registy.length-1);
                System.out.print("Index gen - " + index + " ");
                generator[i] += registy[index];
                System.out.print("generator[i] - " + generator[i]);
                registy = delete(index, registy);
                System.out.println();

            }
            System.out.println(generator[i]);
        }
    }

    public static void main(String[] args) {
        pullGenerator();
    }

    public static String[] delete(int index, String[] arr) {
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
        return arr;
    }
}
