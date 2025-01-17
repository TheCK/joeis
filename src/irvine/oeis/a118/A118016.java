package irvine.oeis.a118;
// Generated by gen_seq4.pl deriv at 2021-06-28 18:44

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a016.A016031;

/**
 * A118016 Integers of the form 2^n/(n-1).
 * @author Georg Fischer
 */
public class A118016 implements Sequence {

  final Sequence mA016031 = new A016031();
  @Override
  public Z next() {
    return Z.FOUR.multiply(mA016031.next());
  }

}
