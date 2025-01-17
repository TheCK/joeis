package irvine.oeis.a283;
// Generated by gen_seq4.pl deriv at 2021-06-28 18:44

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a005.A005187;

/**
 * A283208 Minimal exponent integer sequence associated with Vietoris sequence.
 * @author Georg Fischer
 */
public class A283208 implements Sequence {

  final Sequence mA005187 = new A005187();
  /** Construct the sequence. */
  public A283208() {
    mA005187.next();
  }
  
  @Override
  public Z next() {
    return mA005187.next().subtract(Z.ONE);
  }

}
