/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stb.service.ref;

import Stb.model.Ref.TypeDossierAva;
import java.util.List;

/**
 *
 * @author yayan
 */
public interface TypeDossierAvaServices {

    public List<TypeDossierAva> getAllTypeDossierAva();

    public TypeDossierAva getTypeDossierAva(Short codeTypeDosAva);

}