package io.quarkus.temporal.client.test;

import io.temporal.client.WorkflowClient;
import io.temporal.client.WorkflowClientOptions;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.StringAsset;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.RegisterExtension;

import io.quarkus.test.QuarkusDevModeTest;

import javax.inject.Inject;
import java.util.function.Supplier;

public class TemporalClientDevModeTest {

    @Inject
    WorkflowClient workflowClient;

    // Start hot reload (DevMode) test with your extension loaded
    @RegisterExtension
    static final QuarkusDevModeTest devModeTest = new QuarkusDevModeTest()
        .setArchiveProducer(() -> ShrinkWrap.create(JavaArchive.class)
                .add(new StringAsset("quarkus.temporal.service.url=localhost:7233"), "application.properties"));

    @Test
    public void writeYourOwnDevModeTest() {
        //WorkflowClientOptions options = workflowClient.getOptions();
        //Assertions.assertNotNull(workflowClient);
        // Write your dev mode tests here - see the testing extension guide https://quarkus.io/guides/writing-extensions#testing-hot-reload for more information
        Assertions.assertTrue(true, "Add dev mode assertions to " + getClass().getName());
    }
}
