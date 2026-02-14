package com.prac;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class EcommerceTest {

    @Test
    public void testEcommerceFlow() {

        EcommerceService service = new EcommerceService();

        Profile profile = new Profile();
        profile.setAddress("Delhi");
        profile.setPhone("999999");

        User user = new User();
        user.setName("Amit");
        user.setEmail("amit@gmail.com");

        service.registerUser(user, profile);

        PurchaseOrder o1 = new PurchaseOrder();
        o1.setAmount(1000);

        PurchaseOrder o2 = new PurchaseOrder();
        o2.setAmount(2000);

        service.addOrders(user, Arrays.asList(o1, o2));

        service.addPayment(o1, 1000);
        service.updateOrderAmount(o2, 2500);

        assertNotNull(user.getProfile());
    }
}