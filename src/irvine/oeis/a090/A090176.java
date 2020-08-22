package irvine.oeis.a090;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A090176 G.f.: (1+x^9)/((1-x^4)(1-x^6)(1-x^12)).
 * @author Georg Fischer
 */
public class A090176 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A090176() {
    super(0, new long[] {-1, 0, 0, 1, 0, 0, -1},
      new long[] {-1, 0, 0, 1, 1, 0, 0, -1, 0, 0, 0, 0, 1, 0, 0, -1, -1, 0, 
      0, 1});
  }
}
