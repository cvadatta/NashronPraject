import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import java.io.FileReader;

public class IntegerScript {
    public static void main(String[] args)
            throws Exception
    {
        ScriptEngine ee = new ScriptEngineManager()
                .getEngineByName("nashorn");
        ee.eval(new FileReader("src\\main\\resources\\Hello.js"));


        Invocable invocable=(Invocable)ee;

        invocable.invokeFunction("sumofnums",10,20);


    }

    public static int sumoftwonums(int a,int b){
        return a+b;
    }

}
