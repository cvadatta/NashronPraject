import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import java.io.FileReader;

public class ReturnTask {
    public static void main(String[] args)
            throws Exception
    {
        ScriptEngine ee = new ScriptEngineManager()
                .getEngineByName("nashorn");
        ee.eval(new FileReader("src\\main\\resources\\Json.js"));
        Invocable invocable=(Invocable)ee;

        ObjectNode data = createJsonNode();
        //invocable.invokeFunction("receiveJson",data);
        Object res=invocable.invokeFunction("returnsJson",data);
        System.out.println(res);
        System.out.println(res.getClass());
        System.out.println(res.toString());
        ObjectMapper mapper=new ObjectMapper();
        String fin=mapper.writeValueAsString(res);
        System.out.println(fin);

        JsonNode jsonNode = mapper.readTree(fin);
        System.out.println(jsonNode.toString());


    }


    public static ObjectNode createJsonNode() {
        ObjectMapper objectMapper = new ObjectMapper(new JsonFactory());
        ObjectNode objectNode = objectMapper.createObjectNode();

        objectNode.put("firstName", "Siva");
        objectNode.put("lastName", "Datta");

        return objectNode;
    }

}
