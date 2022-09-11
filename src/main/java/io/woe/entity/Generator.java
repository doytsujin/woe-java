package io.woe.entity;

import com.google.protobuf.Empty;
import io.woe.api.GeneratorApi;
import kalix.javasdk.eventsourcedentity.EventSourcedEntity;
import kalix.javasdk.eventsourcedentity.EventSourcedEntity.Effect;
import kalix.javasdk.eventsourcedentity.EventSourcedEntityContext;

// This class was initially generated based on the .proto definition by Kalix tooling.
// This is the implementation for the Event Sourced Entity Service described in your io/woe/api/generator_api.proto file.
//
// As long as this file exists it will not be overwritten: you can maintain it yourself,
// or delete it so it is regenerated as needed.

public class Generator extends AbstractGenerator {

  @SuppressWarnings("unused")
  private final String entityId;

  public Generator(EventSourcedEntityContext context) {
    this.entityId = context.entityId();
  }

  @Override
  public GeneratorEntity.GeneratorState emptyState() {
    throw new UnsupportedOperationException("Not implemented yet, replace with your empty entity state");
  }

  @Override
  public Effect<Empty> createGenerator(GeneratorEntity.GeneratorState currentState, GeneratorApi.CreateGeneratorCommand createGeneratorCommand) {
    return effects().error("The command handler for `CreateGenerator` is not implemented, yet");
  }

  @Override
  public Effect<Empty> generateDevices(GeneratorEntity.GeneratorState currentState, GeneratorApi.GenerateDevicesCommand generateDevicesCommand) {
    return effects().error("The command handler for `GenerateDevices` is not implemented, yet");
  }

  @Override
  public GeneratorEntity.GeneratorState generatorCreated(GeneratorEntity.GeneratorState currentState, GeneratorEntity.GeneratorCreated generatorCreated) {
    throw new RuntimeException("The event handler for `GeneratorCreated` is not implemented, yet");
  }
  @Override
  public GeneratorEntity.GeneratorState generateDevicesRequested(GeneratorEntity.GeneratorState currentState, GeneratorEntity.GenerateDevicesRequested generateDevicesRequested) {
    throw new RuntimeException("The event handler for `GenerateDevicesRequested` is not implemented, yet");
  }
  @Override
  public GeneratorEntity.GeneratorState generateDeviceRequested(GeneratorEntity.GeneratorState currentState, GeneratorEntity.GenerateDeviceRequested generateDeviceRequested) {
    throw new RuntimeException("The event handler for `GenerateDeviceRequested` is not implemented, yet");
  }

}
