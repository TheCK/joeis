package irvine.oeis.a102;
// Generated by gen_seq4.pl deriv at 2021-06-28 18:44

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000120;

/**
 * A102393 A wicked evil sequence.
 * @author Georg Fischer
 */
public class A102393 implements Sequence {

  final Sequence mA000120 = new A000120();
  protected long mN;
  /** Construct the sequence. */
  public A102393() {
    mN = -1;
  }
  
  @Override
  public Z next() {
    ++mN;
    return Z.valueOf(mN).add(Z.ONE).multiply(Z.ONE.add(Z.NEG_ONE.pow(mA000120.next()))).divide(Z.TWO);
  }

}
