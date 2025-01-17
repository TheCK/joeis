package irvine.oeis.a113;
// Generated by gen_seq4.pl holos at 2021-09-25 22:55

import irvine.oeis.HolonomicRecurrence;
/**
 * A113269 Partial sums of Catalan numbers A000108 multiplied by powers of -10.
 * (40*k+60)*a(k)+(-39*k-57)*a(k+1)+(-k-3)*a(k+2)
 * @author Georg Fischer
 */
public class A113269 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A113269() {
    super(0, "[[0],[60, 40],[-57,-39],[-3,-1]]", "1", 2);
  }
}
