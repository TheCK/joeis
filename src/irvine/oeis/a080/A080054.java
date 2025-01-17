package irvine.oeis.a080;
// Generated by gen_seq4.pl eulerxfm 0 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.oeis.transform.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A080054 G.f.: Product_{n &gt;= 0} (1+x^(2n+1))/(1-x^(2n+1)).
 * @author Georg Fischer
 */
public class A080054 extends EulerTransform {

  /** Construct the sequence. */
  public A080054() {
    super(new PeriodicSequence(2, -1, 2, 0), 1);
  }
}
