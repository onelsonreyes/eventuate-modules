package com.karadak.common.event;

import io.eventuate.Event;
import io.eventuate.EventEntity;

@EventEntity(entity = "com.karadak.common.backend.aggregate.RestaurantAggregate")
public abstract class RestaurantEvent implements Event {
}
