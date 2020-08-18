import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

public class JsonTest {
    public static ObjectNode createJsonNode() {
        ObjectMapper objectMapper = new ObjectMapper(new JsonFactory());
        ObjectNode objectNode = objectMapper.createObjectNode();

        objectNode.put("firstName", "Siva");
        objectNode.put("lastName", "Datta");

        return objectNode;
    }
    public static void main(String args[]) {
        ObjectNode json = createJsonNode();
        System.out.println(json.toString());

    }
}
