/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stb.services;


import Stb.dao.DomiDao;
import Stb.model.Domi.Apurement;
import Stb.model.Domi.AvoirTitre;
import Stb.model.Domi.DetailDom;
import Stb.model.Domi.EmargementImputationTitre;
import Stb.model.Domi.EmargementReglementTitre;
import Stb.model.Domi.ImageDepotDomiciliation;
import Stb.model.Domi.ImageDepotDomiciliationPK;
import Stb.model.Domi.StatCaParMois;
import Stb.model.Domi.VueTimeline;
import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author slim
 */
public class DomiServicesImpl implements DomiServices {

    @Autowired
    DomiDao domiDao;

    @Override
    public List<ImageDepotDomiciliation> allImageDepotDomiciliationNA(String login) throws Exception {
        return domiDao.allImageDepotDomiciliationNA(login);
    }

    @Override
    public List<ImageDepotDomiciliation> allImageDepotDomiciliation(String login) throws Exception {
        return domiDao.allImageDepotDomiciliation(login);
    }

    @Override
    public List<ImageDepotDomiciliation> allImageDepotDomiciliationApkPos(String login) throws Exception {
        return domiDao.allImageDepotDomiciliationApkPos(login);
    }

    @Override
    public ImageDepotDomiciliation oneImageDepotDomiciliation(Integer codeTitre, Integer numDom, String dateDom) throws Exception {
        return domiDao.oneImageDepotDomiciliation(codeTitre, numDom, dateDom);
    }

    @Override
    public List<EmargementReglementTitre> allEmargementReglementTitre(Short codeTitre, int numDom, String dateDom) throws Exception {
        return domiDao.allEmargementReglementTitre(codeTitre, numDom, dateDom);
    }

    @Override
    public BigDecimal sommeEmargementReglementTitreTnd(Short codeTitre, Integer numDom, String dateDom) throws Exception {
        return domiDao.sommeEmargementReglementTitreTnd(codeTitre, numDom, dateDom);
    }

    @Override
    public BigDecimal sommeEmargementReglementTitreDvs(Short codeTitre, Integer numDom, String dateDom) throws Exception {
        return domiDao.sommeEmargementReglementTitreDvs(codeTitre, numDom, dateDom);
    }

    @Override
    public List<EmargementImputationTitre> allEmargementImputationTitre(Short codeTitre, int numDom, String dateDom) throws Exception {
        return domiDao.allEmargementImputationTitre(codeTitre, numDom, dateDom);
    }

    @Override
    public BigDecimal sommeEmargementImputationTitreTnd(Short codeTitre, Integer numDom, String dateDom) throws Exception {
        return domiDao.sommeEmargementImputationTitreTnd(codeTitre, numDom, dateDom);
    }

    @Override
    public BigDecimal sommeEmargementImputationTitreDvs(Short codeTitre, Integer numDom, String dateDom) throws Exception {
        return domiDao.sommeEmargementImputationTitreDvs(codeTitre, numDom, dateDom);
    }

    @Override
    public List<AvoirTitre> allAvoirTitre(Integer codeTitre, int numDom, String dateDom) throws Exception {
        return domiDao.allAvoirTitre(codeTitre, numDom, dateDom);
    }

    @Override
    public BigDecimal sommeAvoirTitreTnd(Integer codeTitre, Integer numDom, String dateDom) throws Exception {
        return domiDao.sommeAvoirTitreTnd(codeTitre, numDom, dateDom);
    }

    @Override
    public BigDecimal sommeAvoirTitreDvs(Integer codeTitre, Integer numDom, String dateDom) throws Exception {
        return domiDao.sommeAvoirTitreDvs(codeTitre, numDom, dateDom);
    }

    @Override
    public List<VueTimeline> allVueTimeline(Integer codeTitre, Integer numDom, String dateDom) throws Exception {
        return domiDao.allVueTimeline(codeTitre, numDom, dateDom);
    }

    @Override
    public String libelleApurement(int codeApurement, int natureTitre) throws Exception {
        return domiDao.libelleApurement(codeApurement, natureTitre);
    }

    @Override
    public String libelleApurement2(int codeApurement, int natureTitre) throws Exception {
        return domiDao.libelleApurement2(codeApurement, natureTitre);
    }

    @Override
    public List<StatCaParMois> statCaParDvsMois(String login, String dateD, String dateF) throws Exception {
        return domiDao.statCaParDvsMois(login, dateD, dateF);
    }

    @Override
    public List<StatCaParMois> statCaParTndMois(String login, String dateD, String dateF) throws Exception {
        return domiDao.statCaParTndMois(login, dateD, dateF);
    }

    @Override
    public List<StatCaParMois> statNbrParDvsMois(String login, String dateD, String dateF) throws Exception {
        return domiDao.statNbrParDvsMois(login, dateD, dateF);
    }

    @Override
    public List<StatCaParMois> statNbrParTndMois(String login, String dateD, String dateF) throws Exception {
        return domiDao.statNbrParTndMois(login, dateD, dateF);
    }

    @Override
    public ImageDepotDomiciliationPK addImageDepotDomiciliation(ImageDepotDomiciliation mageDepotDomiciliation) throws Exception {
        return domiDao.addImageDepotDomiciliation(mageDepotDomiciliation);
    }

    @Override
    public Apurement getApurement(int codeApurement) throws Exception {
    return domiDao.getApurement(codeApurement);   }

    @Override
    public List<DetailDom> Listeidd(String login, int devise, int titre, String datedebDomi, String datefinDomi, String etatDomi, String datedebApur, String datefinApur, String etatApur) throws Exception {
return domiDao.listeTceParam(login, devise, titre, datedebDomi, datefinDomi, etatDomi, datedebApur, datefinApur, etatApur);
    }


}
