package joppd;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.*;
@XmlAccessorType(XmlAccessType.FIELD)

public class Primatelji {
	@XmlElement(name= "P")
	private List <P> p;
	
	public Primatelji (){
		p= new ArrayList <P>();
	}

	public List<P> getP() {
		return p;
	}

	public void setP(P p) {
		this.p.add(p);
	}
	@Override
	public String toString() {
	return System.lineSeparator()+"P = "+p+System.lineSeparator();
	}
}
