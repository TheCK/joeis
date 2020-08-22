package irvine.oeis.a100;
// Generated by gen_seq4.pl deriv at 2020-07-01 19:03
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000676;
import irvine.oeis.a000.A000677;

/**
 * A100584 A000676(n) - A000677(n).
 * @author Georg Fischer
 */
public class A100584 implements Sequence {

  final Sequence mA000676 = new A000676();
  final Sequence mA000677 = new A000677();
  /** Construct the sequence. */
  public A100584() {
  }
  
  @Override
  public Z next() {
    return mA000676.next().subtract(mA000677.next());
  }

}
