package dev.advdk.springbffhex.domain.service;


import dev.advdk.springbffhex.domain.Basket;
import dev.advdk.springbffhex.domain.BasketItem;
import dev.advdk.springbffhex.domain.repository.BasketRepository;
import org.springframework.stereotype.Service;

@Service
public class BasketService {
    private final BasketRepository basketRepository;

    public BasketService(BasketRepository basketRepository) {
        this.basketRepository = basketRepository;
    }

    public void addItemToBasket(int basketId, BasketItem  item) {
        Basket basketById = basketRepository.getBasketById(basketId);
        basketById.addItem(item);
        basketRepository.updateBasket(basketById);
    }

    public Basket getBasket(int basketId) {
        return basketRepository.getBasketById(basketId);
    }
}
