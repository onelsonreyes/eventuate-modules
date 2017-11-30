package com.karadak.common.event;

import com.karadak.common.model.CreateRestaurantRequest;
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
