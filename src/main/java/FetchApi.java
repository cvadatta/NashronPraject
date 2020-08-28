

import javax.script.*;
import java.io.FileReader;

public class FetchApi {
    public static void main(String[] args)
            throws Exception
    {

        System.setProperty("nashorn.args", "--language=es6");
        ScriptEngine ee = new ScriptEngineManager()
                .getEngineByName("Nashorn");
        
        ee.eval(new FileReader("src\\main\\resources\\Fetch.js"));

        Invocable invocable=(Invocable)ee;

        invocable.invokeFunction("tch");

    }
}
