package irvine.oeis.a048;
// Generated by gen_seq4.pl deriv at 2021-06-28 18:44

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000720;
import irvine.oeis.a001.A001221;

/**
 * A048865 a(n) is the number of primes in the reduced residue system mod n.
 * @author Georg Fischer
 */
public class A048865 implements Sequence {

  final Sequence mA000720 = new A000720();
  final Sequence mA001221 = new A001221();
  @Override
  public Z next() {
    return mA000720.next().subtract(mA001221.next());
  }

}
