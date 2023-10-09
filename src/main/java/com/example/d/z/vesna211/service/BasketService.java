package com.example.d.z.vesna211.service;

import com.example.d.z.vesna211.model.Basket;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class BasketService {
    private final Basket basket;

    public BasketService(Basket basket) {
        this.basket = basket;
    }

    public  List<Integer> add(List<Integer> ids) {
        return basket.add(ids);
    }

    public Map<Integer,Integer> get() {
        return basket.get();
    }
}
