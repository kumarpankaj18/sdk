package sdk.stage;


import sdk.Stride;
import sdk.step.Step;

import java.util.List;

public interface NextStageCalculator {
    Stride nextStage(List<Step> steps, List<StepExecution> stepExecutions);
}
