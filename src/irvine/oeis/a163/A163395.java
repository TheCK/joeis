package irvine.oeis.a163;
// Generated by gen_seq4.pl deriv at 2021-10-29 23:39

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a005.A005843;
/**
 * A163395 a(n) = (n-th even nonprime)^(n-th even number).
 * @author Georg Fischer
 */
public class A163395 implements Sequence {

  private final Sequence mA005843 = new A005843();
  private final Sequence mA163300 = new A163300();
  @Override
  public Z next() {
    return mA163300.next().pow(mA005843.next());
  }

}
