package irvine.oeis.a192;
// Generated by gen_seq4.pl deriv at 2021-06-28 18:44

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000607;
import irvine.oeis.a046.A046676;

/**
 * A192541 A046676(n) - A000607(n).
 * @author Georg Fischer
 */
public class A192541 implements Sequence {

  final Sequence mA000607 = new A000607();
  final Sequence mA046676 = new A046676();
  @Override
  public Z next() {
    return mA046676.next().subtract(mA000607.next());
  }

}
