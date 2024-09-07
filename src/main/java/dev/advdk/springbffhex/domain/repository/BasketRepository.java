package dev.advdk.springbffhex.domain.repository;

import dev.advdk.springbffhex.domain.Basket;
import org.springframework.stereotype.Repository;

@Repository
public interface BasketRepository {
    Basket getBasketById(int id);
    void updateBasket(Basket basket);
}
