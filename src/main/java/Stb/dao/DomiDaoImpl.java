package Stb.dao;

import Stb.model.Domi.Apurement;
import Stb.model.Domi.ApurementPK;
import Stb.model.Domi.AvoirTitre;
import Stb.model.Domi.DetailDom;
import Stb.model.Domi.EmargementImputationTitre;
import Stb.model.Domi.EmargementReglementTitre;
import Stb.model.Domi.ImageDepotDomiciliation;
import Stb.model.Domi.ImageDepotDomiciliationPK;
import Stb.model.Domi.StatCaParMois;
import Stb.model.Domi.VueTimeline;
import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class DomiDaoImpl implements DomiDao {

    @Autowired
    @Qualifier("sessionFactorydomi")
    private SessionFactory sessionFactory;

    private Session session;

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
        session = sessionFactory.openSession();
    }

    @Override
    public List<ImageDepotDomiciliation> allImageDepotDomiciliation(String login) throws Exception {

        session.close();
        session = sessionFactory.openSession();
        Query query = session.getNamedQuery("ImageDepotDomiciliation.findByNoPieceClient");
        query.setParameter("noPieceClient", login);
        return query.list();
    }

    @Override
    public List<ImageDepotDomiciliation> allImageDepotDomiciliationNA(String login) throws Exception {
        session = sessionFactory.openSession();
        Query query = session.createQuery("FROM ImageDepotDomiciliation i , Titre t , Apurement a"
                + " WHERE i.codeTitre = t.codeTitre"
                + " AND a.apurementPK.natureTitre = t.natureTitre"
                + " AND ((i.codeApurement IS NULL AND a.apurementPK.codeApurement = 88) OR (i.codeApurement IS NOT NULL AND a.apurementPK.codeApurement = i.codeApurement))"
                + " AND a.etat = 'N'"
                + " AND i.noPieceClient = :login");
        query.setParameter("login", login);
        return query.list();
    }

    @Override
    public List<ImageDepotDomiciliation> allImageDepotDomiciliationApkPos(String login) throws Exception {
        session = sessionFactory.openSession();
        Query query = session.createQuery("FROM ImageDepotDomiciliation i"
                + " WHERE i.noPieceClient = :login"
                + " AND i.codeCloture IN ('D', 'F')");
        query.setParameter("login", login);
        return query.list();
    }

    @Override
    public List<ImageDepotDomiciliation> allImageDepotDomiciliationND(String login) throws Exception {
        session = sessionFactory.openSession();
        Query query = session.createQuery("FROM ImageDepotDomiciliation i"
                + " WHERE i.noPieceClient = :login"
                + " AND i.codeCloture IS NULL");
        query.setParameter("login", login);
        return query.list();
    }

    @Override
    public ImageDepotDomiciliation oneImageDepotDomiciliation(Integer codeTitre, Integer numDom, String dateDom) throws Exception {

        session = sessionFactory.openSession();
        Query query = session.createQuery("FROM ImageDepotDomiciliation i"
                + " WHERE i.codeTitre = :codeTitre"
                + " AND i.numDom = :numDom"
                + " AND i.dateDom = :dateDom");
        query.setParameter("codeTitre", codeTitre);
        query.setParameter("numDom", numDom);

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date dateDomDate = sdf.parse(dateDom);
        query.setParameter("dateDom", dateDomDate);
        return (ImageDepotDomiciliation) query.uniqueResult();
    }

    @Override
    public List<EmargementReglementTitre> allEmargementReglementTitre(Short codeTitre, int numDom, String dateDom) throws Exception {

        session = sessionFactory.openSession();
        Query query = session.createQuery("FROM EmargementReglementTitre e"
                + " WHERE e.emargementReglementTitrePK.codeTitre = :codeTitre"
                + " AND e.emargementReglementTitrePK.numDom = :numDom"
                + " AND e.emargementReglementTitrePK.dateDom = :dateDom");
        query.setParameter("codeTitre", codeTitre);
        query.setParameter("numDom", numDom);

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date dateDomDate = sdf.parse(dateDom);
        query.setParameter("dateDom", dateDomDate);
        return query.list();

    }

    @Override
    public BigDecimal sommeEmargementReglementTitreTnd(Short codeTitre, int numDom, String dateDom) throws Exception {

        session = sessionFactory.openSession();
        Query query = session.createQuery("SELECT SUM(e.mntReglementDt) FROM EmargementReglementTitre e"
                + " WHERE e.emargementReglementTitrePK.codeTitre = :codeTitre"
                + " AND e.emargementReglementTitrePK.numDom = :numDom"
                + " AND e.emargementReglementTitrePK.dateDom = :dateDom");
        query.setParameter("codeTitre", codeTitre);
        query.setParameter("numDom", numDom);

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date dateDomDate = sdf.parse(dateDom);
        query.setParameter("dateDom", dateDomDate);
        return (BigDecimal) query.uniqueResult();

    }

    @Override
    public BigDecimal sommeEmargementReglementTitreDvs(Short codeTitre, int numDom, String dateDom) throws Exception {

        session = sessionFactory.openSession();
        Query query = session.createQuery("SELECT SUM(e.mntReglement) FROM EmargementReglementTitre e"
                + " WHERE e.emargementReglementTitrePK.codeTitre = :codeTitre"
                + " AND e.emargementReglementTitrePK.numDom = :numDom"
                + " AND e.emargementReglementTitrePK.dateDom = :dateDom");
        query.setParameter("codeTitre", codeTitre);
        query.setParameter("numDom", numDom);

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date dateDomDate = sdf.parse(dateDom);
        query.setParameter("dateDom", dateDomDate);
        return (BigDecimal) query.uniqueResult();

    }

    @Override
    public List<EmargementImputationTitre> allEmargementImputationTitre(Short codeTitre, int numDom, String dateDom) throws Exception {

        session = sessionFactory.openSession();
        Query query = session.createQuery("FROM EmargementImputationTitre e"
                + " WHERE e.emargementImputationTitrePK.codeTitre = :codeTitre"
                + " AND e.emargementImputationTitrePK.numDom = :numDom"
                + " AND e.emargementImputationTitrePK.dateDom = :dateDom");
        query.setParameter("codeTitre", codeTitre);
        query.setParameter("numDom", numDom);

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date dateDomDate = sdf.parse(dateDom);
        query.setParameter("dateDom", dateDomDate);
        return query.list();

    }

    @Override
    public BigDecimal sommeEmargementImputationTitreTnd(Short codeTitre, Integer numDom, String dateDom) throws Exception {

        session = sessionFactory.openSession();
        Query query = session.createQuery("SELECT SUM(e.mntTnd) FROM EmargementImputationTitre e"
                + " WHERE e.emargementImputationTitrePK.codeTitre = :codeTitre"
                + " AND e.emargementImputationTitrePK.numDom = :numDom"
                + " AND e.emargementImputationTitrePK.dateDom = :dateDom");
        query.setParameter("codeTitre", codeTitre);
        query.setParameter("numDom", numDom);

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date dateDomDate = sdf.parse(dateDom);
        query.setParameter("dateDom", dateDomDate);
        return (BigDecimal) query.uniqueResult();

    }

    @Override
    public BigDecimal sommeEmargementImputationTitreDvs(Short codeTitre, Integer numDom, String dateDom) throws Exception {

        session = sessionFactory.openSession();
        Query query = session.createQuery("SELECT SUM(e.mntDevise) FROM EmargementImputationTitre e"
                + " WHERE e.emargementImputationTitrePK.codeTitre = :codeTitre"
                + " AND e.emargementImputationTitrePK.numDom = :numDom"
                + " AND e.emargementImputationTitrePK.dateDom = :dateDom");
        query.setParameter("codeTitre", codeTitre);
        query.setParameter("numDom", numDom);

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date dateDomDate = sdf.parse(dateDom);
        query.setParameter("dateDom", dateDomDate);
        return (BigDecimal) query.uniqueResult();

    }

    @Override
    public List<AvoirTitre> allAvoirTitre(Integer codeTitre, int numDom, String dateDom) throws Exception {

        session = sessionFactory.openSession();
        Query query = session.createQuery("FROM AvoirTitre e"
                + " WHERE e.avoirTitrePK.codeTitre = :codeTitre"
                + " AND e.avoirTitrePK.numDom = :numDom"
                + " AND e.avoirTitrePK.dateDom = :dateDom");
        query.setParameter("codeTitre", Short.parseShort(codeTitre.toString()));

        query.setParameter("numDom", numDom);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date dateDomDate = sdf.parse(dateDom);
        query.setParameter("dateDom", dateDomDate);
        return query.list();

    }

    @Override
    public BigDecimal sommeAvoirTitreTnd(Integer codeTitre, Integer numDom, String dateDom) throws Exception {

        session = sessionFactory.openSession();
        Query query = session.createQuery("select SUM(mntTnd) FROM AvoirTitre e"
                + " WHERE e.avoirTitrePK.codeTitre = :codeTitre"
                + " AND e.avoirTitrePK.numDom = :numDom"
                + " AND e.avoirTitre.dateDom = :dateDom");
        query.setParameter("codeTitre", codeTitre);
        query.setParameter("numDom", numDom);

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date dateDomDate = sdf.parse(dateDom);
        query.setParameter("dateDom", dateDomDate);
        return (BigDecimal) query.uniqueResult();

    }

    @Override
    public BigDecimal sommeAvoirTitreDvs(Integer codeTitre, Integer numDom, String dateDom) throws Exception {

        session = sessionFactory.openSession();
        Query query = session.createQuery("select SUM(mntDevise) FROM AvoirTitre e"
                + " WHERE e.avoirTitrePK.codeTitre = :codeTitre"
                + " AND e.avoirTitrePK.numDom = :numDom"
                + " AND e.avoirTitre.dateDom = :dateDom");
        query.setParameter("codeTitre", codeTitre);
        query.setParameter("numDom", numDom);

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date dateDomDate = sdf.parse(dateDom);
        query.setParameter("dateDom", dateDomDate);
        return (BigDecimal) query.uniqueResult();

    }

    @Override
    @SuppressWarnings("CallToPrintStackTrace")
    public List<VueTimeline> allVueTimeline(Integer codeTitre, Integer numDom, String dateDom) throws Exception {

        session = sessionFactory.openSession();
        Query query = session.createQuery("FROM VueTimeline e"
                + " WHERE e.codeTitre = :codeTitre"
                + " AND e.numDom = :numDom"
                + " AND e.dateDom = :dateDom");
        query.setParameter("codeTitre", codeTitre);
        query.setParameter("numDom", numDom);

        SimpleDateFormat sdf3 = new SimpleDateFormat("EEE MMM dd HH:mm:ss zzz yyyy", Locale.ENGLISH);

        Date d1 = null;
        String outputText;
        try {
            d1 = sdf3.parse(dateDom);
            DateFormat outputFormat = new SimpleDateFormat("yyyy-MM-dd");
            outputText = outputFormat.format(d1);

            System.out.println("date " + outputText);
            System.out.println("titre " + codeTitre);
            System.out.println("num " + numDom);

        } catch (Exception e) {
            e.printStackTrace();
        }

        query.setParameter("dateDom", d1);
        return query.list();

    }

    @Override
    public String libelleApurement(int codeApurement, int natureTitre) throws Exception {

        session = sessionFactory.openSession();
        Query query = session.createQuery("SELECT a.libApurement FROM Apurement a"
                + " WHERE a.apurementPK.codeApurement = :codeApurement"
                + " AND a.apurementPK.natureTitre = :natureTitre");
        query.setParameter("codeApurement", codeApurement);
        query.setParameter("natureTitre", natureTitre);
        return query.uniqueResult().toString();

    }

    @Override
    public String libelleApurement2(int codeApurement, int natureTitre) throws Exception {

        session = sessionFactory.openSession();
        ApurementPK apPK = new ApurementPK(codeApurement, natureTitre);
        return ((Apurement) session.get(Apurement.class, apPK)).getLibApurement();

    }

    @Override
    public List<StatCaParMois> statCaParDvsMois(String login, String dateD, String dateF) throws Exception {

        session = sessionFactory.openSession();
        Query query = session.createSQLQuery("select i.code_Devise, TO_CHAR(i.date_Contrat, 'MM/RRRR'), sum(i.mnt_Dvs_Ptfn_Fact), sum(i.mnt_Tnd_Ptfn)"
                + " from Image_Depot_Domiciliation i"
                + " where i.no_Piece_Client = :login"
                + " and i.date_Contrat between :dateD and :dateF"
                + " group by i.code_Devise, TO_CHAR(i.date_Contrat, 'MM/RRRR')");
        query.setParameter("login", login);

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date dateDeb = sdf.parse(dateD);
        query.setParameter("dateD", dateDeb);
        Date dateFin = sdf.parse(dateF);
        query.setParameter("dateF", dateFin);
        List<Object[]> rows = query.list();

        List<StatCaParMois> liste = new ArrayList<>();
        for (Object[] row : rows) {
            StatCaParMois st = new StatCaParMois();
            st.setCodeDevise(Short.valueOf(row[0].toString()));
            st.setMoisAnnee(row[1].toString());
            st.setTotMntDvs(BigDecimal.valueOf(Double.parseDouble(row[2].toString())));
            st.setTotMntTns(BigDecimal.valueOf(Double.parseDouble(row[3].toString())));
            liste.add(st);
        }
        return liste;
    }

    @Override
    public List<StatCaParMois> statCaParTndMois(String login, String dateD, String dateF) throws Exception {

        session = sessionFactory.openSession();
        Query query = session.createSQLQuery("select 788, TO_CHAR(i.date_Contrat, 'MM/RRRR'), 0, sum(i.mnt_Tnd_Ptfn)"
                + " from Image_Depot_Domiciliation i"
                + " where i.no_Piece_Client = :login"
                + " and i.date_Contrat between :dateD and :dateF"
                + " group by TO_CHAR(i.date_Contrat, 'MM/RRRR')");
        query.setParameter("login", login);

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date dateDeb = sdf.parse(dateD);
        query.setParameter("dateD", dateDeb);
        Date dateFin = sdf.parse(dateF);
        query.setParameter("dateF", dateFin);
        List<Object[]> rows = query.list();

        List<StatCaParMois> liste = new ArrayList<>();
        for (Object[] row : rows) {
            StatCaParMois st = new StatCaParMois();
            st.setCodeDevise(Short.valueOf(row[0].toString()));
            st.setMoisAnnee(row[1].toString());
            st.setTotMntDvs(BigDecimal.valueOf(Double.parseDouble(row[2].toString())));
            System.out.println("kk " + BigDecimal.valueOf(Double.parseDouble(row[2].toString())));
            System.out.println("kk " + row[2].toString());
            Double a = Double.valueOf(row[3].toString());
            System.out.println("kk11 " + a.toString());

            String str = row[3].toString().replaceAll(",", "");
            BigDecimal bd = new BigDecimal(str);
            System.out.println("kk1bd1 " + bd.toString());
            st.setTotMntTns(bd);
            System.out.println("get " + st.getTotMntTns().toString());
            //st.setTotMntTns(row[3].toString());
            liste.add(st);
        }
        return liste;

    }

    @Override
    public List<StatCaParMois> statNbrParDvsMois(String login, String dateD, String dateF) throws Exception {

        session = sessionFactory.openSession();
        Query query = session.createSQLQuery("select i.code_Devise, TO_CHAR(i.date_Contrat, 'MM/RRRR'), count(*), 0"
                + " from Image_Depot_Domiciliation i"
                + " where i.no_Piece_Client = :login"
                + " and i.date_Contrat between :dateD and :dateF"
                + " group by i.code_Devise, TO_CHAR(i.date_Contrat, 'MM/RRRR')");
        query.setParameter("login", login);

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date dateDeb = sdf.parse(dateD);
        query.setParameter("dateD", dateDeb);
        Date dateFin = sdf.parse(dateF);
        query.setParameter("dateF", dateFin);
        List<Object[]> rows = query.list();

        List<StatCaParMois> liste = new ArrayList<>();
        for (Object[] row : rows) {
            StatCaParMois st = new StatCaParMois();
            st.setCodeDevise(Short.valueOf(row[0].toString()));
            st.setMoisAnnee(row[1].toString());
            st.setTotMntDvs(BigDecimal.valueOf(Double.parseDouble(row[2].toString())));
            st.setTotMntTns(BigDecimal.valueOf(Double.parseDouble(row[3].toString())));
            liste.add(st);
        }
        return liste;
    }

    @Override
    public List<StatCaParMois> statNbrParTndMois(String login, String dateD, String dateF) throws Exception {

        session = sessionFactory.openSession();
        Query query = session.createSQLQuery("select 788 as codeDevise, TO_CHAR(i.date_Contrat, 'MM/RRRR') as moisAnnee, count(*) as totMntDvs, 0 as totMntTns"
                + " from Image_Depot_Domiciliation i"
                + " where i.no_Piece_Client = :login"
                + " and i.date_Contrat between :dateD and :dateF"
                + " group by TO_CHAR(i.date_Contrat, 'MM/RRRR')");
        query.setParameter("login", login);

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date dateDeb = sdf.parse(dateD);
        query.setParameter("dateD", dateDeb);
        Date dateFin = sdf.parse(dateF);
        query.setParameter("dateF", dateFin);
        List<Object[]> rows = query.list();

        List<StatCaParMois> liste = new ArrayList<>();
        for (Object[] row : rows) {
            StatCaParMois st = new StatCaParMois();
            st.setCodeDevise(Short.valueOf(row[0].toString()));
            st.setMoisAnnee(row[1].toString());
            st.setTotMntDvs(BigDecimal.valueOf(Double.parseDouble(row[2].toString())));
            st.setTotMntTns(BigDecimal.valueOf(Double.parseDouble(row[3].toString())));
            liste.add(st);
        }

        //liste.add(new StatCaParMois(Short.valueOf("788"),"01/2015",BigDecimal.valueOf(19.0),BigDecimal.valueOf(0.0)));
        //liste.add(new StatCaParMois(Short.valueOf("788"),"12/2016",BigDecimal.valueOf(122.0),BigDecimal.valueOf(23.0)));
        return liste;//query.list();

    }

    @Override
    public ImageDepotDomiciliationPK addImageDepotDomiciliation(ImageDepotDomiciliation mageDepotDomiciliation) throws Exception {
        session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        ImageDepotDomiciliationPK imagePK = (ImageDepotDomiciliationPK) session.save(mageDepotDomiciliation);
        tx.commit();
        return imagePK;
    }

    @Override
    public Apurement getApurement(int codeApurement) throws Exception {

        session = sessionFactory.openSession();
        Query query = session.createSQLQuery("SELECT a FROM Apurement a WHERE a.apurementPK.codeApurement = :codeApurement");
        query.setParameter("codeApurement", codeApurement);
        return (Apurement) query.uniqueResult();
    }

    @Override
    public List<DetailDom> listeTceParam(String login, int devise, int titre, String dateDebDomi,
            String dateFinDomi, String etatDomi, String dateDebApur, String dateFinApur, String etatApur) throws Exception {
        session = sessionFactory.openSession();
        Query query = session.createQuery(" select i.numDom, i.dateDom, i.codeTitre, i.codeDevise, "
                + " i.codeModLiv, i.mntDvsPtfnFact, i.nomFournisseur, i.dateApurement, i.totMntRegle, "
                + " i.numeroDossier, t.libTitre, a.etat, i.totMntImpute ,i.codeAgenceBct ,i.mntTndPtfn ,i.racineCompte ,i.cleRib "
                + "FROM ImageDepotDomiciliation i , Titre t , Apurement a "
                + "WHERE t.natureTitre = a.apurementPK.natureTitre "
                + "AND t.codeTitre = i.codeTitre "
                + "AND i.codeApurement = a.apurementPK.codeApurement "
                + "AND i.codeDevise = case when coalesce(:devise,99999) = 99999 then i.codeDevise else :devise end "
                + "AND i.codeTitre  = case when coalesce(:titre,99) = 99 then i.codeTitre else :titre end "
                + "AND i.dateDom >= :dateDebDomi "
                + "AND i.dateDom <= :dateFinDomi "
                + "AND i.codeCloture = case when coalesce(:etatDomi,'X') = 'X' then i.codeCloture else :etatDomi end "
                + "AND a.etat = case when coalesce(:etatApur,'3') = '3' then a.etat else :etatApur end "
                + "AND i.dateApurement >= :dateDebApur "
                + "AND i.dateApurement <= :dateFinApur "
                //+ "AND ( ( :etatApur = '0' AND a.codeApurement = 88 ) "
                //+ "AND ( :etatApur = '1' AND a.etat ='A' ) "
                // + "OR ( :etatApur = '2' AND a.etat ='N' ) "
                //+ "OR ( :etatApur = '3' )) "
                + "AND i.noPieceClient = :login ");

        query.setParameter("devise", devise);
        query.setParameter("titre", titre);
        query.setParameter("login", login);

        if (dateDebDomi.compareTo("") == 0) {
            dateDebDomi = "1000-01-01";
        }
        query.setParameter("dateDebDomi", (new SimpleDateFormat("yyyy-MM-dd")).parse(dateDebDomi));

        if (dateFinDomi.compareTo("") == 0) {
            dateFinDomi = "3000-01-01";
        }
        query.setParameter("dateFinDomi", (new SimpleDateFormat("yyyy-MM-dd")).parse(dateFinDomi));

        query.setParameter("etatDomi", etatDomi);

        if (dateDebApur.equals("")) {
            dateDebApur = "1000-01-01";
        }
        query.setParameter("dateDebApur", (new SimpleDateFormat("yyyy-MM-dd")).parse(dateDebApur));

        if (dateFinApur.equals("")) {
            dateFinApur = "3000-01-01";
        }
        query.setParameter("dateFinApur", (new SimpleDateFormat("yyyy-MM-dd")).parse(dateFinApur));

        query.setParameter("etatApur", etatApur);

        //List<ImageDepotDomiciliation> l = query.list();
        List<Object[]> rows = query.list();

        List<DetailDom> list = new ArrayList<>();
        for (Object[] row : rows) {
            DetailDom ig = new DetailDom();
            ig.setNumDom(row[0].toString());
            ig.setDateDom(row[1].toString());
            ig.setCodeTitre(row[2].toString());
            ig.setCodeDevise(row[3].toString());
            ig.setCodeModLiv(row[4].toString());
            ig.setMntDvsPtfnFact(row[5].toString());
            ig.setNomFournisseur(row[6].toString());
            ig.setDateApurement(row[7].toString());

            ig.setTotMntRegle(row[8] != null ? row[8].toString() : "0");

            ig.setNumeroDossier(row[9].toString());
            ig.setLibTitre(row[10].toString());
            ig.setEtat(row[11].toString());
            ig.setTotMntImpute(row[12] != null ? row[12].toString() : "0");
            ig.setCodeAgenceBct(row[13].toString());
            ig.setMntTndPtfn(row[14] != null ? row[14].toString() : "0");
            ig.setRacineCompte(row[15].toString());
            ig.setCleRib(row[16].toString());
            list.add(ig);
        }
        return list;
    }
}
