package irvine.oeis.a054;

import irvine.oeis.PositionSequence;
import irvine.oeis.a000.A000001;

/**
 * A054396 Numbers n such that there are precisely 4 groups of order n.
 * @author Sean A. Irvine
 */
public class A054396 extends PositionSequence {

  /** Construct the sequence. */
  public A054396() {
    super(0, new A000001(), 4);
  }
}
