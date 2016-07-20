/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stb.service.ref;

import Stb.model.Ref.TPiece;
import java.util.List;

/**
 *
 * @author yayan
 */
public interface TPieceServices {

    public List<TPiece> getAllTPiece();

    public TPiece getTPiece(Short codeTypePiece);

}
