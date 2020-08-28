import javax.script.*;
import java.io.FileReader;

public class FetchApi {
    public static void main(String[] args)
            throws Exception
    {

        ScriptEngine ee = new ScriptEngineManager()
                .getEngineByName("Nashorn");

        ee.eval(new FileReader("src\\main\\resources\\Fetch.js"));

        Invocable invocable=(Invocable)ee;

        invocable.invokeFunction("tch");

    }
}
