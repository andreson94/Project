package service.produto;

import Mock.MockProduto;
import exceptions.DataSourceException;
import exceptions.ProdutoException;
import java.util.List;
import model.produto.Produto;
import model.validador.produto.ValidadorProduto;

/**
 * @author andreson.csilva
 */
public class ServicoProduto {

    public static void cadastrarProduto(Produto produto)
            throws ProdutoException, DataSourceException {
        
        produto.setCod_produto(MockProduto.getTotalProduto());
        //Realiza validações do produto
        ValidadorProduto.validar(produto);

        try {
            //Realiza a chamada de inserção 
            MockProduto.inserir(produto);
        } catch (Exception e) {
            //Imprime qualquer erro técnico no console 
            e.printStackTrace();
            throw new DataSourceException("Erro na fonte de dados", e);
        }
    }

    //Atualiza um produto
    public static void atualizarProduto(Produto produto)
            throws ProdutoException, DataSourceException {

        //Realiza validações do produto
        ValidadorProduto.validar(produto);

        try {
            //Realiza a chamada de atualização 
            MockProduto.atualizar(produto);
            return;
        } catch (Exception e) {
            //Imprime qualquer erro técnico no console 
            e.printStackTrace();
            throw new DataSourceException("Erro na fonte de dados", e);
        }
    }

    //Realiza a pesquisa de um produto por número 
    public static List<Produto> procurarProduto(Long numero)
            throws ProdutoException, DataSourceException {
        try {
            //Verifica se um parâmetro de pesquisa não foi informado.
            //Caso afirmativo, realiza uma listagem simples do mock.
            //Caso contrário, realiza uma pesquisa com o parâmetro
            if (numero == null) {
                return MockProduto.listar();
            } else {
                return MockProduto.procurar(numero);
            }
        } catch (Exception e) {
            //Imprime qualquer erro técnico no console 
            e.printStackTrace();
            throw new DataSourceException("Erro na fonte de dados", e);
        }
    }

    //Obtem o produto com ID informado do mock
    public static Produto obterProduto(Long id)
            throws ProdutoException, DataSourceException {
        try {
            //Retorna o produto obtido com o DAO
            return MockProduto.obter(id);
        } catch (Exception e) {
            //Imprime qualquer erro técnico no console 
            e.printStackTrace();
            throw new DataSourceException("Erro na fonte de dados", e);
        }
    }

    //Exclui o quarto com ID informado do mock
    public static void excluirProduto(Long id)
            throws ProdutoException, DataSourceException {
        try {
            //Solicita ao DAO a exclusão do produto informado
            MockProduto.excluir(id);
        } catch (Exception e) {
            //Imprime qualquer erro técnico no console 

            e.printStackTrace();
            throw new DataSourceException("Erro na fonte de dados", e);
        }
    }
}
