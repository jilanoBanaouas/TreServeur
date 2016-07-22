/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stb.controller;

import Stb.model.ava.Beneficiaires;
import Stb.model.ava.BeneficiairesMvt;
import Stb.model.ava.BeneficiairesMvtPK;
import Stb.model.ava.BeneficiairesPK;
import Stb.model.ava.OperationsDeleguees;
import Stb.model.ava.OperationsDelegueesMvt;
import Stb.model.ava.OperationsDelegueesMvtPK;
import Stb.model.ava.OperationsDelegueesPK;
import Stb.services.AVAServices;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author yayan
 */
@RestController
@RequestMapping("/ava")
public class AVAController {

    @Autowired
    AVAServices aVAServices;

    //    Insert BeneficiaresMvt
    @RequestMapping(value = "/insertBeneficairesMvt", method = RequestMethod.POST)
    public ResponseEntity<Void> insertBeneficairesMvt(@RequestBody BeneficiairesMvt beneficiairesMvt) {
        if (aVAServices.getBeneficiairesMvt(beneficiairesMvt.getBeneficiairesMvtPK()) == null) {
            return new ResponseEntity<Void>(HttpStatus.CONFLICT);
        }
        aVAServices.insertBeneficairesMvt(beneficiairesMvt);
        return new ResponseEntity<Void>(HttpStatus.CREATED);
    }

