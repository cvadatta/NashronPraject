import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import java.io.FileReader;

public class TimeCalculation {

    public static void main(String[] args)
            throws Exception
    {
        long starttime=System.nanoTime();

        ScriptEngine ee = new ScriptEngineManager().getEngineByName("nashorn");

        ee.eval(new FileReader("src\\main\\resources\\Timecal.js"));

        long estimatedtime=System.nanoTime() -starttime;

        System.out.println("Time taken for java and java script program  is:"+estimatedtime);
    }
}
