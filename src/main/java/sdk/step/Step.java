package sdk.step;

import lombok.Data;
import sdk.Field;

import java.util.List;

@Data
public class Step implements Istep {

    private String name;

    private List<Field> fields;

    private Validation validation;

    private Verification verification;

    private NextStrideCalculator nextStrideCalculator;

    private StepExecutionStatusCalculator stepExecutionStatusCalculator;
}
