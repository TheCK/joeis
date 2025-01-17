package irvine.oeis.a112;
// Generated by gen_seq4.pl holos at 2021-09-25 22:55

import irvine.oeis.HolonomicRecurrence;
/**
 * A112711 Partial sums of Catalan numbers A000108 multiplied by powers of -4.
 * (16*k+24)*a(k)+(-15*k-21)*a(k+1)+(-k-3)*a(k+2)
 * @author Georg Fischer
 */
public class A112711 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A112711() {
    super(0, "[[0],[24, 16],[-21,-15],[-3,-1]]", "1", 2);
  }
}
