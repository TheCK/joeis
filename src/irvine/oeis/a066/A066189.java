package irvine.oeis.a066;
// Generated by gen_seq4.pl deriv at 2021-06-28 18:44

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000009;

/**
 * A066189 Sum of all partitions of n into distinct parts.
 * @author Georg Fischer
 */
public class A066189 implements Sequence {

  final Sequence mA000009 = new A000009();
  protected long mN;
  /** Construct the sequence. */
  public A066189() {
    mN = -1;
  }
  
  @Override
  public Z next() {
    ++mN;
    return Z.valueOf(mN).multiply(mA000009.next());
  }

}
