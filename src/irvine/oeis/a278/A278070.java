package irvine.oeis.a278;
// Generated by gen_seq4.pl holos at 2021-06-02 19:27
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A278070 a(n) = hypergeometric([n, -n], [], -1).
 * Recurrence: a(n)=((8*n^2-16*n+4)*a(n-1)+(2*n-1)*a(n-2))/(2*n-3)
 * @author Georg Fischer
 */
public class A278070 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A278070() {
    super(0, "[[0],[-1, 2],[4,-16, 8],[3,-2]]", "1, 2, 11, 106, 1457, 25946, 566827, 14665106", 0);
  }
}
