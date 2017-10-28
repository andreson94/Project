package model.validador.cliente;

import exceptions.ClienteException;
import model.cliente.Cliente;

//validador de dados do cliente
public class ValidadorCliente {
    public static void validar(Cliente cliente)throws ClienteException{
        //realização de validações 
           if (cliente == null) {
            throw new ClienteException("Não foi informado um cliente");
        }
        if (cliente.getNome() == null || "".equals(cliente.getNome())) {
            throw new ClienteException("Por favor informe "
                    + "um nome de cliente");
        }
        if (cliente.getSobrenome() == null
                || "".equals(cliente.getSobrenome())) {
            throw new ClienteException("Por favor informe um "
                    + "sobrenome de cliente");
        }
        if (cliente.getDataNasc() == null) {
            throw new ClienteException("por favor informe um "
                    + "valor de idade válido");
        }
        if(cliente.getRg() == null || "".equals(cliente.getRg())){
            throw new ClienteException("Por favor informe o"
                   + "o RG do cliente");
        }
        if(cliente.getCpf()== null || "".equals(cliente.getCpf())){
            throw new ClienteException("Por favor informe o"
                   + "o Cpf do cliente");
        }
        if (cliente.getSexo() == null || "".equals(cliente.getSexo())
                || (!cliente.getSexo().equals("Masculino"))
                && !cliente.getSexo().equals("Feminino")) {
            throw new ClienteException("Por favor informe o "
                    + "gênero do cliente");
        }
        if (cliente.getEstadoCivil()== null || "".equals(cliente.getEstadoCivil())
                || (!cliente.getEstadoCivil().equals("Solteiro"))
                && !cliente.getEstadoCivil().equals("Casado")) {
            throw new ClienteException("Por favor informe o "
                    + "Estado Civil do cliente");
        }
        if(cliente.getEmail()== null || "".equals(cliente.getEmail())){
            throw new ClienteException("Por favor informe o"
                   + "o Email do cliente");
        }
        if(cliente.getTelefone()== null || "".equals(cliente.getTelefone())){
            throw new ClienteException("Por favor informe o"
                   + "o Telefone do cliente");
        }
        if(cliente.getCep()== null || "".equals(cliente.getCep())){
            throw new ClienteException("Por favor informe o"
                   + "o Cep do cliente");
        }
        if(cliente.getCep()== null || "".equals(cliente.getCep())){
            throw new ClienteException("Por favor informe o"
                   + "o Cep do cliente");
        }
        
        
    }
}

