package sdk.step;

import sdk.Field;

import java.util.List;

public interface StepExecutionStatusCalculator {
    StepStatus getExecutionStatus(List<Field> fields, VerificationExecution verificationExecution);
}
