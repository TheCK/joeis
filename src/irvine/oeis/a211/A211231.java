package irvine.oeis.a211;
// Generated by gen_seq4.pl holos at 2021-08-16 19:34

import irvine.oeis.HolonomicRecurrence;
/**
 * A211231 Row sums of A211230.
 * radtorec((-8*x^3+3*x+1)/(-3*x^2+1)^2)
 * @author Georg Fischer
 */
public class A211231 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A211231() {
    super(0, "[[0],[-96, 24],[0],[48,-17],[-6,-3],[-6, 3],[0, 1]]", "[1, 3, 6, 10, 27, 33, 108, 108]", 0);
  }
}
