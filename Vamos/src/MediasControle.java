import java.io.IOException;
import java.util.Calendar;
import java.util.Iterator;

import yahoofinance.Stock;
import yahoofinance.histquotes.HistoricalQuote;
import yahoofinance.histquotes.Interval;


public class MediasControle {
	
	public double media21(Stock stock) throws IOException{
		
		double media =0, tmp =0;
		
		Calendar from = Calendar.getInstance();
		Calendar to = Calendar.getInstance();
		from.add(Calendar.MONTH, -1);
		int controle = 1;
		
		for(Iterator<HistoricalQuote> iter = stock.getHistory(from, to, Interval.DAILY).iterator(); iter.hasNext();){
			
			HistoricalQuote element = iter.next();
			if(controle == 21){
				tmp += element.getClose().doubleValue();
				break;
			}
			tmp += element.getClose().doubleValue();		
			
		}
		media = tmp/21;
		return media;
		
	}
	public double media26(Stock stock) throws IOException{
		
		double media =0, tmp =0;
		
		Calendar from = Calendar.getInstance();
		Calendar to = Calendar.getInstance();
		from.add(Calendar.MONTH, -2);
		int controle = 1;
		
		for(Iterator<HistoricalQuote> iter = stock.getHistory(from, to, Interval.DAILY).iterator(); iter.hasNext();){
			
			HistoricalQuote element = iter.next();
			if(controle == 26){
				tmp += element.getClose().doubleValue();
				break;
			}
			tmp += element.getClose().doubleValue();		
			
		}
		media = tmp/26;
		return media;		
	}
	//True Verde
	//False Vermelho
	public boolean hilo(Stock stock) throws IOException{
		
		Calendar from = Calendar.getInstance();
		Calendar to = Calendar.getInstance();
		from.add(Calendar.MONTH, -1);
		
		int controle = 1;
		double tmpHighValue = 0, tmpLowValue =0, tmpValorAtual = 0, highValue = 0, lowValue = 0; 
		
		for(Iterator<HistoricalQuote> iter = stock.getHistory(from, to, Interval.DAILY).iterator(); iter.hasNext();){
			
			HistoricalQuote element = iter.next();
			
			if(controle == 1 ){
				tmpHighValue += element.getHigh().doubleValue();
				tmpLowValue  += element.getLow().doubleValue();
				tmpValorAtual = element.getClose().doubleValue();
			}
			tmpHighValue += element.getHigh().doubleValue();
			tmpLowValue  += element.getLow().doubleValue();
			
			if(controle == 4){
				break;
			}
			controle++;
		}
		
		highValue = tmpHighValue/4;
		lowValue = tmpLowValue/4;
		
		if( tmpValorAtual >= highValue  && tmpValorAtual >= lowValue){
			return true;
		}else{
			return false;
		}
	}
	public boolean hiloDeslocado(Stock stock) throws IOException{
		
		Calendar from = Calendar.getInstance();
		Calendar to = Calendar.getInstance();
		from.add(Calendar.MONTH, -1);
		
		int controle = 1;
		double tmpHighValue = 0, tmpLowValue =0, tmpValorAtual = 0, highValue = 0, lowValue = 0; 
		
		for(Iterator<HistoricalQuote> iter = stock.getHistory(from, to, Interval.DAILY).iterator(); iter.hasNext();){
			
			HistoricalQuote element = iter.next();
			
			if(controle == 2 ){
				tmpHighValue += element.getHigh().doubleValue();
				tmpLowValue  += element.getLow().doubleValue();
				tmpValorAtual = element.getClose().doubleValue();
			}
			tmpHighValue += element.getHigh().doubleValue();
			tmpLowValue  += element.getLow().doubleValue();
			
			if(controle == 5){
				break;
			}
			controle++;
		}
		
		highValue = tmpHighValue/4;
		lowValue = tmpLowValue/4;
		
		if( tmpValorAtual >= highValue  && tmpValorAtual >= lowValue){
			return true;
		}else{
			return false;
		}
	}


}
