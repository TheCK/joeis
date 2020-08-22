package irvine.oeis.a222;
// Generated by gen_seq4.pl digexch a001 A001477 10 5 7 at 2020-06-05 15:16
// DO NOT EDIT here!                 rseq   rseqno   base     dig1     dig2

import irvine.math.z.Z;
import irvine.oeis.a001.A001477;

/**
 * A222246 In the number n, replace all (decimal) digits '5' with '7' and vice versa.
 * @author Georg Fischer
 */
public class A222246 extends A001477 {

  @Override
  public Z next() {
    return new Z(super.next().toString(10)
        .replace('5', 'a')
        .replace('7', '5')
        .replace('a', '7'), 10);
  }

}
