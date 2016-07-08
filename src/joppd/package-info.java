@XmlSchema( 
    namespace = "http://e-porezna.porezna-uprava.hr/sheme/zahtjevi/ObrazacJOPPD/v1-1", 
    elementFormDefault = XmlNsForm.QUALIFIED, 
    xmlns={
	       @XmlNs(prefix="ObrazacJOPPD", namespaceURI="http://e-porezna.porezna-uprava.hr/sheme/zahtjevi/ObrazacJOPPD/v1-1"), 
	       @XmlNs(prefix="passenger", namespaceURI="http://mycompany/passenger")
	   })
package joppd;

import javax.xml.bind.annotation.*;