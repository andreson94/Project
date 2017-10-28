/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mock;

import java.util.ArrayList;
import java.util.List;
import model.cliente.Cliente;


public class MockCliente {
    private static int totalClientes=0;
    //Armazena a lista de Clientes
    private static List<Cliente> listaCliente = new ArrayList<Cliente>();
    
    //Inserir um Cliente no Mock
    public static void inserir (Cliente cliente)
            throws Exception{
        cliente.setId(totalClientes++);
        listaCliente.add(cliente);
    }
    
    //Realiza a atualização dos dados de um cliente, com ID e dados
    //fornecidos como parâmetro através de um objeto da classe "Cliente"
    public static void atualizar (Cliente clienteProcura)
            throws Exception{
        if(clienteProcura != null && clienteProcura.getId() != null && !listaCliente.isEmpty()){
            for(Cliente clienteAtz : listaCliente){
                if(clienteAtz != null && clienteAtz.getId() == clienteProcura.getId() ){
                    clienteAtz.setNome(clienteProcura.getNome());
                    clienteAtz.setSobrenome(clienteProcura.getSobrenome());
                    clienteAtz.setDataNasc(clienteProcura.getDataNasc());
                    clienteAtz.setRg(clienteProcura.getRg());
                    clienteAtz.setCpf(clienteProcura.getCpf());
                    clienteAtz.setSexo(clienteProcura.getSexo());
                    clienteAtz.setEstadoCivil(clienteProcura.getEstadoCivil());
                    clienteAtz.setEmail(clienteProcura.getEmail());
                    clienteAtz.setTelefone(clienteProcura.getTelefone());
                    clienteAtz.setCep(clienteProcura.getCep());
                    clienteAtz.setEndereco(clienteProcura.getEndereco());
                    clienteAtz.setNumEnd(clienteProcura.getNumEnd());
                    clienteAtz.setComplemento(clienteProcura.getComplemento());
                    clienteAtz.setBairro(clienteProcura.getBairro());
                    clienteAtz.setCidade(clienteProcura.getCidade());
                    clienteAtz.setEstado(clienteProcura.getEstado());
                    
                } 
            }
        }
    }
      //Realiza a exclusão de um cliente, com o Id
    public static void excluir (Integer id) throws Exception{
        if(id != null && !listaCliente.isEmpty()){
            for(int i=0; i < listaCliente.size(); i++){
                Cliente clienteAtz = listaCliente.get(i);
                if(clienteAtz != null && clienteAtz.getId() == id){
                    listaCliente.remove(i);
                    break;
                }
            }
        }
    }
    
    //Lista todos os Clientes
    public static List<Cliente> listar()
            throws Exception{
        return listaCliente;
    }
    
    //Procura um cliente, com o nome ou sobrenome
    public static List<Cliente> procurar(String valor)
            throws Exception{
        List<Cliente> listaResultado = new ArrayList<Cliente>();
        
        if(valor != null && !listaCliente.isEmpty()){
            for(Cliente clienteAtz : listaCliente){
                if(clienteAtz != null && clienteAtz.getNome() != null && clienteAtz.getSobrenome() != null){
                    if(clienteAtz.getNome().toUpperCase().contains(valor.toUpperCase())
                          || clienteAtz.getSobrenome().toUpperCase().contains(valor.toUpperCase())  ){
                        
                    }
                }
            }
        }
        //Returna a lista de clientes encontrados
        return listaResultado;
    }
    
     //Obtém um cliente da lista
    public static Cliente obter (Integer id)
            throws Exception{
        if(id != null && !listaCliente.isEmpty()){
            for(int i=0;  i<listaCliente.size(); i++){
                if(listaCliente.get(i) != null && listaCliente.get(i).getId() == id ){
                    return listaCliente.get(i);
                }
            }
        }
        return null;
    }
    
    
    
    
    
    
}
