package joppd;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.UUID;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.xml.sax.SAXException;

import javax.swing.JButton;
import javax.swing.JFileChooser;

import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.BoxLayout;
import java.awt.GridLayout;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

import javax.swing.JFileChooser;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.util.ArrayList;
import java.util.Date;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import javax.swing.JOptionPane;
import javax.xml.XMLConstants;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;


public class Frame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame frame = new Frame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Frame() {
		setTitle("JOPPD");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 279, 147);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 1, 0, 0));
		
		JButton btnNewButton = new JButton("Kreiraj JOPPD xml");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Main();
				} catch (JAXBException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		contentPane.add(btnNewButton);
	}

	
	public void Main() throws JAXBException{
		try{
		    String name = JOptionPane.showInputDialog(null, "Upišite svoje ime i prezime");
		    String[] name_ = name.split("\\s+");
		    List<String> osobe = new ArrayList<String>();
		    
		    UUID id = UUID.randomUUID();

		    int brojRedaka;
			XSSFRow row2;
			Date date = new Date();
			Date date_ = new Date();
			SimpleDateFormat dt1 = new SimpleDateFormat("yyyy-MM-dd");
			DateFormat ft = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
			DateFormat dt2 = new SimpleDateFormat("dd.MM.yyyy",Locale.ENGLISH);
			
			JAXBContext context = JAXBContext.newInstance(Root.class);
			
			 Marshaller m = context.createMarshaller();
			 m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			 
			 Double predujamPoreza_ = 0.00;
			 Double generacijskaSolidarnost_p1 = 0.00;
			 Double zdravstvenoOsiguranje_p1 = 0.00;
			 Double zdravstvenoOsiguranje_p2 = 0.00;
			 Double kapitaliziranaStednja_p1 = 0.00;
			 Double zaposlavanje_p1 = 0.00;
			 
			 Double b13_2_q = 0.00;
			 Double b13_2_r = 0.00;
			 
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
			 
			 
			 root.setVerzijaSheme("1.1");
			 
		    //-----------METAPODACI--------------
		    naslov.setPutanja("http://purl.org/dc/elements/1.1/title");
		    naslov.setVrijednost("Izvješæe o primicima, porezu na dohodak i prirezu te doprinosima za obvezna osiguranja");
		    metapodaci.setNaslov(naslov); //
		    metapodaci.setXmlns1("http://e-porezna.porezna-uprava.hr/sheme/Metapodaci/v2-0");
		    
		    autor.setPutanja("http://purl.org/dc/elements/1.1/creator");
		    autor.setVrijednost(name);
		    metapodaci.setAutor(autor); //
		    
		    datum.setPutanja("http://purl.org/dc/elements/1.1/date");
		    datum.setVrijednost(dt1.format(date)+"T"+"00:00:00");
		    metapodaci.setDatum(datum); //
		    
		    format.setPutanja("http://purl.org/dc/elements/1.1/format");
		    format.setVrijednost("text/xml");
		    metapodaci.setFormat(format); //
		    
		    jezik.setPutanja("http://purl.org/dc/elements/1.1/language");
		    jezik.setVrijednost("hr-HR");
		    metapodaci.setJezik(jezik); //
		    
		    identifikator.setPutanja("http://purl.org/dc/elements/1.1/identifier");
		    identifikator.setVrijednost(id.toString());
		    metapodaci.setIdentifikator(identifikator); //
		    
		    uskladjenost.setPutanja("http://purl.org/dc/terms/conformsTo");
		    uskladjenost.setVrijednost("ObrazacJOPPD-v1-1");
		    metapodaci.setUskladjenost(uskladjenost); //
		    
		    tip.setPutanja("http://purl.org/dc/elements/1.1/type");
		    tip.setVrijednost("Elektronièki obrazac");
		    metapodaci.setTip(tip); //
		    
		    metapodaci.setAdresant("Ministarstvo Financija, Porezna uprava, Zagreb");
		    //-------------KRAJ METAPODATAKA-------------
		    root.setMetapodaci(metapodaci); //
		    
		    
		    predujamPoreza.setP12("0.00");
		    predujamPoreza.setP2("0.00");
		    predujamPoreza.setP3("0.00");
		    predujamPoreza.setP4("0.00");
		    predujamPoreza.setP5("0.00");
		    predujamPoreza.setP6("0.00");
		    
		  //-----doprinosi------
		    
		    
		    generacijskaSolidarnost.setP2("0.00");
		    generacijskaSolidarnost.setP3("0.00");
		    generacijskaSolidarnost.setP4("0.00");
		    generacijskaSolidarnost.setP5("0.00");
		    generacijskaSolidarnost.setP6("0.00");
		    generacijskaSolidarnost.setP7("0.00");
		    
		    
		    kapitaliziranaStednja.setP2("0.00");
		    kapitaliziranaStednja.setP3("0.00");
		    kapitaliziranaStednja.setP4("0.00");
		    kapitaliziranaStednja.setP5("0.00");
		    kapitaliziranaStednja.setP6("0.00");
		   
		    
		    zdravstvenoOsiguranje.setP3("0.00");
		    zdravstvenoOsiguranje.setP4("0.00");
		    zdravstvenoOsiguranje.setP5("0.00");
		    zdravstvenoOsiguranje.setP6("0.00");
		    zdravstvenoOsiguranje.setP7("0.00");
		    zdravstvenoOsiguranje.setP8("0.00");
		    zdravstvenoOsiguranje.setP9("0.00");
		    zdravstvenoOsiguranje.setP10("0.00");
		    zdravstvenoOsiguranje.setP11("0.00");
		    zdravstvenoOsiguranje.setP12("0.00");
		    
		    
		    
		    zaposljavanje.setP2("0.00");
		    zaposljavanje.setP3("0.00");

		    //-------kraj doprinosa------------------------------
		    
		    
		    stranaA.setIsplaceniNeoporeziviPrimici("0.00");
		    stranaA.setKamataMO2("0.00");
		    stranaA.setUkupniNeoporeziviPrimici("0.00");
		    
		    naknadaZaposljavanjeInvalida.setP1("0");
		    naknadaZaposljavanjeInvalida.setP2("0.00");

		    izvjesceSastavio.setIme(name_[0]);
		    izvjesceSastavio.setPrezime(name_[1]);
		    
		    //---------------------KRAJ STRANE A--------------------------
		    
			FileInputStream fileInputStream = new FileInputStream(odaberiDatoteku());
			@SuppressWarnings("resource")
			XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);
			XSSFSheet worksheet = workbook.getSheet("Sheet1");
			
			XSSFRow row1 = worksheet.getRow(1);
			
			for(int i = 0; i<16; ++i){
				String valString = null;
				//Double valInteger;
				XSSFCell cell = row1.getCell((short) i);
			
				if (cell.getCellType() == cell.CELL_TYPE_STRING){
					valString = cell.getStringCellValue();
					System.out.println(i+": "+valString);
				}
				else if(cell.getCellType() == cell.CELL_TYPE_NUMERIC){
					valString = String.format("%.2f", cell.getNumericCellValue());
					System.out.println(i+": "+valString);
				}
				
				switch(i){
				case 0: 
				    stranaA.setDatumIzvjesca(dt1.format(date));
					break;
				case 1: 
					stranaA.setOznakaIzvjesca(valString);
					break;

				case 2: 
					stranaA.setVrstaIzvjesca(valString);
					break;

				case 3: 
					podnositeljIzvjesca.setNaziv(valString);
					break;

				case 4: 
					adresa.setMjesto(valString);
					break;

				case 5: 
					adresa.setUlica(valString);
					break;

				case 6: 
					adresa.setBroj(valString);
					break;

				case 7: 
					podnositeljIzvjesca.setEmail(valString);
					break;

				case 8: 
					podnositeljIzvjesca.setoIB(valString);
					break;

				case 9: 
					podnositeljIzvjesca.setOznaka(valString);
					break;
					
				}
			}
			
			podnositeljIzvjesca.setAdresa(adresa); //
			stranaA.setPodnositeljIzvjesca(podnositeljIzvjesca); //
			
			
			System.out.println("Plaæe:");
			brojRedaka = (int)worksheet.getRow(3).getCell(1).getNumericCellValue();
			
			for(int j=0; j<brojRedaka; ++j){
				P p = new P();
				row2 = worksheet.getRow(5+j);
			    
			    stranaA.setBrojRedaka(Integer.toString(brojRedaka));
			    
				for(int i=0; i<39  ; ++i){
					
					String valString = null;
					Double valDouble = 0.00;
					XSSFCell cell = row2.getCell((short) i);
				
					if (cell.getCellType() == cell.CELL_TYPE_STRING){
						valString = cell.getStringCellValue();
						System.out.println(i+": "+valString);
					}
					else if(cell.getCellType() == cell.CELL_TYPE_NUMERIC){
						valDouble = cell.getNumericCellValue();
						valString = String.format("%.2f", cell.getNumericCellValue());
						System.out.println(i+": "+valString);
					}
					
					switch(i){
					case 0: 
					    p.setP1(valString.replace(",", ".").replace(".00", ""));
						break;
					case 1: 
					    p.setP2(valString.replace(",", "."));
						break;

					case 2: 
						p.setP3(valString.replace(",", "."));
						break;

					case 3: 
						p.setP4(valString.replace(",", "."));
						break;

					case 4: 
						p.setP5(valString.replace(",", "."));
						
						if(!osobe.contains(valString.replace(",", ".")))
							osobe.add(valString.replace(",", "."));
						
						break;

					case 5: 
					    p.setP61(valString.replace(",", "."));
						break;

					case 6: 
						p.setP62(valString.replace(",", "."));
						break;

					case 7: 
						p.setP71(valString.replace(",", "."));
						break;

					case 8: 
						p.setP72(valString.replace(",", "."));
						break;

					case 9: 
						p.setP8(valString.replace(",", "."));
						break;
					
					case 10: 
						p.setP9(valString.replace(",", "."));
						break;
					case 11: 
						p.setP10(valString.replace(",", "."));
						break;

					case 12: 
						date_ = dt2.parse(valString.replace(",", "."));
						p.setP101(dt1.format(date_));
						break;

					case 13: 
						date_ = dt2.parse(valString.replace(",", "."));
						p.setP102(dt1.format(date_));
						break;

					case 14: 
						p.setP11(valString.replace(",", "."));
						break;

					case 15: 
						p.setP12(valString.replace(",", "."));
						break;

					case 16: 
						p.setP121(valString.replace(",", "."));
						generacijskaSolidarnost_p1 += valDouble;
						b13_2_q = valDouble;
						break;

					case 17: 
						p.setP122(valString.replace(",", "."));
						kapitaliziranaStednja_p1 += valDouble;
						b13_2_r = valDouble;
						break;

					case 18: 
						p.setP123(valString.replace(",", "."));
						zdravstvenoOsiguranje_p1 += valDouble;
						break;

					case 19: 
						p.setP124(valString.replace(",", "."));
						zdravstvenoOsiguranje_p2 += valDouble;
						break;
						
					case 20: 
						p.setP125(valString.replace(",", "."));
						zaposlavanje_p1 += valDouble;
						break;
					case 21: 
						p.setP126(valString.replace(",", "."));
						break;

					case 22: 
						p.setP127(valString.replace(",", "."));
						break;

					case 23: 
						p.setP128(valString.replace(",", "."));
						break;

					case 24: 
						p.setP129(valString.replace(",", "."));
						break;

					case 25: 
						p.setP131(valString.replace(",", "."));
						break;

					case 26: 
						p.setP132(String.format("%.2f", b13_2_q+b13_2_r).replace(",", "."));
						break;

					case 27: 
						p.setP133(valString.replace(",", "."));
						break;

					case 28: 
						p.setP134(valString.replace(",", "."));
						break;

					case 29: 
						p.setP135(valString.replace(",", "."));
						break;
						
					case 30: 
						p.setP141(valString.replace(",", "."));
						predujamPoreza_ += valDouble;
						break;
					case 31: 
						p.setP142(valString.replace(",", "."));
						predujamPoreza_ += valDouble;
						break;

					case 32: 
						p.setP151(valString.replace(",", "."));
						break;

					case 33: 
						p.setP152(valString.replace(",", "."));
						break;

					case 34: 
						p.setP161(valString.replace(",", "."));
						break;

					case 35: 
						p.setP162(valString.replace(",", "."));
						break;

					case 36: 
						p.setP17(valString.replace(",", "."));
						break;
						
					case 37:
						
						break;
						
					case 38:
						p.setP100(valString.replace(",", ".").replace(".00", ""));
						break;
					}
			}
				primatelji.setP(p); //
			}
			//System.out.println(snimiDatoteku().toString());
			
			stranaA.setBrojOsoba(Integer.toString(osobe.size()));
			
			predujamPoreza.setP1(String.format("%.2f",predujamPoreza_).replace(",", "."));
		    predujamPoreza.setP11(String.format("%.2f",predujamPoreza_).replace(",", "."));
			generacijskaSolidarnost.setP1(String.format("%.2f",generacijskaSolidarnost_p1).replace(",", "."));
			kapitaliziranaStednja.setP1(String.format("%.2f",kapitaliziranaStednja_p1).replace(",", "."));
			zdravstvenoOsiguranje.setP1(String.format("%.2f",zdravstvenoOsiguranje_p1).replace(",", "."));
		    zdravstvenoOsiguranje.setP2(String.format("%.2f",zdravstvenoOsiguranje_p2).replace(",", "."));
			zaposljavanje.setP1(String.format("%.2f",zaposlavanje_p1).replace(",", "."));
			
			stranaA.setPredujamPoreza(predujamPoreza); //
			doprinosi.setGeneracijskaSolidarnost(generacijskaSolidarnost); //
			doprinosi.setKapitaliziranaStednja(kapitaliziranaStednja); //
			doprinosi.setZdravstvenoOsiguranje(zdravstvenoOsiguranje); //
			doprinosi.setZaposljavanje(zaposljavanje); //
			stranaA.setDoprinosi(doprinosi); //
			stranaA.setNaknadaZaposljavanjeInvalida(naknadaZaposljavanjeInvalida); //
			stranaA.setIzvjesceSastavio(izvjesceSastavio); //
		
			root.setStranaA(stranaA); //
		    
		    stranaB.setPrimatelji(primatelji); //
		    root.setStranaB(stranaB); //
			
	    File file = new File(snimiDatoteku().toString());
	    
        //SchemaFactory sf = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI); 
        //Schema schema = sf.newSchema(new File("res/ObrazacJOPPD-v1-1.xsd")); 

        //m.setSchema(schema);

		 m.setEventHandler(new ValidationHandler());
		 m.marshal(root, System.out);
		 m.marshal(root, file);
		 
		 infoBox("JOPPD xml uspješno kreiran!", "Success");
				
		} catch (FileNotFoundException e) {
			infoBox("Datoteka nije pronaðena!", "Pogreška");
			e.printStackTrace();
		} catch (IOException e) {
			infoBox("Greška kod kreiranja JOPPD xml-a!", "Pogreška");
			e.printStackTrace();
		} catch (Exception e){
			infoBox("Greška kod kreiranja JOPPD xml-a!", "Pogreška");
			e.printStackTrace();
		}		
	}
	
	public File odaberiDatoteku(){
		try{
			
			infoBox("Odaberite datoteku iz koje æe se kreirati xml datoteka", "LOAD");
			
			JFileChooser f = new JFileChooser();
			FileNameExtensionFilter filter = new FileNameExtensionFilter("Excel file", "xlsx");
			
			f.setFileFilter(filter);

	        f.setFileSelectionMode(JFileChooser.FILES_ONLY); 
	        int result = f.showOpenDialog(null);
	        
	        System.out.println(f.getCurrentDirectory());
	        System.out.println(f.getSelectedFile());
	        
	        if(result == JFileChooser.CANCEL_OPTION)
	            throw new RuntimeException();
	        
	        return f.getSelectedFile();
	        
		}catch(Exception e){
			e.printStackTrace();
		}
		return null;
	}
	
	@SuppressWarnings("deprecation")
	public File snimiDatoteku(){
		try{
			Date date = new Date();
			SimpleDateFormat dt = new SimpleDateFormat("yyyy-MM-dd");
			 
			infoBox("Odaberite mjesto i naziv snimanja datoteke", "SAVE");
			 
			JFileChooser f = new JFileChooser();

	        f.setSelectedFile(new File("JOPPD-"+dt.format(date)+".xml"));
	        f.setFileSelectionMode(JFileChooser.FILES_ONLY); 
	        int result = f.showSaveDialog(null);
	        
	        System.out.println(f.getCurrentDirectory());
	        System.out.println(f.getSelectedFile());
	        
	        if(result == JFileChooser.CANCEL_OPTION)
	            throw new RuntimeException();
	        
	        return f.getSelectedFile();
		        
			}catch(Exception e){
				e.printStackTrace();
			}
			return null;
	}
	
    public static void infoBox(String infoMessage, String titleBar)
    {
        JOptionPane.showMessageDialog(null, infoMessage, titleBar, JOptionPane.INFORMATION_MESSAGE);
    }
	
}
