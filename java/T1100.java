import java.io.PrintWriter;
import java.util.*;

public class T1100 {

    public static void main(String str[]) {

        PrintWriter out = new PrintWriter(System.out);
        Scanner input = new Scanner(System.in);
        try {
            int N = input.nextInt();
            byte max = 0;
            int id[] = new int[N];
            byte M[]  = new byte[N];
            for (int i = 0; i < N; i++) {
                id[i] = input.nextInt();
                M[i] = input.nextByte();
                if (M[i] > max){
                    max = M[i];
                }
            }

            for (int i = max; i >= 0; i --){
                  for (int j = 0; j < N; j ++){
                      if (M[j] == i){
                          out.print(id[j]);
                          out.print(" ");
                          out.println(M[j]);
                      }
                  }
            }
            out.flush();

        } finally {
            out.close();
            input.close();
        }

    }
}
