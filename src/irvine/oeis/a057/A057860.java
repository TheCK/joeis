package irvine.oeis.a057;
// Generated by gen_seq4.pl deriv at 2021-06-28 18:44

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a001.A001221;
import irvine.oeis.a051.A051953;

/**
 * A057860 Number of residue classes modulo n which contain only composite numbers.
 * @author Georg Fischer
 */
public class A057860 implements Sequence {

  final Sequence mA001221 = new A001221();
  final Sequence mA051953 = new A051953();
  @Override
  public Z next() {
    return mA051953.next().subtract(mA001221.next());
  }

}
