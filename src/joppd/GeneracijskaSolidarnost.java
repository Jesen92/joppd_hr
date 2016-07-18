package joppd;
import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
public class GeneracijskaSolidarnost {

	@XmlElement(name = "P1")
	public String p1;
	
	@XmlElement(name = "P2")
	public String p2;
	
	@XmlElement(name = "P3")
	public String p3;
	
	@XmlElement(name = "P4")
	public String p4;
	
	@XmlElement(name = "P5")
	public String p5;
	
	@XmlElement(name = "P6")
	public String p6;
	
	@XmlElement(name = "P7")
	public String p7;
	
	
	
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

	public String getP3() {
		return p3;
	}

	public void setP3(String p3) {
		this.p3 = p3;
	}

	public String getP4() {
		return p4;
	}

	public void setP4(String p4) {
		this.p4 = p4;
	}

	public String getP5() {
		return p5;
	}

	public void setP5(String p5) {
		this.p5 = p5;
	}

	public String getP6() {
		return p6;
	}

	public void setP6(String p6) {
		this.p6 = p6;
	}

	public String getP7() {
		return p7;
	}

	public void setP7(String p7) {
		this.p7 = p7;
	}

	@Override
	public String toString() {
	return "P1 = "+p1+System.lineSeparator()+
			"P2 = "+p2+System.lineSeparator()+
			"P3 = "+p3+System.lineSeparator()+
			"P4 = "+p4+System.lineSeparator()+
			"P5 = "+p5+System.lineSeparator()+
			"P6 = "+p6+System.lineSeparator()+
			"P7 = "+p7+System.lineSeparator();
			
	}
}
