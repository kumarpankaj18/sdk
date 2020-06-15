package sdk.internal;

import lombok.AllArgsConstructor;
import lombok.Data;
import sdk.Field;
import sdk.OnboardingResponse;
import sdk.UserAction;
import sdk.Workflow;

import java.util.Collection;
import java.util.Map;


@Data
@AllArgsConstructor
public class WorkflowExecutor {

    private Workflow workflow;


    public Collection<Field> getFields() {
        StageExecutor stageExecutor = new StageExecutor(workflow.getStage());
        return stageExecutor.getFields();
    }


    // get onboarding type
    // getWorkflow for onboarding type
    // getEntity data for entity
    // merge entity data and default values
    // with user , entity and default value execute workflow

    // save step
    // if step is not completed
    // validate step
    // if validation passes getNext stride ,
    // else
    // get next stride
    // execute same logic for next stride

    // submit step
    // if step is not completed
    // validate step
    // verify step this returns verification status
    // end
    // get next stride
    // execute same logic for next stride
    public void execute(Map<String, Object> input, UserAction userAction) {
        StageExecutor stageExecutor = new StageExecutor(workflow.getStage());
        stageExecutor.execute(input);
    }

    public OnboardingResponse getResponse() {
        OnboardingResponse onboardingResponse = new OnboardingResponse();
        onboardingResponse.setFieldDetails(this.getFields());
        return onboardingResponse;
    }

}
