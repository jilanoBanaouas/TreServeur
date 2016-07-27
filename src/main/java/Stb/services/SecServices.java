//package Stb.services;
//
//import Stb.model.Sec.Client;
//import java.math.BigInteger;
//import java.util.List;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//
//public interface SecServices {
//    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException;
//
//    public Client getClient(BigInteger typeP, String login, String pwd) throws Exception;
//
//    public Client getClientlogin(String login) throws Exception;
//
//    public List<String> getAbonnmentClient(BigInteger typeP, String login, String pwd) throws Exception;
//}