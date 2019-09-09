package com.utn.rjmg.pedrest.model.comida;

public enum DiaSemana {
	LUNES(1, "Lunes"),
	MARTES(2, "Martes"),
	MIERCOLES(3, "Miercoles"),
	JUEVES(4, "Jueves"),
	VIERNES(5, "Viernes"),
	SABADO(6, "Sabado"),
	DOMINGO(7, "Domingo");
	
	private Integer id;
	private String desc;
	
	private DiaSemana(Integer id, String desc) {
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
