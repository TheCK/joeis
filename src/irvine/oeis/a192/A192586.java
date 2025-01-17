package irvine.oeis.a192;

import irvine.oeis.FiniteSequence;

/**
 * A192586 Monotonic ordering of set S generated by these rules:  if x and y are in S and xy-1 is a prime, then xy-1 is in S, and 2 and 4 are in S.
 * @author Georg Fischer
 */
public class A192586 extends FiniteSequence {

  /** Construct the sequence. */
  public A192586() {
    super(2, 3, 4, 5, 7, 11, 13, 19, 37, 43, 73);
  }
}
