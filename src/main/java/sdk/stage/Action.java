package sdk.stage;

import sdk.step.Step;

import java.util.List;

public interface Action {

    boolean execute(List<Step> steps);
}
