package game;

public class Generator {
    public static int[] orderQuestion = new int[5];
    public static int[] orderAnswers = new int[4];

    static {
        generate();
    }

    private static void generate() {
        for (var i = 0; i < orderQuestion.length; i++) {
            orderQuestion[i] = (int) (Math.random() * 5 + 1);
            if (i==0) {
                i++;
            }
            else if (orderQuestion[i] == orderQuestion[i-1]){
                orderQuestion[i] = (int) (Math.random() * 5 + 1);
            }
        }

    }
    public static void main(String[] args) {
        for (var order: orderQuestion) {
            System.out.print(order + " ");
        }
    }
}


