package irvine.oeis.a228;
// Generated by gen_seq4.pl bindec at 2021-08-04 23:24

import irvine.oeis.a003.A003849;
import irvine.oeis.cons.BinaryToDecimalExpansionSequence;

/**
 * A228249 The decimal expansion of the infinite Fibonacci word, interpreted as a binary expansion.
 * @author Georg Fischer
 */
public class A228249 extends BinaryToDecimalExpansionSequence {

  /** Construct the sequence. */
  public A228249() {
    super(new A003849());
  }
}
