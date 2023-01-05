class IConstD implements IConst {
    public static void main(String args[]) {
        int nums[] = new int[MAX];

        for(int i=MIN; i <= 10; i++) {
            if(i >= MAX) System.out.println(ERRORMSG);
            else {
                nums[i] = i;
                System.out.print(nums[i] + " ");
            }
        }
    }
}

class classB implements IB {
    public void method1() { }
    public void method2() { }
    public void method3() { }
    public void method4() { }
}

interface IConst {
    int MIN = 0;
    int MAX = 10;
    String ERRORMSG = "Boundary Error";
}

interface IA {
    void method1();
    void method2();
}

interface IB extends IA {
    void method3();
    void method4();
}