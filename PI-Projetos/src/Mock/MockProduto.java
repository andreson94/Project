
package Mock;


import java.util.ArrayList;
import java.util.List;
import model.produto.Produto;


public class MockProduto {
    
    private static int totalProduto = 0;
    //Armazena a lista de produtos 
    private static List<Produto> listaproduto = new ArrayList<Produto>();
    
    //Inseri produtos
    public static void inserir(Produto produto)
            throws Exception {
        produto.setCodProduto(totalProduto++);
        listaproduto.add(produto);
    }
    
    //Atualização dos dados de um produto
    public static void atualizar (Produto produtoProcura)
            throws Exception{
        if(produtoProcura != null && !listaproduto.isEmpty() ){
            for(Produto produtoatt : listaproduto){
                
            }
                
        }
           
               
           
            }
    
    
    
}
