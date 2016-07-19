package Stb.controller;

import Stb.model.Gen.MessageRecus;
import Stb.model.Gen.MswMtxxx;
import Stb.model.Gen.MswNomField;
import Stb.model.Gen.MswRecepMsg;
import Stb.model.Gen.MswUtlField;
import Stb.model.Gen.MswUtlMtxxx;
import Stb.model.Gen.MswUtlSequence;
import Stb.model.Gen.OperationTitre;
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
import javax.validation.Valid;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
@Component
@Transactional("txManagerGen")
@RequestMapping("/gen")
public class GenController {

    @Autowired
    GenServices genServices;

    static final Logger logger = Logger.getLogger(SecController.class);

    //Mtxx
    @RequestMapping(value = "/Listmtxxenvoyes", method = RequestMethod.GET)
    public @ResponseBody
    List<MswUtlMtxxx> Listmtxxenvoyes() {
        List<MswUtlMtxxx> Lmtxenv = null;
        try {
            Lmtxenv = genServices.Listmtxxenvoyes();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return Lmtxenv;
    }

    @RequestMapping(value = "/gettypemtx", method = RequestMethod.GET)
    public @ResponseBody
    MswMtxxx gettypemtx(@RequestParam("mtxxx") String mtxxx) {
        MswMtxxx type = null;
        try {
            type = genServices.gettypemtx(mtxxx);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return type;
    }

    //Sequence
    @RequestMapping(value = "/Listseqs", method = RequestMethod.GET)
    public @ResponseBody
    List<MswUtlSequence> Listseqs(@RequestParam("numero") int numero, @RequestParam("nmesg") String nmesg) {
        List<MswUtlSequence> lseq = null;
        try {
            lseq = genServices.Listseqs(numero, nmesg);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lseq;
    }

    //field  
    @RequestMapping(value = "/allfield", method = RequestMethod.GET, produces = "application/json", headers = "Accept=application/json")
    public @ResponseBody
    List<MswUtlField> allfield(@RequestParam("numero") int numero, @RequestParam("nmesg") String nmesg, @RequestParam("numSequence") int numSequence) {
        List<MswUtlField> lf = null;
        try {
            lf = genServices.allfield(numero, nmesg, numSequence);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lf;
    }

    @RequestMapping(value = "/getfieldbynom", method = RequestMethod.GET)
    public @ResponseBody
    String getfieldbynom(@RequestParam("mtxxx") String mtxxx, @RequestParam("seq") String seq, @RequestParam("field") String field) {
        MswNomField fi = null;
        try {
            fi = genServices.getfieldbynom(mtxxx, seq, field);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return fi.getLibField();
    }
    //Message Recues

    @RequestMapping(value = "/Listmtxxrecues", method = RequestMethod.GET)
    public @ResponseBody
    List<MessageRecus> Listmtxxrecues() {
        List<MessageRecus> Lmtxrecu = null;
        try {
            Lmtxrecu = genServices.Listmtxxrecues();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return Lmtxrecu;
    }

    @RequestMapping(value = "/getdetailR", method = RequestMethod.GET)
    public @ResponseBody
    List<MswRecepMsg> getdetailR(@RequestParam("mtxxx") String mtxxx) {
        List<MswRecepMsg> d = null;
        try {
            d = genServices.getdetailR(mtxxx);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return d;
    }

    /*@RequestMapping(value = "/fieldSw", method = RequestMethod.GET)
    public @ResponseBody
    List<String> fieldSw(@RequestParam("mtxxx") String mtxxx) throws Exception{
        SwiftRecus sr = genServices.getSwiftRecues(mtxxx);
        List<String> f = null;
        List<String> tf = null;
        tf.add("F20");
        f.add(sr.getF20());
        tf.add("F21");
        f.add(sr.getF21());
        tf.add("F225");
        f.add(sr.getF25());
        tf.add("F30");
        f.add(sr.getF30().toString());
        tf.add("F32");
        f.add(sr.getF32Date().toString());
        f.add(sr.getF32Dvs().toString());
        f.add(sr.getF32Mnt().toString());
        f.add(sr.getF33Dvs().toString());
        f.add(sr.getF33Mnt().toString());
        f.add(sr.getF34Date().toString());
        f.add(sr.getF34Dvs().toString());
        f.add(sr.getF34Mnt().toString());
        f.add(sr.getF71());
        f.add(sr.getF73());
        f.add(sr.getF53Bnq().toString());
        f.add(sr.getF53Agc().toString());
        f.add(sr.getF57NumCpt());
        f.add(sr.getF53Nom());
        f.add(sr.getF53Adr1());
        f.add(sr.getF53Adr2());
        f.add(sr.getF57Bnq().toString());
        f.add(sr.getF57Agc().toString());
        f.add(sr.getF57NumCpt());
        f.add(sr.getF57Nom());
        f.add(sr.getF57Adr1());
        f.add(sr.getF57Adr2());
        f.add(sr.getF58Bnq().toString());
        f.add(sr.getF58Agc().toString());
        f.add(sr.getF58NumCpt());
        f.add(sr.getF58Nom());
        f.add(sr.getF58Adr1());
        f.add(sr.getF58Adr2()); 
        f.add(sr.getF72().toString());
        f.add(sr.getF77().toString());
        f.add(sr.getF79().toString());


        
    }*/
    
       
     @RequestMapping(value = "/savetitre", method = RequestMethod.POST)
    public @ResponseBody
    void savetitre(@RequestBody @Valid final OperationTitre p) {
        
       try {
         genServices.savetitre(p);

        } catch (Exception e) {
            e.printStackTrace();
        }
    
}
}
