package joppd;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
public class Zaposljavanje {
	@XmlElement(name = "P1")
	public Double p1;
	
	@XmlElement(name = "P2")
	public Double p2;
	
	@XmlElement(name = "P3")
	public Double p3;
	

	
	
	public Double getP1() {
		return p1;
	}

	public void setP1(Double p1) {
		this.p1 = p1;
	}

	public Double getP2() {
		return p2;
	}

	public void setP2(Double p2) {
		this.p2 = p2;
	}

	public Double getP3() {
		return p3;
	}

	public void setP3(Double p3) {
		this.p3 = p3;
	}

	
	@Override
	public String toString() {
	return "P1 = "+p1+System.lineSeparator()+
			"P2 = "+p2+System.lineSeparator()+
			"P3 = "+p3+System.lineSeparator();
			
	}
}
