package sdk;

import lombok.Data;

import java.util.HashMap;
import java.util.Map;

@Data
public class OnboardingRequest {

    private Map<String, Object> userInputValues = new HashMap<>();
    private Map<String, Object> defaultValues = new HashMap<>();

    private UserAction userAction;
}
