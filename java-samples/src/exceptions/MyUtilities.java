package exceptions;

import java.io.FileInputStream;
import java.io.IOException;

class BadDataSetException extends Exception {
	private String setName;
	private IOException e;
	
	public BadDataSetException(String setName, IOException e){
		this.setName = setName;
		this.e = e;
	}
	
	public String getSetName(){
		return this.setName;
	}
	
	public IOException getIOException(){
		return this.e;
	}
}

public class MyUtilities {
	
	public double[] getDataSet(String setName) throws BadDataSetException{
		String file = setName + ".dset";
		FileInputStream in = null;
		try{
			in = new FileInputStream(file);
			return readDataSet(in);
		} catch (IOException e){
			throw new BadDataSetException(setName,e);
		} finally {
			try{
				if (in != null)
					in.close();
			} catch (IOException e){
				
			}
		}
	}
	
	private double[] readDataSet(FileInputStream in) {
		// TODO Auto-generated method stub
		return null;
	}

	public static void main(String[] args){
		try {
			new MyUtilities().getDataSet("salaries");
		} catch (BadDataSetException bse) {
			// TODO Auto-generated catch block
			System.out.println(bse.getSetName() + " " + bse.getIOException().getMessage());
		}

	}

}
