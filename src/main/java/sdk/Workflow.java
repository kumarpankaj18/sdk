package sdk;

import lombok.Data;
import sdk.stage.Stage;

import java.util.HashMap;
import java.util.Map;

@Data
public class Workflow {

    private Stage               stage;
    private String              version;
    private Map<String, String> fieldMap;
}
