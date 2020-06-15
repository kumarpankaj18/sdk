package sdk.step;

import sdk.Field;
import sdk.VerificationStatus;

import java.util.List;

public interface Verification {

    VerificationStatus verify(List<Field> fields);
}
