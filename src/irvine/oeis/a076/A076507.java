package irvine.oeis.a076;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A076507 Three people (P1, P2, P3) are in a circle and are saying Hello to each other. They start with P2 saying "Hello, Hello". Thereafter Pn says "Hello" for n times the total number of Hello's so far.
 * @author Georg Fischer
 */
public class A076507 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A076507() {
    super(1, new long[] {0, 2, 6, 8, -16},
      new long[] {1, 0, 0, -24});
  }
}
