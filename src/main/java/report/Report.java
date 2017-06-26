package report;

import java.util.ArrayList;

public class Report {
	private String code;
	private ArrayList<String> trades;

	public Report() {
		code = null;
		trades = new ArrayList<String>();
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public ArrayList<String> getTrades() {
		return trades;
	}

	public void setTrades(ArrayList<String> trades) {
		this.trades = trades;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((code == null) ? 0 : code.hashCode());
		result = prime * result + ((trades == null) ? 0 : trades.hashCode());
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
		Report other = (Report) obj;
		if (code == null) {
			if (other.code != null)
				return false;
		} else if (!code.equals(other.code))
			return false;
		if (trades == null) {
			if (other.trades != null)
				return false;
		} else if (!trades.equals(other.trades))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Report [code=" + code + ", trades=" + trades + "]";
	}
}