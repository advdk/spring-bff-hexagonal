package dev.advdk.springbffhex.application;

import dev.advdk.springbffhex.application.request.BasketItemRequest;
import dev.advdk.springbffhex.application.response.BasketItemResponse;
import dev.advdk.springbffhex.application.response.BasketResponse;
import dev.advdk.springbffhex.domain.Basket;
import dev.advdk.springbffhex.domain.BasketItem;
import dev.advdk.springbffhex.domain.service.BasketService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/basket")
public class BasketController {

    private final BasketService basketService;

    public BasketController(BasketService basketService) {
        this.basketService = basketService;
    }


    @GetMapping("/{basketId}")
    public BasketResponse getBasket(int basketId) {
        Basket basket = basketService.getBasket(basketId);
        var basketItems = basket.getItems().stream()
                .map(item -> new BasketItemResponse(item.getProductId(), item.getQuantity()))
                .toList();
        return new BasketResponse(basket.getId(), basketItems);
    }

    @PostMapping("/{basketId}/items")
    public void addItemToBasket(int basketId, BasketItemRequest item) {
        BasketItem basketItem = new BasketItem(item.productId(), item.quantity());
        basketService.addItemToBasket(basketId, basketItem);
    }


}
