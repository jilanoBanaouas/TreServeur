//package Stb.controller;
//
//import Stb.model.Domi.Apurement;
//import Stb.model.Domi.AvoirTitre;
//import Stb.model.Domi.DetailDom;
//import Stb.model.Domi.EmargementImputationTitre;
//import Stb.model.Domi.EmargementReglementTitre;
//import Stb.model.Domi.ImageDepotDomiciliation;
//import Stb.model.Domi.ImageDepotDomiciliationPK;
//import Stb.model.Domi.StatCaParMois;
//import Stb.model.Domi.VueTimeline;
//import Stb.services.DomiServices;
//import java.math.BigDecimal;
//import java.text.SimpleDateFormat;
//import java.util.Date;
//import java.util.List;
//
//import javax.ws.rs.core.MediaType;
//import org.apache.log4j.Logger;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.ResponseBody;
//import org.springframework.transaction.annotation.Transactional;
//import org.springframework.stereotype.Component;
//import org.springframework.web.bind.annotation.RequestParam;
//
//@Controller
//@Component
//@Transactional("txManagerdomi")
//@RequestMapping("/domi")
//public class DomiController {
//
//    @Autowired
//    DomiServices domiServices;
//
//    static final Logger logger = Logger.getLogger(SecController.class);
//
//    @RequestMapping(value = "/allImageDepotDomiciliation", method = RequestMethod.GET)
//    //@RequestMapping(value = "/ListimddNA", method = RequestMethod.GET)
//    public @ResponseBody
//    List<ImageDepotDomiciliation> allImageDepotDomiciliation(@RequestParam("login") String login) {
//        List<ImageDepotDomiciliation> lid = null;
//        try {
//            lid = domiServices.allImageDepotDomiciliation(login);
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return lid;
//    }
//
//    @RequestMapping(value = "/allImageDepotDomiciliationNA", method = RequestMethod.GET)
//    public @ResponseBody
//    List<ImageDepotDomiciliation> allImageDepotDomiciliationNA(@RequestParam("login") String login) {
//        List<ImageDepotDomiciliation> lid = null;
//        try {
//            lid = domiServices.allImageDepotDomiciliationNA(login);
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return lid;
//    }
//
//    @RequestMapping(value = "/allImageDepotDomiciliationApkPos", method = RequestMethod.GET)
//    public @ResponseBody
//    List<ImageDepotDomiciliation> allImageDepotDomiciliationApkPos(@RequestParam("login") String login) {
//        List<ImageDepotDomiciliation> lid = null;
//        try {
//            lid = domiServices.allImageDepotDomiciliationApkPos(login);
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return lid;
//    }
//
//    @RequestMapping(value = "/oneImageDepotDomiciliation", method = RequestMethod.GET, produces = "application/json", headers = "Accept=application/json")
//    public @ResponseBody
//    ImageDepotDomiciliation oneImageDepotDomiciliation(@RequestParam("codeTitre") Integer codeTitre, @RequestParam("numDom") Integer numDom, @RequestParam("dateDom") String dateDom) {
//        ImageDepotDomiciliation id = null;
//        try {
//            id = domiServices.oneImageDepotDomiciliation(codeTitre, numDom, dateDom);
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return id;
//    }
//
//    @RequestMapping(value = "/allEmargementReglementTitre", method = RequestMethod.GET)
//    public @ResponseBody
//    List<EmargementReglementTitre> allEmargementReglementTitre(@RequestParam("codeTitre") Short codeTitre, @RequestParam("numDom") int numDom, @RequestParam("dateDom") String dateDom) {
//        List<EmargementReglementTitre> id = null;
//        try {
//            id = domiServices.allEmargementReglementTitre(codeTitre, numDom, dateDom);
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return id;
//    }
//
//    @RequestMapping(value = "/sommeEmargementReglementTitreTnd", method = RequestMethod.GET)
//    public @ResponseBody
//    BigDecimal sommeEmargementReglementTitreTnd(@RequestParam("codeTitre") Short codeTitre, @RequestParam("numDom") Integer numDom, @RequestParam("dateDom") String dateDom) {
//        BigDecimal id = null;
//        try {
//            id = domiServices.sommeEmargementReglementTitreTnd(codeTitre, numDom, dateDom);
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return id;
//    }
//
//    @RequestMapping(value = "/sommeEmargementReglementTitreDvs", method = RequestMethod.GET)
//    public @ResponseBody
//    BigDecimal sommeEmargementReglementTitreDvs(@RequestParam("codeTitre") Short codeTitre, @RequestParam("numDom") int numDom, @RequestParam("dateDom") String dateDom) {
//        BigDecimal id = null;
//        try {
//            id = domiServices.sommeEmargementReglementTitreDvs(codeTitre, numDom, dateDom);
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return id;
//    }
//
//    @RequestMapping(value = "/allEmargementImputationTitre", method = RequestMethod.GET)
//    public @ResponseBody
//    List<EmargementImputationTitre> allEmargementImputationTitre(@RequestParam("codeTitre") Short codeTitre, @RequestParam("numDom") int numDom, @RequestParam("dateDom") String dateDom) {
//        List<EmargementImputationTitre> id = null;
//        try {
//            id = domiServices.allEmargementImputationTitre(codeTitre, numDom, dateDom);
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return id;
//    }
//
//    @RequestMapping(value = "/sommeEmargementImputationTitreTnd", method = RequestMethod.GET)
//    public @ResponseBody
//    BigDecimal sommeEmargementImputationTitreTnd(@RequestParam("codeTitre") Short codeTitre, @RequestParam("numDom") Integer numDom, @RequestParam("dateDom") String dateDom) {
//        BigDecimal id = null;
//        try {
//            id = domiServices.sommeEmargementImputationTitreTnd(codeTitre, numDom, dateDom);
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return id;
//    }
//
//    @RequestMapping(value = "/sommeEmargementImputationTitreDvs", method = RequestMethod.GET)
//    public @ResponseBody
//    BigDecimal sommeEmargementImputationTitreDvs(@RequestParam("codeTitre") Short codeTitre, @RequestParam("numDom") Integer numDom, @RequestParam("dateDom") String dateDom) {
//        BigDecimal id = null;
//        try {
//            id = domiServices.sommeEmargementImputationTitreDvs(codeTitre, numDom, dateDom);
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return id;
//    }
//
//    @RequestMapping(value = "/allAvoirTitre", method = RequestMethod.GET)
//    public @ResponseBody
//    List<AvoirTitre> allAvoirTitre(@RequestParam("codeTitre") Integer codeTitre, @RequestParam("numDom") Integer numDom, @RequestParam("dateDom") String dateDom) {
//        List<AvoirTitre> id = null;
//        try {
//            id = domiServices.allAvoirTitre(codeTitre, numDom, dateDom);
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return id;
//    }
//
//    @RequestMapping(value = "/sommeAvoirTitreTnd", method = RequestMethod.GET)
//    public @ResponseBody
//    BigDecimal sommeAvoirTitreTnd(@RequestParam("codeTitre") Integer codeTitre, @RequestParam("numDom") Integer numDom, @RequestParam("dateDom") String dateDom) {
//        BigDecimal id = null;
//        try {
//            id = domiServices.sommeAvoirTitreTnd(codeTitre, numDom, dateDom);
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return id;
//    }
//
//    @RequestMapping(value = "/sommeAvoirTitreDvs", method = RequestMethod.GET)
//    public @ResponseBody
//    BigDecimal sommeAvoirTitreDvs(@RequestParam("codeTitre") Integer codeTitre, @RequestParam("numDom") Integer numDom, @RequestParam("dateDom") String dateDom) {
//        BigDecimal id = null;
//        try {
//            id = domiServices.sommeAvoirTitreDvs(codeTitre, numDom, dateDom);
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return id;
//    }
//
//    @RequestMapping(value = "/allVueTimeline", method = RequestMethod.GET)
//    public @ResponseBody
//    List<VueTimeline> allVueTimeline(@RequestParam("codeTitre") Integer codeTitre, @RequestParam("numDom") Integer numDom, @RequestParam("dateDom") String dateDom) {
//        List<VueTimeline> id = null;
//        try {
//            id = domiServices.allVueTimeline(codeTitre, numDom, dateDom);
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return id;
//    }
//
//    @RequestMapping(value = "/getLibApurement", method = RequestMethod.GET)
//    public @ResponseBody
//    String getLibApurement(@RequestParam("codeApurement") int codeApurement, @RequestParam("natureTitre") int natureTitre) {
//        String id = null;
//        try {
//            id = domiServices.libelleApurement(codeApurement, natureTitre);
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return id;
//    }
//
//    @RequestMapping(value = "/getLibApurement2", method = RequestMethod.GET)
//    public @ResponseBody
//    String getLibApurement2(@RequestParam("codeApurement") int codeApurement, @RequestParam("natureTitre") int natureTitre) {
//        String id = null;
//        try {
//            id = domiServices.libelleApurement2(codeApurement, natureTitre);
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return id;
//    }
//
//    @RequestMapping(value = "/statCaParDvsMois", method = RequestMethod.GET)
//    public @ResponseBody
//    List<StatCaParMois> statCaParDvsMois(@RequestParam("login") String login, @RequestParam("dateD") String dateD, @RequestParam("dateF") String dateF) {
//        List<StatCaParMois> id = null;
//        try {
//            id = domiServices.statCaParDvsMois(login, dateD, dateF);
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return id;
//    }
//
//    @RequestMapping(value = "/statCaParTndMois", method = RequestMethod.GET)
//    public @ResponseBody
//    List<StatCaParMois> statCaParTndMois(@RequestParam("login") String login, @RequestParam("dateD") String dateD, @RequestParam("dateF") String dateF) {
//        List<StatCaParMois> id = null;
//        try {
//            id = domiServices.statCaParTndMois(login, dateD, dateF);
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return id;
//    }
//
//    @RequestMapping(value = "/statNbrParDvsMois", method = RequestMethod.GET)
//    public @ResponseBody
//    List<StatCaParMois> statNbrParDvsMois(@RequestParam("login") String login, @RequestParam("dateD") String dateD, @RequestParam("dateF") String dateF) {
//        List<StatCaParMois> id = null;
//        try {
//            id = domiServices.statNbrParDvsMois(login, dateD, dateF);
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return id;
//    }
//
//    @RequestMapping(value = "/statNbrParTndMois", method = RequestMethod.GET,produces =  MediaType.APPLICATION_JSON)
//    public @ResponseBody
//    List<StatCaParMois> statNbrParTndMois(@RequestParam("login") String login, @RequestParam("dateD") String dateD, @RequestParam("dateF") String dateF) {
//        List<StatCaParMois> id = null;
//        try {
//            id = domiServices.statNbrParTndMois(login, dateD, dateF);
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return id;
//    }
//
//    //à finaliser
//    @RequestMapping(value = "/addImageDepotDomiciliation", method = RequestMethod.GET)
//    public @ResponseBody
//    ImageDepotDomiciliationPK addImageDepotDomiciliation(@RequestParam("refContrat") int refContrat, @RequestParam("uniteContrat") int uniteContrat, @RequestParam("dateContrat") String dateContrat) {
//
//        ImageDepotDomiciliationPK id = null;
//        try {
//            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//            Date dateContratDate = sdf.parse(dateContrat);
//            id = domiServices.addImageDepotDomiciliation(new ImageDepotDomiciliation(refContrat, uniteContrat, dateContratDate));
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return id;
//    }
//    
//    
//    @RequestMapping(value = "/getApurement", method = RequestMethod.GET)
//    public @ResponseBody
//    Apurement getApurement(@RequestParam("codeApurement") int codeApurement) {
//
//        Apurement ap = null;
//        try {
//            ap = domiServices.getApurement(codeApurement);
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return ap;
//    }
//    
//     @RequestMapping(value = "/Listeidd", method = RequestMethod.GET)
//      public @ResponseBody
//      List<DetailDom> Listeidd(
//              @RequestParam("login") String login,
//              @RequestParam("devise")int devise,
//              @RequestParam("titre")int titre,
//              @RequestParam("datedebDomi") String datedebDomi,
//              @RequestParam("datefinDomi")String datefinDomi,
//              @RequestParam("etatDomi")  String etatDomi, 
//              @RequestParam("datedebApur")String datedebApur,@RequestParam("datefinApur")String datefinApur,
//              @RequestParam("etatApur") String etatApur){
//        List<DetailDom> img = null;
//        try {
//            img = domiServices.Listeidd(login, devise, titre, datedebDomi, datefinDomi, etatDomi, datedebApur, datefinApur, etatApur);
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return img;
//    
//}
//}
//
