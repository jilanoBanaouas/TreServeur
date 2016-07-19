/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stb.dao;

import Stb.model.Sec.Abonnement;
import Stb.model.Sec.Client;
import Stb.model.Sec.Users;
import java.math.BigInteger;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 *
 * @author slim
 */
public class SecDaoImpl implements SecDao {

    @Autowired
    @Qualifier("sessionFactorySec")
    private SessionFactory sessionFactory;

    private Session session3;

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
        session3 = sessionFactory.openSession();
    }

    @Override
    public Client getClient(BigInteger typeP, String login, String pwd) throws Exception {
        session3 = sessionFactory.openSession();
        Query query = session3.createQuery("from Client c where c.clientPK.typePiecePersonne = :typeP and c.clientPK.noPiecePersonne = :login and c.password = :pwd");
        query.setParameter("typeP", typeP);
        query.setParameter("login", login);
        query.setParameter("pwd", pwd);
        Client c = (Client) query.uniqueResult();
        return c;
    }

    @Override
    public Client getClientlogin(String login) throws Exception {

        session3 = sessionFactory.openSession();
        Query query = session3.createQuery("from Client c where c.clientPK.noPiecePersonne = :login");
        query.setParameter("login", login);
        Client c = (Client) query.uniqueResult();
        return c;
    }

    @Override
    public List<String> getAbonnmentClient(BigInteger typeP, String login, String pwd) throws Exception {
        session3 = sessionFactory.openSession();
        Client c = getClient(typeP, login, pwd);
        List<String> abn = new ArrayList<String>();
        if (c != null) {
            System.out.println("voila");
            Query query = session3.createQuery("SELECT a FROM Abonnement a WHERE a.abonnementPK.noPiecePersonne = :np");
            query.setParameter("np", login);
            List<Abonnement> lab = query.list();
            System.out.println(lab.toString() + " " + lab.size());
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            Date date = new Date();
            String datee = dateFormat.format(date);
            Date dateee = dateFormat.parse(datee);
            for (int k = 0; k < lab.size(); k++) {
                System.out.println(lab.toString());
                String datee1 = dateFormat.format(lab.get(k).getDateFin());
                Date dateee1 = dateFormat.parse(datee1);
                
                if (dateee.after(dateee1)) {
                    String code = String.valueOf(lab.get(k).getAbonnementPK().getCodeProduitService());
                    
                    abn.add(code);

                }
            }
            System.out.println(abn.toString() + " sizeee");
        }
        return abn;

    }

    @Override
    public void addUser(Users user) {
        Session session = sessionFactory.openSession();
        session.save(user);
    }

    @Override
    public void editUser(Users user) {
        Session session = sessionFactory.openSession();
        session.update(user);
    }

    @Override
    public void deleteUser(int userId) {
        Session session = sessionFactory.openSession();
        session.delete(findUser(userId));
    }

    @Override
    public Users findUser(int userId) {
        Session session = sessionFactory.openSession();
        return (Users) session.get(Users.class, userId);
    }

    @Override
    public Users findUserByName(String username) {
        Session session = sessionFactory.openSession();
        Criteria criteria = session.createCriteria(Users.class);
        criteria.add(Restrictions.eq("username", username));
        return (Users) criteria.uniqueResult();
    }

    @Override
    public List<Users> getAllUsers() {
        Session session = sessionFactory.openSession();
        return session.createQuery("from User").list();
    }

}
