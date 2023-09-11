public class Multiples {
    public static void main(String[] args) {
        int fives = 5;
        int threes = 3;
        int sum = 0;

        while(fives < 1000) {
            sum ++;
            fives = fives + 5;
        }

        while(threes < 1000){
            if (threes % 5 != 0) {
                sum++;
            }
            threes = threes + 3;
        }
        System.out.println(sum);

    }
}
