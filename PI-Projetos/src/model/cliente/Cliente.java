
package model.cliente;


public class Cliente {
    private int idCliente;
    private String nome;
    private String sobrenome;
    private String dataNasc;
    private String rg;
    private String cpf;
    private String sexo;
    private String estadoCivil;
    private String email;
    private String telefone;
    private String cep;
    private String endereco;
    private String numEnd;
    private String complemento;
    private String bairro;
    private String cidade;
    private String estado;
    
    public Cliente(int idCliente,String nome,String sobrenome,String datanasc,String rg,String cpf,
            String sexo,String estadoCivil,String email,String telefone,String cep,
            String endereco,String numEnd,String complemento,String bairro,String cidade,String estado){
        
        this.idCliente = idCliente;
        this.nome=nome;
        this.sobrenome = sobrenome;
        this.dataNasc=datanasc;
        this.rg = rg;
        this.cpf=cpf;
        this.sexo = sexo;
        this.estadoCivil=estadoCivil;
        this.email = email;
        this.telefone = telefone;
        this.cep = cep;
        this.endereco = endereco;
        this.numEnd = numEnd;
        this.complemento = complemento;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
    }

    public int idCliente() {
        return idCliente;
    }

    
    public void setidCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNome() {
        return nome;
    }

    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getNumEnd() {
        return numEnd;
    }

    public void setNumEnd(String numEnd) {
        this.numEnd = numEnd;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
}
