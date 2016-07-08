package joppd;

import java.io.File;

import javax.swing.JOptionPane;
import javax.xml.XMLConstants;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;







public class demo {
	public static void main(String[] args) throws Exception {

		try {
		/*
		JAXBContext jc = JAXBContext.newInstance(Root.class);
		
		Unmarshaller unmarshaller = jc.createUnmarshaller();
	    Root prviDocument = (Root) unmarshaller.unmarshal(new File("C:\\ivana.xml"));
		
	    System.out.println(prviDocument);
	    */
		
		JAXBContext context = JAXBContext.newInstance(Root.class);
		
		 Marshaller m = context.createMarshaller();
		 m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
	    
		 Root root = new Root();
		 Metapodaci metapodaci = new Metapodaci();
		 Naslov naslov = new Naslov();
		 Autor autor = new Autor();
		 Datum datum = new Datum();
		 Format format = new Format();
		 Jezik jezik = new Jezik();
		 Identifikator identifikator = new Identifikator();
		 Uskladjenost uskladjenost = new Uskladjenost();
		 Tip tip = new Tip();
		 StranaA stranaA = new StranaA();
		 PodnositeljIzvjesca podnositeljIzvjesca = new PodnositeljIzvjesca();
		 Adresa adresa = new Adresa();
		 PredujamPoreza predujamPoreza = new PredujamPoreza();
		 Doprinosi doprinosi = new Doprinosi();
		 GeneracijskaSolidarnost generacijskaSolidarnost = new GeneracijskaSolidarnost();
		 KapitaliziranaStednja kapitaliziranaStednja = new KapitaliziranaStednja();
		 ZdravstvenoOsiguranje zdravstvenoOsiguranje = new ZdravstvenoOsiguranje();
		 Zaposljavanje zaposljavanje = new Zaposljavanje();
		 NaknadaZaposljavanjeInvalida naknadaZaposljavanjeInvalida = new NaknadaZaposljavanjeInvalida();
		 IzvjesceSastavio izvjesceSastavio = new IzvjesceSastavio();
		 StranaB stranaB = new StranaB();
		 Primatelji primatelji = new Primatelji();
		 P p = new P();
		 
		 
		 root.setVerzijaSheme("1.1");
		 
	    //-----------METAPODACI--------------
	    naslov.setPutanja("http://purl.org/dc/elements/1.1/title");
	    naslov.setVrijednost("Izvješæe o primicima, porezu na dohodak i prirezu te doprinosima za obvezna osiguranja");
	    
	    autor.setPutanja("http://purl.org/dc/elements/1.1/creator");
	    autor.setVrijednost("element");
	    
	    datum.setPutanja("http://purl.org/dc/elements/1.1/date");
	    datum.setVrijednost("element");
	    
	    format.setPutanja("http://purl.org/dc/elements/1.1/format");
	    format.setVrijednost("element");
	    
	    jezik.setPutanja("http://purl.org/dc/elements/1.1/language");
	    jezik.setVrijednost("element");
	    
	    identifikator.setPutanja("http://purl.org/dc/elements/1.1/identifier");
	    identifikator.setVrijednost("element");
	    
	    uskladjenost.setPutanja("http://purl.org/dc/terms/conformsTo");
	    uskladjenost.setVrijednost("element");
	    
	    tip.setPutanja("http://purl.org/dc/elements/1.1/type");
	    tip.setVrijednost("element");
	    
	    metapodaci.setAdresant("element");
	    //-------------KRAJ METAPODATAKA-------------
	    
	    
	    //----------STRANA A-----------------------
	    stranaA.setDatumIzvjesca("datum");
	    stranaA.setOznakaIzvjesca("");
	    stranaA.setVrstaIzvjesca("");
	    
	    podnositeljIzvjesca.setNaziv("");
	    adresa.setMjesto("");
	    adresa.setUlica("");
	    adresa.setBroj("");
	    podnositeljIzvjesca.setEmail("");
	    podnositeljIzvjesca.setoIB("");
	    podnositeljIzvjesca.setOznaka("");
	    
	    stranaA.setBrojOsoba("");
	    stranaA.setBrojRedaka("");
	    
	    predujamPoreza.setP1(0.0);
	    predujamPoreza.setP11(0.0);
	    predujamPoreza.setP12(0.0);
	    predujamPoreza.setP2(0.0);
	    predujamPoreza.setP3(0.0);
	    predujamPoreza.setP4(0.0);
	    predujamPoreza.setP5(0.0);
	    predujamPoreza.setP6(0.0);
	    
	  //-----doprinosi------
	    
	    generacijskaSolidarnost.setP1(0.0);
	    generacijskaSolidarnost.setP2(0.0);
	    generacijskaSolidarnost.setP3(0.0);
	    generacijskaSolidarnost.setP4(0.0);
	    generacijskaSolidarnost.setP5(0.0);
	    generacijskaSolidarnost.setP6(0.0);
	    generacijskaSolidarnost.setP7(0.0);
	    
	    kapitaliziranaStednja.setP1(0.0);
	    kapitaliziranaStednja.setP2(0.0);
	    kapitaliziranaStednja.setP3(0.0);
	    kapitaliziranaStednja.setP4(0.0);
	    kapitaliziranaStednja.setP5(0.0);
	    kapitaliziranaStednja.setP6(0.0);
	   
	    zdravstvenoOsiguranje.setP1(0.0);
	    zdravstvenoOsiguranje.setP2(0.0);
	    zdravstvenoOsiguranje.setP3(0.0);
	    zdravstvenoOsiguranje.setP4(0.0);
	    zdravstvenoOsiguranje.setP5(0.0);
	    zdravstvenoOsiguranje.setP6(0.0);
	    zdravstvenoOsiguranje.setP7(0.0);
	    zdravstvenoOsiguranje.setP8(0.0);
	    zdravstvenoOsiguranje.setP9(0.0);
	    zdravstvenoOsiguranje.setP10(0.0);
	    zdravstvenoOsiguranje.setP11(0.0);
	    zdravstvenoOsiguranje.setP12(0.0);
	    
	    
	    zaposljavanje.setP1(0.0);
	    zaposljavanje.setP2(0.0);
	    zaposljavanje.setP3(0.0);

	    //-------kraj doprinosa------------------------------
	    
	    
	    stranaA.setIsplaceniNeoporeziviPrimici("");
	    stranaA.setKamataMO2("");
	    stranaA.setUkupniNeoporeziviPrimici("");
	    
	    naknadaZaposljavanjeInvalida.setP1(0);
	    naknadaZaposljavanjeInvalida.setP2(0.0);

	    izvjesceSastavio.setIme("");
	    izvjesceSastavio.setPrezime("");
	    
	    //---------------------KRAJ STRANE A--------------------------
	    
	    //---------------------STRANA B------------------------------
	    
	    p.setP1(0);
	    p.setP2("");
	    p.setP3("");
	    p.setP4("");
	    p.setP5("");
	    p.setP61("");
	    p.setP62("");
	    p.setP71("");
	    p.setP72("");
	    p.setP8("");
	    p.setP9("");
	    p.setP10("");
	    p.setP100("");
	    p.setP101("");
	    p.setP102("");
	    p.setP11("");
	    p.setP12("");
	    p.setP121("");
	    p.setP122("");
	    p.setP123("");
	    p.setP124("");
	    p.setP125("");
	    p.setP126("");
	    p.setP127("");
	    p.setP128("");
	    p.setP129("");
	    p.setP131("");
	    p.setP132("");
	    p.setP133("");
	    p.setP134("");
	    p.setP135("");
	    p.setP141("");
	    p.setP142("");
	    p.setP151("");
	    p.setP152("");
	    p.setP161("");
	    p.setP162("");
	    p.setP17("");
//--------------------------KRAJ B STRANE-------------------

	    File file = new File("C:/build.xml");
		
        SchemaFactory sf = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI); 
        Schema schema = sf.newSchema(new File("res/validation.xsd")); 

	 m.setSchema(schema);
	 m.setEventHandler(new ValidationHandler());
	 m.marshal(root, System.out);
	 m.marshal(root, file);
	    
	}catch (RuntimeException e){
		infoBox("Došlo je do greške u XML datoteci", "XML ERROR");
	}

}

public static void infoBox(String infoMessage, String titleBar)
{
    JOptionPane.showMessageDialog(null, infoMessage, titleBar, JOptionPane.INFORMATION_MESSAGE);
}
	
}