package Stb.controller;

//import Stb.model.Ref.CoursJoursDeviseBb;
//import Stb.model.Ref.ModeDeLivraison;
//import Stb.model.Ref.ModeDeReglement;
import Stb.model.Ref.Activite;
import Stb.model.Ref.Agence;
import Stb.model.Ref.Devise;
import Stb.model.Ref.Pays;
import Stb.model.Ref.TPiece;
import Stb.model.Ref.TypeDossierAva;
import Stb.services.RefServices;
import java.util.List;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

@Transactional("txManagerRef")
@RequestMapping("/ref")
public class RefController {

    @Autowired
    RefServices refServices;

   

    //Retrive the name of the banque with id
    @RequestMapping(value = "/oneBanque", method = RequestMethod.GET, produces = "text/plain")
    public String oneBanque(@RequestParam(value = "codeBanque") Short codeBanque) {
        String libB = null;
        try {
            libB = refServices.oneBanque(codeBanque);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return libB;
    }

    //Retrive the name of the agence with codeAgenceBct
    @RequestMapping(value = "/oneAgence", method = RequestMethod.GET, produces = "text/plain")
    String oneAgence(@RequestParam(value = "codeAgenceBct") Short codeAgenceBct, @RequestParam(value = "codeBanque") Short codeBanque) {
        String liba = null;
        try {
            liba = refServices.oneAgence(codeAgenceBct, codeBanque);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return liba;

    }

//    @RequestMapping(value = "/oneBanqueEtr", method = RequestMethod.GET)
//    public @ResponseBody
//    String oneBanqueEtr(@RequestParam(value = "codeBnqEtr") int codeBnqEtr) {
//        String libB = null;
//        try {
//
//            libB = refServices.oneBanqueEtr(codeBnqEtr);
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return libB;
//    }
//
//    @RequestMapping(value = "/oneAgenceEtr", method = RequestMethod.GET)
//    public @ResponseBody
//    String oneAgenceEtr(@RequestParam(value = "codeAgenceEtr") int codeAgenceEtr, @RequestParam(value = "codeBnqEtr") int codeBnqEtr) {
//        String liba = null;
//        try {
//
//            liba = refServices.oneAgenceEtr(codeAgenceEtr, codeBnqEtr);
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return liba;
//    }
    //Retrive all devise
    @RequestMapping(value = "/allDevise", method = RequestMethod.GET)
    public List<Devise> allDevise() {
        List<Devise> Ldev = null;
        try {
            Ldev = refServices.allDevise();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Ldev;
    }

    @RequestMapping(value = "/sigleDevise", method = RequestMethod.GET, produces = "text/plain")
    Devise sigleDevise(@RequestParam(value = "codeDevise") Integer codeDevise) {
        Devise d = null;
        try {
            d = refServices.sigleDevise(codeDevise);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return d;

    }

    @RequestMapping(value = "/allPays", method = RequestMethod.GET)
    public List<Pays> allPays() {
        List<Pays> Lpays = null;
        try {
            Lpays = refServices.allPays();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return Lpays;
    }

//    @RequestMapping(value = "/oneModeReglement", method = RequestMethod.GET)
//    public @ResponseBody
//    ModeDeReglement oneModeReglement(@RequestParam(value = "codeModReg") Integer codeModReg) {
//        ModeDeReglement mreg = null;
//        try {
//            mreg = refServices.oneModeReglement(codeModReg);
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return mreg;
//    }
//    @RequestMapping(value = "/allModeLivraison", method = RequestMethod.GET)
//    public @ResponseBody
//    List<ModeDeLivraison> allModeLivraison() {
//        List<ModeDeLivraison> Lml = null;
//        try {
//            Lml = refServices.allModeLivraison();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return Lml;
//    }
//    @RequestMapping(value = "/oneModeLivraison", method = RequestMethod.GET)
//    public @ResponseBody
//    ModeDeLivraison oneModeLivraison(@RequestParam(value = "codeModLiv") Integer codeModLiv) {
//        ModeDeLivraison ml = null;
//        try {
//            ml = refServices.oneModeLivraison(codeModLiv);
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return ml;
//    }
//
//    @RequestMapping(value = "/coursJourDevise", method = RequestMethod.GET)
//    public @ResponseBody
//    CoursJoursDeviseBb coursJourDevise(@RequestParam(value = "codeDevise") Short codeDevise) {
//        CoursJoursDeviseBb cjbb = null;
//        try {
//            cjbb = refServices.coursJourDevise(codeDevise);
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return cjbb;
//    }
    //nouveaux services (JSON)
    @RequestMapping(value = "/allActivite", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Activite>> allActivite() {

        List<Activite> activites = refServices.getAllActivite();
        if (activites.isEmpty()) {
            return new ResponseEntity<List<Activite>>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<List<Activite>>(activites, HttpStatus.OK);
    }

    // Retrieve single activite
    @RequestMapping(value = "/oneActivite", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Activite> getActivite(@RequestParam(value = "codeActivite") Integer codeActivite) {
        Activite activite = refServices.getActivite(codeActivite);
        if (activite == null) {
            return new ResponseEntity<Activite>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<Activite>(activite, HttpStatus.OK);
    }

    // Retrieve all Agence
    @RequestMapping(value = "/allAgence", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Agence>> allAgence() {
        List<Agence> agences = refServices.getAllAgence();
        if (agences.isEmpty()) {
            return new ResponseEntity<List<Agence>>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<List<Agence>>(agences, HttpStatus.OK);
    }

// Retrieve single Agence
    @RequestMapping(value = "/oneAgence", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Agence> oneAgence(@RequestParam(value = "codeBanque") short codeBanque, @RequestParam(value = "codeAgenceBct") short codeAgenceBct) {
        Agence agence = refServices.getAgence(codeBanque, codeAgenceBct);
        if (agence == null) {
            return new ResponseEntity<Agence>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<Agence>(agence, HttpStatus.OK);
    }

// Retrieve all TPiece
    @RequestMapping(value = "/allTPiece", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<TPiece>> allTPiece() {
        List<TPiece> tpieces = refServices.getAllTPiece();
        if (tpieces.isEmpty()) {
            return new ResponseEntity<List<TPiece>>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<List<TPiece>>(tpieces, HttpStatus.OK);
    }
    // Retrieve single TPiece  

    @RequestMapping(value = "/oneTPiece", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<TPiece> oneTPiece(@RequestParam(value = "codeTypePiece") Short codeTypePiece) {
        TPiece activite = refServices.getTPiece(codeTypePiece);
        if (activite == null) {
            return new ResponseEntity<TPiece>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<TPiece>(activite, HttpStatus.OK);
    }

// Retrieve all TypeDossierAva
    @RequestMapping(value = "/allTypeDossierAva", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<TypeDossierAva>> allTypeDossierAva() {
        List<TypeDossierAva> typesdossier = refServices.getAllTypeDossierAva();
        if (typesdossier.isEmpty()) {
            return new ResponseEntity<List<TypeDossierAva>>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<List<TypeDossierAva>>(typesdossier, HttpStatus.OK);
    }
// Retrieve single TypeDossierAva

    @RequestMapping(value = "/oneTypeDossierAva", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<TypeDossierAva> oneTypeDossierAva(@RequestParam(value = "codeTypeDosAva") Short codeTypeDosAva) {
        TypeDossierAva typeDosAva = refServices.getTypeDossierAva(codeTypeDosAva);
        if (typeDosAva == null) {
            return new ResponseEntity<TypeDossierAva>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<TypeDossierAva>(typeDosAva, HttpStatus.OK);
    }

}
