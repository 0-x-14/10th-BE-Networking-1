package com.gildedrose.Update;

import com.gildedrose.Item;

public class UpdateBackstagePassesLogic implements UpdateLogic {

    @Override
    public void update(Item item) {

        if (item.quality < 50) {
            item.quality++;
        }
        if (item.sellIn <= 10 && item.quality < 50) {
            item.quality++;
        }
        if (item.sellIn <= 5 && item.quality < 50) {
            item.quality++;
        }

        item.sellIn--;

        if (item.sellIn < 0) {
            item.quality = 0;
        }
    }
}
