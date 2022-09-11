package io.woe.entity;

import com.google.protobuf.Empty;
import io.woe.api.RegionApi;
import kalix.javasdk.eventsourcedentity.EventSourcedEntity;
import kalix.javasdk.eventsourcedentity.EventSourcedEntity.Effect;
import kalix.javasdk.eventsourcedentity.EventSourcedEntityContext;

// This class was initially generated based on the .proto definition by Kalix tooling.
// This is the implementation for the Event Sourced Entity Service described in your io/woe/api/region_api.proto file.
//
// As long as this file exists it will not be overwritten: you can maintain it yourself,
// or delete it so it is regenerated as needed.

public class Region extends AbstractRegion {

  @SuppressWarnings("unused")
  private final String entityId;

  public Region(EventSourcedEntityContext context) {
    this.entityId = context.entityId();
  }

  @Override
  public RegionEntity.RegionState emptyState() {
    throw new UnsupportedOperationException("Not implemented yet, replace with your empty entity state");
  }

  @Override
  public Effect<Empty> subRegionState(RegionEntity.RegionState currentState, RegionApi.SubRegionStateCommand subRegionStateCommand) {
    return effects().error("The command handler for `SubRegionState` is not implemented, yet");
  }

  @Override
  public Effect<Empty> aggregateRegion(RegionEntity.RegionState currentState, RegionApi.AggregateRegionCommand aggregateRegionCommand) {
    return effects().error("The command handler for `AggregateRegion` is not implemented, yet");
  }

  @Override
  public Effect<RegionApi.GetRegionStateResponse> getRegionState(RegionEntity.RegionState currentState, RegionApi.GetRegionStateRequest getRegionStateRequest) {
    return effects().error("The command handler for `GetRegionState` is not implemented, yet");
  }

  @Override
  public RegionEntity.RegionState regionUpdated(RegionEntity.RegionState currentState, RegionEntity.RegionUpdated regionUpdated) {
    throw new RuntimeException("The event handler for `RegionUpdated` is not implemented, yet");
  }
  @Override
  public RegionEntity.RegionState regionAggregated(RegionEntity.RegionState currentState, RegionEntity.RegionAggregated regionAggregated) {
    throw new RuntimeException("The event handler for `RegionAggregated` is not implemented, yet");
  }

}
