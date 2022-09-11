package io.woe.action;

import com.google.protobuf.Any;
import com.google.protobuf.Empty;
import io.woe.entity.RegionEntity;
import kalix.javasdk.action.ActionCreationContext;

// This class was initially generated based on the .proto definition by Kalix tooling.
// This is the implementation for the Action Service described in your io/woe/action/region_to_region_action.proto file.
//
// As long as this file exists it will not be overwritten: you can maintain it yourself,
// or delete it so it is regenerated as needed.

public class RegionToRegionAction extends AbstractRegionToRegionAction {

  public RegionToRegionAction(ActionCreationContext creationContext) {}

  @Override
  public Effect<Empty> onRegionUpdated(RegionEntity.RegionUpdated regionUpdated) {
    throw new RuntimeException("The command handler for `OnRegionUpdated` is not implemented, yet");
  }
  @Override
  public Effect<Empty> onRegionAggregated(RegionEntity.RegionAggregated regionAggregated) {
    throw new RuntimeException("The command handler for `OnRegionAggregated` is not implemented, yet");
  }
}
