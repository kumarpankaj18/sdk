package sdk.stage;

import sdk.step.Step;

import java.util.List;

public interface Rollback {

    boolean rollback(List<Step> steps);
}
