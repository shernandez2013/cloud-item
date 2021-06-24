package com.formacionbdi.springboot.app.item.models;

import java.io.Serializable;
import java.util.Date;

public class Producto implements Serializable {
    private Long id;
    private String nombre;
    private Long precio;
    private Date createAt;
    private Integer port;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Long getPrecio() {
        return precio;
    }

    public void setPrecio(Long precio) {
        this.precio = precio;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

	public Integer getPort() {
		return port;
	}

	public void setPort(Integer port) {
		this.port = port;
	}


}
