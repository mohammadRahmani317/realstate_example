package com.melksanj.constants;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

// cat3Slug
@Getter
@RequiredArgsConstructor
public enum AdCategoryEnum {
    APARTMENT_RENT("apartment-rent", "آپارتمان اجاره‌ای"),
    APARTMENT_SELL("apartment-sell", "آپارتمان فروشی"),
    HOUSE_VILLA_RENT("house-villa-rent", "خانه/ویلا اجاره‌ای"),
    HOUSE_VILLA_SELL("house-villa-sell", "خانه/ویلا فروشی"),
    INDUSTRY_AGRICULTURE_BUSINESS_RENT("industry-agriculture-business-rent", "صنعتی/کشاورزی/تجاری اجاره‌ای"),
    INDUSTRY_AGRICULTURE_BUSINESS_SELL("industry-agriculture-business-sell", "صنعتی/کشاورزی/تجاری فروشی"),
    OFFICE_RENT("office-rent", "دفتر کار اجاره‌ای"),
    OFFICE_SELL("office-sell", "دفتر کار فروشی"),
    PARTNERSHIP("partnership", "مشارکت در ساخت"),
    PLOT_OLD("plot-old", "زمین"),
    PRESELL("presell", "پروژه پیش‌فروش"),
    SHOP_RENT("shop-rent", "مغازه اجاره‌ای"),
    SHOP_SELL("shop-sell", "مغازه فروشی"),
    SUITE_APARTMENT("suite-apartment", "سوئیت"),
    VILLA("villa", "ویلا"),
    WORKSPACE("workspace", "فضای کاری");

    private final String code;
    private final String title;

    public static AdCategoryEnum fromCode(String code) {
        for (AdCategoryEnum category : values()) {
            if (category.code.equals(code)) {
                return category;
            }
        }
        throw new IllegalArgumentException("Invalid PropertyCategory code: " + code);
    }
}
