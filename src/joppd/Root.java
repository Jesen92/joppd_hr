package joppd;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.*;



@XmlAccessorType(XmlAccessType.FIELD)

@XmlRootElement(name = "ObrazacJOPPD")
public class Root {
	
	
	@XmlAttribute(name="verzijaSheme")
	private String verzijaSheme;
	
	@XmlElement(name = "Metapodaci")
	private List <Metapodaci> metapodaci;
	
	@XmlElement(name = "StranaA")
	private List <StranaA> stranaA;
	
	@XmlElement(name = "StranaB")
	private List <StranaB> stranaB;
	
	
	
	public Root (){
		metapodaci = new ArrayList<Metapodaci>();
		stranaA = new ArrayList<StranaA>();
		stranaB = new ArrayList<StranaB>();
	}
	
	

	public String getVerzijaSheme() {
		return verzijaSheme;
	}

	public void setVerzijaSheme(String verzijaSheme) {
		this.verzijaSheme = verzijaSheme;
	}
	
	
	
	public List<Metapodaci> getMetapodaci() {
		return metapodaci;
	}

	public void setMetapodaci(Metapodaci metapodaci) {
		this.metapodaci.add(metapodaci);
	}

	public List<StranaA> getStranaA() {
		return stranaA;
	}

	public void setStranaA(StranaA stranaA) {
		this.stranaA.add(stranaA);
	}

	public List<StranaB> getStranaB() {
		return stranaB;
	}

	public void setStranaB(StranaB stranaB) {
		this.stranaB.add(stranaB);
	}
	
	
	@Override
	public String toString() {
	return "Metapodaci = "+metapodaci+System.lineSeparator()+ verzijaSheme+System.lineSeparator()+System.lineSeparator()+
			"StranaA = "+ stranaA+System.lineSeparator()+System.lineSeparator()+
			"StranaB = "+ stranaB+System.lineSeparator()+System.lineSeparator();
	}
}
