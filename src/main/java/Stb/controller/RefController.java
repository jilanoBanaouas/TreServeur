package Stb.controller;

import Stb.model.Ref.CoursJoursDeviseBb;
import Stb.model.Ref.Devise;
import Stb.model.Ref.ModeDeLivraison;
import Stb.model.Ref.ModeDeReglement;
import Stb.model.Ref.Pays;
import Stb.services.RefServices;
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

@Controller
@Component
@Transactional("txManagerRef")
@RequestMapping("/ref")
public class RefController {

    @Autowired
    RefServices refServices;

    static final Logger logger = Logger.getLogger(SecController.class);

    @RequestMapping(value = "/oneBanque", method = RequestMethod.GET)
    public @ResponseBody
    String oneBanque(@RequestParam(value = "codeBanque") Short codeBanque) {
        String libB = null;
        try {

            libB = refServices.oneBanque(codeBanque);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return libB;
    }

    @RequestMapping(value = "/oneAgence", method = RequestMethod.GET)
    public @ResponseBody
    String oneAgence(@RequestParam(value = "codeAgenceBct") Short codeAgenceBct, @RequestParam(value = "codeBanque") Short codeBanque) {
        String liba = null;
        try {

            liba = refServices.oneAgence(codeAgenceBct, codeBanque);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return liba;
    }

    @RequestMapping(value = "/oneBanqueEtr", method = RequestMethod.GET)
    public @ResponseBody
    String oneBanqueEtr(@RequestParam(value = "codeBnqEtr") int codeBnqEtr) {
        String libB = null;
        try {

            libB = refServices.oneBanqueEtr(codeBnqEtr);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return libB;
    }

    @RequestMapping(value = "/oneAgenceEtr", method = RequestMethod.GET)
    public @ResponseBody
    String oneAgenceEtr(@RequestParam(value = "codeAgenceEtr") int codeAgenceEtr, @RequestParam(value = "codeBnqEtr") int codeBnqEtr) {
        String liba = null;
        try {

            liba = refServices.oneAgenceEtr(codeAgenceEtr, codeBnqEtr);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return liba;
    }

    @RequestMapping(value = "/allDevise", method = RequestMethod.GET)
    public @ResponseBody
    List<Devise> allDevise() {
        List<Devise> Ldev = null;
        try {
            Ldev = refServices.allDevise();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return Ldev;
    }

    @RequestMapping(value = "/sigleDevise", method = RequestMethod.GET)
    public @ResponseBody
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
    public @ResponseBody
    List<Pays> allPays() {
        List<Pays> Lpays = null;
        try {
            Lpays = refServices.allPays();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return Lpays;
    }

    @RequestMapping(value = "/oneModeReglement", method = RequestMethod.GET)
    public @ResponseBody
    ModeDeReglement oneModeReglement(@RequestParam(value = "codeModReg") Integer codeModReg) {
        ModeDeReglement mreg = null;
        try {
            mreg = refServices.oneModeReglement(codeModReg);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return mreg;
    }

    @RequestMapping(value = "/allModeLivraison", method = RequestMethod.GET)
    public @ResponseBody
    List<ModeDeLivraison> allModeLivraison() {
        List<ModeDeLivraison> Lml = null;
        try {
            Lml = refServices.allModeLivraison();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Lml;
    }

    @RequestMapping(value = "/oneModeLivraison", method = RequestMethod.GET)
    public @ResponseBody
    ModeDeLivraison oneModeLivraison(@RequestParam(value = "codeModLiv") Integer codeModLiv) {
        ModeDeLivraison ml = null;
        try {
            ml = refServices.oneModeLivraison(codeModLiv);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return ml;
    }

    @RequestMapping(value = "/coursJourDevise", method = RequestMethod.GET)
    public @ResponseBody
    CoursJoursDeviseBb coursJourDevise(@RequestParam(value = "codeDevise") Short codeDevise) {
        CoursJoursDeviseBb cjbb = null;
        try {
            cjbb = refServices.coursJourDevise(codeDevise);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return cjbb;
    }
}
