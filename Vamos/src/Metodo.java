import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

import yahoofinance.Stock;
import yahoofinance.YahooFinance;


public class Metodo {
	
	public HashMap<String, Ativos> estrategiaVencedoraBusca() throws IOException{
		
		Map<String, Stock> stocks = YahooFinance.get(adicionaAtivosLista()); 
		HashMap<String, Ativos> map = new HashMap<String, Ativos>();
		
		Set<Entry<String, Stock>> s =stocks.entrySet();
		
		Iterator it=s.iterator();
		
		while(it.hasNext()){
			Map.Entry m =(Map.Entry)it.next();
			String ativo = (String) m.getKey();
			Stock stock = (Stock) m.getValue();
			
			AtivosControle  atiControle = new AtivosControle();
			MediasControle mediaControle = new MediasControle();
			
			Ativos ati = atiControle.ativo(stock);
			double media26 = mediaControle.media26(stock);
			double media21 = mediaControle.media21(stock);
			
			boolean hilo = mediaControle.hilo(stock);
			boolean hiloDelocado = mediaControle.hiloDeslocado(stock);
			
			if(ati.getValor() > media26){
				if(hilo == true){
					if(hiloDelocado == false){
						map.put(ativo, new Ativos(ativo, ati.getMaiorValor(), ati.getMenorValor(), ati.getValor()));
					}
				}
			}
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
	public String[] adicionaAtivosLista(){
		String[] symbols = new String[] 
				{ "ABEV3.SA",
				"ALPA4.SA",
				"ALSC3.SA",
				"ALUP11.SA",
				"BBAS3.SA",
				"BBDC3.SA",
				"BBDC4.SA",
				"BBSE3.SA",
				"BEEF3.SA",
				"BRAP4.SA",
				"BRFS3.SA",
				"BRKM5.SA",
				"BRML3.SA",
				"BRPR3.SA",
				"BRSR6.SA",
				"BTOW3.SA",
				"BVMF3.SA",
				"CCRO3.SA",
				"CESP6.SA",
				"CIEL3.SA",
				"CMIG4.SA",
				"CPFE3.SA",
				"CPLE6.SA",
				"CSAN3.SA",
				"CSMG3.SA",
				"CSNA3.SA",
				"CVCB3.SA",
				"CYRE3.SA",
				"DTEX3.SA",
				"ECOR3.SA",
				"EGIE3.SA",
				"ELET3.SA",
				"ELET6.SA",
				"ELPL4.SA",
				"EMBR3.SA",
				"ENBR3.SA",
				"EQTL3.SA",
				"ESTC3.SA",
				"EZTC3.SA",
				"FIBR3.SA",
				"FLRY3.SA",
				"GFSA3.SA",
				"GGBR4.SA",
				"GOAU4.SA",
				"GOLL4.SA",
				"HGTX3.SA",
				"HYPE3.SA",
				"IGTA3.SA",
				"ITSA4.SA",
				"ITUB4.SA",
				"JBSS3.SA",
				"KLBN11.SA",
				"KROT3.SA",
				"LAME3.SA",
				"LAME4.SA",
				"LEVE3.SA",
				"LIGT3.SA",
				"LREN3.SA",
				"MDIA3.SA",
				"MGLU3.SA",
				"MPLU3.SA",
				"MRFG3.SA",
				"MRVE3.SA",
				"MULT3.SA",
				"MYPK3.SA",
				"NATU3.SA",
				"ODPV3.SA",
				"PCAR4.SA",
				"PETR3.SA",
				"PETR4.SA",
				"POMO4.SA",
				"PSSA3.SA",
				"QGEP3.SA",
				"QUAL3.SA",
				"RADL3.SA",
				"RAIL3.SA",
				"RAPT4.SA",
				"RENT3.SA",
				"SANB11.SA",
				"SBSP3.SA",
				"SEER3.SA",
				"SMLE3.SA",
				"SMTO3.SA",
				"SULA11.SA",
				"SUZB5.SA",
				"TAEE11.SA",
				//"TIET11.SA",
				"TIMP3.SA",
				"TOTS3.SA",
				"TRPL4.SA",
				"TUPY3.SA",
				"UGPA3.SA",
				"USIM5.SA",
				"VALE3.SA",
				"VALE5.SA",
				"VIVT4.SA",
				"VLID3.SA",
				"VVAR11.SA",
				"WEGE3.SA"} ;
		return symbols;

		
	}

}
