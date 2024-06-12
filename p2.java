import java.util.Scanner;
public class P2 {
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        System.out.print("输入整数：");
        int a = s.nextInt();
        try{
            divide(a);
        }catch (Exception e){
            System.out.println("捕获异常为："+e.getMessage());
        }
    }
    public static void divide(int a)throws Exception{
        if (a==0){
            throw new Exception("输出整数为0，请重新输入");
        }
        else{
            System.out.println("输入为："+a);
        }
    }
}
