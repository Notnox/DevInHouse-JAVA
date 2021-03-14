package Semana1Modulo02Ex10;

public class Fatura {
	private String numero;
	private String descricao;
	private int quantidade;
	private double precoPorItem;
	
	public Fatura(String numero, String descricao, int quantidade, double precoPorItem) {
		this.numero = numero;
		this.descricao = descricao;
		this.quantidade = (int) verificarPositivo(quantidade);
		this.precoPorItem = verificarPositivo(precoPorItem);
	}
	
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public double getPrecoPorItem() {
		return precoPorItem;
	}
	public void setPrecoPorItem(double precoPorItem) {
		this.precoPorItem = precoPorItem;
	}
	
	public double getValorFatura() {
		return this.quantidade * this.precoPorItem;
	}
	
	private double verificarPositivo(double valor) {
		if (valor > 0) {
			return valor;
		} else {
			return 0;
		}
	}
}
