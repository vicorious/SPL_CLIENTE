package co.com.vicorious.pruebas.persistencia.entidades;


import co.com.vicorious.persistencia.anotaciones.Tabla;
/**
 *  <p>entidades</p>	
 * 	 @author Alejandro Lindarte Castro <strong>Copyright 2017</strong>
 * 	 <br>
 * 	 <h3>Licencia: </h3>
 * 	 <p>
 * 	 This program is free software: you can redistribute it and/or modify
 *   it under the terms of the GNU General Public License as published by
 *   the Free Software Foundation, either version 3 of the License, or
 *   (at your option) any later version.
 *
 *   This program is distributed in the hope that it will be useful,
 *   but WITHOUT ANY WARRANTY; without even the implied warranty of
 *   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *   GNU General Public License for more details.
 *
 *   You should have received a copy of the GNU General Public License
 *   along with this program.  If not, see {@literal <http://www.gnu.org/licenses/>}
 *   </p>
 *   
 *   <h3>Descripcion :</h3>  
 *   
 *    Esta clase nos encapsula la tabla "PARAMETRO" de la base de datos
 *    
 *   */
@Tabla(nombre = "PARAMETRO")
public class Parametro 
{
	private int id;
	
	private String codigo;
	
	private String nombre;

	/**
	 * Getter
	 * @return id de la entidad
	 */
	public int getId() 
	{
		return id;
	}

	/**
	 * Setter
	 * @param id: id a asignar
	 */
	public void setId(int id) 
	{
		this.id = id;
	}

	/**
	 * Getter
	 * @return: codigo de la entidad
	 */
	public String getCodigo() 
	{
		return codigo;
	}

	/**
	 * Setter
	 * @param codigo: codigo a asignar
	 */
	public void setCodigo(String codigo) 
	{
		this.codigo = codigo;
	}

	/**
	 * Getter
	 * @return: nombre de la entidad
	 */
	public String getNombre() 
	{
		return nombre;
	}

	/**
	 * Setter
	 * @param nombre: nombre a asignar
	 */
	public void setNombre(String nombre) 
	{
		this.nombre = nombre;
	}
		
}//Parametro
