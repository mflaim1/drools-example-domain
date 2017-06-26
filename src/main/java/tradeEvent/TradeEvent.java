package tradeEvent;

import java.util.Date;

@org.kie.api.definition.type.Role(org.kie.api.definition.type.Role.Type.EVENT)
@org.kie.api.definition.type.Timestamp("timestamp")

public class TradeEvent implements java.io.Serializable {
	private String accountId;
	private String financialAdvisorId;
	private Double price;
	private int quantity;
	private String symbol;
	private String type;
	private Date timestamp;
	private String id;

	public TradeEvent() {

	}

	public TradeEvent(String accountId, String financialAdvisorId, Double price, int quantity, String symbol,
			String type, Date timestamp, String id) {
		super();
		this.accountId = accountId;
		this.financialAdvisorId = financialAdvisorId;
		this.price = price;
		this.quantity = quantity;
		this.symbol = symbol;
		this.type = type;
		this.timestamp = timestamp;
		this.id = id;
	}

	public String getAccountId() {
		return accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public String getFinancialAdvisorId() {
		return financialAdvisorId;
	}

	public void setFinancialAdvisorId(String financialAdvisorId) {
		this.financialAdvisorId = financialAdvisorId;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Date getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((financialAdvisorId == null) ? 0 : financialAdvisorId.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((accountId == null) ? 0 : accountId.hashCode());
		result = prime * result + ((price == null) ? 0 : price.hashCode());
		result = prime * result + quantity;
		result = prime * result + ((symbol == null) ? 0 : symbol.hashCode());
		result = prime * result + ((timestamp == null) ? 0 : timestamp.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TradeEvent other = (TradeEvent) obj;
		if (financialAdvisorId == null) {
			if (other.financialAdvisorId != null)
				return false;
		} else if (!financialAdvisorId.equals(other.financialAdvisorId))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (accountId == null) {
			if (other.accountId != null)
				return false;
		} else if (!accountId.equals(other.accountId))
			return false;
		if (price == null) {
			if (other.price != null)
				return false;
		} else if (!price.equals(other.price))
			return false;
		if (quantity != other.quantity)
			return false;
		if (symbol == null) {
			if (other.symbol != null)
				return false;
		} else if (!symbol.equals(other.symbol))
			return false;
		if (timestamp == null) {
			if (other.timestamp != null)
				return false;
		} else if (!timestamp.equals(other.timestamp))
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "TradeEvent [accountId=" + accountId + ", financialAdvisorId=" + financialAdvisorId + ", price=" + price
				+ ", quantity=" + quantity + ", symbol=" + symbol + ", type=" + type + ", timestamp=" + timestamp
				+ ", id=" + id + "]";
	}

}