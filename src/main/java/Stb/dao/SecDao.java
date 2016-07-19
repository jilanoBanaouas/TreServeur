/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stb.dao;

import Stb.model.Sec.Client;
import Stb.model.Sec.Users;
import java.math.BigInteger;
import java.util.List;

/**
 *
 * @author slim
 */
public interface SecDao {

    //client
    public Client getClient(BigInteger typeP, String login, String pwd) throws Exception;

    public Client getClientlogin(String login) throws Exception;

    public List<String> getAbonnmentClient(BigInteger typeP, String login, String pwd) throws Exception;

    void addUser(Users user);

    void editUser(Users user);

    void deleteUser(int userId);

    Users findUser(int userId);

    Users findUserByName(String username);

    List<Users> getAllUsers();
}
