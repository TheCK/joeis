package irvine.oeis.a089;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A089596 G.f.: (1+2*x^3+3*x^6+x^8+6*x^9+2*x^11+9*x^12+x^14+10*x^15+x^16+9*x^18+2*x^19 +6*x^21 +x^22+3*x^24+2*x^27+x^30) / ((1-x^5)^2*(1-x^12)^2).
 * @author Georg Fischer
 */
public class A089596 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A089596() {
    super(0, new long[] {1, 0, 0, 2, 0, 0, 3, 0, 1, 6, 0, 2, 9, 0, 1, 10, 1, 0, 9, 
      2, 0, 6, 1, 0, 3, 0, 0, 2, 0, 0, 1},
      new long[] {1, 0, 0, 0, 0, -2, 0, 0, 0, 0, 1, 0, -2, 0, 0, 0, 0, 4, 
      0, 0, 0, 0, -2, 0, 1, 0, 0, 0, 0, -2, 0, 0, 0, 0, 1});
  }
}
