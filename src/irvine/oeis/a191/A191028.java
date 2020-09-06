package irvine.oeis.a191;
// Generated by gen_seq4.pl prikron at 2020-09-03 08:47
// DO NOT EDIT here!

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Subsequence;
import irvine.oeis.a000.A000040;

/**
 * A191028 Primes p with Kronecker symbol (p|38) = 1.
 * @author Georg Fischer
 */
public class A191028 extends Subsequence {

  /** Construct the sequence. */
  public A191028() {
    super(new A000040());
  }
  
  @Override
  public boolean isOk(final Z term) {
    return LongUtils.kronecker(term.longValueExact(), 38) == 1;
  }
}
