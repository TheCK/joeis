package irvine.oeis.a120;
// Generated by gen_seq4.pl deriv at 2020-07-01 19:03
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000120;

/**
 * A120738 a(n) = 4*n - A000120(n).
 * @author Georg Fischer
 */
public class A120738 implements Sequence {

  final Sequence mA000120 = new A000120();
  protected long mN;
  /** Construct the sequence. */
  public A120738() {
    mN = -1;
  }
  
  @Override
  public Z next() {
    ++mN;
    return Z.FOUR.multiply(Z.valueOf(mN)).subtract(mA000120.next());
  }

}
