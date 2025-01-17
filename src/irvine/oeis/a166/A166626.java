package irvine.oeis.a166;
// Generated by gen_seq4.pl deriv at 2021-06-28 18:44

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a165.A165826;

/**
 * A166626 Totally multiplicative sequence with a(p) = 5p for prime p.
 * @author Georg Fischer
 */
public class A166626 implements Sequence {

  final Sequence mA165826 = new A165826();
  protected long mN;
  /** Construct the sequence. */
  public A166626() {
    mN = 0;
  }
  
  @Override
  public Z next() {
    ++mN;
    return Z.valueOf(mN).multiply(mA165826.next());
  }

}
