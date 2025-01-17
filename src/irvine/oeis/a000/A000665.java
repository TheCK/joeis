package irvine.oeis.a000;

import irvine.oeis.transform.EulerTransformSequence;
import irvine.oeis.a003.A003190;

/**
 * A000665 Number of 3-uniform hypergraphs on n unlabeled nodes, or equivalently number of relations with 3 arguments on n nodes.
 * @author Sean A. Irvine
 */
public class A000665 extends EulerTransformSequence {

  /** Construct the sequence. */
  public A000665() {
    super(new A003190(), 0);
  }
}
