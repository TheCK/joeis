package irvine.oeis.a124;
// Generated by gen_seq4.pl eulerxfm 1 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.oeis.transform.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A124340 Number of solutions to n = x^2 + 2*y^2 + 4*(T(z) + T(w)) + 1 where x and y are integers, z and w are nonnegative integers and T(x) = (x^2+x)/2.
 * @author Georg Fischer
 */
public class A124340 extends EulerTransform {

  /** Construct the sequence. */
  public A124340() {
    super(new PeriodicSequence(2, -1, 2, -2, 2, -1, 2, -4), 1);
  }
}
