package com.example.simmanagerv2;

import com.example.simmanagerv2.dtos.ModemResponse;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.DefaultUriBuilderFactory;

@SpringBootApplication
public class SimManagerV2Application {

    public static void main(String[] args) {
        SpringApplication.run(SimManagerV2Application.class, args);

       /* for (int i=1;i<=32;i++){
          String url = "/goip_send_at.html?username=root&password=Connect4Admin@Topili&port="+i+"&at=AT%2BCIMI&timeout=50";
            DefaultUriBuilderFactory builderFactory = new DefaultUriBuilderFactory();
            builderFactory.setEncodingMode(DefaultUriBuilderFactory.EncodingMode.VALUES_ONLY);
            RestTemplate template = new RestTemplateBuilder()
                    .rootUri("http://192.168.2.67")
                    .uriTemplateHandler(builderFactory)
                    .build();
            ModemResponse result = template.getForObject(url,ModemResponse.class);
            System.out.println(result.getResp()+"*******"+i);
        }*/


/*        for (int i=1;i<=32;i++){
            String url = "/goip_send_at.html?username=root&password=Connect4Admin@Topili&port="+i+"&at=AT%2BCOPS?&timeout=50";
            DefaultUriBuilderFactory builderFactory = new DefaultUriBuilderFactory();
            builderFactory.setEncodingMode(DefaultUriBuilderFactory.EncodingMode.VALUES_ONLY);
            RestTemplate template = new RestTemplateBuilder()
                    .rootUri("http://192.168.2.67")
                    .uriTemplateHandler(builderFactory)
                    .build();
            ModemResponse result = template.getForObject(url, ModemResponse.class);
            System.out.println(result.toString()+"*******"+i);
        }*/
    }

}
