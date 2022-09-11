package io.woe.action;

import akka.stream.javadsl.Source;
import com.google.protobuf.Empty;
import io.woe.action.DeviceToRegionAction;
import io.woe.action.DeviceToRegionActionTestKit;
import io.woe.entity.DeviceEntity;
import kalix.javasdk.testkit.ActionResult;
import org.junit.Ignore;
import org.junit.Test;
import static org.junit.Assert.*;

// This class was initially generated based on the .proto definition by Kalix tooling.
//
// As long as this file exists it will not be overwritten: you can maintain it yourself,
// or delete it so it is regenerated as needed.

public class DeviceToRegionActionTest {

  @Test
  @Ignore("to be implemented")
  public void exampleTest() {
    DeviceToRegionActionTestKit service = DeviceToRegionActionTestKit.of(DeviceToRegionAction::new);
    // // use the testkit to execute a command
    // SomeCommand command = SomeCommand.newBuilder()...build();
    // ActionResult<SomeResponse> result = service.someOperation(command);
    // // verify the reply
    // SomeReply reply = result.getReply();
    // assertEquals(expectedReply, reply);
  }

  @Test
  @Ignore("to be implemented")
  public void onDeviceCreatedTest() {
    DeviceToRegionActionTestKit testKit = DeviceToRegionActionTestKit.of(DeviceToRegionAction::new);
    // ActionResult<Empty> result = testKit.onDeviceCreated(DeviceEntity.DeviceCreated.newBuilder()...build());
  }

  @Test
  @Ignore("to be implemented")
  public void onDeviceStateUpdatedTest() {
    DeviceToRegionActionTestKit testKit = DeviceToRegionActionTestKit.of(DeviceToRegionAction::new);
    // ActionResult<Empty> result = testKit.onDeviceStateUpdated(DeviceEntity.DeviceStateUpdated.newBuilder()...build());
  }

}
