package io.quarkus.temporal.client.it.workflow;

import io.quarkus.temporal.runtime.annotations.TemporalActivityStub;
import io.quarkus.temporal.runtime.annotations.TemporalWorkflow;
import io.temporal.workflow.Workflow;

@TemporalWorkflow(queue = "testQueue", name = "test")
public class TestWorkflowImpl implements TestWorkflow {

    @TemporalActivityStub
    TestActivity testActivity;

    @Override
    public void run() {
        System.out.println(testActivity.hello());
        Workflow.sleep(10000);
        System.out.println("Workflow <<1>> completed");
    }
}
