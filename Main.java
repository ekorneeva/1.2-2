public class Main {
    public static void main(String[] args) {
        int account = 100;
        int sum = 1100;
        int bonus;
        int percent = 1;
        if (sum <= 1000) {
            bonus = 0;
        } else {
            bonus = sum * percent / 100;
        }
        int total = account + sum + bonus;
        System.out.println(total);
    }
}
