package irvine.oeis.a086;
// Generated by gen_seq4.pl deriv at 2021-06-28 18:44

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a001.A001359;
import irvine.oeis.a006.A006512;

/**
 * A086704 Greater of the twin primes raised to their lesser twins.
 * @author Georg Fischer
 */
public class A086704 implements Sequence {

  final Sequence mA001359 = new A001359();
  final Sequence mA006512 = new A006512();
  @Override
  public Z next() {
    return mA006512.next().pow(mA001359.next());
  }

}
