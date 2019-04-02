package tscislo;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class TomekBean {
	private String name = "tomek";
	private Integer value = 0;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getValue() {
		return ++value;
	}

	public void setValue(Integer value) {
		this.value = value;
	}
}