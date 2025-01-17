package irvine.oeis.a339;
// Generated by gen_seq4.pl deriv at 2021-06-28 18:44

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a002.A002095;
import irvine.oeis.a302.A302236;

/**
 * A339395 Number of partitions of n into an even number of nonprime parts.
 * @author Georg Fischer
 */
public class A339395 implements Sequence {

  final Sequence mA002095 = new A002095();
  final Sequence mA302236 = new A302236();
  @Override
  public Z next() {
    return mA002095.next().add(mA302236.next()).divide(Z.TWO);
  }

}
