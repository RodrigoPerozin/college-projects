package modelo;

public abstract class Aberturas {
	
	protected String descricao;
	protected int estado;
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setEstado(int estado) {
		this.estado = estado;
	}
	
	public int getEstado() {
		return estado;
	}
	
}
