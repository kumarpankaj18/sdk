package sdk.step;

import sdk.Field;
import sdk.Stride;

import java.util.List;

public interface NextStrideCalculator {
    Stride nextStride(List<Field> fields, VerificationExecution verificationExecution);
}
