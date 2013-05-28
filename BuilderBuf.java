package string;
/*
 * @Q: what's the difference between StringBuffer and StringBuilder?
 * 
 * @A: StringBuffer methods are synchronized while StringBuilder are not.
 */
public class BuilderBuf {
  public static void main(String[] args) {
        int N = 77777777;
        long t;

        {
            StringBuffer sb = new StringBuffer();
            t = System.currentTimeMillis();
            for (int i = N; i --> 0 ;) {
                sb.append("");
            }
            System.out.println(System.currentTimeMillis() - t);
        }

        {
            StringBuilder sb = new StringBuilder();
            t = System.currentTimeMillis();
            for (int i = N; i --> 0 ;) {
                sb.append("");
            }
            System.out.println(System.currentTimeMillis() - t);
        }
    }
}
