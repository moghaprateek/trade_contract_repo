/**
 * 
 */
package com.trading.trade;

import com.trading.Contract;

/**
 * @author Patrick-pc
 *
 */
public class Trade {

	private String tradeId;
	private String price;
	private Integer slaInHours;
	private Contract contract;

	/**
	 * 
	 */
	public Trade() {

	}

	/**
	 * @param tradeId
	 * @param price
	 * @param slaInHours
	 * @param contract
	 */
	public Trade(String tradeId, String price, Integer slaInHours, Contract contract) {
		super();
		this.tradeId = tradeId;
		this.price = price;
		this.slaInHours = slaInHours;
		this.contract = contract;
	}

	/**
	 * @return the tradeId
	 */
	public String getTradeId() {
		return tradeId;
	}

	/**
	 * @param tradeId the tradeId to set
	 */
	public void setTradeId(String tradeId) {
		this.tradeId = tradeId;
	}

	/**
	 * @return the price
	 */
	public String getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(String price) {
		this.price = price;
	}

	/**
	 * @return the slaInHours
	 */
	public Integer getSlaInHours() {
		return slaInHours;
	}

	/**
	 * @param slaInHours the slaInHours to set
	 */
	public void setSlaInHours(Integer slaInHours) {
		this.slaInHours = slaInHours;
	}

	/**
	 * @return the contract
	 */
	public Contract getContract() {
		return contract;
	}

	/**
	 * @param contract the contract to set
	 */
	public void setContract(Contract contract) {
		this.contract = contract;
	}

	@Override
	public String toString() {
		return "Trade [tradeId=" + tradeId + ", price=" + price + ", slaInHours=" + slaInHours + ", contract="
				+ contract + "]";
	}

}
