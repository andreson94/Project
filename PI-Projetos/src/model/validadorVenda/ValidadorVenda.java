package model.validadorVenda;

import exceptions.VendaException;
import model.venda.Venda;


public class ValidadorVenda {
    public static void validar (Venda venda) throws VendaException{
        //Realiza validações
      if (venda == null) {
            throw new VendaException("Não feita nenhuma venda");
        }
          if (venda.getProduto()== null || "".equals(venda.getProduto())) {
            throw new VendaException("Por favor informe o "
                    + " o produto");
        }
      
    }
    
    
}
