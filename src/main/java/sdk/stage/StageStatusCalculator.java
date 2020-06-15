package sdk.stage;

import sdk.step.Step;

import java.util.List;

public interface StageStatusCalculator {
    StageStatus getStageStatus(List<Step> steps, List<StepExecution> stepExecutions);
    //
    // Stage status can be determined using verification status of steps
    // Client can implement this function or os will provide defaults implementation.
    //

    //
    //
    //
    //
    //
}
