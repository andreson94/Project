
package Mock;


import java.util.ArrayList;
import java.util.List;
import model.produto.Produto;


public class MockProduto {
    
    private static long totalProduto = 1;
    //Armazena a lista de produtos 
    private static List<Produto> listaProduto = new ArrayList<Produto>();
    
    //Inseri produtos
    public static void inserir(Produto produto)
            throws Exception {
        setTotalProduto(getTotalProduto()+1);
        listaProduto.add(produto);
    }
    
    //Atualização dos dados de um produto
    public static void atualizar (Produto produtoProcura)
            throws Exception{
        if(produtoProcura != null && !listaProduto.isEmpty() ){
            for(Produto produtoAtz : listaProduto){
                if(produtoAtz != null && produtoAtz.getCod_produto()== produtoProcura.getCod_produto()){
                   produtoAtz.setModelo(produtoProcura.getModelo());
                   produtoAtz.setTamanho(produtoProcura.getTamanho());
                   produtoAtz.setMarca(produtoProcura.getMarca());
                   produtoAtz.setCor(produtoProcura.getCor());
                   produtoAtz.setPreco(produtoProcura.getPreco());
                   break;
                }
                
                }
                
                }
                }
    //Exclui o produto com o cod.
    public static void excluir(Long id) throws Exception{
        if(id != null && !listaProduto.isEmpty()){
          for(int i=0; i < listaProduto.size(); i++){
              Produto produtoLa = listaProduto.get(i);
              if(produtoLa != null && produtoLa.getCod_produto()== id){
                  listaProduto.remove(i);
                  break;
              }
          }
    }
    }
    
    //lista os produtos
    public static List<Produto> listar()
        throws Exception {
        return listaProduto;
    }
    
    //Procura um produto na lista de acordo com o id
    public static  List<Produto> procurar(Long valor)
            throws Exception{
        List<Produto> listaResultado = new ArrayList<Produto>();
        
        if(valor != null && !listaProduto.isEmpty()){
            for(Produto produtoLa : listaProduto){
                if(produtoLa != null && produtoLa.getCod_produto() != null ){
                    if(produtoLa.getCod_produto()== valor){
                        listaResultado.add(produtoLa);
                    }
                }
            }
    }
        //Lista de clientes encontrados
        return listaResultado;   
    }
    //obtem um produto na lista 
    public  static Produto obter(Long id)
            throws Exception{
        if(id != null && !listaProduto.isEmpty()){
            for(int i=0 ; i<listaProduto.size(); i++){
                if(listaProduto.get(i) != null && listaProduto.get(i).getCod_produto()== id){
                    return listaProduto.get(i);
                    
                }}
            
        }
    
    return  null;
}

    public static long getTotalProduto() {
        return totalProduto;
    }

    public static void setTotalProduto(long totalProduto) {
        MockProduto.totalProduto = totalProduto;
    }
    
    
    
}
    
    
