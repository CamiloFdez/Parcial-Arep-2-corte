package eci.edu.co.proxy.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProxyController {

    private static final String USER_AGENT = "Mozilla/5.0";
    private static final String GET_URL = "http://localhost:8081/collatzsequence?value=";
    private static final String GET_URL1 = "http://ec2-54-174-93-109.compute-1.amazonaws.com:8081/collatzsequence?value=";

    @GetMapping(value = "/collatzsequence", produces = "application/json")
    public String collatzsequence(@RequestParam(value = "value") int value) throws IOException {
        return makeRequest(value, "GET");
    }

    @PostMapping(value = "/collatzsequence", produces = "application/json")
    public String collatzsequencePost(@RequestParam(value = "value") int value) throws IOException {
        return makeRequest(value, "POST");
    }

    private String makeRequest(int value, String method) throws IOException {
        URL obj = new URL(GET_URL + value);
        URL obj1 = new URL(GET_URL1 + value);
        HttpURLConnection con = (HttpURLConnection) obj.openConnection();
        HttpURLConnection con1 = (HttpURLConnection) obj1.openConnection();
        con.setRequestMethod(method);
        con.setRequestProperty("User-Agent", USER_AGENT);
        con1.setRequestMethod(method);
        con1.setRequestProperty("User-Agent1", USER_AGENT);

        int responseCode = con.getResponseCode();
        System.out.println(method + " Response Code :: " + responseCode);

        if (responseCode == HttpURLConnection.HTTP_OK) {
            BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
            String inputLine;
            String response = "";

            while ((inputLine = in.readLine()) != null) {
                response += inputLine;
            }
            in.close();

            return response;
        } else {
            return "{\"operation\":\"error\",\"input\":" + value + ",\"output\":\"" + method + " request not worked\"}";
        }
    }
}
