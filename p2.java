package snippet;
import java.util.Scanner;

public class P2 {
    int input_value = 0;
    Scanner sc = new Scanner(System.in);

    public int judge() {
        System.out.println("请输入一个整数");
        input_value = sc.nextInt();
        return handle_value(input_value);
    }

    public int handle_value(int num) {
        if (num <= 0) {
            System.out.println("error please input again");
            return handle_value(sc.nextInt()); 
        } else {
            return num;
        }
    }
}
