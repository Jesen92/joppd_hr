package joppd;
import javax.xml.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace="http://e-porezna.porezna-uprava.hr/sheme/Metapodaci/v2-0")
public class Metapodaci {
	
	
	
	@XmlElement(name= "Naslov")
	private List <Naslov> naslov;
	
	@XmlElement(name= "Autor")
	private List <Autor> autor;
	
	@XmlElement(name= "Datum")
	private List <Datum> datum;
	
	@XmlElement(name= "Format")
	private List <Format> format;
	
	@XmlElement(name= "Jezik")
	private List <Jezik> jezik;
	
	@XmlElement(name= "Identifikator")
	private List <Identifikator> identifikator;
	
	@XmlElement(name= "Uskladjenost")
	private List <Uskladjenost> uskladjenost;
	
	@XmlElement(name= "Tip")
	private List <Tip> tip;
	
	@XmlElement(name= "Adresant")
	private String adresant;

	public Metapodaci(){
		
		naslov = new ArrayList<Naslov>();
		autor = new ArrayList<Autor>();
		datum = new ArrayList<Datum>();
		format = new ArrayList<Format>();
		jezik = new ArrayList<Jezik>();
		identifikator = new ArrayList<Identifikator>();
		uskladjenost = new ArrayList<Uskladjenost>();
		tip = new ArrayList<Tip>();
		
	}
	


	public List<Naslov> getNaslov() {
		return naslov;
	}

	public void setNaslov(Naslov naslov) {
		this.naslov.add(naslov);
	}

	public List<Autor> getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor.add(autor);
	}

	public List<Datum> getDatum() {
		return datum;
	}

	public void setDatum(Datum datum) {
		this.datum.add(datum);
	}

	public List<Format> getFormat() {
		return format;
	}

	public void setFormat(Format format) {
		this.format.add(format);
	}

	public List<Jezik> getJezik() {
		return jezik;
	}

	public void setJezik(Jezik jezik) {
		this.jezik.add(jezik);
	}

	public List<Identifikator> getIdentifikator() {
		return identifikator;
	}

	public void setIdentifikator(Identifikator identifikator) {
		this.identifikator.add(identifikator);
	}

	public List<Uskladjenost> getUskladjenost() {
		return uskladjenost;
	}

	public void setUskladjenost(Uskladjenost uskladjenost) {
		this.uskladjenost.add(uskladjenost);
	}

	public List<Tip> getTip() {
		return tip;
	}

	public void setTip(Tip tip) {
		this.tip.add(tip);
	}


	

	public String getAdresant() {
		return adresant;
	}

	public void setAdresant(String adresant) {
		this.adresant = adresant;
	}

	@Override
	public String toString() {
	return "Naslov = "+naslov+System.lineSeparator()+
			"Autor = "+autor+System.lineSeparator()+
			"Datum = "+datum+System.lineSeparator()+
			"Format = "+format+System.lineSeparator()+
			"Jezik = "+jezik+System.lineSeparator()+
			"Identifikator = "+identifikator+System.lineSeparator()+
			"Uskladjenost = "+uskladjenost+System.lineSeparator()+
			"Tip = "+tip+System.lineSeparator()+
			"Adresant = "+adresant+System.lineSeparator();
	}
}
