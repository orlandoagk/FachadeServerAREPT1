package edu.eci.escuelaing.arep.components;


import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

public class HttpRequest {

    public static String get(String operation, String number){

        HttpResponse<String> response = null;
        try {
            response = Unirest.get("https://trigcalculator-orlando.herokuapp.com/calculateTrigonometric?operation="+operation+"&number="+number)
                    .asString();
        } catch (UnirestException e) {
            e.printStackTrace();
        }

        return response.getBody();



    }




}
