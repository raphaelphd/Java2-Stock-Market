import java.io.IOException;

import yahoofinance.Stock;


public class AtivosControle {
	
	public Ativos ativo(Stock stock) throws IOException{
		Ativos ativo = new Ativos();
		
		ativo.setValor(stock.getQuote(true).getPrice().doubleValue());
		ativo.setMaiorValor(stock.getQuote(true).getDayHigh().doubleValue());
		ativo.setMenorValor(stock.getQuote(true).getDayLow().doubleValue());
		ativo.setAtivo(stock.getSymbol());
		
		return ativo;
		
	}

}
