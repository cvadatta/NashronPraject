import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import java.io.FileReader;

public class Run1 {
    public static void main(String[] args)
            throws Exception
    {
        ScriptEngine ee = new ScriptEngineManager()
                .getEngineByName("nashorn");
        ee.eval(new FileReader("src/main/resources/Hello.js"));
        //2// Bindings bind=ee.getBindings(ScriptContext.ENGINE_SCOPE);
        // 2//bind.put("name","Muttai Murali Dharan!!");
        //2//ee.eval(new FileReader("C:\\\\Users\\\\SIVA DATTA\\\\IdeaProjects\\\\nashrontest\\\\src\\\\demo.js"));
        //ee.eval(new FileReader("C:\\Users\\SIVA DATTA\\IdeaProjects\\RunTimeLoading\\src\\main\\resources\\Hello.js"));
        //Invocable invocable=(Invocable)ee;

        //invocable.invokeFunction("s1");

        //invocable.invokeFunction("s2","pitaambhar saxena!!");
    }

}
