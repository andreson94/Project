package service;


import Mock.MockVenda;
import Telas.Relatorio;
import exceptions.DataSourceException;
import exceptions.VendaException;
import java.util.List;
import javax.swing.JFormattedTextField;
import model.validador.produto.ValidadorProduto;
import model.validadorVenda.ValidadorVenda;
import model.venda.Venda;

public class ServicoVenda {
 public static void cadastrarVenda(Venda venda)
            throws VendaException, DataSourceException {
        
        venda.setId(MockVenda.getTotalVenda());
        //Realiza validações do produto
        ValidadorVenda.validar(venda);

        try {
            //Realiza a chamada de inserção 
            MockVenda.inserir(venda);
        } catch (Exception e) {
            //Imprime qualquer erro técnico no console 
            e.printStackTrace();
            throw new DataSourceException("Erro na fonte de dados", e);
        }
    }

    //Atualiza um produto
    public static void atualizarProduto(Venda venda)
            throws VendaException, DataSourceException {

        //Realiza validações do produto
        ValidadorVenda.validar(venda);

        try {
            //Realiza a chamada de atualização 
            MockVenda.atualizar(venda);
            return;
        } catch (Exception e) {
            //Imprime qualquer erro técnico no console 
            e.printStackTrace();
            throw new DataSourceException("Erro na fonte de dados", e);
        }
    }

    //Realiza a pesquisa de um produto por número 
    public static List<Venda> procurarVenda(String numero)
            throws VendaException, DataSourceException {
        try {
            //Verifica se um parâmetro de pesquisa não foi informado.
            //Caso afirmativo, realiza uma listagem simples do mock.
            //Caso contrário, realiza uma pesquisa com o parâmetro
            if (numero == null) {
                return MockVenda.listar();
            } else {
                return MockVenda.procurar(numero);
            }
        } catch (Exception e) {
            //Imprime qualquer erro técnico no console 
            e.printStackTrace();
            throw new DataSourceException("Erro na fonte de dados", e);
        }
    }

    //Obtem o produto com ID informado do mock
    public static Venda obterProduto(Integer id)
            throws VendaException, DataSourceException {
        try {
            //Retorna o produto obtido com o DAO
            return MockVenda.obter(id);
        } catch (Exception e) {
            //Imprime qualquer erro técnico no console 
            e.printStackTrace();
            throw new DataSourceException("Erro na fonte de dados", e);
        }
    }

    //Exclui o produto com ID informado do mock
    public static void excluirProduto(Integer id)
            throws VendaException, DataSourceException {
        try {
            //Solicita ao DAO a exclusão do produto informado
            MockVenda.excluir(id);
        } catch (Exception e) {
            //Imprime qualquer erro técnico no console 

            e.printStackTrace();
            throw new DataSourceException("Erro na fonte de dados", e);
        }
    }

    public static Relatorio obterProduto(JFormattedTextField textDataInicial) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

