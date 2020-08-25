public class TimeCalulationwiithonlyJava {

    public static void main(String[] args){
        long starttime=System.nanoTime();
        System.out.println("Hello World!! Using only JAVA!!");
        long estimatedtime=System.nanoTime() -starttime;
        System.out.println("Time taken for simple java program is:"+estimatedtime);
    }
}
