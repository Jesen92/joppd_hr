package joppd;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)

public class StranaB {
	
	@XmlElement(name= "Primatelji")
	private List <Primatelji> primatelji;
	
	public StranaB (){
	primatelji = new ArrayList <Primatelji>();
	}

	public List<Primatelji> getPrimatelji() {
		return primatelji;
	}

	public void setPrimatelji(Primatelji primatelji) {
		this.primatelji.add(primatelji);
	}

	@Override
	public String toString() {
	return "Primatelji = "+primatelji+System.lineSeparator();
	}
	

}
