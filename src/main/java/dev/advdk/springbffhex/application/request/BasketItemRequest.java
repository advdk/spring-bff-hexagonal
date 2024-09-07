package dev.advdk.springbffhex.application.request;

public record BasketItemRequest(
        String productId,
        int quantity
) {
}
