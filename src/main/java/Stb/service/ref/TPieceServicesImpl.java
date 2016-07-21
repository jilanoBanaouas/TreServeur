/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stb.service.ref;

import Stb.dao.ref.TPieceDao;
import Stb.model.Ref.TPiece;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author yayan
 */
public class TPieceServicesImpl implements TPieceServices {

    @Autowired
    TPieceDao tPieceDao;

    @Override
    public List<TPiece> getAllTPiece() {
        return tPieceDao.getAllTPiece();
    }

    @Override
    public TPiece getTPiece(Short codeTypePiece) {
        return tPieceDao.getTPiece(codeTypePiece);
    }

}
