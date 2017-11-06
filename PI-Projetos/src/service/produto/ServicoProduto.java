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
    //Realiza validações no quarto
        ValidadorProduto.validar(produto);

        try {
            //Realiza a chamada de inserção na fonte de dados
            MockProduto.inserir(produto);
        } catch (Exception e) {
            //Imprime qualquer erro técnico no console e devolve
            //uma exceção e uma mensagem amigável a camada de visão
            e.printStackTrace();
            throw new DataSourceException("Erro na fonte de dados", e);
        }
    }
    //Atualiza um quarto na fonte de dados
    public static void atualizarQuarto(Produto produto)
            throws ProdutoException, DataSourceException {
        
        //Realiza validações no quarto
        ValidadorProduto.validar(produto);

        try {
            //Realiza a chamada de atualização na fonte de dados
            MockProduto.atualizar(produto);
            return;
        } catch (Exception e) {
            //Imprime qualquer erro técnico no console e devolve
            //uma exceção e uma mensagem amigável a camada de visão
            e.printStackTrace();
            throw new DataSourceException("Erro na fonte de dados", e);
        }
    }

    //Realiza a pesquisa de um quarto por número na fonte de dados
    public static List<Produto> procurar(Long numero)
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
            //Imprime qualquer erro técnico no console e devolve
            //uma exceção e uma mensagem amigável a camada de visão
            e.printStackTrace();
            throw new DataSourceException("Erro na fonte de dados", e);
        }
    }

    //Obtem o quarto com ID informado do mock
    public static Produto obterProduto(Integer id)
            throws ProdutoException, DataSourceException {
        try {
            //Retorna o quarto obtido com o DAO
            return MockProduto.obter(id);
        } catch (Exception e) {
            //Imprime qualquer erro técnico no console e devolve
            //uma exceção e uma mensagem amigável a camada de visão
            e.printStackTrace();
            throw new DataSourceException("Erro na fonte de dados", e);
        }
    }

    //Exclui o quarto com ID informado do mock
    public static void excluirProduto(Integer id)
            throws ProdutoException, DataSourceException {
        try {
            //Solicita ao DAO a exclusão do quarto informado
            MockProduto.excluir(id);
        } catch (Exception e) {
            //Imprime qualquer erro técnico no console e devolve
            //uma exceção e uma mensagem amigável a camada de visão
            e.printStackTrace();
            throw new DataSourceException("Erro na fonte de dados", e);
        }
    }    
}
