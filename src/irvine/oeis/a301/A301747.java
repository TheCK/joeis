package irvine.oeis.a301;
// Generated by gen_seq4.pl prodetb 0 at 2020-10-13 17:55
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.transform.EulerTransform;
import irvine.oeis.a000.A000005;


/**
 * A301747 Expansion of Product_{k&gt;=1} (1/(1 - x^k))^(sigma_0(k)^2).
 * @author Georg Fischer
 */
public class A301747 extends EulerTransform {

  /** Construct the sequence. */
  public A301747() {
    super(new A000005(), 1);
  }

  @Override
  protected Z advance() {
    return mSeq.next().pow(2);
  }

}
