package irvine.oeis.a141;
// Generated by gen_seq4.pl deriv at 2020-07-01 19:03
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000111;
import irvine.oeis.a014.A014695;

/**
 * A141479 A000111(n) + A014695(n).
 * @author Georg Fischer
 */
public class A141479 implements Sequence {

  final Sequence mA000111 = new A000111();
  final Sequence mA014695 = new A014695();
  /** Construct the sequence. */
  public A141479() {
  }
  
  @Override
  public Z next() {
    return mA000111.next().add(mA014695.next());
  }

}
