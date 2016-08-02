package Stb.controller;


import Stb.model.Gen.Documents;
import Stb.model.Gen.DocumentsPK;
import Stb.model.ava.BeneficiairesMvt;
import Stb.model.ava.BeneficiairesMvtPK;
import java.util.List;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;
import Stb.services.GenServices;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import javax.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/gen")
public class GenController {

    @Autowired
    GenServices genServices;

  @RequestMapping(value = "/insertDocuments", method = RequestMethod.POST)
    public ResponseEntity<Void> insertDocuments(@RequestBody Documents documents) {
       Documents testExistance=genServices.getDocuments(documents.getDocumentsPK());
        if (testExistance != null ) {
            return new ResponseEntity<Void>(HttpStatus.CONFLICT);
        }
        genServices.insertDocuments(documents);
        return new ResponseEntity<Void>(HttpStatus.CREATED);
    }
    
    @RequestMapping(value = "/AllDocuments", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Documents>> AllDocuments() {
        List<Documents> documents = genServices.getAllDocuments();
        if (documents.isEmpty()) {
            return new ResponseEntity<List<Documents>>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<List<Documents>>(documents, HttpStatus.OK);
    }
    
       @RequestMapping(value = "/updateDocuments", method = RequestMethod.PUT)
    public ResponseEntity<Documents> updateDocuments(@RequestBody Documents documents) {
        Documents currentDocuments = genServices.getDocuments(documents.getDocumentsPK());
        if (currentDocuments == null) {
            return new ResponseEntity<Documents>(HttpStatus.NOT_FOUND);
        }
        genServices.updateDocuments(documents);
        
        return new ResponseEntity<Documents>(documents, HttpStatus.OK);
        
    }
    
     @RequestMapping(value = "/oneDocuments/{typeDossier},{numDossier},{dateDossier},{numLigne}",
            method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Documents> oneBeneficiairesMvt(
            @PathVariable("typeDossier") String typeDossier,
            @PathVariable("numDossier") long numDossier,
            @PathVariable("dateDossier") String dateDossier,
            @PathVariable("numLigne") short numLigne
    ) {
  
        DocumentsPK documentsPK = new DocumentsPK();
        
        documentsPK.setNumDossier(numDossier);
        documentsPK.setNumLigne(numLigne);
        documentsPK.setTypeDossier(typeDossier);
        

        SimpleDateFormat pattern=new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date date=pattern.parse(dateDossier);
        documentsPK.setDateDossier(date);
        } catch (ParseException ex) {
            java.util.logging.Logger.getLogger(AVAController.class.getName()).log(Level.SEVERE, null, ex);
            ex.printStackTrace();
        }
       
        Documents documents = genServices.getDocuments(documentsPK);
 
          
        if (documents == null) {
            return new ResponseEntity<Documents>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<Documents>(documents, HttpStatus.OK);
    }
}
