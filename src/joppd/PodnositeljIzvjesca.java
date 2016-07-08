package joppd;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
public class PodnositeljIzvjesca {
	
	@XmlElement(name = "Naziv")
	public String naziv;
	
	@XmlElement(name = "Adresa")
	public List <Adresa> adresa;
	
	@XmlElement(name = "Email")
	public String email;
	
	@XmlElement(name = "OIB")
	public String oIB;
	
	@XmlElement(name = "Oznaka")
	public String oznaka;
	
	public PodnositeljIzvjesca (){
		adresa = new ArrayList <Adresa>();
	
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public List<Adresa> getAdresa() {
		return adresa;
	}

	public void setAdresa(Adresa adresa) {
		this.adresa.add(adresa);
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getoIB() {
		return oIB;
	}

	public void setoIB(String oIB) {
		this.oIB = oIB;
	}

	public String getOznaka() {
		return oznaka;
	}

	public void setOznaka(String oznaka) {
		this.oznaka = oznaka;
	}

		@Override
		public String toString() {
		return "naziv = "+naziv+System.lineSeparator()+
				"adresa = "+ adresa+System.lineSeparator()+
				"email = "+ email+System.lineSeparator()+
				"OIB = "+ oIB+System.lineSeparator()+
				"oznaka = "+ oznaka+System.lineSeparator();
		}
	
}
