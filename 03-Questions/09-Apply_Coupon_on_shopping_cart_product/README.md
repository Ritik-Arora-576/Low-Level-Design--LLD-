# Apply coupon on Shopping cart product

Given shopping cart with product and coupons. Calculate the net price after applying coupons on products. Coupons can be different types with certain conditions.

1. N% of i.e 10% for all the individual items
2. P% off on next item
3. D% off on Nth Item of type T

Squentially apply all the coupons and get the total amount.

**Solution: We can solve this question by using Decorator Design Pattern**

### Object
1. ShoppingCart
2. Product -> CouponDecorator
3. CouponDecorator -> GeneralCoupon, TypeCoupon