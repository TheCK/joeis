package irvine.oeis.a119;
// Generated by gen_seq4.pl deriv at 2021-06-28 18:44

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a036.A036689;

/**
 * A119959 p^2-p+1 central polygonal numbers with prime indices A002061(prime(n)).
 * @author Georg Fischer
 */
public class A119959 implements Sequence {

  final Sequence mA036689 = new A036689();
  @Override
  public Z next() {
    return mA036689.next().add(Z.ONE);
  }

}
