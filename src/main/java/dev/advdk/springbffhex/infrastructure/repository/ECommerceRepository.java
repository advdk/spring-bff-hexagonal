package dev.advdk.springbffhex.infrastructure.repository;

import dev.advdk.springbffhex.domain.Basket;
import dev.advdk.springbffhex.domain.repository.BasketRepository;

public class ECommerceRepository implements BasketRepository {
    @Override
    public Basket getBasketById(int id) {
        // Make call to ECommerce API to get basket by id
        return null;
    }

    @Override
    public void updateBasket(Basket basket) {
        // Make call to ECommerce API to update basket
    }
}
