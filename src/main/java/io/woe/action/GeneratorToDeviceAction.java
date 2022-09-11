package io.woe.action;

import com.google.protobuf.Any;
import com.google.protobuf.Empty;
import io.woe.entity.GeneratorEntity;
import kalix.javasdk.action.ActionCreationContext;

// This class was initially generated based on the .proto definition by Kalix tooling.
// This is the implementation for the Action Service described in your io/woe/action/generator_to_device_action.proto file.
//
// As long as this file exists it will not be overwritten: you can maintain it yourself,
// or delete it so it is regenerated as needed.

public class GeneratorToDeviceAction extends AbstractGeneratorToDeviceAction {

  public GeneratorToDeviceAction(ActionCreationContext creationContext) {}

  @Override
  public Effect<Empty> onGenerateDeviceRequested(GeneratorEntity.GenerateDeviceRequested generateDeviceRequested) {
    throw new RuntimeException("The command handler for `OnGenerateDeviceRequested` is not implemented, yet");
  }
}
