package irvine.oeis.a339;
// Generated by gen_seq4.pl deriv at 2021-06-28 18:44

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a001.A001935;
import irvine.oeis.a261.A261734;

/**
 * A339406 Number of partitions of n into an even number of parts that are not multiples of 4.
 * @author Georg Fischer
 */
public class A339406 implements Sequence {

  final Sequence mA001935 = new A001935();
  final Sequence mA261734 = new A261734();
  @Override
  public Z next() {
    return mA001935.next().add(mA261734.next()).divide(Z.TWO);
  }

}
