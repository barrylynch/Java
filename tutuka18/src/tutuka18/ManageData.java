package tutuka18;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Vector;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

public class ManageData {
	
	// Get number of unmatched transactions in this vector of transactions
	public static int unmatched(int numMatched, Vector<Transaction> trans)
	{
		int unMatched = 0;
		unMatched = trans.size() - numMatched;

		return unMatched;
	}
	
	// Set matched indicators in transaction and count instances of transaction match
	public static int matchData(Vector<Transaction> trans1, Vector<Transaction> trans2)
	{
		int numMatched = 0;
		// reset matched indicators to allow correct usage of service 2nd time and there after
		for (Transaction transaction : trans1) {
			transaction.setMatched(false);
		}
		for (Transaction transaction : trans2) {
			transaction.setMatched(false);
		}
		
		for ( Transaction tran1 : trans1) {
			for (Transaction tran2 : trans2) {
				if(tran1.equals(tran2))
				{
					tran1.setMatched(true);
					tran2.setMatched(true);
					numMatched ++;
					break;
				}			
			}
		}
		return numMatched;
	}
	// Create vector of unmatched transactions
	public static Vector<Transaction> getUnmatchedOutput(Vector<Transaction> trans)
	{
		Vector<Transaction> unmatched = null; 				
		unmatched = new Vector<Transaction>();
		
		for (Transaction transaction : trans) {
			if(!transaction.getMatched() )
			{
				unmatched.add(transaction);
			}			
		}
		return unmatched;
	}	
	// Read CSV data from file into vector of transaction objects
	public static Vector<Transaction> readCSVData(File file) 
    {
 	   	Reader in = null;
 	   	Vector<Transaction> transFromCVS = null;
 	   	transFromCVS = new Vector<Transaction>();
	 	try {
	 		in = new FileReader(file);
	 	} catch (FileNotFoundException e) {
	 		// TODO Auto-generated catch block
	 		e.printStackTrace();
	 	}
	 	   Iterable<CSVRecord> records = null;
	 	try {
	 		records = CSVFormat.RFC4180.withFirstRecordAsHeader().parse(in);
	 	} catch (IOException e) {
	 		// TODO Auto-generated catch block
	 		e.printStackTrace();
	 	}
	 	for (CSVRecord record : records) {
	 		String transactionID = record.get("TransactionID");
	 		String profileName = record.get("ProfileName");
	 		String transactionDate = record.get("TransactionDate");
	 		String transactionAmount = record.get("TransactionAmount");
	 		String transactionNarrative = record.get("TransactionNarrative");
	 		String transactionDescription = record.get("TransactionDescription");
	 		String transactionType = record.get("TransactionType");
	 		String walletReference = record.get("WalletReference");
	       
	 		Transaction transaction = null;
	 		transaction = new Transaction();
	       
	 		transaction.setProfileName(profileName);
	 		transaction.setTransactionAmount(transactionAmount);
	 		transaction.setTransactionDate(transactionDate);
	 		transaction.setTransactionDescription(transactionDescription);
	 		transaction.setTransactionID(transactionID);
	 		transaction.setTransactionNarrative(transactionNarrative);
	 		transaction.setTransactionType(transactionType);
	 		transaction.setWalletReference(walletReference);
	 		transFromCVS.add(transaction);
 	       
	 	}
 	   
	 	return transFromCVS;
    }
}
