package dev.advdk.springbffhex.application.response;

import java.util.List;

public record BasketResponse(
        Long id,
        List<BasketItemResponse> items) {
}
