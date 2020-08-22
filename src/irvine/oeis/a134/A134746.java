package irvine.oeis.a134;
// Generated by gen_seq4.pl eulerxfm 0 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.oeis.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A134746 Expansion of 1+k in powers of q^(1/2) where q is Jacobi's nome and k is the elliptic modulus.
 * @author Georg Fischer
 */
public class A134746 extends EulerTransform {

  /** Construct the sequence. */
  public A134746() {
    super(new PeriodicSequence(4, -10, 4, 4, 4, -10, 4, 0), 1);
  }
}
