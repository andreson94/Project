package Mock;

import java.util.ArrayList;
import java.util.List;
import model.venda.Venda;

public class MockVenda {
    private static int totalVenda=0;
    //Armazena a lista de Clientes
    private static List<Venda> listaVenda = new ArrayList<Venda>();
    
    //Inserir um Cliente no Mock
    public static void inserir (Venda venda)
            throws Exception{
        venda.setId(totalVenda++);
        listaVenda.add(venda);
    }
    
    //Realiza a atualização dos dados de um cliente, com ID e dados
    //fornecidos como parâmetro através de um objeto da classe "Cliente"
    public static void atualizar (Venda vendaProcura)
            throws Exception{
        if(vendaProcura != null && vendaProcura.getId() != null && !listaVenda.isEmpty()){
            for(Venda vendaAtz : listaVenda){
                if(vendaAtz != null && vendaAtz.getId() == vendaProcura.getId() ){
                    vendaAtz.setCliente(vendaProcura.getCliente());
                    vendaAtz.setData(vendaProcura.getData());
                    vendaAtz.setProduto(vendaProcura.getProduto());
                    vendaAtz.setValor(vendaProcura.getValor());
                   
                    
                } 
            }
        }
    }
      //Realiza a exclusão de um cliente, com o Id
    public static void excluir (Integer id) throws Exception{
        if(id != null && !listaVenda.isEmpty()){
            for(int i=0; i < listaVenda.size(); i++){
                Venda vendaAtz = listaVenda.get(i);
                if(vendaAtz != null && vendaAtz.getId() == id){
                    listaVenda.remove(i);
                    break;
                }
            }
        }
    }
    
    //Lista todos os Clientes
    public static List<Venda> listar()
            throws Exception{
        return listaVenda;
    }
    
    //Procura um cliente, com o nome ou sobrenome
    public static List<Venda> procurar(String valor)
            throws Exception{
        List<Venda> listaResultado = new ArrayList<Venda>();
        
        if(valor != null && !listaVenda.isEmpty()){
            for(Venda vendaAtz : listaVenda){
                if(vendaAtz != null && vendaAtz.getCliente()!= null ){
                    
                }
            }
        }
        //Returna a lista de clientes encontrados
        return listaResultado;
    }
    
     //Obtém um cliente da lista
    public static Venda obter (Integer id)
            throws Exception{
        if(id != null && !listaVenda.isEmpty()){
            for(int i=0;  i<listaVenda.size(); i++){
                if(listaVenda.get(i) != null && listaVenda.get(i).getId() == id ){
                    return listaVenda.get(i);
                }
            }
        }
        return null;
    }
    
     public static int getTotalVenda() {
        return totalVenda;
    }

    public static void setTotalVenda(int totalVenda) {
        MockVenda.totalVenda = totalVenda;
    }
    
    
    
}
    
    
    
    


