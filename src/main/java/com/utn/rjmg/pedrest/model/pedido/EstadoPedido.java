package com.utn.rjmg.pedrest.model.pedido;

public enum EstadoPedido {
	PENDIENTE(1, "Pendiente"),
	EN_PROCESO(2, "En_proceso"),
	DESPACHADO(3, "Despachado");
	
	private Integer id;
	private String desc;
	
	private EstadoPedido(Integer id, String desc) {
		this.id = id;
		this.desc = desc;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}
}
