package irvine.oeis.a064;
// Generated by gen_seq4.pl holos at 2021-07-06 21:47

import irvine.oeis.HolonomicRecurrence;

/**
 * A064310 Generalized Catalan numbers C(-1; n).
 * radtorec(1/(3/2-1/2*(4*x+1)^(1/2)))
 * @author Georg Fischer
 */
public class A064310 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A064310() {
    super(0, "[[0],[-6, 4],[12,-7],[0,-2]]", "[1, 1]", 0);
  }
}
