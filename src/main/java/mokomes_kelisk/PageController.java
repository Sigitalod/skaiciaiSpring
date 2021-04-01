package mokomes_kelisk;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import skaiciuojam.ManoSkaiciai;

@Controller
public class PageController {

	@RequestMapping(path="/3sk", method={ RequestMethod.GET, RequestMethod.POST })
	public String trysskaiciai(@RequestParam(name="skaicius1", defaultValue="0.0") String skaicius1
			, @RequestParam(name="palyginti_skirtuma", defaultValue="nelyginti") String palyginti
			,Model model) throws CloneNotSupportedException {
		
		Double skaicius1x = 0.0;
		
	try {
		
		if ( ( palyginti != null )  && ( palyginti.equals( "palyginti") ) ) {
			
			 skaicius1x = Double.parseDouble( skaicius1 );
		}
		
	} catch ( Exception e ) {
		
		}

	
		ApplicationContext context = new ClassPathXmlApplicationContext( "file:src/beans.xml" );
		SkaiciavimoUzduotis su = (SkaiciavimoUzduotis) context.getBean( "mainspring" );
		su.vykdyti();
		model.addAttribute("visi_skaiciai",su.visi_skaiciai);
		model.addAttribute("skaicius1",skaicius1x );
		return "labas";
	}
	@RequestMapping(path="/skaiciu-reiksmes", method={ RequestMethod.GET, RequestMethod.POST })
	public @ResponseBody ManoSkaiciai[] skaiciuReiksmes(@RequestParam(name="skaicius1", defaultValue="0.0") String skaicius1
			, @RequestParam(name="palyginti_skirtuma", defaultValue="nelyginti") String palyginti
			,Model model) throws CloneNotSupportedException {
		/*
		Double skaicius1x = 0.0;
		
	try {
		
		if ( ( palyginti != null )  && ( palyginti.equals( "palyginti") ) ) {
			
			 skaicius1x = Double.parseDouble( skaicius1 );
		}
		
	} catch ( Exception e ) {
		
		}
*/
	
		ApplicationContext context = new ClassPathXmlApplicationContext( "file:src/beans.xml" );
		SkaiciavimoUzduotis su = (SkaiciavimoUzduotis) context.getBean( "mainspring" );
		su.vykdyti();
		/*model.addAttribute("skaicius1",skaicius1x );*/
		return su.visi_skaiciai;
	}
}

