package Week6.Day2;

public class String_Builder {
    public static void main(String[] args) {
        // code
        StringBuilder sb=new StringBuilder("Hi");
        System.out.println(sb);
        System.out.println(sb.capacity());

        StringBuilder mg=new StringBuilder("Megha");
        System.out.println(mg);
        System.out.println(mg.capacity());

        StringBuilder aa=new StringBuilder();
        System.out.println(aa.capacity());

        StringBuilder ls=new StringBuilder(10);
        ls.append("Hello");
        ls.insert(2, 'e');
        System.out.println(ls);
        ls.delete(3, 5);
        System.out.println(ls);
        ls.ensureCapacity(30);
        ls.append("Megha");
        ls.append("Lakshya");
        System.out.println(ls.capacity());
        System.out.println(ls.length());
        System.out.println(ls);
        System.out.println(ls.substring(5));
        ls.replace(2, 3, "ll");
        System.out.println(ls);
        ls.reverse();
        System.out.println(ls);
    }
    
}
