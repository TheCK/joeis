package irvine.oeis.a131;
// Generated by gen_seq4.pl deriv at 2020-07-01 19:03
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000012;
import irvine.oeis.a007.A007318;
import irvine.oeis.a097.A097806;

/**
 * A131398 <code>3*A007318 - A097806 - A000012</code>.
 * @author Georg Fischer
 */
public class A131398 implements Sequence {

  final Sequence mA000012 = new A000012();
  final Sequence mA007318 = new A007318();
  final Sequence mA097806 = new A097806();
  /** Construct the sequence. */
  public A131398() {
  }
  
  @Override
  public Z next() {
    return Z.THREE.multiply(mA007318.next()).subtract(mA097806.next()).subtract(mA000012.next());
  }

}
