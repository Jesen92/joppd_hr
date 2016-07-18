package joppd;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
public class ZdravstvenoOsiguranje {
	@XmlElement(name = "P1")
	private String p1;
	
	@XmlElement(name = "P2")
	private String p2;
	
	@XmlElement(name = "P3")
	private String p3;
	
	@XmlElement(name = "P4")
	private String p4;
	
	@XmlElement(name = "P5")
	private String p5;
	
	@XmlElement(name = "P6")
	private String p6;
	
	@XmlElement(name = "P7")
	private String p7;
	
	@XmlElement(name = "P8")
	private String p8;
	
	@XmlElement(name = "P9")
	private String p9;
	
	@XmlElement(name = "P10")
	private String p10;
	
	@XmlElement(name = "P11")
	private String p11;
	
	@XmlElement(name = "P12")
	private String p12;
	
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
	

	public String getP8() {
		return p8;
	}

	public void setP8(String p8) {
		this.p8 = p8;
	}

	public String getP9() {
		return p9;
	}

	public void setP9(String p9) {
		this.p9 = p9;
	}

	public String getP10() {
		return p10;
	}

	public void setP10(String p10) {
		this.p10 = p10;
	}

	public String getP11() {
		return p11;
	}

	public void setP11(String p11) {
		this.p11 = p11;
	}

	public String getP12() {
		return p12;
	}

	public void setP12(String p12) {
		this.p12 = p12;
	}

	@Override
	public String toString() {
	return "P1 = "+p1+System.lineSeparator()+
			"P2 = "+p2+System.lineSeparator()+
			"P3 = "+p3+System.lineSeparator()+
			"P4 = "+p4+System.lineSeparator()+
			"P5 = "+p5+System.lineSeparator()+
			"P6 = "+p6+System.lineSeparator()+
			"P7 = "+p7+System.lineSeparator()+
			"P8 = "+p8+System.lineSeparator()+
			"P9 = "+p9+System.lineSeparator()+
			"P10 = "+p10+System.lineSeparator()+
			"P11 = "+p11+System.lineSeparator()+
			"P12 = "+p12+System.lineSeparator();
			
	}
}
