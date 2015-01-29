import java.io.*;
import java.util.*;

public class T1196 {

	private static StreamTokenizer in;
	private static PrintWriter out;

	private static int nextInt() throws IOException {
		in.nextToken();
		return (int)in.nval;
	}

	public static void main (String[] str) throws IOException {
		Locale.setDefault(Locale.US);
		in = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
      		out = new PrintWriter(new OutputStreamWriter(System.out));

		int n = nextInt();
		Map<Integer, Boolean> map = new HashMap<Integer, Boolean> (n);
		for (int i = 0; i < n; i ++){
			map.put(nextInt(), true);
		}

		int matched = 0;
		int m = nextInt();
		for (int i = 0; i < m; i ++){
			if (map.get(nextInt()) != null) matched ++;
		}

		out.print(matched);
		out.flush();
	}
}
