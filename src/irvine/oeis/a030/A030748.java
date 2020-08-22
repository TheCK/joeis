package irvine.oeis.a030;

/**
 * A030748 Row 2, where, at stage k&gt;1, write i in row 1 and j in row 2, where i is the number of j's in rows 1 and 2, for j=1,2,...,m, where m=max number in row 1 from stages 1 to k-1; stage 1 is 4 in row 1.
 * @author Sean A. Irvine
 */
public class A030748 extends A030747 {

  @Override
  protected long select(final long a, final long b) {
    return b;
  }
}
