package joppd;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
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
import java.util.Locale;

import javax.swing.JFileChooser;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
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
		
		JButton btnNewButton = new JButton("Odaberi .xlsx datoteku");
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
			int brojRedaka;
			XSSFRow row2;
			Date date = new Date();
			SimpleDateFormat dt1 = new SimpleDateFormat("yyyy-mm-dd");
			DateFormat ft = new SimpleDateFormat("yyyy-mm-dd", Locale.ENGLISH);
			
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
		    datum.setVrijednost(dt1.format(date)+"T"+date.getTime());
		    
		    format.setPutanja("http://purl.org/dc/elements/1.1/format");
		    format.setVrijednost("text/xml");
		    
		    jezik.setPutanja("http://purl.org/dc/elements/1.1/language");
		    jezik.setVrijednost("hr-HR");
		    
		    identifikator.setPutanja("http://purl.org/dc/elements/1.1/identifier");
		    identifikator.setVrijednost("ObrazacJOPPD-v1-1");
		    
		    uskladjenost.setPutanja("http://purl.org/dc/terms/conformsTo");
		    uskladjenost.setVrijednost("Elektronièki obrazac");
		    
		    tip.setPutanja("http://purl.org/dc/elements/1.1/type");
		    tip.setVrijednost("Ministarstvo Financija, Porezna uprava, Zagreb");
		    
		    metapodaci.setAdresant("element");
		    //-------------KRAJ METAPODATAKA-------------
	       
			FileInputStream fileInputStream = new FileInputStream(odaberiDatoteku());
			@SuppressWarnings("resource")
			XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);
			XSSFSheet worksheet = workbook.getSheet("JOPPD");
			
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
	
				
			System.out.println("Plaæe:");
			brojRedaka = (int)worksheet.getRow(6).getCell(1).getNumericCellValue();
			
			for(int j=0; j<brojRedaka; ++j){
				row2 = worksheet.getRow(8+j);
			    stranaA.setBrojOsoba(Integer.toString(brojRedaka));
			    stranaA.setBrojRedaka(Integer.toString(brojRedaka));
			    
				for(int i=0; i<39  ; ++i){
					String valString = null;
					//int valInteger = 0;
					XSSFCell cell = row2.getCell((short) i);
				
					if (cell.getCellType() == cell.CELL_TYPE_STRING){
						valString = cell.getStringCellValue();
						System.out.println(i+": "+valString);
					}
					else if(cell.getCellType() == cell.CELL_TYPE_NUMERIC){
						//valInteger = (int)cell.getNumericCellValue();
						valString = String.format("%.2f", cell.getNumericCellValue());
						System.out.println(i+": "+valString);
					}
					
					switch(i){
					case 0: 
					    p.setP1(i+1);
						break;
					case 1: 
					    p.setP2(valString);
						break;

					case 2: 
						p.setP3(valString);
						break;

					case 3: 
						p.setP4(valString);
						break;

					case 4: 
						p.setP5(valString);
						break;

					case 5: 
					    p.setP61(valString);
						break;

					case 6: 
						p.setP62(valString);
						break;

					case 7: 
						p.setP71(valString);
						break;

					case 8: 
						p.setP72(valString);
						break;

					case 9: 
						p.setP8(valString);
						break;
					
					case 10: 
						p.setP9(valString);
						break;
					case 11: 
						p.setP10(valString);
						break;

					case 12: 
						p.setP100(valString);
						break;

					case 13: 
						p.setP101(valString);
						break;

					case 14: 
						p.setP102(valString);
						break;

					case 15: 
						p.setP11(valString);
						break;

					case 16: 
						p.setP12(valString);
						break;

					case 17: 
						p.setP121(valString);
						break;

					case 18: 
						p.setP122(valString);
						break;

					case 19: 
						p.setP123(valString);
						break;
						
					case 20: 
						p.setP124(valString);
						break;
					case 21: 
						p.setP125(valString);
						break;

					case 22: 
						p.setP126(valString);
						break;

					case 23: 
						p.setP127(valString);
						break;

					case 24: 
						p.setP128(valString);
						break;

					case 25: 
						p.setP129(valString);
						break;

					case 26: 
						p.setP131(valString);
						break;

					case 27: 
						p.setP132(valString);
						break;

					case 28: 
						p.setP133(valString);
						break;

					case 29: 
						p.setP134(valString);
						break;
						
					case 30: 
						p.setP135(valString);
						break;
					case 31: 
						p.setP141(valString);
						break;

					case 32: 
						p.setP142(valString);
						break;

					case 33: 
						p.setP151(valString);
						break;

					case 34: 
						p.setP152(valString);
						break;

					case 35: 
						p.setP161(valString);
						break;

					case 36: 
						p.setP162(valString);
						break;
						
					case 37:
						p.setP17(valString);
						break;
					}
			}
			}
			//System.out.println(snimiDatoteku().toString());
			
	    File file = new File(snimiDatoteku().toString());

		 m.setEventHandler(new ValidationHandler());
		 m.marshal(root, System.out);
		 m.marshal(root, file);
				
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}	
	}
	
	public File odaberiDatoteku(){
		try{
			
			infoBox("Odaberite datoteku iz koje æe se kreirati xml datoteka", "LOAD");
			
			JFileChooser f = new JFileChooser();

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
	
	@SuppressWarnings("deprecation")
	public File snimiDatoteku(){
		try{
			Date date = new Date();
			SimpleDateFormat dt = new SimpleDateFormat("yyyy-MM-dd");
			 
			infoBox("Odaberite mjesto i naziv snimanja datoteke", "SAVE");
			 
			JFileChooser f = new JFileChooser();

	        f.setSelectedFile(new File("JOPPD-"+dt.format(date.getDate())+".xml"));
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
