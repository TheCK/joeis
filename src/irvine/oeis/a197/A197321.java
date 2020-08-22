package irvine.oeis.a197;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A197321 Binomial(n+10, 10)*8^n.
 * @author Georg Fischer
 */
public class A197321 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A197321() {
    super(0, new long[] {1},
      new long[] {1, -88, 3520, -84480, 1351680, -15138816, 121110528, -692060160, 2768240640L, 
      -7381975040L, 11811160064L, -8589934592L});
  }
}
