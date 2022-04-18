package com.example.listadecompras.validator;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

@FacesValidator("com.example.listadecompras.validator.QuantityValidator")
public class QuantityValidator implements Validator {
    @Override
    public void validate(FacesContext facesContext, UIComponent uiComponent, Object value) throws ValidatorException {
        Float valueParser = (Float) value;
        if (valueParser > 0) {
            return;
        }
        FacesMessage msg = new FacesMessage("Esse campo deve ser um número maior que 0");
        msg.setSeverity(FacesMessage.SEVERITY_ERROR);
        throw new ValidatorException(msg);
    }
}