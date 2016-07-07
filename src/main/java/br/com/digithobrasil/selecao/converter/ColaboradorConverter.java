package br.com.digithobrasil.selecao.converter;

import java.util.Map;
import java.util.Map.Entry;
import java.util.UUID;
import java.util.WeakHashMap;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

import br.com.digithobrasil.selecao.model.Colaborador;


@FacesConverter(value="br.com.digithobrasil.selecao.converter.ColaboradorConverter", forClass = Colaborador.class)
public class ColaboradorConverter implements Converter{

	private static Map<Object, String> entities = new WeakHashMap<Object, String>();
		
		@Override
		public Object getAsObject(FacesContext context, UIComponent component,
				String value) {
			
			 for (Entry<Object, String> entry : entities.entrySet()) {
		            if (entry.getValue().equals(value)) {
		                return entry.getKey();
		            }
		        }
		        return null;
		}

		@Override
		public String getAsString(FacesContext fc, UIComponent uic, Object object) {
			
			synchronized (entities) {
	            if (!entities.containsKey(object)) {
	                String uuid = UUID.randomUUID().toString(); 
	                entities.put(object, uuid);
	                return uuid;
	            } else {
	                return entities.get(object);
	            }
			}
		}

}
