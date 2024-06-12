public class P1 {
    public static void main(String[]args){
        StringBuffer sb=new StringBuffer("Listen");
        System.out.println(sb.toString());
        sb.append("Me!" );
        System.out.println(sb.toString());
        sb.insert(6,"To");
        System.out.println(sb.toString());
    }
}
