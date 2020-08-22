package irvine.oeis.a022;

import irvine.oeis.EulerTransformSequence;
import irvine.oeis.PeriodicSequence;

/**
 * A022594 Expansion of Product_{m&gt;=1} (1+q^m)^30.
 * @author Sean A. Irvine
 */
public class A022594 extends EulerTransformSequence {

  /** Construct the sequence. */
  public A022594() {
    super(new PeriodicSequence(30, 0), 0);
  }
}

