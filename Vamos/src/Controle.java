import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

import yahoofinance.Stock;
import yahoofinance.YahooFinance;
import yahoofinance.histquotes.HistoricalQuote;
import yahoofinance.histquotes.Interval;


public class Controle {
	
	
	public String[] adicionaAtivosLista(){
		String[] symbols = new String[] { "RSID3.SA" , 
				"JBDU4.SA" , 
				"SGPS3.SA" , 
				"CARD3.SA" , 
				"TELB4.SA" , 
				"MLFT4.SA" , 
				"PRIO3.SA" , 
				"GOLL4.SA" , 
				"JHSF3.SA" , 
				"MGLU3.SA" , 
				"OIBR3.SA" , 
				"FHER3.SA" , 
				"PDGR3.SA" , 
				"OIBR4.SA" , 
				"BPAN4.SA" , 
				"ATOM3.SA" , 
				"TGMA3.SA" , 
				"BRAP3.SA" , 
				"CMIG3.SA" , 
				"HBOR3.SA" , 
				"BEES3.SA" , 
				"ROMI3.SA" , 
				"BRSR6.SA" , 
				"BRAP4.SA" , 
				"ABCB4.SA" , 
				"RAIL3.SA" , 
				"SMLE3.SA" , 
				"VIVR3.SA" , 
				"MRVE3.SA" , 
				"MEAL3.SA" , 
				"RUMO3.SA" , 
				"PTBL3.SA" , 
				"GGBR3.SA" , 
				"CESP6.SA" , 
				"TPIS3.SA" , 
				//"BBTG11.SA" , 
				"RAPT4.SA" , 
				"CMIG4.SA" , 
				"RLOG3.SA" , 
				"TIMP3.SA" , 
				"TESA3.SA" , 
				"MYPK3.SA" , 
				"CPLE3.SA" , 
				"FESA4.SA" , 
				"BPHA3.SA" , 
				"SHUL4.SA" , 
				"LCAM3.SA" , 
				"EZTC3.SA" , 
				"SSBR3.SA" , 
				"CSMG3.SA" , 
				"DTEX3.SA" , 
				"CLSC4.SA" , 
				"GUAR3.SA" , 
				"PARC3.SA" , 
				"TCSA3.SA" , 
				"LOGN3.SA" , 
				"SPTW11.SA" , 
				"SLED4.SA" , 
				"CYRE3.SA" , 
				"ARZZ3.SA" , 
				"PFRM3.SA" , 
				"NATU3.SA" , 
				"SCAR3.SA" , 
				"RENT3.SA" , 
				"EVEN3.SA" , 
				"TUPY3.SA" , 
				"POSI3.SA" , 
				"SLCE3.SA" , 
				"ALPA4.SA" , 
				"GRND3.SA" , 
				"LIGT3.SA" , 
				"SNSL3.SA" , 
				"MGEL4.SA" , 
				"CVCB3.SA" , 
				"AMAR3.SA" , 
				"CPLE6.SA" , 
				//"ENGI11.SA" , 
				"ITSA4.SA" , 
				"BTOW3.SA" , 
				"IGTA3.SA" , 
				"SHOW3.SA" , 
				"BRML3.SA" , 
				"DIRR3.SA" , 
				"BBAS3.SA" , 
				"LREN3.SA" , 
				"HGTX3.SA" , 
				"SDIL11.SA" , 
				"CGRA4.SA" , 
				"BRPR3.SA" , 
				"KEPL3.SA" , 
				"VALE5.SA" , 
				"AAPL34.SA" , 
				//"ALUP11.SA" , 
				"ELPL4.SA" , 
				"TOTS3.SA" , 
				"GUAR4.SA" , 
				"FLRY3.SA" , 
				"PRML3.SA" , 
				"ITUB4.SA" , 
				"ITSA3.SA" , 
				"ITUB3.SA" , 
				"CGRA3.SA" , 
				"BRCR11.SA" , 
				//"SMAL11.SA" , 
				"CGAS3.SA" , 
				"BVMF3.SA" , 
				"VLOL11.SA" , 
				"VALE3.SA" , 
				"BBPO11.SA" , 
				"HGBS11.SA" , 
				"HYPE3.SA" , 
				"PCAR4.SA" , 
				"CCRO3.SA" , 
				"FIGS11.SA" , 
				"TECN3.SA" , 
				"EMBR3.SA" , 
				"CTIP3.SA" , 
				"SULA11.SA" , 
				"MXRF11.SA" , 
				"SAAG11.SA" , 
				"KNRI11.SA" , 
				"MULT3.SA" , 
				"VISA34.SA" , 
				"QGEP3.SA" , 
				"CGAS5.SA" , 
				"TBOF11.SA" , 
				"DAGB33.SA" , 
				"BBDC4.SA" , 
				"MDIA3.SA" , 
				"BBDC3.SA" , 
				"SBSP3.SA" , 
				"AGCX11.SA" , 
				"WEGE3.SA" , 
				"HGRE11.SA" , 
				"LPSB3.SA" , 
				//"SANB11.SA" , 
				"ABEV3.SA" , 
				//"ECOO11.SA" , 
				"LAME3.SA" , 
				"VIVT3.SA" , 
				"MAGG3.SA" , 
				//"VIVT4.SA" , 
				"SAPR4.SA" , 
				"AGRO3.SA" , 
				"UNIP6.SA" , 
				//"BOVA11.SA" , 
				//"TAEE11.SA" , 
				"ECOR3.SA" , 
				"HONB34.SA" , 
				//"XBOV11.SA" , 
				"GFSA3.SA" , 
				"BBSE3.SA" , 
				//"PIBB11.SA" , 
				"EQTL3.SA" , 
				"HGLG11.SA" , 
				"GOAU4.SA" , 
				"MMXM3.SA" , 
				"UGPA3.SA" , 
				"PSSA3.SA" , 
				"JNJB34.SA" , 
				"POMO3.SA" , 
				"CPRE3.SA" , 
				"CZLT33.SA" , 
				"TIET4.SA" , 
				"GGBR4.SA" , 
				"LEVE3.SA" , 
				"CPFE3.SA" , 
				"PGCO34.SA" , 
				"BBRK3.SA" , 
				"PEPB34.SA" , 
				"WSON33.SA" , 
				"MCDC34.SA" , 
				//"MFII11.SA" , 
				//"IBOV11.SA" , 
				"KHCB34.SA" , 
				"MPLU3.SA" , 
				"GOAU3.SA" , 
				//"BCRI11.SA" , 
				"ENBR3.SA" , 
				"SEER3.SA" , 
				"QUAL3.SA" , 
				"ALSC3.SA" , 
				//"IVVB11.SA" , 
				"BERK34.SA" , 
				"FRAS3.SA" , 
				"CIEL3.SA" , 
				"TRPL4.SA" , 
				"POMO4.SA" , 
				"JSRE11.SA" , 
				//"TIET11.SA" , 
				"CMCS34.SA" , 
				"ANIM3.SA" , 
				"USIM5.SA" , 
				"CSAN3.SA" , 
				//"VRTA11.SA" , 
				"ETER3.SA" , 
				"USIM3.SA" , 
				"WFCO34.SA" , 
				//"KNCR11.SA" , 
				"KROT3.SA" , 
				//"VVAR11.SA" , 
				"JBSS3.SA" , 
				"BRIN3.SA" , 
				"LAME4.SA" , 
				"VLID3.SA" , 
				"ESTC3.SA" , 
				"RADL3.SA" , 
				"GSGI34.SA" , 
				"COCE5.SA" , 
				"LINX3.SA" , 
				"BRKM5.SA" , 
				"GPIV33.SA" , 
				"PETR4.SA" , 
				"TIET3.SA" , 
				"SUZB5.SA" , 
				"GEOO34.SA" , 
				"MILS3.SA" , 
				"CSNA3.SA" , 
				"SMTO3.SA" , 
				"ODPV3.SA" , 
				"MRFG3.SA" , 
				"ELET6.SA" , 
				"CHVX34.SA" , 
				"KLBN4.SA" , 
				"OFSA3.SA" , 
				"PMAM3.SA" , 
				"FIBR3.SA" , 
				"EXXO34.SA" , 
				"UCAS3.SA" , 
				//"HALI34.SA" , 
				"SLBG34.SA" , 
				"PETR3.SA" , 
				"ELET3.SA" , 
				//"KLBN11.SA" , 
				"BEEF3.SA" , 
				"JSLG3.SA" , 
				"BRFS3.SA" , 
				"BSEV3.SA" , 
				//"RNEW11.SA" , 
				"LUPA3.SA" , 
				"RCSL4.SA" , 
				"OGSA3.SA" } ;
		return symbols;

		
	}

