package joppd;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
public class StranaA {

	@XmlElement(name = "DatumIzvjesca")
	private String datumIzvjesca;
	
	@XmlElement(name = "OznakaIzvjesca")
	private String oznakaIzvjesca;
	
	@XmlElement(name = "VrstaIzvjesca")
	private String vrstaIzvjesca;
	
	@XmlElement(name = "PodnositeljIzvjesca")
	private List <PodnositeljIzvjesca> podnositeljIzvjesca;
	
	@XmlElement(name = "BrojOsoba")
	private String brojOsoba;
	
	@XmlElement(name = "BrojRedaka")
	private String brojRedaka;
	
	@XmlElement(name = "PredujamPoreza")
	private List <PredujamPoreza> predujamPoreza;
	
	@XmlElement(name = "Doprinosi")
	private List <Doprinosi> doprinosi;
	
	@XmlElement(name = "IsplaceniNeoporeziviPrimici")
	private String isplaceniNeoporeziviPrimici;
	
	@XmlElement(name = "KamataMO2")
	private String kamataMO2;
	
	@XmlElement(name = "UkupniNeoporeziviPrimici")
	private String ukupniNeoporeziviPrimici;
	
	@XmlElement(name = "NaknadaZaposljavanjeInvalida")
	private List <NaknadaZaposljavanjeInvalida> naknadaZaposljavanjeInvalida;
	
	@XmlElement(name = "IzvjesceSastavio")
	private List <IzvjesceSastavio> izvjesceSastavio;

	public StranaA (){
		podnositeljIzvjesca = new ArrayList <PodnositeljIzvjesca>();
		predujamPoreza = new ArrayList <PredujamPoreza>();
		doprinosi = new ArrayList <Doprinosi>();
		naknadaZaposljavanjeInvalida = new ArrayList <NaknadaZaposljavanjeInvalida>();
		izvjesceSastavio = new ArrayList <IzvjesceSastavio>();


	}
	
	public String getDatumIzvjesca() {
		return datumIzvjesca;
	}

	public void setDatumIzvjesca(String datumIzvjesca) {
		this.datumIzvjesca = datumIzvjesca;
	}

	public String getOznakaIzvjesca() {
		return oznakaIzvjesca;
	}

	public void setOznakaIzvjesca(String oznakaIzvjesca) {
		this.oznakaIzvjesca = oznakaIzvjesca;
	}

	public String getVrstaIzvjesca() {
		return vrstaIzvjesca;
	}

	public void setVrstaIzvjesca(String vrstaIzvjesca) {
		this.vrstaIzvjesca = vrstaIzvjesca;
	}

	public List<PodnositeljIzvjesca> getPodnositeljIzvjesca() {
		return podnositeljIzvjesca;
	}

	public void setPodnositeljIzvjesca(PodnositeljIzvjesca podnositeljIzvjesca) {
		this.podnositeljIzvjesca.add(podnositeljIzvjesca);
	}

	public String getBrojOsoba() {
		return brojOsoba;
	}

	public void setBrojOsoba(String brojOsoba) {
		this.brojOsoba = brojOsoba;
	}

	public String getBrojRedaka() {
		return brojRedaka;
	}

	public void setBrojRedaka(String brojRedaka) {
		this.brojRedaka = brojRedaka;
	}

	public List<PredujamPoreza> getPredujamPoreza() {
		return predujamPoreza;
	}

	public void setPredujamPoreza(PredujamPoreza predujamPoreza) {
		this.predujamPoreza.add(predujamPoreza);
	}

	public List<Doprinosi> getDoprinosi() {
		return doprinosi;
	}

	public void setDoprinosi(Doprinosi doprinosi) {
		this.doprinosi.add(doprinosi);
	}

	public String getIsplaceniNeoporeziviPrimici() {
		return isplaceniNeoporeziviPrimici;
	}

	public void setIsplaceniNeoporeziviPrimici(String isplaceniNeoporeziviPrimici) {
		this.isplaceniNeoporeziviPrimici = isplaceniNeoporeziviPrimici;
	}

	public String getKamataMO2() {
		return kamataMO2;
	}

	public void setKamataMO2(String kamataMO2) {
		this.kamataMO2 = kamataMO2;
	}

	public String getUkupniNeoporeziviPrimici() {
		return ukupniNeoporeziviPrimici;
	}

	public void setUkupniNeoporeziviPrimici(String ukupniNeoporeziviPrimici) {
		this.ukupniNeoporeziviPrimici = ukupniNeoporeziviPrimici;
	}

	public List<NaknadaZaposljavanjeInvalida> getNaknadaZaposljavanjeInvalida() {
		return naknadaZaposljavanjeInvalida;
	}

	public void setNaknadaZaposljavanjeInvalida(NaknadaZaposljavanjeInvalida naknadaZaposljavanjeInvalida) {
		this.naknadaZaposljavanjeInvalida.add(naknadaZaposljavanjeInvalida);
	}

	public List<IzvjesceSastavio> getIzvjesceSastavio() {
		return izvjesceSastavio;
	}

	public void setIzvjesceSastavio(IzvjesceSastavio izvjesceSastavio) {
		this.izvjesceSastavio.add(izvjesceSastavio);
	}
	
	@Override
	public String toString() {
	return "DatumIzvjesca = "+datumIzvjesca+System.lineSeparator()+
			"OznakaIzvjesca = "+oznakaIzvjesca+System.lineSeparator()+
			"VrstaIzvjesca = "+vrstaIzvjesca+System.lineSeparator()+
			"PodnositeljIzvjesca = "+podnositeljIzvjesca+System.lineSeparator()+
			"BrojOsoba = "+brojOsoba+System.lineSeparator()+
			"BrojRedaka = "+brojRedaka+System.lineSeparator()+
			"PredujamPoreza = "+predujamPoreza+System.lineSeparator()+
			"Doprinosi = "+doprinosi+System.lineSeparator()+
			"IsplaceniNeoporeziviPrimici = "+isplaceniNeoporeziviPrimici+System.lineSeparator()+
			"KamataMO2 = "+kamataMO2+System.lineSeparator()+
			"UkupniNeoporeziviPrimici = "+ukupniNeoporeziviPrimici+System.lineSeparator()+
			"NaknadaZaposljavanjeInvalida = "+naknadaZaposljavanjeInvalida+System.lineSeparator()+
			"IzvjesceSastavio = "+izvjesceSastavio+System.lineSeparator();
	}
	
}
