package irvine.oeis.a230;
// Generated by gen_seq4.pl deriv at 2021-06-28 18:44

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a217.A217622;

/**
 * A230481 Prime(prime(2n) - prime(2 prime(n)).
 * @author Georg Fischer
 */
public class A230481 implements Sequence {

  final Sequence mA217622 = new A217622();
  final Sequence mA230460 = new A230460();
  @Override
  public Z next() {
    return mA217622.next().subtract(mA230460.next());
  }

}