	public void verificaAcoes(String[] lista) throws IOException{
		
		//Iterator it = lista.length;
		//while(it.hasNext()){
		for(int i = 0; i < lista.length; i++) {
			Stock stock =  YahooFinance.get(lista[i]);
			System.out.println("Ativo : " + lista[i] + " Resposta : " + stock.isValid() );
			stock =null;
			
			
		}
		
	}

	public Ativos historico(int periodoMedia, int periodoHilo, String ativo) throws IOException{
		
		Medias med = new Medias();
		
		double mediaMovel = 0, maiorValor =0, menorValor = 0;;
		String halo;
		
		Calendar from = Calendar.getInstance();
		Calendar to = Calendar.getInstance();
		from.add(Calendar.MONTH, -2); 
		
		Stock stock = YahooFinance.get(ativo, from, to, Interval.DAILY);
		
		int controle = 0;
		double valorAtual = 0, valorAtualHalo = 0;
		double tmpHighValue = 0, tmpLowValue = 0;
		
		for(Iterator<HistoricalQuote> iter = stock.getHistory().iterator(); iter.hasNext();){
			
			HistoricalQuote element = iter.next();
			
			if(controle == 0){				
				valorAtualHalo = element.getClose().doubleValue();
				maiorValor = element.getHigh().doubleValue();
				menorValor = element.getLow().doubleValue();
				
			}
			
			if(controle < periodoHilo){
				
				tmpHighValue += element.getHigh().doubleValue();
				tmpLowValue  += element.getLow().doubleValue();
				
				//System.out.println("High Value --> " + tmpHighValue + " Low Value --> " + tmpLowValue);
			}
			
			if(controle <= periodoMedia){
				
				valorAtual += element.getClose().doubleValue();
				
			}
			else{
				break;
			}
			
			
			controle ++;
			
		}
		
		mediaMovel = valorAtual/periodoMedia;
		System.out.println("Media " + mediaMovel);
		
		if(mediaMovel < valorAtualHalo){
			med.setPosicaoMedia("Acima");
		}
		else{
			med.setPosicaoMedia("Abaixo");
		}
		
		tmpHighValue = tmpHighValue/4;
		tmpLowValue = tmpLowValue/4;
		
		if( valorAtualHalo >= tmpHighValue  && valorAtualHalo >= tmpLowValue){
			halo = "Verde";
		}else{
			halo = "Vermelho";
		}
		
		med.setHalo(halo);
		med.setMediaMovel(mediaMovel);
		
		
		Ativos ati = new Ativos(ativo, maiorValor, menorValor, valorAtualHalo);
		
		
		return ati;
	}
		
