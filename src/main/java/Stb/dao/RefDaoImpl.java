package Stb.dao;

import Stb.model.Ref.Activite;
import Stb.model.Ref.Agence;
import Stb.model.Ref.AgencePK;
//import Stb.model.Ref.AgenceEtrangere;
//import Stb.model.Ref.AgenceEtrangerePK;
import Stb.model.Ref.Banque;
//import Stb.model.Ref.BanqueEtrangere;
//import Stb.model.Ref.CoursJoursDeviseBb;
import Stb.model.Ref.Devise;
//import Stb.model.Ref.ModeDeLivraison;
//import Stb.model.Ref.ModeDeReglement;
import Stb.model.Ref.Pays;
import Stb.model.Ref.TPiece;
import Stb.model.Ref.TypeDossierAva;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class RefDaoImpl implements RefDao {

    @Autowired
    @Qualifier("sessionFactoryRef")
    private SessionFactory sessionFactory;

    private Session session;

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public Session getSession() {
        return session;
    }

    public void setSession(Session session) {
        this.session = session;
    }

    @Override
    public String oneBanque(Short codeBanque) throws Exception {
        session = sessionFactory.openSession();
        return ((Banque) session.get(Banque.class, codeBanque)).getLibBanque();

    }

    @Override
    public String oneAgence(Short codeAgenceBct, Short codeBanque) throws Exception {
        session = sessionFactory.openSession();
        return ((Agence) session.get(Agence.class, new AgencePK(codeBanque, codeAgenceBct))).getLibAgence();
    }

//    @Override
//    public String oneBanqueEtr(int codeBnqEtr) throws Exception {
//        session = sessionFactory.openSession();
//        return ((BanqueEtrangere) session.get(BanqueEtrangere.class, codeBnqEtr)).getLibLong();
//    }
//
//    @Override
//    public String oneAgenceEtr(int codeAgenceEtr, int codeBanqueEtr) throws Exception {
//        session = sessionFactory.openSession();
//        return ((AgenceEtrangere) session.get(AgenceEtrangere.class, new AgenceEtrangerePK(codeBanqueEtr, codeAgenceEtr))).getLibAgenceEtr();
//    }
    @Override
    public List<Devise> allDevise() {
        session = sessionFactory.openSession();
        Query query = session.getNamedQuery("Devise.findAll");
        return query.list();
    }

    @Override
    public Devise sigleDevise(Integer codeDevise) throws Exception {
        session = sessionFactory.openSession();
        return ((Devise) session.get(Devise.class, codeDevise));

    }

    @Override
    public List<Pays> allPays() throws Exception {
        session = sessionFactory.openSession();
        Query query = session.getNamedQuery("Pays.findAll");
        return query.list();

    }
//
//    @Override
//    public ModeDeReglement oneModeReglement(Integer codeModReg) throws Exception {
//        session = sessionFactory.openSession();
//        return ((ModeDeReglement) session.get(ModeDeReglement.class, codeModReg));
//    }
//
//    @Override
//    public List<ModeDeLivraison> allModeLivraison() throws Exception {
//        session = sessionFactory.openSession();
//        Query query = session.getNamedQuery("ModeDeLivraison.findAll");
//        return query.list();
//    }
//
//    @Override
//    public ModeDeLivraison oneModeLivraison(Integer codeModLiv) throws Exception {
//        session = sessionFactory.openSession();
//        return ((ModeDeLivraison) session.get(ModeDeLivraison.class, codeModLiv));
//    }
//
//    @Override
//    public CoursJoursDeviseBb coursJourDevise(Short codeDevise) throws Exception {
//        session = sessionFactory.openSession();
//        Query query = session.getNamedQuery("CoursJoursDeviseBb.findByCodeDevise").setParameter("codeDevise", codeDevise);
//        return (CoursJoursDeviseBb) query.uniqueResult();
//    }

    @Override
    public List<Activite> getAllActivite() {
        session = sessionFactory.openSession();
        Query query = session.getNamedQuery("Activite.findAll");
        List<Activite> liste = query.list();
        session.close();
        return liste;
    }

    @Override
    public Activite getActivite(Integer codeActivite) {
        session = sessionFactory.openSession();
        Query query = session.getNamedQuery("Activite.findByCodeActivite");
        query.setParameter("codeActivite", codeActivite);
        Activite ativite = (Activite) query.uniqueResult();
        session.close();
        return ativite;
    }

    @Override
    public List<Agence> getAllAgence() {
        session = sessionFactory.openSession();
        Query query = session.getNamedQuery("Agence.findAll");
        List<Agence> liste = query.list();
        session.close();
        return liste;
    }

    @Override
    public Agence getAgence(short codeBanque, short codeAgenceBct) {

        session = sessionFactory.openSession();
        Query query = session.getNamedQuery("Activite.findByCodeBanqueAndCodeAgence");
        query.setParameter("codeBanque", codeBanque);
        query.setParameter("codeAgenceBct", codeAgenceBct);
        Agence agence = (Agence) query.uniqueResult();
        session.close();
        return agence;

    }

    @Override
    public List<TPiece> getAllTPiece() {
        session = sessionFactory.openSession();
        Query query = session.getNamedQuery("TPiece.findAll");
        List<TPiece> liste = query.list();
        session.close();
        return liste;
    }

    @Override
    public TPiece getTPiece(Short codeTypePiece) {
        session = sessionFactory.openSession();
        Query query = session.getNamedQuery("TPiece.findByCodeTypePiece");
        query.setParameter("codeTypePiece", codeTypePiece);
        TPiece tPiece = (TPiece) query.uniqueResult();
        session.close();
        return tPiece;
    }

    @Override
    public List<TypeDossierAva> getAllTypeDossierAva() {
        session = sessionFactory.openSession();
        Query query = session.getNamedQuery("TypeDossierAva.findAll");
        List<TypeDossierAva> liste = query.list();
        session.close();
        return liste;
    }

    @Override
    public TypeDossierAva getTypeDossierAva(Short codeTypeDosAva) {
        session = sessionFactory.openSession();
        Query query = session.getNamedQuery("TypeDossierAva.findByCodeTypeDosAva");
        query.setParameter("codeTypeDosAva", codeTypeDosAva);
        TypeDossierAva typeDossierAva = (TypeDossierAva) query.uniqueResult();
        session.close();
        return typeDossierAva;
    }
}
