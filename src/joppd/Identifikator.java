package joppd;
import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
public class Identifikator {
	@XmlAttribute(name="dc")
	private String putanja;
	
	@XmlValue
	private String vrijednost;

	public String getPutanja() {
		return putanja;
	}

	public void setPutanja(String putanja) {
		this.putanja = putanja;
	}

	
	
	public String getVrijednost() {
		return vrijednost;
	}

	public void setVrijednost(String vrijednost) {
		this.vrijednost = vrijednost;
	}

	@Override
	public String toString() {
	return "Naslov = "+vrijednost+System.lineSeparator()+"atribut = "+ putanja;
	}
}
