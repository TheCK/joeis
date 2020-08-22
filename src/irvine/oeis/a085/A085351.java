package irvine.oeis.a085;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A085351 Expansion of (1-3*x)/((1-4*x)*(1-5*x)).
 * @author Georg Fischer
 */
public class A085351 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A085351() {
    super(0, new long[] {1, -3},
      new long[] {1, -9, 20});
  }
}
