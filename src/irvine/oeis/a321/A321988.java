package irvine.oeis.a321;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A321988 Number of integer triples (x,y,z) with x,y,z&gt;0 and 4*x+6*y+3*n*z &lt; 12*n.
 * @author Georg Fischer
 */
public class A321988 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A321988() {
    super(0, new long[] {0, 0, -4, -9, -10, -11, -5, -3},
      new long[] {-1, 1, 1, -1, 1, -1, -1, 1});
  }
}
