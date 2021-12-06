package com.gildedrose.items;

import com.gildedrose.core.Item;

public class SwitchItem extends Item {

    public SwitchItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    public void updateQuality() {
        int factor;
        if (this.sellIn >= 0) factor = 1;
        else factor = -1;
        if(this.quality < 50) this.quality = Math.max(this.quality + factor, 0);
        else this.quality = 50;
    }
}
