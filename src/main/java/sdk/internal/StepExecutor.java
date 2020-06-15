package sdk.internal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import sdk.Field;
import sdk.step.Step;

import java.util.Collection;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StepExecutor {

    private Step step;

    public Collection<Field> getFields() {
        return step.getFields();
    }
}
