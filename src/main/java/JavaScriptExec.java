import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

import javax.script.*;
import java.io.*;

public class JavaScriptExec {
    public static void main(String[] args)
            throws Exception
    {
        ScriptEngine ee = new ScriptEngineManager()
                .getEngineByName("nashorn");
        ee.eval(new FileReader("src\\main\\resources\\Hello.js"));
        Invocable invocable=(Invocable)ee;

        ObjectNode data = createJsonNode();
        invocable.invokeFunction("receiveJson",data);
        //Object res=invocable.invokeFunction("receiveJson",data);
    }

    public static int sumoftwonums(int a,int b){
        return a+b;
    }

    public static ObjectNode createJsonNode() {
        ObjectMapper objectMapper = new ObjectMapper(new JsonFactory());
        ObjectNode objectNode = objectMapper.createObjectNode();

        objectNode.put("firstName", "Siva");
        objectNode.put("lastName", "Datta");

        return objectNode;
    }

}
