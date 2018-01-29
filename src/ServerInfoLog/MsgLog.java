package ServerInfoLog;

import java.io.FileWriter;
import java.io.IOException;

public class MsgLog {
  static int n=0;
  protected  String defaultLogFile;
  protected FileWriter writer;
  public MsgLog(){
	//  defaultLogFile=System.getProperty("logfileDir")+"/serverlog"+String.valueOf(n); 
	  defaultLogFile="serverlog"+String.valueOf(n);
	  try {
		writer=new FileWriter(defaultLogFile,false);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
  }
  public void write(String s)throws IOException{    
		writer.write(s+"\n");
		writer.flush();
  }
  private void logTerminite() throws IOException {
	// TODO Auto-generated method stub
	 writer.close();
	 n++;
 }
}
