package irvine.oeis.a186;
// Generated by gen_seq4.pl deriv at 2020-07-01 19:03
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a007.A007519;

/**
 * A186295 <code>A007519(n)-2</code>.
 * @author Georg Fischer
 */
public class A186295 implements Sequence {

  final Sequence mA007519 = new A007519();
  /** Construct the sequence. */
  public A186295() {
  }
  
  @Override
  public Z next() {
    return mA007519.next().subtract(Z.TWO);
  }

}
