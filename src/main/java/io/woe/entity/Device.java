package io.woe.entity;

import com.google.protobuf.Empty;
import io.woe.api.DeviceApi;
import kalix.javasdk.eventsourcedentity.EventSourcedEntity;
import kalix.javasdk.eventsourcedentity.EventSourcedEntity.Effect;
import kalix.javasdk.eventsourcedentity.EventSourcedEntityContext;

// This class was initially generated based on the .proto definition by Kalix tooling.
// This is the implementation for the Event Sourced Entity Service described in your io/woe/api/device_api.proto file.
//
// As long as this file exists it will not be overwritten: you can maintain it yourself,
// or delete it so it is regenerated as needed.

public class Device extends AbstractDevice {

  @SuppressWarnings("unused")
  private final String entityId;

  public Device(EventSourcedEntityContext context) {
    this.entityId = context.entityId();
  }

  @Override
  public DeviceEntity.DeviceState emptyState() {
    throw new UnsupportedOperationException("Not implemented yet, replace with your empty entity state");
  }

  @Override
  public Effect<Empty> createDevice(DeviceEntity.DeviceState currentState, DeviceApi.CreateDeviceCommand createDeviceCommand) {
    return effects().error("The command handler for `CreateDevice` is not implemented, yet");
  }

  @Override
  public Effect<Empty> pingDevice(DeviceEntity.DeviceState currentState, DeviceApi.PingDeviceCommand pingDeviceCommand) {
    return effects().error("The command handler for `PingDevice` is not implemented, yet");
  }

  @Override
  public DeviceEntity.DeviceState deviceCreated(DeviceEntity.DeviceState currentState, DeviceEntity.DeviceCreated deviceCreated) {
    throw new RuntimeException("The event handler for `DeviceCreated` is not implemented, yet");
  }
  @Override
  public DeviceEntity.DeviceState deviceStateUpdated(DeviceEntity.DeviceState currentState, DeviceEntity.DeviceStateUpdated deviceStateUpdated) {
    throw new RuntimeException("The event handler for `DeviceStateUpdated` is not implemented, yet");
  }

}
