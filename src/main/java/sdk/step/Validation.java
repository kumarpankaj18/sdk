package sdk.step;

import sdk.Field;

import java.util.List;

public interface Validation {

    boolean validate(List<Field> fields);
}
