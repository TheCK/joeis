package irvine.oeis.a165;
// Generated by gen_seq4.pl deriv at 2021-10-29 23:39

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a014.A014076;
import irvine.oeis.a163.A163300;
/**
 * A165955 n-th odd nonprime plus n-th even nonprime.
 * @author Georg Fischer
 */
public class A165955 implements Sequence {

  private final Sequence mA014076 = new A014076();
  private final Sequence mA163300 = new A163300();
  @Override
  public Z next() {
    return mA014076.next().add(mA163300.next());
  }

}
