package gestion;

import java.util.*;

public class Zoologico {
	private String nombre;
	private String ubicacion;
	private List<Zona> zonas = new ArrayList<Zona>();
	
	public Zoologico() {}
	
	public Zoologico(String nombre, String ubicacion) {
		this.nombre = nombre;
		this.ubicacion = ubicacion;
	}
	
	public void agregarZonas(Zona zona) {
		zona.setZoo(this);
		zonas.add(zona);
	}
	
	public int cantidadTotalAnimales() {
		int totalAnimales = 0;
		for(int i = 0; i < zonas.size(); i++) {
			totalAnimales += zonas.get(i).cantidadAnimales();
		}
		return totalAnimales;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	public List<Zona> getZonas() {
		return zonas;
	}

	public void setZonas(List<Zona> zonas) {
		this.zonas = zonas;
	}
}
