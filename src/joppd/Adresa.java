package joppd;
import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
public class Adresa {
	@XmlElement(name = "Mjesto")
	public String mjesto;
	
	@XmlElement(name = "Ulica")
	public String ulica;

	@XmlElement(name = "Broj")
	public String broj;

	public String getMjesto() {
		return mjesto;
	}

	public void setMjesto(String mjesto) {
		this.mjesto = mjesto;
	}

	public String getUlica() {
		return ulica;
	}

	public void setUlica(String ulica) {
		this.ulica = ulica;
	}

	public String getBroj() {
		return broj;
	}

	public void setBroj(String broj) {
		this.broj = broj;
	}
	
	@Override
	public String toString() {
	return "mjesto = "+mjesto+System.lineSeparator()+
			"ulica = "+ ulica+System.lineSeparator()+
			"broj = "+ broj+System.lineSeparator();
	}
}
