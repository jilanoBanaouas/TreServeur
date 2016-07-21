/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.ref;

import Stb.model.Ref.Activite;
import org.springframework.web.client.RestTemplate;

/**
 *
 * @author yayan
 */
public class ClientControllerRefTest {
    	public static final String REST_SERVICE_URI = "http://localhost:9090/AppServerAVA";
        
        public static void getActivite(){
		 RestTemplate res = new RestTemplate();
		          Activite activite = res.getForObject(REST_SERVICE_URI+"/ref/oneActivite", Activite.class);
            System.out.println("--------------------"+activite.getLibActivite());
	}
        
          public static void main(String args[]){
        getActivite();

    }
    
}
