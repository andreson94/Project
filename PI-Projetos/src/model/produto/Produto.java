package model.produto;


public class Produto {
    private Integer id;
    private Long numero;
    private String modelo;
    private String tamanho;
    private String marca;
    private String cor;
    private float preco;
  
//metodo para acessar valor do codigo
    public Long getNumero(){
        return numero;
    }
    public void setNumero(Long numero){
        this.numero = numero;
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

    
    public float getPreco() {
        return preco;
    }

    
    public void setPreco(float preco) {
        this.preco = preco;
    }
    
    
}
