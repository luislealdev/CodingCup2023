import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int normal_bucket = sc.nextInt();
        int number_beans = sc.nextInt();
        int special_bucket = sc.nextInt();
        int result;
        int total_beans = normal_bucket * number_beans;

        if (total_beans % special_bucket != 0) {
            result = (total_beans / special_bucket) + 1;
        } else {
            result = total_beans / special_bucket;
        }

        System.out.println(result);

        sc.close();
    }
}
