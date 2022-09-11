package io.woe.action;

import akka.stream.javadsl.Source;
import com.google.protobuf.Empty;
import io.woe.action.RegionToRegionAction;
import io.woe.action.RegionToRegionActionTestKit;
import io.woe.entity.RegionEntity;
import kalix.javasdk.testkit.ActionResult;
import org.junit.Ignore;
import org.junit.Test;
import static org.junit.Assert.*;

// This class was initially generated based on the .proto definition by Kalix tooling.
//
// As long as this file exists it will not be overwritten: you can maintain it yourself,
// or delete it so it is regenerated as needed.

public class RegionToRegionActionTest {

  @Test
  @Ignore("to be implemented")
  public void exampleTest() {
    RegionToRegionActionTestKit service = RegionToRegionActionTestKit.of(RegionToRegionAction::new);
    // // use the testkit to execute a command
    // SomeCommand command = SomeCommand.newBuilder()...build();
    // ActionResult<SomeResponse> result = service.someOperation(command);
    // // verify the reply
    // SomeReply reply = result.getReply();
    // assertEquals(expectedReply, reply);
  }

  @Test
  @Ignore("to be implemented")
  public void onRegionUpdatedTest() {
    RegionToRegionActionTestKit testKit = RegionToRegionActionTestKit.of(RegionToRegionAction::new);
    // ActionResult<Empty> result = testKit.onRegionUpdated(RegionEntity.RegionUpdated.newBuilder()...build());
  }

  @Test
  @Ignore("to be implemented")
  public void onRegionAggregatedTest() {
    RegionToRegionActionTestKit testKit = RegionToRegionActionTestKit.of(RegionToRegionAction::new);
    // ActionResult<Empty> result = testKit.onRegionAggregated(RegionEntity.RegionAggregated.newBuilder()...build());
  }

}
