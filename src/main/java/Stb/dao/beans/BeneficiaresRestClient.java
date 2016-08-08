/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stb.dao.beans;

import java.io.Serializable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 *
 * @author yayan
 */
@ManagedBean
@RequestScoped
public class BeneficiaresRestClient implements Serializable {

    public static final String REST_SERVICE_URI = "http://localhost:9090/AppServerAVA";

    //AllBeneficiaires
    public List<Beneficiares> allBeneficiaires() {
        RestTemplate res = new RestTemplate();
        ResponseEntity<Beneficiares[]> responseEntity = res.getForEntity(REST_SERVICE_URI + "/AllBeneficiaires", Beneficiares[].class);
        Beneficiares[] objects = responseEntity.getBody();
        return Arrays.asList(objects);

    }

    //OneBeneficiaire
    public Beneficiares oneBeneficiaires(String codeProduitService, String codeOoneBenperation,
            String refOperation, String dateOperation,
            String uniteOperation, String noPieceBenef) {

        RestTemplate restTemplate = new RestTemplate();
        String url = REST_SERVICE_URI + " /oneBeneficiairesMvt/{codeProduitService},"
                + "{codeOoneBenperation},"
                + "{refOperation},"
                + "{dateOperation},"
                + "{uniteOperation},"
                + "{noPieceBenef}";

        Map<String, String> map = new HashMap<String, String>();
        map.put("codeProduitService", codeProduitService);
        map.put("codeOoneBenperation", codeOoneBenperation);
        map.put("refOperation", refOperation);
        map.put("dateOperation", dateOperation);
        map.put("uniteOperation", uniteOperation);
        map.put("noPieceBenef", noPieceBenef);
        Beneficiares beneficiares = restTemplate.getForObject(url, Beneficiares.class, map);
        return beneficiares;
    }
    
    

}
