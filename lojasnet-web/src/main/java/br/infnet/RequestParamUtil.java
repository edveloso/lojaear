package br.infnet;

import java.util.Map;

import javax.faces.context.FacesContext;

public class RequestParamUtil {

	public static String getRequestParameter(String parametro) {
		FacesContext context = FacesContext.getCurrentInstance();
		Map<String, String> map = context.getExternalContext().getRequestParameterMap();
		String id = map.get(parametro);
		return id;
	}
	
}
