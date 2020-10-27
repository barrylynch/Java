package tutuka19;


public class Transaction {

	String ProfileName;
	String TransactionDate;
	String TransactionAmount;
	String TransactionNarrative;
	String TransactionDescription;
	String TransactionID;
	String TransactionType;
	String WalletReference;
	Boolean matched = false;
	Boolean almostMatch = false;
	
	// Get and Set methods
	public String getProfileName() {
		return ProfileName;
	}
	public void setProfileName(String profileName) {
		ProfileName = profileName;
	}
	public String getTransactionDate() {
		return TransactionDate;
	}
	public void setTransactionDate(String transactionDate) {
		TransactionDate = transactionDate;
	}
	public String getTransactionAmount() {
		return TransactionAmount;
	}
	public void setTransactionAmount(String transactionAmount) {
		TransactionAmount = transactionAmount;
	}
	public String getTransactionNarrative() {
		return TransactionNarrative;
	}
	public void setTransactionNarrative(String transactionNarrative) {
		TransactionNarrative = transactionNarrative;
	}
	public String getTransactionDescription() {
		return TransactionDescription;
	}
	public void setTransactionDescription(String transactionDescription) {
		TransactionDescription = transactionDescription;
	}
	public String getTransactionID() {
		return TransactionID;
	}
	public void setTransactionID(String transactionID) {
		TransactionID = transactionID;
	}
	public String getTransactionType() {
		return TransactionType;
	}
	public void setTransactionType(String transactionType) {
		TransactionType = transactionType;
	}
	public String getWalletReference() {
		return WalletReference;
	}
	public void setWalletReference(String walletReference) {
		WalletReference = walletReference;
	}
	public Boolean getMatched() {
		return matched;
	}
	public void setMatched(Boolean matched) {
		this.matched = matched;
	}
	public Boolean getAlmostMatch() {
		return almostMatch;
	}
	public void setAlmostMatch(Boolean almostMatch) {
		this.almostMatch = almostMatch;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ProfileName == null) ? 0 : ProfileName.hashCode());
		result = prime * result + ((TransactionAmount == null) ? 0 : TransactionAmount.hashCode());
		result = prime * result + ((TransactionDate == null) ? 0 : TransactionDate.hashCode());
		result = prime * result + ((TransactionDescription == null) ? 0 : TransactionDescription.hashCode());
		result = prime * result + ((TransactionID == null) ? 0 : TransactionID.hashCode());
		result = prime * result + ((TransactionNarrative == null) ? 0 : TransactionNarrative.hashCode());
		result = prime * result + ((TransactionType == null) ? 0 : TransactionType.hashCode());
		result = prime * result + ((WalletReference == null) ? 0 : WalletReference.hashCode());
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
		Transaction other = (Transaction) obj;
		if (ProfileName == null) {
			if (other.ProfileName != null)
				return false;
		} else if (!ProfileName.equals(other.ProfileName))
			return false;
		if (TransactionAmount == null) {
			if (other.TransactionAmount != null)
				return false;
		} else if (!TransactionAmount.equals(other.TransactionAmount))
			return false;
		if (TransactionDate == null) {
			if (other.TransactionDate != null)
				return false;
		} else if (!TransactionDate.equals(other.TransactionDate))
			return false;
		if (TransactionDescription == null) {
			if (other.TransactionDescription != null)
				return false;
		} else if (!TransactionDescription.equals(other.TransactionDescription))
			return false;
		if (TransactionID == null) {
			if (other.TransactionID != null)
				return false;
		} else if (!TransactionID.equals(other.TransactionID))
			return false;
		if (TransactionNarrative == null) {
			if (other.TransactionNarrative != null)
				return false;
		} else if (!TransactionNarrative.equals(other.TransactionNarrative))
			return false;
		if (TransactionType == null) {
			if (other.TransactionType != null)
				return false;
		} else if (!TransactionType.equals(other.TransactionType))
			return false;
		if (WalletReference == null) {
			if (other.WalletReference != null)
				return false;
		} else if (!WalletReference.equals(other.WalletReference))
			return false;
		return true;
	}
	
	// Return true if all members except 1 match
	public boolean almostEquals(Object obj) {
		boolean profileNameIsDifferent = false;
		boolean transactionAmountIsDifferent = false;
		boolean transactionDateIsDifferent = false;
		boolean transactionDescIsDifferent = false;
		boolean transactionIDIsDifferent = false;
		boolean transactionNarrativeIsDifferent = false;
		boolean transactionTypeIsDifferent = false;
		boolean walletReferenceIsDifferent = false;
		
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Transaction other = (Transaction) obj;
				
		if (ProfileName == null) {
			if (other.ProfileName != null)
				profileNameIsDifferent = true;
		} else if (!ProfileName.equals(other.ProfileName))
			profileNameIsDifferent = true;
		if (TransactionAmount == null) {
			if (other.TransactionAmount != null)
				transactionAmountIsDifferent = true;
		} else if (!TransactionAmount.equals(other.TransactionAmount))
			transactionAmountIsDifferent = true;
		if (TransactionDate == null) {
			if (other.TransactionDate != null)
				transactionDateIsDifferent = true;
		} else if (!TransactionDate.equals(other.TransactionDate))
			transactionDateIsDifferent = true;
		if (TransactionDescription == null) {
			if (other.TransactionDescription != null)
				transactionDescIsDifferent = true;
		} else if (!TransactionDescription.equals(other.TransactionDescription))
			transactionDescIsDifferent = true;
		if (TransactionID == null) {
			if (other.TransactionID != null)
				transactionIDIsDifferent = true;
		} else if (!TransactionID.equals(other.TransactionID))
			transactionIDIsDifferent = true;
		if (TransactionNarrative == null) {
			if (other.TransactionNarrative != null)
				transactionNarrativeIsDifferent = true;
		} else if (!TransactionNarrative.equals(other.TransactionNarrative))
			transactionNarrativeIsDifferent = true;
		if (TransactionType == null) {
			if (other.TransactionType != null)
				transactionTypeIsDifferent = true;
		} else if (!TransactionType.equals(other.TransactionType))
			transactionTypeIsDifferent = true;
		if (WalletReference == null ) {
			if (other.WalletReference != null)
				walletReferenceIsDifferent = true;
		} else if (!WalletReference.equals(other.WalletReference) )
				walletReferenceIsDifferent = true;
		
		if(profileNameIsDifferent && !transactionAmountIsDifferent && 
				!transactionDateIsDifferent && !transactionDescIsDifferent &&
				!transactionIDIsDifferent && !transactionNarrativeIsDifferent &&
				!transactionTypeIsDifferent && !walletReferenceIsDifferent)
			{ return true; }
		else if(!profileNameIsDifferent && transactionAmountIsDifferent && 
				!transactionDateIsDifferent && !transactionDescIsDifferent &&
				!transactionIDIsDifferent && !transactionNarrativeIsDifferent &&
				!transactionTypeIsDifferent && !walletReferenceIsDifferent)
			{ return true; }
		else if(!profileNameIsDifferent && !transactionAmountIsDifferent && 
				transactionDateIsDifferent && !transactionDescIsDifferent &&
				!transactionIDIsDifferent && !transactionNarrativeIsDifferent &&
				!transactionTypeIsDifferent && !walletReferenceIsDifferent)
			{ return true; }
		else if(!profileNameIsDifferent && !transactionAmountIsDifferent && 
				!transactionDateIsDifferent && transactionDescIsDifferent &&
				!transactionIDIsDifferent && !transactionNarrativeIsDifferent &&
				!transactionTypeIsDifferent && !walletReferenceIsDifferent)
			{ return true; }
		else if(!profileNameIsDifferent && !transactionAmountIsDifferent && 
				!transactionDateIsDifferent && !transactionDescIsDifferent &&
				transactionIDIsDifferent && !transactionNarrativeIsDifferent &&
				!transactionTypeIsDifferent && !walletReferenceIsDifferent)
			{ return true; }
		else if(!profileNameIsDifferent && !transactionAmountIsDifferent && 
				!transactionDateIsDifferent && !transactionDescIsDifferent &&
				!transactionIDIsDifferent && transactionNarrativeIsDifferent &&
				!transactionTypeIsDifferent && !walletReferenceIsDifferent)
			{ return true; }
		else if(!profileNameIsDifferent && !transactionAmountIsDifferent && 
				!transactionDateIsDifferent && !transactionDescIsDifferent &&
				!transactionIDIsDifferent && !transactionNarrativeIsDifferent &&
				transactionTypeIsDifferent && !walletReferenceIsDifferent)
			{ return true; }
		else if(!profileNameIsDifferent && !transactionAmountIsDifferent && 
				!transactionDateIsDifferent && !transactionDescIsDifferent &&
				!transactionIDIsDifferent && !transactionNarrativeIsDifferent &&
				!transactionTypeIsDifferent && walletReferenceIsDifferent)
			{ return true; }	
		else 
		{
			return false;
		}
	}
	
	@Override
	public String toString() {
		return "transaction [ProfileName=" + ProfileName + ", TransactionDate=" + TransactionDate
				+ ", TransactionAmount=" + TransactionAmount + ", TransactionNarrative=" + TransactionNarrative
				+ ", TransactionDescription=" + TransactionDescription + ", TransactionID=" + TransactionID
				+ ", TransactionType=" + TransactionType + ", WalletReference=" + WalletReference + "]";
	}
}
