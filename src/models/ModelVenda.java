package models;
public class ModelVenda {
    
    private int id_Venda;
    private String Data;
    private float Valor;
    private String nomeCliente;
    private String nomeProduto;
    private int qtdItem;
    /**
     * @return the id_Venda
     */
    public int getId_Venda() {
        return id_Venda;
    }

    /**
     * @param id_Venda the id_Venda to set
     */
    public void setId_Venda(int id_Venda) {
        this.id_Venda = id_Venda;
    }

    /**
     * @return the Data
     */
    public String getData() {
        return Data;
    }

    /**
     * @param Data the Data to set
     */
    public void setData(String Data) {
        this.Data = Data;
    }

    /**
     * @return the Valor
     */
    public float getValor() {
        return Valor;
    }

    /**
     * @param Valor the Valor to set
     */
    public void setValor(float Valor) {
        this.Valor = Valor;
    }

    /**
     * @return the nomeCliente
     */
    public String getNomeCliente() {
        return nomeCliente;
    }

    /**
     * @param nomeCliente the nomeCliente to set
     */
    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    /**
     * @return the nomeProduto
     */
    public String getNomeProduto() {
        return nomeProduto;
    }

    /**
     * @param nomeProduto the nomeProduto to set
     */
    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    /**
     * @return the qtdItem
     */
    public int getQtdItem() {
        return qtdItem;
    }

    /**
     * @param qtdItem the qtdItem to set
     */
    public void setQtdItem(int qtdItem) {
        this.qtdItem = qtdItem;
    }
    
}
