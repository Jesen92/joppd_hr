package joppd;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)

public class Doprinosi {

	@XmlElement(name = "GeneracijskaSolidarnost")
	private List <GeneracijskaSolidarnost> generacijskaSolidarnost;
	
	@XmlElement(name = "KapitaliziranaStednja")
	private List <KapitaliziranaStednja> kapitaliziranaStednja;
	
	@XmlElement(name = "ZdravstvenoOsiguranje")
	private List <ZdravstvenoOsiguranje> zdravstvenoOsiguranje;
	
	@XmlElement(name = "Zaposljavanje")
	private List <Zaposljavanje> zaposljavanje;
	
	
	public Doprinosi(){
		generacijskaSolidarnost = new ArrayList<GeneracijskaSolidarnost>();
		kapitaliziranaStednja = new ArrayList<KapitaliziranaStednja>();
		zdravstvenoOsiguranje = new ArrayList<ZdravstvenoOsiguranje>();
		zaposljavanje = new ArrayList<Zaposljavanje>();
	}
	
	
	public List<GeneracijskaSolidarnost> getGeneracijskaSolidarnost() {
		return generacijskaSolidarnost;
	}

	public void setGeneracijskaSolidarnost(GeneracijskaSolidarnost generacijskaSolidarnost) {
		this.generacijskaSolidarnost.add(generacijskaSolidarnost);
	}

	public List<KapitaliziranaStednja> getKapitaliziranaStednja() {
		return kapitaliziranaStednja;
	}

	public void setKapitaliziranaStednja(KapitaliziranaStednja kapitaliziranaStednja) {
		this.kapitaliziranaStednja.add(kapitaliziranaStednja);
	}

	public List<ZdravstvenoOsiguranje> getZdravstvenoOsiguranje() {
		return zdravstvenoOsiguranje;
	}

	public void setZdravstvenoOsiguranje(ZdravstvenoOsiguranje zdravstvenoOsiguranje) {
		this.zdravstvenoOsiguranje.add(zdravstvenoOsiguranje);
	}

	public List<Zaposljavanje> getZaposljavanje() {
		return zaposljavanje;
	}

	public void setZaposljavanje(Zaposljavanje zaposljavanje) {
		this.zaposljavanje.add(zaposljavanje);
	}
	
	


	@Override
	public String toString() {
	return "GeneracijskaSolidarnost = "+generacijskaSolidarnost+System.lineSeparator()+
			"KapitaliziranaStednja = "+kapitaliziranaStednja+System.lineSeparator()+
			"ZdravstvenoOsiguranje = "+zdravstvenoOsiguranje+System.lineSeparator()+
			"Zaposljavanje = "+zaposljavanje+System.lineSeparator();
	}

}
