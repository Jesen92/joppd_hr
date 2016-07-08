package joppd;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
public class NaknadaZaposljavanjeInvalida {
	@XmlElement(name = "P1")
	public int p1;
	
	@XmlElement(name = "P2")
	public Double p2;
	

	public int getP1() {
		return p1;
	}

	public void setP1(int p1) {
		this.p1 = p1;
	}

	public Double getP2() {
		return p2;
	}

	public void setP2(Double p2) {
		this.p2 = p2;
	}



	
	@Override
	public String toString() {
	return "P1 = "+p1+System.lineSeparator()+
			"P2 = "+p2+System.lineSeparator();
			
	}
}
