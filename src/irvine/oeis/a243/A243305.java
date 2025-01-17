package irvine.oeis.a243;
// Generated by gen_seq4.pl deriv at 2020-07-01 19:03
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000010;

/**
 * A243305 a(n) = 2^phi(n)+1 = A066781(n)+1.
 * @author Georg Fischer
 */
public class A243305 implements Sequence {

  final Sequence mA000010 = new A000010();
  @Override
  public Z next() {
    return Z.TWO.pow(mA000010.next()).add(Z.ONE);
  }

}
