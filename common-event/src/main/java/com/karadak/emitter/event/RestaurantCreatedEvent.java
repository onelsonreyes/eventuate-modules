package com.karadak.emitter.event;

import com.karadak.emitter.model.CreateRestaurantRequest;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class RestaurantCreatedEvent extends RestaurantEvent {
    private CreateRestaurantRequest createRestaurantRequest;

}
