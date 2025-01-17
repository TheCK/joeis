package irvine.oeis.a054;

import irvine.oeis.PositionSequence;
import irvine.oeis.a000.A000001;

/**
 * A054397 Numbers m such that there are precisely 5 groups of order m.
 * @author Sean A. Irvine
 */
public class A054397 extends PositionSequence {

  /** Construct the sequence. */
  public A054397() {
    super(0, new A000001(), 5);
  }
}
