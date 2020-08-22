package irvine.oeis.a204;
// Generated by gen_seq4.pl deriv at 2020-07-01 19:03
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a014.A014330;
import irvine.oeis.a203.A203577;

/**
 * A204452 A014330 - A203577. Difference between the exponential convolution of A000108 (Catalan) with itself and the corresponding exponential half-convolution.
 * @author Georg Fischer
 */
public class A204452 implements Sequence {

  final Sequence mA014330 = new A014330();
  final Sequence mA203577 = new A203577();
  /** Construct the sequence. */
  public A204452() {
  }
  
  @Override
  public Z next() {
    return mA014330.next().subtract(mA203577.next());
  }

}
