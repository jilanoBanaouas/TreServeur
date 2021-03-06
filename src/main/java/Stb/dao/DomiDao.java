//package Stb.dao;
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
//import java.math.BigDecimal;
//import java.util.List;
//
//public interface DomiDao {
//
//    public List<DetailDom> listeTceParam(String login, int devise, int titre, String dateDebDomi,
//            String dateFinDomi, String etatDomi, String dateDebApur, String dateFinApur, String etatApur) throws Exception;
//
//    public List<ImageDepotDomiciliation> allImageDepotDomiciliation(String login) throws Exception;
//
//    public List<ImageDepotDomiciliation> allImageDepotDomiciliationNA(String login) throws Exception;
//
//    public List<ImageDepotDomiciliation> allImageDepotDomiciliationApkPos(String login) throws Exception;
//
//    public List<ImageDepotDomiciliation> allImageDepotDomiciliationND(String login) throws Exception;
//
//    public ImageDepotDomiciliation oneImageDepotDomiciliation(Integer codeTitre, Integer numDom, String dateDom) throws Exception;
//
//    public List<EmargementReglementTitre> allEmargementReglementTitre(Short codeTitre, int numDom, String dateDom) throws Exception;
//
//    public BigDecimal sommeEmargementReglementTitreTnd(Short codeTitre, int numDom, String dateDom) throws Exception;
//
//    public BigDecimal sommeEmargementReglementTitreDvs(Short codeTitre, int numDom, String dateDom) throws Exception;
//
//    public List<EmargementImputationTitre> allEmargementImputationTitre(Short codeTitre, int numDom, String dateDom) throws Exception;
//
//    public BigDecimal sommeEmargementImputationTitreTnd(Short codeTitre, Integer numDom, String dateDom) throws Exception;
//
//    public BigDecimal sommeEmargementImputationTitreDvs(Short codeTitre, Integer numDom, String dateDom) throws Exception;
//
//    public List<AvoirTitre> allAvoirTitre(Integer codeTitre, int numDom, String dateDom) throws Exception;
//
//    public BigDecimal sommeAvoirTitreTnd(Integer codeTitre, Integer numDom, String dateDom) throws Exception;
//
//    public BigDecimal sommeAvoirTitreDvs(Integer codeTitre, Integer numDom, String dateDom) throws Exception;
//
//    public List<VueTimeline> allVueTimeline(Integer codeTitre, Integer numDom, String dateDom) throws Exception;
//
//    public String libelleApurement(int codeApurement, int natureTitre) throws Exception;
//
//    public String libelleApurement2(int codeApurement, int natureTitre) throws Exception;
//
//    public List<StatCaParMois> statCaParDvsMois(String login, String dateD, String dateF) throws Exception;
//
//    public List<StatCaParMois> statCaParTndMois(String login, String dateD, String dateF) throws Exception;
//
//    public List<StatCaParMois> statNbrParDvsMois(String login, String dateD, String dateF) throws Exception;
//
//    public List<StatCaParMois> statNbrParTndMois(String login, String dateD, String dateF) throws Exception;
//
//    public ImageDepotDomiciliationPK addImageDepotDomiciliation(ImageDepotDomiciliation mageDepotDomiciliation) throws Exception;
//
//    public Apurement getApurement(int codeApurement) throws Exception;
//}
