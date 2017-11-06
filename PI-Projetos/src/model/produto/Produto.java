package model.produto;


public class Produto {
    private Integer id;
    private Long cod_produto;
    private String modelo;
    private String tamanho;
    private String marca;
    private String cor;
    private String genero;
    private Float preco;
  
//metodo para acessar valor do codigo
    public Long getCod_produto(){
        return cod_produto;
    }
    public void setCod_produto(Long cod_produto){
        this.cod_produto = cod_produto;
    }
    public String getGenero(){
        return genero;
    }
    public void setGenero(String genero){
        this.genero = genero;
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id){
        this.id = id;
    }
//motodo para acessar o modelo
    public String getModelo() {
        return modelo;
    }
//metodo para alterar o modelo 
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
//acessa o tamanho do produto
    public String getTamanho() {
        return tamanho;
    }
//altera o tamanho do produto
    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }
//acessa a marca do produto 
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }

    
    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    
    public Float getPreco() {
        return preco;
    }

    
    public void setPreco(Float preco) {
        this.preco = preco;
    }

    public Object getCódigo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Object getEstoque() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
