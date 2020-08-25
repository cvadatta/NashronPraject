import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import java.io.FileReader;

public class TimeCalculation {

    public static void main(String[] args)
            throws Exception
    {
        int avgwithjs=0;
        for(int i=0;i<1000;i++){

            ScriptEngine ee = new ScriptEngineManager().getEngineByName("nashorn");

            ee.eval(new FileReader("src\\main\\resources\\Timecal.js"));

            Invocable invocable=(Invocable)ee;

            long starttime=System.nanoTime();

            invocable.invokeFunction("hello");

            long estimatedtime=System.nanoTime() -starttime;

            System.out.println("Time taken for java and java script program  is:"+estimatedtime);

            avgwithjs+=estimatedtime/1000;
        }
        System.out.println(avgwithjs);

    }
}
