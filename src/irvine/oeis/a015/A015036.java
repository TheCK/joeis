package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015036 Inverse of 1027th cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015036 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015036() {
    super(Cyclotomic.inverse(1027));
  }
}