    @RequestMapping(value = "/AllBeneficiairesMvt", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<BeneficiairesMvt>> AllBeneficiairesMvt() {
        List<BeneficiairesMvt> beneficiairesMvts = aVAServices.getAllBeneficiairesMvt();
        if (beneficiairesMvts.isEmpty()) {
            return new ResponseEntity<List<BeneficiairesMvt>>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<List<BeneficiairesMvt>>(beneficiairesMvts, HttpStatus.OK);

    }

    // Retrieve single BeneficiairesMvt
    @RequestMapping(value = "/oneBeneficiairesMvt", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<BeneficiairesMvt> oneBeneficiairesMvt(@RequestBody BeneficiairesMvtPK beneficiairesMvtPK) {
        BeneficiairesMvt beneficiairesMvt = aVAServices.getBeneficiairesMvt(beneficiairesMvtPK);
        if (beneficiairesMvt == null) {
            return new ResponseEntity<BeneficiairesMvt>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<BeneficiairesMvt>(beneficiairesMvt, HttpStatus.OK);
    }

    // Update
    @RequestMapping(value = "/updateBeneficiairesMvt", method = RequestMethod.PUT)
    public ResponseEntity<BeneficiairesMvt> updateBeneficiairesMvt(@RequestBody BeneficiairesMvt beneficiairesMvt) {
        BeneficiairesMvt currentBeneficiairesMvt = aVAServices.getBeneficiairesMvt(beneficiairesMvt.getBeneficiairesMvtPK());

        if (currentBeneficiairesMvt == null) {
            System.out.println(" not found");
            return new ResponseEntity<BeneficiairesMvt>(HttpStatus.NOT_FOUND);
        }
        aVAServices.updateBeneficiairesMvt(beneficiairesMvt);
        return new ResponseEntity<BeneficiairesMvt>(beneficiairesMvt, HttpStatus.OK);

    }

//  OperationsDéléguéesMVT
    @RequestMapping(value = "/insertOperationsDelegueesMvt", method = RequestMethod.POST)
    public ResponseEntity<Void> insertOperationsDelegueesMvt(@RequestBody OperationsDelegueesMvt operationsDelegueesMvt) {
        if (aVAServices.getOperationsDelegueesMvt(operationsDelegueesMvt.getOperationsDelegueesMvtPK()) == null) {
            return new ResponseEntity<Void>(HttpStatus.CONFLICT);
        }
        aVAServices.insertOperationsDelegueesMvt(operationsDelegueesMvt);
        return new ResponseEntity<Void>(HttpStatus.CREATED);
    }

    @RequestMapping(value = "/AllOperationsDelegueesMvt", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<OperationsDelegueesMvt>> AllOperationsDelegueesMvt() {
        List<OperationsDelegueesMvt> operationsDelegueesMvt = aVAServices.getAllOperationsDelegueesMvt();
        if (operationsDelegueesMvt.isEmpty()) {
            return new ResponseEntity<List<OperationsDelegueesMvt>>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<List<OperationsDelegueesMvt>>(operationsDelegueesMvt, HttpStatus.OK);
    }

    // Retrieve single OperationsDelegueesMvt
    @RequestMapping(value = "/oneOperationsDelegueesMvt", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<OperationsDelegueesMvt> oneOperationsDelegueesMvt(@RequestBody OperationsDelegueesMvtPK operationsDelegueesMvtPK) {
        OperationsDelegueesMvt operationsDelegueesMvt = aVAServices.getOperationsDelegueesMvt(operationsDelegueesMvtPK);
        if (operationsDelegueesMvt == null) {
            return new ResponseEntity<OperationsDelegueesMvt>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<OperationsDelegueesMvt>(operationsDelegueesMvt, HttpStatus.OK);
    }

    // Update
    @RequestMapping(value = "/updateOperationsDelegueesMvt", method = RequestMethod.PUT)
    public ResponseEntity<OperationsDelegueesMvt> updateOperationsDelegueesMvt(@RequestBody OperationsDelegueesMvt operationsDelegueesMvt) {

        OperationsDelegueesMvt operationsDelegueesMvt1 = aVAServices.getOperationsDelegueesMvt(operationsDelegueesMvt.getOperationsDelegueesMvtPK());

        if (operationsDelegueesMvt1 == null) {
            System.out.println("OperationsDelegueesMvt not found");
            return new ResponseEntity<OperationsDelegueesMvt>(HttpStatus.NOT_FOUND);
        }
        aVAServices.updateOperationsDelegueesMvt(operationsDelegueesMvt);
        return new ResponseEntity<OperationsDelegueesMvt>(operationsDelegueesMvt, HttpStatus.OK);
    }

    // Retrieve single Beneficiaires
    @RequestMapping(value = "/oneBeneficiaires", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Beneficiaires> oneBeneficiaires(BeneficiairesPK beneficiairesPK) {

        Beneficiaires beneficiaires = aVAServices.getBeneficiaires(beneficiairesPK);
        if (beneficiaires == null) {
            return new ResponseEntity<Beneficiaires>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<Beneficiaires>(beneficiaires, HttpStatus.OK);
    }

    @RequestMapping(value = "/AllBeneficiaires", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Beneficiaires>> AllBeneficiaires() {
        List<Beneficiaires> beneficiaires = aVAServices.getAllBeneficiaires();
        if (beneficiaires.isEmpty()) {
            return new ResponseEntity<List<Beneficiaires>>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<List<Beneficiaires>>(beneficiaires, HttpStatus.OK);
    }

    // Retrieve single oneOperationsDeleguees
    @RequestMapping(value = "/oneOperationsDeleguees", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<OperationsDeleguees> oneOperationsDeleguees(@RequestBody OperationsDelegueesPK operationsDelegueesPK) {
        OperationsDeleguees operationsDeleguees = aVAServices.getOperationsDeleguees(operationsDelegueesPK);
        if (operationsDeleguees == null) {
            return new ResponseEntity<OperationsDeleguees>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<OperationsDeleguees>(operationsDeleguees, HttpStatus.OK);
    }

    @RequestMapping(value = "/AllOperationsDeleguees", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<OperationsDeleguees>> AllOperationsDeleguees() {
        List<OperationsDeleguees> operationsDelegueeses = aVAServices.getAllOperationsDeleguees();
        if (operationsDelegueeses.isEmpty()) {
            return new ResponseEntity<List<OperationsDeleguees>>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<List<OperationsDeleguees>>(operationsDelegueeses, HttpStatus.OK);
    }

}
