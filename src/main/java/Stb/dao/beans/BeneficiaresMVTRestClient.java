/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stb.dao.beans;

import Stb.model.ava.BeneficiairesMvt;
import java.io.Serializable;
import java.util.Arrays;
import java.util.HashMap;

import java.util.List;
import java.util.Map;
import org.springframework.http.HttpStatus;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.client.RestTemplate;

/**
 *
 * @author yayan
 */

public class BeneficiaresMVTRestClient implements Serializable{
     public static final String REST_SERVICE_URI = "http://localhost:9090/AppServerAVA";

     public List<BeneficiairesMvt> AllBeneficiairesMvt() {
        RestTemplate res = new RestTemplate();
        ResponseEntity<BeneficiairesMvt[]> responseEntity = res.getForEntity(REST_SERVICE_URI + "/AllBeneficiairesMvt", BeneficiairesMvt[].class);
        BeneficiairesMvt[] objects = responseEntity.getBody();
        return Arrays.asList(objects);
     }
     
      public BeneficiairesMvt oneBeneficiairesMvt(String numDossier, String dateDossier,
            String codeTypeDos, String noPieceBenef){
           RestTemplate restTemplate = new RestTemplate();
          String url = REST_SERVICE_URI + "/oneBeneficiaires/"
                  + "{numDossier},"
                  + "{dateDossier},"
                  + "{codeTypeDos},"
                  + "{noPieceBenef}";

        Map<String, String> map = new HashMap<String, String>();
        map.put("numDossier", numDossier);
        map.put("dateDossier", dateDossier);
        map.put("codeTypeDos", codeTypeDos);
        map.put("noPieceBenef", noPieceBenef);
       
        BeneficiairesMvt beneficiares = restTemplate.getForObject(url, BeneficiairesMvt.class, map);
        return beneficiares;
      }
      
     
}
