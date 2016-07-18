package joppd;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
public class NaknadaZaposljavanjeInvalida {
	@XmlElement(name = "P1")
	public String p1;
	
	@XmlElement(name = "P2")
	public String p2;
	

	public String getP1() {
		return p1;
	}

	public void setP1(String p1) {
		this.p1 = p1;
	}

	public String getP2() {
		return p2;
	}

	public void setP2(String p2) {
		this.p2 = p2;
	}



	
	@Override
	public String toString() {
	return "P1 = "+p1+System.lineSeparator()+
			"P2 = "+p2+System.lineSeparator();
			
	}
}
