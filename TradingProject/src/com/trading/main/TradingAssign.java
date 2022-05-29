/**
 * 
 */
package com.trading.main;

import java.util.List;
import java.util.Scanner;

import com.trading.trade.Trade;
import com.trading.utility.TradeUtility;

/**
 * @author Patrick-pc
 *
 */
public class TradingAssign {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			int contractNum = 0;
			int tradeNum = 0;
			try (Scanner scanner = new Scanner(System.in)) {
				System.out.println("Enter The Number Of Contract To Generate >");

				contractNum = scanner.nextInt();

				System.out
						.println("Enter The Number Of Trade To Generate But Equal To / Or Less Than Contract Number >");

				tradeNum = scanner.nextInt();

				if (!(tradeNum <= contractNum)) {
					System.err.println("Provided Wrong Input");
					System.exit(0);
				}
			}

			List<Trade> trades = TradeUtility.assignContract(TradeUtility.generateContract(contractNum),
					TradeUtility.generateTrade(tradeNum));
			trades.stream().forEach(i -> System.out.println(i));

		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}

}
