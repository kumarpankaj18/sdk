package sdk.internal;

import lombok.AllArgsConstructor;
import lombok.Data;
import sdk.Field;
import sdk.UserAction;
import sdk.stage.Stage;
import sdk.step.Step;

import java.util.*;

@Data
@AllArgsConstructor
public class StageExecutor {

    private Stage stage;

    public Collection<Field> getFields() {
        List<Step> steps = stage.getSteps();
        List<Field> fields = new ArrayList<>();
        StepExecutor stepExecutor = new StepExecutor();
        for (Step step : steps) {
            stepExecutor.setStep(step);
            fields.addAll(stepExecutor.getFields());

        }
        return fields;
    }

    public void execute(Map<String, Object> input)
    {
    }
}
