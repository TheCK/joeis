package irvine.oeis.a100;
// Generated by gen_seq4.pl deriv at 2020-07-01 19:03
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000010;

/**
 * A100371 a(n) = 2^phi(n) - 1 = A066781(n) - 1.
 * @author Georg Fischer
 */
public class A100371 implements Sequence {

  final Sequence mA000010 = new A000010();
  /** Construct the sequence. */
  public A100371() {
  }
  
  @Override
  public Z next() {
    return Z.TWO.pow(mA000010.next()).subtract(Z.ONE);
  }

}