	public HashMap<String, Ativos> metodo() throws Exception{

		//String lista[] = adicionaAtivosLista();
		String lista[] = new String[] { "EMBR3.SA" };
		
		HashMap<String, Ativos> map = new HashMap<String, Ativos>();
		
		for(int i = 0; i < lista.length; i++) {
			
			Ativos ati = historico(26, 4, lista[i]);
			map.put(lista[i], new Ativos(lista[i], ati.getMaiorValor(), ati.getMenorValor(), ati.getValor()));
			
		}
		
		
		return map;
		
	}

	public void print(Map<String, Ativos> map){
		
		Set<Entry<String, Ativos>> s =map.entrySet();
		
		Iterator it=s.iterator();
		
		while(it.hasNext()){
			Map.Entry m =(Map.Entry)it.next();
			String key = (String) m.getKey();
			Ativos ati = (Ativos) m.getValue();
			
			System.out.println(
					" Codigo Ativo: " + key + 
					" |Start      : " + ati.getMaiorValor() + 
					" |Stop       : " + ati.getMenorValor() +
					" |Valor Atual: " + ati.getValor()  
					);			
			
		}
	}
	
	public HashMap<String, Integer> ordena( int perido) throws IOException{
		
		HashMap<Integer,String> porcList=new HashMap<Integer,String>();
		HashMap<String, Integer> listaResult=new HashMap<String,Integer>();
		
		//String lista[] = adicionaAtivosLista();
		
	    String[] lista = new String[] { "EMBR3.SA" };
				//"JBDU4.SA" , 
				//"SGPS3.SA" };
		//ArrayList<String> lis = new ArrayList<String>();
		
		
		for(int i = 0; i < lista.length; i++) {
			
			Calendar from = Calendar.getInstance();
			Calendar to = Calendar.getInstance();
			from.add(Calendar.MONTH, -1); 
			
			//Stock stock = YahooFinance.get(lista[i], from, to, Interval.DAILY);
			
			//System.out.println(" Porcentagem " + stock.getQuote().getChangeInPercent());
			
			Stock stock1 = YahooFinance.get(lista[i], from, to, Interval.MONTHLY);
			stock1.getQuote().getChangeFromYearHighInPercent();
			
			System.out.println(" Porcentagem 2 " + stock1.getQuote().getPrice());
			
			int controle = 0;
			double ultimoValor = 0, primeiroValor = 0;
			
			for(Iterator<HistoricalQuote> iter = stock1.getHistory().iterator(); iter.hasNext();){
				
				HistoricalQuote element = iter.next();
				
				if(controle == 0){				
					//ultimoValor = element.getClose().doubleValue();
					//System.out.println("Ativo " + lista[i] + " Ultimo Valor : " + ultimoValor);
				}
				//if(controle == perido ){
					//primeiroValor = element.getClose().doubleValue();
					//System.out.println(" Ativo " + lista[i] + " Primiro Valor : " + element.getClose().doubleValue() + " Data " + element.getDate().DAY_OF_MONTH + "/" + element.getDate().MONTH);
					//System.out.println("Controle " + controle);
					//break;
				//}
				
				controle ++;
			}
			
			double resultado = (ultimoValor*100/primeiroValor) -100;
			
			//System.out.println("Ativo " + lista[i] + " Primiro Valor : " + primeiroValor + " Ultimo Valor " + resultado + " Resultado " + resultado);
			
			porcList.put((int) resultado, new String(lista[i]));
		}
		
		TreeMap treePre=new TreeMap(porcList);
		//Iterator k=treePreCurso.keySet().iterator();
		Iterator k= treePre.descendingKeySet().iterator();
		while (k.hasNext()){
			int valor=(int) k.next();
			String ativo=porcList.get(valor);
			//System.out.println(valor + ":" + ativo);
			listaResult.put(ativo, new Integer(valor));
			
		}
		
		return listaResult;
		
	}
	
	public void printList(Map<String, Integer> map){
		Set<Entry<String,Integer>> s =map.entrySet();
		
		Iterator it=s.iterator();
		while(it.hasNext()){
			Map.Entry m =(Map.Entry)it.next();
			String ativo = (String) m.getKey();
			int valor = (int) m.getValue();
			System.out.println("Resultado Ativo: " + ativo + " Valor " + valor);
			
		}
		
		
		
		
	}
	
	public void porcentagem(Map<String, Stock> stocks, int periodo){
		
		Set<Entry<String, Stock>> s = stocks.entrySet();
		Iterator it=s.iterator();
		
		while(it.hasNext()){
			Map.Entry m =(Map.Entry)it.next();
			System.out.println("KEY : " + m.getKey() );
		}
		
		
		
	}
	
}
