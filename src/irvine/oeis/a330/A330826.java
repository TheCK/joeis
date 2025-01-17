package irvine.oeis.a330;
// Generated by gen_seq4.pl deriv at 2021-06-28 18:44

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000051;
import irvine.oeis.a019.A019434;

/**
 * A330826 Numbers of the form 2^((2^n)+1)*F_n, where F_n is a Fermat prime, A019434.
 * @author Georg Fischer
 */
public class A330826 implements Sequence {

  final Sequence mA000051 = new A000051();
  final Sequence mA019434 = new A019434();
  @Override
  public Z next() {
    return Z.TWO.pow(mA000051.next()).multiply(mA019434.next());
  }

}
