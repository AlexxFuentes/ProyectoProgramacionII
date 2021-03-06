package GestionClases;

/*
* AUTORA: GLENY NIHIMAYA

* CLASE: GESTION PAGO SERVICIOS PUBLICOS
* DESCRIPCION: MUESTRA LAS OPERACIONES QUE SE
*             PUEDEN HACER CON ESTA CLASE.
* FECHA: 18/07/2020
*/

import java.util.LinkedList;

import clases.PagoServiciosPublicos;
import clases.ServiciosAPagar;

public class GestionPagoServiciosPublicos {
	private LinkedList<PagoServiciosPublicos> lstPagoServicios=new LinkedList<>();

	public GestionPagoServiciosPublicos() {
		super();
	}

	public LinkedList<PagoServiciosPublicos> getLstPagoServicios() {
		return lstPagoServicios;
	}

	public void setLstPagoServicios(LinkedList<PagoServiciosPublicos> lstPagoServicios) {
		this.lstPagoServicios = lstPagoServicios;
	}
       
	/**
	 * METODO UTILIZADO PARA BUSCAR EL SERVICIO PUBLICO A PAGAR
	 * @param servPagar
	 * @return TRUE-SI SE REALIZO CORRECTAMENTE, CASO CONTRARIO RETORNA FALSE
	 */
	
	public PagoServiciosPublicos BuscarPago(ServiciosAPagar serviciopagar) {
		PagoServiciosPublicos servicioBuscado = null;
		
		for(int i=0;i<lstPagoServicios.size();i++) {
			if(lstPagoServicios.get(i).get_servicioaPagar() == serviciopagar) {
				servicioBuscado = lstPagoServicios.get(i);
				break;
			}
		}
		return servicioBuscado;
	}
	/**
	 * METODO UTILIZADO PARA AGREGAR EL SERVICIO PUBLICO A PAGAR
	 * @param servPagar
	 * @return TRUE-SI SE REALIZO CORRECTAMENTE, CASO CONTRARIO RETORNA FALSE
	 */
	public boolean AgregarServicioAPagar(PagoServiciosPublicos servPagar) {
		if(BuscarPago(servPagar.get_servicioaPagar())==null) {
			return false;
		}else {
			lstPagoServicios.add(servPagar);
			return true;
		}
	}
	
	/**
	 * METODO UTILIZADO PARA MODIFICAR EL SERVICIO PUBLICO A PAGAR
	 * @param servPagar
	 * @return TRUE-SI SE REALIZO CORRECTAMENTE, CASO CONTRARIO RETORNA FALSE
	 */
	public boolean ModificarPago(PagoServiciosPublicos pagoModificado, int posicion ) {
		if(posicion<0 || posicion>lstPagoServicios.size()) {
			return false;
		}else {
			PagoServiciosPublicos posicionEncontrada=BuscarPago(pagoModificado.get_servicioaPagar());
			
			if(posicionEncontrada==null) {
				lstPagoServicios.set(posicion, pagoModificado);
			}
		}
		return false;
		
	}
	
	/**
	 * METODO UTILIZADO PARA ELIMINAR EL SERVICIO PUBLICO A PAGAR
	 * @param servPagar
	 * @return TRUE-SI SE REALIZO CORRECTAMENTE, CASO CONTRARIO RETORNA FALSE
	 */
	
	public boolean EliminarPago(PagoServiciosPublicos servicioPagar) {
		if(BuscarPago(servicioPagar.get_servicioaPagar()) != null) {
			return false;
		}else {
		     lstPagoServicios.remove(servicioPagar);
		     return true;
	    }
	
	}
	
	/**
	 * METODO PARA IMPRIMIR TODOS
	 */
	public void imprimirTodos() {
		for(int i=0;i<lstPagoServicios.size();i++) {
			System.out.println(lstPagoServicios.get(i));
		}
	}
	
	/**
	 * M�TODO PARA OBTENER POSICI�N DE LA COLECCI�N PagoServiciosPublicos
	 * @param posicion
	 * @return POSICI�N O INDICE DE LA COLECI�N
	 */
	public PagoServiciosPublicos getPosicion(int posicion) {
		return lstPagoServicios.get(posicion);
	}
}
