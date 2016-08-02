/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stb.dao;
import Stb.model.Gen.MessageRecus;
import Stb.model.Gen.MswMtxxx;
import Stb.model.Gen.MswNomField;
import Stb.model.Gen.MswRecepMsg;
import Stb.model.Gen.MswUtlField;
import Stb.model.Gen.MswUtlMtxxx;
import Stb.model.Gen.MswUtlSequence;
import Stb.model.Gen.OperationTitre;
import Stb.model.Gen.SwiftRecus;
import java.util.List;

/**
 *
 * @author slim
 */
public interface GenDao {

    //field
    public List<MswUtlField> allfield(int numero, String nmesg, int numSequence) throws Exception;

    public MswNomField getfieldbynom(String mtxxx, String seq, String field) throws Exception;

    //MsgRecu
    public List<MessageRecus> Listmtxxrecues() throws Exception;

    public List<MswRecepMsg> getdetailR(String mtxxx) throws Exception;

    public List<MswUtlMtxxx> Listmtxxenvoyes() throws Exception;

    public MswMtxxx gettypemtx(String mtxxx) throws Exception;

    public List<MswUtlSequence> Listseqs(int numero, String nmesg) throws Exception;

    public SwiftRecus getSwiftRecues(String mtxxx) throws Exception;
    
    public void savetitre(OperationTitre p);
    
    //MAJ
    
}
