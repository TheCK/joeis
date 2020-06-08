package irvine.oeis.a222;
// Generated by gen_seq4.pl digexch a001 A001477 10 7 8 at 2020-06-05 15:16
// DO NOT EDIT here!                 rseq   rseqno   base     dig1     dig2

import irvine.math.z.Z;
import irvine.oeis.a001.A001477;

/**
 * A222252 In the number n, replace all (decimal) digits <code>'7'</code> with <code>'8'</code> and vice versa.
 * @author Georg Fischer
 */
public class A222252 extends A001477 {

  @Override
  public Z next() {
    return new Z(super.next().toString(10)
        .replace('7', 'a')
        .replace('8', '7')
        .replace('a', '8'), 10);
  }

}
