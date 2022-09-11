package io.woe.action;

import akka.stream.javadsl.Source;
import com.google.protobuf.Empty;
import io.woe.action.GeneratorToDeviceAction;
import io.woe.action.GeneratorToDeviceActionTestKit;
import io.woe.entity.GeneratorEntity;
import kalix.javasdk.testkit.ActionResult;
import org.junit.Ignore;
import org.junit.Test;
import static org.junit.Assert.*;

// This class was initially generated based on the .proto definition by Kalix tooling.
//
// As long as this file exists it will not be overwritten: you can maintain it yourself,
// or delete it so it is regenerated as needed.

public class GeneratorToDeviceActionTest {

  @Test
  @Ignore("to be implemented")
  public void exampleTest() {
    GeneratorToDeviceActionTestKit service = GeneratorToDeviceActionTestKit.of(GeneratorToDeviceAction::new);
    // // use the testkit to execute a command
    // SomeCommand command = SomeCommand.newBuilder()...build();
    // ActionResult<SomeResponse> result = service.someOperation(command);
    // // verify the reply
    // SomeReply reply = result.getReply();
    // assertEquals(expectedReply, reply);
  }

  @Test
  @Ignore("to be implemented")
  public void onGenerateDeviceRequestedTest() {
    GeneratorToDeviceActionTestKit testKit = GeneratorToDeviceActionTestKit.of(GeneratorToDeviceAction::new);
    // ActionResult<Empty> result = testKit.onGenerateDeviceRequested(GeneratorEntity.GenerateDeviceRequested.newBuilder()...build());
  }

}
