package br.com.digithobrasil.selecao.controller;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

public class Controller {
	
	
	public void addErrorMessage(String message) {
		FacesContext.getCurrentInstance()
				.addMessage(
						null,
						new FacesMessage(FacesMessage.SEVERITY_ERROR, message,
								null));
	}

	public void addSucessMessage(String message) {
		FacesContext.getCurrentInstance().addMessage(null,
				new FacesMessage(FacesMessage.SEVERITY_INFO, message, null));
	}

	public void addWarnMessage(String message) {
		FacesContext.getCurrentInstance().addMessage(null,
				new FacesMessage(FacesMessage.SEVERITY_WARN, message, null));
	}

}
