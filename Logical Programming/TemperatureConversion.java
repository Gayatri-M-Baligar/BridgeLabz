public class TemperatureConversion {
    static void temperaturConversion(int f,int c){
        double cel=(f-32) * 5f/9;
        double fah = (c * 9f/5) + 32;
        System.out.println("fahrenheit to celsius is: " + cel);
        System.out.print("Celsius to fahrenheit is: "+ fah);
    }
    public static void main(String[] args) {
        int f = Integer.parseInt(args[0]);
        int c=Integer.parseInt(args[1]);
        temperaturConversion(f,c);
    }
}
