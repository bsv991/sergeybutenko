package ua.hillel.pageObjectApi;

import com.google.gson.Gson;
import okhttp3.*;
import ua.hillel.entity.Order;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.time.LocalDate;

public class StoreApi {
    private static String baseUrl = "https://petstore.swagger.io/v2/store";
    private static String date = LocalDate.now().toString();
    private static RequestBody requestBody;
    private static Request request;
    private static OkHttpClient client;
    private static Response response;
    private static Call call;

    public static Order order (int setId) {
        Order order = new Order();
        order.setId(setId);
        order.setPetId(2);
        order.setShipDate(date);
        order.setQuantity(50);
        order.setStatus("placed");
        order.setComplete(true);
        return order;
    }

    public static String getInventory() throws IOException {
        request = new Request.Builder()
                .header("Content-Type" , "application/json")
                .url(baseUrl + "/inventory")
                .build();

        client = new OkHttpClient();
        call = client.newCall(request);
        response = call.execute();
        return response.body().string();
    }

    public static String setStoreOrder(String jsonObject) throws IOException {
        requestBody = RequestBody.create(jsonObject.getBytes(StandardCharsets.UTF_8));

        request = new Request.Builder()
                .header("Content-Type" , "application/json")
                .url(baseUrl + "/order")
                .post(requestBody)
                .build();

        client = new OkHttpClient();
        call = client.newCall(request);
        response = call.execute();
        return response.body().string();
    }

    public static String getStoreOrderId(int storeId) throws IOException {
        String url = "/order/" + storeId;
        request = new Request.Builder()
                .header("Content-Type" , "application/json")
                .url(baseUrl + url)
                .build();

        client = new OkHttpClient();
        call = client.newCall(request);
        response = call.execute();
        return response.body().string();
    }

    public static String delStoreOrderId(int storeId) throws IOException {
        String url = "/order/" + storeId;
        request = new Request.Builder()
                .header("Content-Type" , "application/json")
                .url(baseUrl + url)
                .delete()
                .build();

        client = new OkHttpClient();
        call = client.newCall(request);
        response = call.execute();
        return response.body().string();
    }
}