package io.woe.action;

import com.google.protobuf.Any;
import com.google.protobuf.Empty;
import io.woe.entity.DeviceEntity;
import kalix.javasdk.action.ActionCreationContext;

// This class was initially generated based on the .proto definition by Kalix tooling.
// This is the implementation for the Action Service described in your io/woe/action/device_to_region_action.proto file.
//
// As long as this file exists it will not be overwritten: you can maintain it yourself,
// or delete it so it is regenerated as needed.

public class DeviceToRegionAction extends AbstractDeviceToRegionAction {

  public DeviceToRegionAction(ActionCreationContext creationContext) {}

  @Override
  public Effect<Empty> onDeviceCreated(DeviceEntity.DeviceCreated deviceCreated) {
    throw new RuntimeException("The command handler for `OnDeviceCreated` is not implemented, yet");
  }
  @Override
  public Effect<Empty> onDeviceStateUpdated(DeviceEntity.DeviceStateUpdated deviceStateUpdated) {
    throw new RuntimeException("The command handler for `OnDeviceStateUpdated` is not implemented, yet");
  }
}
