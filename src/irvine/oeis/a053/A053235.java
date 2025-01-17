package irvine.oeis.a053;

import irvine.oeis.PositionSequence;

/**
 * A053235 Numbers n such that A053230(n) = 3.
 * @author Sean A. Irvine
 */
public class A053235 extends PositionSequence {

  /** Construct the sequence. */
  public A053235() {
    super(1, new A053230(), 3);
  }
}
