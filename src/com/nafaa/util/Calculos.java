package com.nafaa.util;

public class Calculos {
	
	public static String Calcular(String pat, String mat, String nam, String yea, String mon, String dia, char sexx, String entidadfederativa,String namecomplet){
    	String primerape = pat;
    	String segundoape = mat;
    	String nombrepila = nam;
    	String anio = yea;
    	String mont=mon;
    	String da=dia;
    	char Se = sexx;
    	String entidadfed = entidadfederativa;
    	String completo = namecomplet;
    	String sexop;
    	String sexohombre = "Hombre";
    	String sexomujer = "Mujer";
    	if (Se==('H'))
    		sexop = sexohombre;
    		else
    		sexop = sexomujer;     		
    		
    	//Letra inicial del primer apellido
    	String curp="";
    	curp += primerape.charAt(0);
    		
    	//Primera vocal interna del primer apellido
    	//Necesitamos un ciclo que recorra la cadena del primer apellido desde la posición 1
    	int primervocal=0;
    	char desplazamiento=0;
    	//En el ciclo buscamos la primera vocal interna del primer apellido, cuando la encuentra sale del ciclo y deja de buscar 
    	for(int i=1;(primervocal==0&&i<primerape.length());i++)
    	{
    		desplazamiento = primerape.charAt(i);
    		if(desplazamiento==('A'))
    			primervocal++; 
    			
    			else if(desplazamiento==('E'))
    				primervocal++;
    				
    				else if(desplazamiento==('I'))
    					primervocal++;
    					
    					else if(desplazamiento==('O'))
    						primervocal++;
    						
    						else if(desplazamiento==('U'))
    							primervocal++;			
    	}
    	
    	curp += String.valueOf(desplazamiento);
    	
    	//Adjuntamos la inicial del segundo apellido
    	curp += segundoape.charAt(0);
    	
    	//Adjuntamos la inicial del nombre
    	curp += nombrepila.charAt(0);
    	
    	//Adjuntamos el año de nacimiento
    	curp += anio.substring(2,4);
    	
    	//Adjuntamos en mes de nacimiento
    	String counter="";
    	String s1 = new String(mont);
    	if(s1.equals("ENERO"))
    		counter = "01";
    		else if(s1.equals("FEBRERO"))
    			counter = "02";
    			else if(s1.equals("MARZO"))
    				counter = "03";
    				else if(s1.equals("ABRIL"))
    					counter = "04";
    					else if(s1.equals("MAYO"))
    						counter = "05";
    						else if(s1.equals("JUNIO"))
    							counter = "06";
    							else if(s1.equals("JULIO"))
    								counter = "07";
    								else if(s1.equals("AGOSTO"))
    									counter = "08";
    									else if(s1.equals("SEPTIEMBRE"))
    										counter = "09";
    										else if(s1.equals("OCTUBRE"))
    											counter = "10";
    											else if(s1.equals("NOVIEMBRE"))
    												counter = "11";
    												else if(s1.equals("DICIEMBRE"))
    													counter = "12";
    														curp +=counter;
    														
    	//Adjuntamos el día de nacimiento
    	curp +=(da.length()==1)?("0"+da):da;
    	//Adjuntamos en sexo
    	curp += String.valueOf(Se);
    	
    	//Adjuntamos la entidad federativa de nacimiento
    	String enti="";
    	String s2 = new String(entidadfed);
    	if(s2.equals("AGUASCALIENTES"))
    		enti = "AS";
    		else if(s2.equals("BAJA CALIFORNIA NTE."))
    			enti = "BC";
    			else if(s2.equals("BAJA CALIFORNIA SUR"))
    				enti = "BS";
    				else if(s2.equals("CAMPECHE"))
    					enti = "CC";
    					else if(s2.equals("COAHUILA"))
    						enti = "CL";
    						else if(s2.equals("COLIMA"))
    							enti = "CM";
    							else if(s2.equals("CHIAPAS"))
    								enti = "CS";
    								else if(s2.equals("CHIHUAHUA"))
    									enti = "CH";
    									else if(s2.equals("GUANAJUATO"))
    										enti = "GT";
    										else if(s2.equals("DISTRITO FEDERAL"))
    											enti = "DF";
    											else if(s2.equals("DURANGO"))
    												enti = "DG";
    												else if(s2.equals("GUERRERO"))
    													enti = "GR";
    													else if(s2.equals("HIDALGO"))
    														enti = "HG";
    														else if(s2.equals("JALISCO"))
    															enti = "JC";
    															else if(s2.equals("MEXICO"))
    																enti = "MC";
    																else if(s2.equals("MICHOACAN"))
    																	enti = "MN";
    																	else if(s2.equals("MORELOS"))
    																		enti = "MS";
    																		else if(s2.equals("NAYARIT"))
    																			enti = "NT";
    																			else if(s2.equals("NUEVO LEON"))
    																				enti = "NL";
    																				else if(s2.equals("OAXACA"))
    																					enti = "OC";
    																					else if(s2.equals("PUEBLA"))
    																						enti = "PL";
    																						else if(s2.equals("QUERETARO"))
    																							enti = "QT";
    																							else if(s2.equals("QUINTANA ROO"))
    																								enti = "QR";
    																								else if(s2.equals("SAN LUIS POTOSI"))
    																									enti = "SP";
    																									else if(s2.equals("SINALOA"))
    																										enti = "SL";
    																										else if(s2.equals("SONORA"))
    																											enti = "SR";
    																											else if(s2.equals("TABASCO"))
    																												enti = "TC";
    																												else if(s2.equals("TAMAULIPAS"))
    																													enti = "TS";
    																													else if(s2.equals("TLAXCALA"))
    																														enti = "TL";
    																														else if(s2.equals("VERACRUZ"))
    																															enti = "VZ";
    																															else if(s2.equals("YUCATAN"))
    																																enti = "YN";
    																																else if(s2.equals("ZACATECAS"))
    																																	enti = "ZS";
    																																	curp += enti;
    	//Primer consonante interna del primer apellido
    	//En este caso es recomendable trabajar con un arreglo para no hacer 22 "if else" como en el caso donde obtuvimos la primera vocal interna del primer apellido
    	char consonantes[] = {'B','C','D','F','G','H','J','K','L','M','N','Ñ','P','Q','R','S','T','V','W','X','Y','Z'};
    	int primerconsonante = 0;
    	char recorrido =0;
    	//En este ciclo se incrementa el desplazamiento por la cadena del primer apellido
    	for(int i = 1;(primerconsonante==0&&i<primerape.length()); i ++)
    	{
    		//En este ciclo for interno comparamos cada consonante del arreglo "consonantes" con la letra del primer apellido en la posición 1, 
    		//una vez que la encuentra deja de buscar y se sale del ciclo 
    		for(int j = 0; (j< consonantes.length&&primerconsonante==0);j++)
    		{
    		recorrido = primerape.charAt(i);
    		if(recorrido==consonantes[j])
    			primerconsonante++; 
    		}
    	} 
    	curp += String.valueOf(recorrido);
    	
    	//Primer consonante interna del segundo apellido
    	//En este caso es recomendable trabajar con un arreglo para no hacer 22 "if else" como en el caso donde obtuvimos la primera vocal del primer apellido
    	int priconsegape = 0;
    	char recsegape =0;
    	//En este ciclo se incrementa el desplazamiento por la cadena del segundo apellido
    	for(int i = 1;(priconsegape==0&&i<segundoape.length()); i ++)
    	{
    		//En este ciclo for interno comparamos cada consonante del arreglo "consonantes" con la letra del segundo apellido en la posición 1, 
    		//una vez que la encuentra deja de buscar y se sale del ciclo 
    		for(int j = 0; (j< consonantes.length&&priconsegape==0);j++)
    		{
    		recsegape = segundoape.charAt(i);
    		if(recsegape==consonantes[j])
    			priconsegape++; 
    		}
    	} 
    	curp += String.valueOf(recsegape);
    	
    	//Primer consonante interna del nombre de pila
    	//En este caso es recomendable trabajar con un arreglo para no hacer 22 "if else" como en el caso donde obtuvimos la primera vocal del primer apellido
    	int priconnom = 0;
    	char recnombre =0;
    	//En este ciclo se incrementa el desplazamiento por la cadena del nombre
    	for(int i = 1;(priconnom==0&&i<nombrepila.length()); i ++)
    	{
    		//En este ciclo for interno comparamos cada consonante del arreglo "consonantes" con la letra del nombre en la posición 1, 
    		//una vez que la encuentra deja de buscar y se sale del ciclo 
    		for(int j = 0; (j< consonantes.length&&priconnom==0);j++)
    		{
    		recnombre = nombrepila.charAt(i);
    		if(recnombre==consonantes[j])
    			priconnom++; 
    		}
    	} 
    	curp += String.valueOf(recnombre);
    	//Crearemos un arreglo con las palabras inconvenientes, las compararemos una por una con las primeras 4 letras de la curp creada y si estas 4 letras son igual a alguna de las palabras inconvenientes, entonces cambiaremos la primer vocal por una "X"
    	String inconvenientes [] = {"BACA","BAKA","BUEI","BUEY","CACA","CACO","CAGA","CAGO","CAKA","CAKO","COGE","COGI","COJA","COJE","COJI","COJO","COLA","CULO","FALO","FETO","GETA","GUEI","GUEY","JETA","JOTO","KACA","KACO","KAGA","KAGO","KAKA","KAKO","KOGE","KOGI","KOJA","KOJE","KOJI","KOJO","KOLA","KULO","LILO","LOCA","LOCO","LOKA","LOKO","MAME","MAMO","MEAR","MEAS","MEON","MIAR","MION","MOCO","MOKO","MULA","MULO","NACA","NACO","PEDA","PEDO","PENE","PIPI","PITO","POPO","PUTA","PUTO","QULO","RATA","ROBA","ROBE","ROBO","RUIN","SENO","TETA","VACA","VAGA","VAGO","VAKA","VUEI","VUEY","WUEI","WUEY"};
    	for(int i = 0; i < inconvenientes.length;i ++){
    		if(inconvenientes [i].regionMatches(0,curp,0,4))
    			Cambio(curp, primerape, segundoape, nombrepila, anio,mont, da, Se,entidadfed,completo,sexop);	
    }
    	//jTextField2.setText(curp);
    		//JOptionPane.showMessageDialog(this,"Por favor verifique que todos los datos sean correctos","Recomendación",JOptionPane.INFORMATION_MESSAGE);						
    	return curp;
	}
	
    public static String Cambio( String cade, String firstape, String secondape, String namepil, String anie, String mese, String daye, char sexxx, String Entidad, String nombrecompleto, String definesexo){
	String reemplazo = cade;
	String first = firstape;
	String second = secondape;
	String pilname = namepil;
	String annio = anie;
	String mess = mese;
	String dayy = daye;
	char sexor = sexxx;
	String ente = Entidad;
	String a = "";
	StringBuffer buffer = new StringBuffer(reemplazo);
	String complet = nombrecompleto;
	String defsexop = definesexo;
	buffer.setCharAt(1,'X');
	//convertimos el objeto buffer de la clase StringBuffer en una cadena invocando al metodo implicito toString()
	a +=buffer.toString();
    return a;
    }
	

}
