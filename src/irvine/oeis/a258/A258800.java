package irvine.oeis.a258;
// Generated by gen_seq4.pl holos at 2021-08-16 19:34

import irvine.oeis.HolonomicRecurrence;
/**
 * A258800 The number of zeroless decimal numbers whose digital sum is n.
 * radtorec(-(x^9+x^8+x^7+x^6+x^5+x^4+x^3+x^2+x)/(x^9+x^8+x^7+x^6+x^5+x^4+x^3+x^2+x-1))
 * @author Georg Fischer
 */
public class A258800 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A258800() {
    super(0, "[[0],[-17, 1],[-32, 2],[-45, 3],[-56, 4],[-65, 5],[-72, 6],[-77, 7],[-80, 8],[-81, 9],[-47, 7],[-34, 6],[-23, 5],[-14, 4],[-7, 3],[-2, 2],[1, 1],[2],[1,-1]]", "[0, 1, 2, 4, 8, 16, 32, 64, 128, 256, 511, 1021, 2040, 4076, 8144, 16272, 32512, 64960, 129792, 259328]", 0);
  }
}
