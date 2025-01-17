package irvine.oeis.a283;
// Generated by gen_seq4.pl prodeta 0 at 2020-10-13 17:55
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.transform.EulerTransform;


/**
 * A283579 Expansion of exp( Sum_{n&gt;=1} A283533(n)/n*x^n ) in powers of x.
 * @author Georg Fischer
 */
public class A283579 extends EulerTransform {

  /** Construct the sequence. */
  public A283579() {
    super(1);
  }

  @Override
  protected Z advance() {
    return Z.valueOf(mN).pow(2 * mN);
  }

}
