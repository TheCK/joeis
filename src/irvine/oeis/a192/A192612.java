package irvine.oeis.a192;

import irvine.oeis.FiniteSequence;

/**
 * A192612 Monotonic ordering of set S generated by these rules:  if x and y are in S and x^2+2y^2 is a prime, then x^2+2y^2 is in S, and 1 and 2 are in S.
 * @author Georg Fischer
 */
public class A192612 extends FiniteSequence {

  /** Construct the sequence. */
  public A192612() {
    super(1, 2, 3, 11, 17, 19, 139, 251, 307, 379, 587);
  }
}
