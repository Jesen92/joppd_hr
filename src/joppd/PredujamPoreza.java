package joppd;
import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
public class PredujamPoreza {
	@XmlElement(name = "P1")
	public Double p1;
	
	@XmlElement(name = "P11")
	public Double p11;
	
	@XmlElement(name = "P12")
	public Double p12;
	
	@XmlElement(name = "P2")
	public Double p2;
	
	@XmlElement(name = "P3")
	public Double p3;
	
	@XmlElement(name = "P4")
	public Double p4;
	
	@XmlElement(name = "P5")
	public Double p5;
	
	@XmlElement(name = "P6")
	public Double p6;

	public Double getP1() {
		return p1;
	}

	public void setP1(Double p1) {
		this.p1 = p1;
	}

	public Double getP11() {
		return p11;
	}

	public void setP11(Double p11) {
		this.p11 = p11;
	}

	public Double getP12() {
		return p12;
	}

	public void setP12(Double p12) {
		this.p12 = p12;
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

	public Double getP4() {
		return p4;
	}

	public void setP4(Double p4) {
		this.p4 = p4;
	}

	public Double getP5() {
		return p5;
	}

	public void setP5(Double p5) {
		this.p5 = p5;
	}

	public Double getP6() {
		return p6;
	}

	public void setP6(Double p6) {
		this.p6 = p6;
	}
	
	@Override
	public String toString() {
	return "P1 = "+p1+System.lineSeparator()+
			"P11 = "+p11+System.lineSeparator()+
			"P12 = "+p12+System.lineSeparator()+
			"P2 = "+p2+System.lineSeparator()+
			"P3 = "+p3+System.lineSeparator()+
			"P4 = "+p4+System.lineSeparator()+
			"P5 = "+p5+System.lineSeparator()+
			"P6 = "+p6+System.lineSeparator();
			
	}

}