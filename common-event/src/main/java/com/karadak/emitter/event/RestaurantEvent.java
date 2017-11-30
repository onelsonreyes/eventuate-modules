package com.karadak.emitter.event;

import io.eventuate.Event;
import io.eventuate.EventEntity;

@EventEntity(entity = "com.karadak.emitter.backend.aggregate.RestaurantAggregate")
public abstract class RestaurantEvent implements Event {
}
