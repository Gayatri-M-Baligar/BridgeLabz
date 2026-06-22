public class DisplayDefaultValues {
    byte a;
    short b;
    int c;
    long d;
    float e;
    double f;
    char g;
    boolean h;
    public static void main(String[] args){
        DisplayDefaultValues ddv=new DisplayDefaultValues();
        System.out.println("Byte Default Value is: " + ddv.a);

        System.out.println("Short Default Value is: " + ddv.b);
        System.out.println("Integer Default Value is: " + ddv.c);
        System.out.println("Long Default Value is: " + ddv.d);
        System.out.println("Float Default Value is: " + ddv.e);
        System.out.println("Double Default Value is: " + ddv.f);
        System.out.println("Character Default Value is: " + ddv.g);
        System.out.println("Boolean Default Value is: " + ddv.h);

    }
}
