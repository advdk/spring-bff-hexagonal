package dev.advdk.springbffhex.domain;

import java.util.List;

public class Basket {
    private Long id;
    private String userId;
    private List<BasketItem> items;

    public Basket(Long id, String userId, List<BasketItem> items) {
        this.id = id;
        this.userId = userId;
        this.items = items;
    }

    public Long getId() {
        return id;
    }

    public String getUserId() {
        return userId;
    }

    public List<BasketItem> getItems() {
        return items;
    }

    public void addItem(BasketItem item) {

        if(item.getQuantity() <= 0) {
            throw new IllegalArgumentException("Quantity must be greater than 0");
        }


        items.add(item);
    }

}
