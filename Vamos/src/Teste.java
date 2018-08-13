import java.awt.List;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

import yahoofinance.Stock;
import yahoofinance.YahooFinance;
import yahoofinance.histquotes.HistoricalQuote;
import yahoofinance.histquotes.Interval;
import yahoofinance.quotes.stock.StockQuote;


public class Teste {

	public static void main(String[] args) {
		
		

		/*HashMap<Integer,String> preCurso=new HashMap<Integer,String>();

		preCurso.put(10, "EL");
		preCurso.put(2, "RA");
		preCurso.put(4, "PHA");
		

		Iterator j=preCurso.keySet().iterator();
		while(j.hasNext()){
			int curso=(int)j.next();
			String preco=preCurso.get(curso);
			System.out.println(curso + ":" + preco);

		}
*/
		System.out.println("-------------------------");

		TreeMap treePreCurso=new TreeMap(preCurso);
		//Iterator k=treePreCurso.keySet().iterator();
		Iterator k= treePreCurso.descendingKeySet().iterator();
		while (k.hasNext()){
			int curso=(int) k.next();
			String preco=preCurso.get(curso);
			System.out.println(curso + ":" + preco);

		}

	}

}
