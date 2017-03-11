
package auction_fest;

import java.io.*;
import java.util.*;

public class StdinReader
{
   public static final BufferedReader stdinReader = new BufferedReader(new InputStreamReader(System.in));
   public static StringTokenizer tokenizeLine() throws java.io.IOException
   {
	return new StringTokenizer(stdinReader.readLine());
   }
   public static StringTokenizer tokenizeLine(String prompt) throws java.io.IOException
   {
	System.out.print(prompt);
	return new StringTokenizer(stdinReader.readLine());
   }
   public static String readLine() throws java.io.IOException
   {
	return stdinReader.readLine();
   }
   public static String readLine(String prompt) throws java.io.IOException
   {
     System.out.print(prompt);
     return stdinReader.readLine();
   }
}

