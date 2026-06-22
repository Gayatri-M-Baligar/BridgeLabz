public class DemonstrateVariablesMethods {
    static  int a;

    static {
        a=100;
    }

    static int add(int a,int b){
        return a+b;
    }
    public static void main(String[] args) {
        System.out.println(DemonstrateVariablesMethods.a);
        System.out.print(DemonstrateVariablesMethods.add(10,20));

    }
}
