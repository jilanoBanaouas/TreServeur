package Stb.controller;

import Stb.model.Sec.Client;
import java.util.List;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import java.math.BigInteger;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;
import Stb.services.SecServices;
import org.springframework.security.core.userdetails.UserDetails;

@Controller
@Component
@Transactional("txManagerSec")
@RequestMapping("/sec")
public class SecController {

    @Autowired
    SecServices secServices;
        List<String> abn = null;

    static final Logger logger = Logger.getLogger(SecController.class);

 @RequestMapping(value = "/getclient", method = RequestMethod.GET)
    public @ResponseBody
    Client getClient(@RequestParam("typeP") BigInteger typeP, @RequestParam("login") String login, @RequestParam("pwd") String pwd) {
        Client c = null;
        try {
            c = secServices.getClient(typeP, login, pwd);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return c;
    }

    @RequestMapping(value = "/getclientlogin", method = RequestMethod.GET)
    public @ResponseBody
    Client getClientlogin(@RequestParam("login") String login) {
        Client c = null;
        try {
            c = secServices.getClientlogin(login);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return c;
    }

    @RequestMapping(value = "/getAbonnmentClient", method = RequestMethod.GET)
    public @ResponseBody
    List<String> getAbonnmentClient(@RequestParam("typeP") BigInteger typeP, @RequestParam("login") String login, @RequestParam("pwd") String pwd) {
    

        try {
            abn = secServices.getAbonnmentClient(typeP, login, pwd);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return abn;
    }
    
    @RequestMapping(value = "/getlogin", method = RequestMethod.GET)
    public @ResponseBody
    UserDetails getlogin(@RequestParam("Username") String Username) {
        UserDetails abn = null;

        try {
            abn = secServices.loadUserByUsername(Username);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return abn;
    }
}
