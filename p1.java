package snippet;
public class P1 {
    public static void main(String[] args) {
    	String add_str = "Me";
    	String mid_str = "To";
    	String init_str = "Listen";
    	P2 p2 = new P2();
        StringBuffer sb = new StringBuffer(init_str);
        System.out.println(sb.toString());
        sb.append(add_str);
        System.out.println(sb.toString());
        sb.insert(init_str.length(), mid_str);
        System.out.println(sb.toString());
        System.out.println(p2.judge());
        P3.print_json();
    }
}
