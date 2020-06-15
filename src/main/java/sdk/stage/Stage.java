package sdk.stage;

import lombok.Data;
import sdk.step.Step;
import sdk.Stride;

import java.util.List;

@Data
public class Stage implements Istage {

    private String name;

    private Stride currentStride;

    private List<Step> steps;

    private Rollback rollback;

    private Action action;

    private NextStageCalculator nextStageCalculator;

    private StageStatusCalculator stageStatusCalculator;
}
