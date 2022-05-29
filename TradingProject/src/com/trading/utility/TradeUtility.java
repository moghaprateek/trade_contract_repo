/**
 * 
 */
package com.trading.utility;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Random;
import java.util.UUID;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import com.trading.Contract;
import com.trading.trade.Trade;

/**
 * @author Patrick-pc
 *
 */
public class TradeUtility {
	public static List<Trade> assignContract(List<Contract> contracts, List<Trade> trades) {
		return trades.stream().filter(obj -> obj.getContract() == null)
				.peek(obj -> obj.setContract(getContractForTrade(contracts))).collect(Collectors.toList());

	}

	public static Contract getContractForTrade(List<Contract> contracts) {
		Random r = new Random();
		Contract contract = null;
		List<Contract> filterList = contracts.stream().filter(obj -> obj.isAssignedFlag() == false)
				.collect(Collectors.toList());
		if (filterList.size() < 0 && filterList.size() == 1) {
			contract = filterList.get(0);
		} else {
			if (!filterList.isEmpty())
				contract = filterList.stream().skip(r.nextInt(filterList.size())).findFirst().get();
		}
		for (Contract contractValue : contracts) {
			if (contractValue.getContractId().equalsIgnoreCase(contract.getContractId())) {
				contractValue.setAssignedFlag(true);
				break;
			}
		}

		return contract;
	}

	public static List<Contract> generateContract(int contractLimit) {
		return IntStream.rangeClosed(1, contractLimit)
				.mapToObj(i -> new Contract(UUID.randomUUID().toString(), "Desc About Contract :" + i, false))
				.collect(Collectors.toList());
	}

	public static List<Trade> generateTrade(int tradeLimit) {
		return IntStream.rangeClosed(1, tradeLimit).mapToObj(i -> new Trade(UUID.randomUUID().toString(),
				String.valueOf(1000 * i), LocalDateTime.now().getHour(), null)).collect(Collectors.toList());
	}
}
