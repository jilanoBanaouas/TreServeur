/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stb.dao;

import Stb.model.Ref.Devise;

import Stb.model.Ref.Pays;
import java.util.List;

/**
 *
 * @author slim
 */
public interface RefDao {

    public String oneBanque(Short codeBanque) throws Exception;

    public String oneAgence(Short codeAgenceBct, Short codeBanque) throws Exception;

//    public String oneBanqueEtr(int codeBnqEtr) throws Exception;

//    public String oneAgenceEtr(int codeAgenceEtr, int codeBanqueEtr) throws Exception;

    public List<Devise> allDevise() throws Exception;

    public Devise sigleDevise(Integer codeDevise) throws Exception;

    public List<Pays> allPays() throws Exception;

//    public ModeDeReglement oneModeReglement(Integer codeModReg) throws Exception;
//
//    public List<ModeDeLivraison> allModeLivraison() throws Exception;
//
//    public ModeDeLivraison oneModeLivraison(Integer codeModLiv) throws Exception;
//
//    public CoursJoursDeviseBb coursJourDevise(Short codeDevise) throws Exception;

}
