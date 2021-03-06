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
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@RestController
@RequestMapping("/ava")
public class AVAController {

    @Autowired
    AVAServices aVAServices;

    //     Insert BeneficiaresMvt
    @RequestMapping(value = "/insertBeneficairesMvt", method = RequestMethod.POST)
    public ResponseEntity<Void> insertBeneficairesMvt(@RequestBody BeneficiairesMvt beneficiairesMvt) {
        BeneficiairesMvt testExistance = aVAServices.getBeneficiairesMvt(beneficiairesMvt.getBeneficiairesMvtPK());
        if (testExistance != null) {
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

    // Retrieve single Beneficiaires
    @RequestMapping(value = "/oneBeneficiaires/{numDossier},{dateDossier},{codeTypeDos},{noPieceBenef}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Beneficiaires> oneBeneficiaires(
            @PathVariable("numDossier") int numDossier,
            @PathVariable("dateDossier") String dateDossier,
            @PathVariable("codeTypeDos") short codeTypeDos,
            @PathVariable("noPieceBenef") String noPieceBenef) {
        BeneficiairesPK beneficiairesPk = new BeneficiairesPK();
        beneficiairesPk.setCodeTypeDos(codeTypeDos);
        beneficiairesPk.setNoPieceBenef(noPieceBenef);
        beneficiairesPk.setNumDossier(numDossier);

        try {
            SimpleDateFormat pattern = new SimpleDateFormat("yyyy-MM-dd");
            Date date = pattern.parse(dateDossier);

            beneficiairesPk.setDateDossier(date);

        } catch (ParseException ex) {
            Logger.getLogger(AVAController.class.getName()).log(Level.SEVERE, null, ex);
            ex.printStackTrace();
        }
        Beneficiaires beneficiaires = aVAServices.getBeneficiaires(beneficiairesPk);
        if (beneficiaires == null) {
            return new ResponseEntity<Beneficiaires>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<Beneficiaires>(beneficiaires, HttpStatus.OK);
    }

    // Retrieve single oneOperationsDeleguees
    @RequestMapping(value = "/oneOperationsDeleguees/{numDossier},{dateDossier},{codeAgenceAva}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<OperationsDeleguees> oneOperationsDeleguees(
            @PathVariable("numDossier") long numDossier,
            @PathVariable("dateDossier") String dateDossier,
            @PathVariable("codeAgenceAva") short codeAgenceAva
    ) {
        OperationsDelegueesPK operationsDelegueesPK = new OperationsDelegueesPK();
        operationsDelegueesPK.setCodeAgenceAva(codeAgenceAva);
        operationsDelegueesPK.setNumDossier(numDossier);

        try {
            SimpleDateFormat pattern = new SimpleDateFormat("yyyy-MM-dd");
            Date date = pattern.parse(dateDossier);
            operationsDelegueesPK.setDateDossier(date);

        } catch (ParseException ex) {
            Logger.getLogger(AVAController.class.getName()).log(Level.SEVERE, null, ex);
            ex.printStackTrace();
        }

        OperationsDeleguees operationsDeleguees = aVAServices.getOperationsDeleguees(operationsDelegueesPK);
        if (operationsDeleguees == null) {
            return new ResponseEntity<OperationsDeleguees>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<OperationsDeleguees>(operationsDeleguees, HttpStatus.OK);
    }

    // Retrieve single BeneficiairesMvt
    @RequestMapping(value = "/oneBeneficiairesMvt/{codeProduitService},{codeOoneBenperation},{refOperation},{dateOperation},{uniteOperation},{noPieceBenef}",
            method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<BeneficiairesMvt> oneBeneficiairesMvt(
            @PathVariable("codeProduitService") short codeProduitService,
            @PathVariable("codeOperation") short codeOperation,
            @PathVariable("refOperation") long refOperation,
            @PathVariable("dateOperation") String dateOperation,
            @PathVariable("uniteOperation") short uniteOperation,
            @PathVariable("noPieceBenef") String noPieceBenef
    ) {

        BeneficiairesMvtPK beneficiairesMvtPK = new BeneficiairesMvtPK();
        beneficiairesMvtPK.setCodeOperation(codeOperation);
        beneficiairesMvtPK.setCodeProduitService(codeProduitService);

        try {
            SimpleDateFormat pattern = new SimpleDateFormat("yyyy-MM-dd");
            Date date = pattern.parse(dateOperation);

            beneficiairesMvtPK.setDateOperation(date);

        } catch (ParseException ex) {
            Logger.getLogger(AVAController.class.getName()).log(Level.SEVERE, null, ex);
            ex.printStackTrace();
        }

        beneficiairesMvtPK.setNoPieceBenef(noPieceBenef);
        beneficiairesMvtPK.setRefOperation(refOperation);
        beneficiairesMvtPK.setUniteOperation(uniteOperation);

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
            return new ResponseEntity<BeneficiairesMvt>(HttpStatus.NOT_FOUND);
        }
        aVAServices.updateBeneficiairesMvt(beneficiairesMvt);
        System.out.println("update f�");
        return new ResponseEntity<BeneficiairesMvt>(beneficiairesMvt, HttpStatus.OK);

    }
//
////  OperationsD�l�gu�esMVT

    @RequestMapping(value = "/insertOperationsDelegueesMvt", method = RequestMethod.POST)
    public ResponseEntity<Void> insertOperationsDelegueesMvt(@RequestBody OperationsDelegueesMvt operationsDelegueesMvt) {
        if (aVAServices.getOperationsDelegueesMvt(operationsDelegueesMvt.getOperationsDelegueesMvtPK()) != null) {
            return new ResponseEntity<Void>(HttpStatus.CONFLICT);
        }
        aVAServices.insertOperationsDelegueesMvt(operationsDelegueesMvt);
        return new ResponseEntity<Void>(HttpStatus.CREATED);
    }

    @RequestMapping(value = "/insertMultiple", method = RequestMethod.POST)
    public ResponseEntity<Void> insertMultiple(@RequestBody OperationDelMVTAndListBenifMVT operationDelMVTAndListBenifMVT) {

        if (aVAServices.getOperationsDelegueesMvt(operationDelMVTAndListBenifMVT.getOperationsDelegueesMvt().getOperationsDelegueesMvtPK()) != null) {
            return new ResponseEntity<Void>(HttpStatus.CONFLICT);
        }

        aVAServices.insertOperationsDelegueesMvt(operationDelMVTAndListBenifMVT.getOperationsDelegueesMvt());
        aVAServices.insertListBeneficairesMvt(operationDelMVTAndListBenifMVT.getBeneficiairesMvts());

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
    @RequestMapping(value = "/oneOperationsDelegueesMvt/{codeProduitService},{codeOperation},{refOperation},{dateOperation},{uniteOperation}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<OperationsDelegueesMvt> oneOperationsDelegueesMvt(
            @PathVariable("codeProduitService") short codeProduitService,
            @PathVariable("codeOperation") int codeOperation,
            @PathVariable("refOperation") long refOperation,
            @PathVariable("dateOperation") String dateOperation,
            @PathVariable("uniteOperation") short uniteOperation
    ) {
        OperationsDelegueesMvtPK opDelMvtPK = new OperationsDelegueesMvtPK();
        opDelMvtPK.setCodeOperation(codeOperation);
        opDelMvtPK.setCodeProduitService(codeProduitService);

        try {
            SimpleDateFormat pattern = new SimpleDateFormat("yyyy-MM-dd");
            Date date = pattern.parse(dateOperation);
            opDelMvtPK.setDateOperation(date);
        } catch (ParseException ex) {
            Logger.getLogger(AVAController.class.getName()).log(Level.SEVERE, null, ex);
            ex.printStackTrace();
        }

        opDelMvtPK.setUniteOperation(uniteOperation);
        opDelMvtPK.setRefOperation(refOperation);
        OperationsDelegueesMvt operationsDelegueesMvt = aVAServices.getOperationsDelegueesMvt(opDelMvtPK);
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

    @RequestMapping(value = "/AllBeneficiaires", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Beneficiaires>> AllBeneficiaires() {
        List<Beneficiaires> beneficiaires = aVAServices.getAllBeneficiaires();
        if (beneficiaires.isEmpty()) {
            return new ResponseEntity<List<Beneficiaires>>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<List<Beneficiaires>>(beneficiaires, HttpStatus.OK);
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
