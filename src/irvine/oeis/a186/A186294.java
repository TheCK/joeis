package irvine.oeis.a186;
// Generated by gen_seq4.pl deriv at 2020-07-01 19:03
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a007.A007519;

/**
 * A186294 (A007519(n)+1)/2.
 * @author Georg Fischer
 */
public class A186294 implements Sequence {

  final Sequence mA007519 = new A007519();
  /** Construct the sequence. */
  public A186294() {
  }
  
  @Override
  public Z next() {
    return mA007519.next().add(Z.ONE).divide(Z.TWO);
  }

}
