package hillel.homework18;

import com.google.gson.Gson;
import org.testng.annotations.Test;
import ua.hillel.entity.Order;

import java.io.IOException;

import static ua.hillel.pageObjectApi.StoreApi.*;

public class StoreApiTest {

    @Test
    public void testGetInventory() throws IOException {
        System.out.println("Response getInventory: " + getInventory());
    }

    @Test
    public void testSetOrder() throws IOException {
        Order order = order(9);
        String jsonObject = new Gson().toJson(order);
        System.out.println("Response setStoreOrder: " + setStoreOrder(jsonObject));
    }

    @Test
    public void testGetOrderId() throws IOException {
        Order order = order(9);
        String jsonObject = new Gson().toJson(order);
        System.out.println("Response setStoreOrder: " + setStoreOrder(jsonObject));
        System.out.println("Response getStoreOrderId: " + getStoreOrderId(order.getId()));
    }

    @Test
    public void testDelOrderId() throws IOException {
        Order order = order(9);
        String jsonObject = new Gson().toJson(order);
        System.out.println("Response setStoreOrder: " + setStoreOrder(jsonObject));
        System.out.println("Response getStoreOrderId: " + getStoreOrderId(order.getId()));
        System.out.println("Response delStoreOrderId: " + delStoreOrderId(order.getId()));
    }
}