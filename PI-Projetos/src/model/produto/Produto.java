package model.produto;


public class Produto {
    private int codProduto;
    private String modelo;
    private String tamanho;
    private String marca;
    private String cor;
    private float preco;

//metodo construtor
    public Produto(String modelo,String tamanho,String marca,String cor,float preco){
        this.modelo = modelo;
        this.tamanho = tamanho;
        this.marca = marca;
        this.cor = cor;
        this.preco = preco;
    }
//metodo para acessar valor do codigo
    public int getCodProduto() {
        return codProduto;
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
