package com.hibesoft;

import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Arrays;
import java.util.List;

public class Api {

    public static List<TeamServer>  getTeamServerList(String apiResponse){
        Gson gson=new Gson();
        TeamServer[] teamServers = gson.fromJson(apiResponse, TeamServer[].class);
        return Arrays.asList(teamServers);
    }

    public static String getResponseApi(String directionUrl){
        String response = null;
        try{
            URL url = new URL(directionUrl);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.setRequestProperty("Accept", "application/json");

            if (conn.getResponseCode() != 200) {
                throw new RuntimeException("Failed : HTTP Error code : "+ conn.getResponseCode());
            }

            InputStreamReader in = new InputStreamReader(conn.getInputStream());
            BufferedReader br = new BufferedReader(in);
            response=br.readLine();
            conn.disconnect();
        } catch (Exception e) {
            System.out.println("Exception in teamServerGet: " + e);
        }
        return  response;
    }
    public static void main(String[] args) {
     String url="http://18.220.117.43:8080/TeamServer";
     String response=getResponseApi(url);

     getTeamServerList(response).forEach(System.out::println);

    }
}
