package irvine.oeis.a124;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a036.A036704;
import irvine.oeis.a120.A120883;

/**
 * A124623 Number of unit squares having center within inscribed circle of an n X n integer square.
 * @author Sean A. Irvine
 */
public class A124623 implements Sequence {

  private final Sequence mA = new SkipSequence(new A120883(), 1);
  private final Sequence mB = new A036704();
  private boolean mEven = true;

  @Override
  public Z next() {
    mEven = !mEven;
    return mEven ? mA.next().multiply(4) : mB.next();
  }
}
