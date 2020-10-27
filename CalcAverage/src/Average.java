import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import org.magicwerk.brownies.collections.BigList;

public class Average {

	private BigInteger calculateAverage(BigList<Integer> list) {
		BigInteger sum = BigInteger.ZERO;
		BigInteger sum2 = BigInteger.ZERO;
		BigInteger value = BigInteger.ZERO;
		BigInteger size;
		
		  if(!list.isEmpty()) {
		    for (Integer mark : list) {
		    	value = BigInteger.valueOf(mark);
		        sum2 = sum.add(value);
		        sum  = sum2.abs();
		    }
		    size = BigInteger.valueOf(list.size());
		    return sum.divide(size);
		  }
		  return sum;
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BigInteger result = BigInteger.ZERO;
		BigList<Integer> list = new BigList <Integer>();
		list.add(10);
		list.add(20);
		list.add(50);
		Average avg = new Average();
		result = avg.calculateAverage(list);
		System.out.println("Result" + result);
	}

}
