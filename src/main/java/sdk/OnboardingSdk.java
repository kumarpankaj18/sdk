package sdk;

import sdk.internal.WorkflowExecutor;

import java.util.HashMap;
import java.util.Map;

public class OnboardingSdk {

    private Workflow workflow;

    // returns onboardind type id
    public String createOnboardingType(String product, String platform, String version, String orgId) {
        // returns onboarding type id
        return "";
    }

    // returns onboardind type id
    public String getOnboardingType(String product, String platform, String version, String orgId) {
        // returns onboarding type id
        return "";
    }

    // returns onboarding id
    public String createOnboardingRequest(String onboardingTypeId, String entityId, String entityType) {
        // creates onboarding request entry
        // creates onboarding data entry
        // returns onboarding id
        return "";
    }

    public OnboardingResponse getOnboardingFields(String onboardingId, OnboardingRequest onboardingRequest) {

        // get onboarding type
        // getWorkflow for onboarding type
        // getEntity data for entity

        WorkflowExecutor workflowExecutor = new WorkflowExecutor(workflow);

        return workflowExecutor.getResponse();
    }

    public OnboardingResponse updateOnboardingRequest(String onboardingId, OnboardingRequest onboardingRequest) {

        Map<String, Object> input = new HashMap<>(onboardingRequest.getDefaultValues());
        input.putAll(onboardingRequest.getUserInputValues());

        WorkflowExecutor workflowExecutor = new WorkflowExecutor(workflow);
        workflowExecutor.execute(input, onboardingRequest.getUserAction());


        return workflowExecutor.getResponse();
    }

    public OnboardingResponse getVerificationData(String onboardingId) {
        // getVerification
        return new OnboardingResponse();
    }


}
