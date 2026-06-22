public class StopWatch {
    public static void main(String[] args) {
        long startTime = System.nanoTime();
        long endTime=System.nanoTime();
        long elapsed = endTime-startTime;
        double seconds = elapsed/1_000_000_000.0;
        System.out.print("Elapsed Time" + seconds + " seconds");
    }
}

