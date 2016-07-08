package joppd;
import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
public class IzvjesceSastavio {
	
	@XmlElement(name = "Ime")
	public String ime;

	@XmlElement(name = "Prezime")
	public String prezime;

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public String getPrezime() {
		return prezime;
	}

	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}
	
	@Override
	public String toString() {
	return "Ime = "+ime+System.lineSeparator()+
			"Prezime = "+prezime+System.lineSeparator();
	}
}
