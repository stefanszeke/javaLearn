public class LogicalOpTable {
    public static void main(String[] args) {
        System.out.println("p\tq\tAND\tOR\tXOR\tNOT");

        boolean p, q;

        p = true; q = true;

        System.out.print((p ? 1 : 0) + "\t" + (q ? 1 : 0) +"\t");
        System.out.print(((p&q)? 1 : 0) + "\t" + ((p|q)? 1 : 0) + "\t");
        System.out.println(((p^q)? 1 : 0) + "\t" + ((!p)? 1 : 0));
        p = true; q = false;
        System.out.print(p + "\t" + q +"\t");
        System.out.print((p&q) + "\t" + (p|q) + "\t");
        System.out.println((p^q) + "\t" + (!p));
        p = false; q = true;
        System.out.print(p + "\t" + q +"\t");
        System.out.print((p&q) + "\t" + (p|q) + "\t");
        System.out.println((p^q) + "\t" + (!p));
        p = false; q = false;
        System.out.print(p + "\t" + q +"\t");
        System.out.print((p&q) + "\t" + (p|q) + "\t");
        System.out.println((p^q) + "\t" + (!p));


    }
}



// difference between or and xor is that or is true when either of the operands is true, while xor is true when only one of the operands is true
