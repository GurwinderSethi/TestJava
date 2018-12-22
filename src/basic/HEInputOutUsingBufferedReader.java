package basic;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class HEInputOutUsingBufferedReader {
 public static void main(String args[] ) throws Exception {
 try{
	 
 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 String line = br.readLine();
 int l = Integer.parseInt(line);
 line = br.readLine();
 int n = Integer.parseInt(line);
 int x[][]=new int[n][2];
 
 for(int i=0;i<n;i++){
 String input=br.readLine();
 String[] tokens = input.split(" ");
 x[i][0]=Integer.parseInt(tokens[0]);
 x[i][1]=Integer.parseInt(tokens[1]); 
 }
 
 for(int i=0;i<n;i++){
 if(x[i][0]<l||x[i][1]<l){
 System.out.println("UPLOAD ANOTHER");
 }
 else if(x[i][0]>=l&&x[i][1]>=l){
 if(x[i][0]==x[i][1])
 System.out.println("ACCEPTED");
 else
 System.out.println("CROP IT");
 }
 }
 }
 catch(Exception e){
 System.out.println(e);
 }
 
 
 
 }
}