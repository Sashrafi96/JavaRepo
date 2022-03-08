package com.nec.billpayment;

public class Consumer {

	private String consumerNo;
	private String consumerName;
	private String consumedUnit;
	
	public String getConsumerNo() {
		return consumerNo;
	}
	public void setConsumerNo(String consumerNo) {
		this.consumerNo = consumerNo;
	}

	public String getConsumerName() {
		return consumerName;
	}
	public void setConsumerName(String consumerName) {
		this.consumerName = consumerName;
	}

	public String getConsumedUnit() {
		return consumedUnit;
	}
	public void setConsumedUnit(String consumedUnit) {
		this.consumedUnit = consumedUnit;
	}
//	private int consumerNo;
//	private String consumerName;
//	private int consumedUnit;
//	
//	public int getConsumerNo() {
//		return consumerNo;
//	}
//	public void setConsumerNo(int consumerNo) {
//		this.consumerNo = consumerNo;
//	}
//
//	public String getConsumerName() {
//		return consumerName;
//	}
//	public void setConsumerName(String consumerName) {
//		this.consumerName = consumerName;
//	}
//
//	public int getConsumedUnit() {
//		return consumedUnit;
//	}
//	public void setConsumedUnit(int consumedUnit) {
//		this.consumedUnit = consumedUnit;
//	}



	@Override
	public String toString() {
		return "consumerNo=" + consumerNo + ", consumerName=" + consumerName + ", consumedUnit="
				+ consumedUnit+"\n";
	}
	
}
